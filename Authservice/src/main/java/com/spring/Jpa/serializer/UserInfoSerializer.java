package com.spring.Jpa.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.Jpa.model.UserInfoDto;
import org.apache.kafka.common.serialization.Serializer;
import org.hibernate.annotations.DialectOverride;

import java.util.Map;

public class UserInfoSerializer implements Serializer<UserInfoDto> {

    @Override
    public void configure(Map<String, ?> configs, boolean isKey){

    }

    @Override
    public byte[] serialize(String arg0, UserInfoDto arg1){
        byte[] retVal = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            retVal = objectMapper.writeValueAsString(arg1).getBytes();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return retVal;
    }

    @Override
    public void close(){

    }

}
