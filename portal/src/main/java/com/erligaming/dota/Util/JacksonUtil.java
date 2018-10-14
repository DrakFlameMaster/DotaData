package com.erligaming.dota.Util;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JacksonUtil {
    private static final Logger log = LoggerFactory.getLogger(JacksonUtil.class);

    private static final ObjectMapper mapper = new ObjectMapper();

    /**
     * Description: JSON 反序列化 对象
     *
     * @param jsonStr JSON字符串
     * @param clazz   对象

     */
    public static <T> T toBean(String jsonStr, Class<T> clazz) {

        try {
            return mapper.readValue(jsonStr, clazz);
        } catch (JsonParseException e) {
            log.error("jackson.readValue error", e);
        } catch (JsonMappingException e) {
            log.error("jackson.readValue error", e);
        } catch (IOException e) {
            log.error("jackson.readValue error", e);
        }
        return null;
    }

    /**
     * Description:序列化 对象 <br>
     * 双向关系 ，避免TOJSON时死循环 ,在该model添加@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class) <br>
     *
     * @param obj 目标对象
     * @return String JSON字符串
     */
    public static String toJson(Object obj) {
        String json = "";
        try {
            json = mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.error("jackson.toJson error", e);
        }
        return json;

    }

    /**
     * Description: 深度克隆实体
     *
     * @param obj   对象
     * @param clazz 实体
     * @return 引用地址更改后的新实体
     */
    public static <T> T deepCloneObject(Object obj, Class<T> clazz) {

        return toBean(toJson(obj), clazz);
    }

    /**
     * Description:深度克隆费率实体list
     *
     * @param list
     * @param collectionClass
     * @param elementClasses
     */
    @SuppressWarnings("rawtypes")
    public static List<?> deepCloneList(List<?> list, Class collectionClass, Class elementClasses) {
        List<?> result = new ArrayList<>();
        try {
            result = mapper.readValue(toJson(list), getCollectionType(collectionClass, elementClasses));
        } catch (IOException e) {
            log.error("context", e);
        }
        return result;
    }

    /**
     * 获取泛型的Collection Type
     *
     * @param collectionClass 泛型的Collection
     * @param elementClasses  元素类
     * @return JavaType Java类型
     * @since 1.0
     */
    public static JavaType getCollectionType(Class<?> collectionClass, Class<?> elementClasses) {
        return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
    }

    private JacksonUtil() {

    }
}