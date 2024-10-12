package spring.consumer.deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;
import spring.consumer.entities.UserInfoDto;

import java.util.Map;

public class UserInfoDeserializer implements Deserializer<UserInfoDto> {

    @Override
    public void configure(Map<String, ?> configs, boolean isKey){}

    @Override
    public UserInfoDto deserialize(String arg0, byte[] arg1){
        ObjectMapper mapper = new ObjectMapper();
        UserInfoDto user = null;
        try{
            user = mapper.readValue(arg1, UserInfoDto.class);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return user;
    }

    @Override
    public void close(){}
}
