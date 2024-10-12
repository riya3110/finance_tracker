package com.expense.service.consumer;

import com.expense.service.dto.ExpenseDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class ExpenseDeserializer implements Deserializer<ExpenseDto> {

    @Override
    public void configure(Map<String, ?> arg0, boolean arg1) {}

    @Override
    public ExpenseDto deserialize(String argo0, byte[] arg1) {
        ObjectMapper objectMapper = new ObjectMapper();
        ExpenseDto expense = null;
        try{
            expense = objectMapper.readValue(arg1, ExpenseDto.class);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return expense;
    }
    @Override
    public void close() {}
}
