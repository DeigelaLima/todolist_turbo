package br.com.deigelalima.todolist.utils;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class Utils {

    public static void copyNonNullProperties(Object source, Object target){
        BeanUtils.copyProperties(source, target, getNullPropertyNames(source));
    }
    
    public static String[] getNullPropertyNames(Object source){
        final BeanWrapper src = new BeanWrapperImpl(source);

        PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<>();

        for(PropertyDescriptor pd: pds){
            Object srcValue = src.getPropertyValue(pd.getName());
            if(srcValue == null){
                emptyNames.add(pd.getName());
            }

        }

        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }
}

//Link do banco de dados em memória
//http://localhost:8080/h2-console/login.jsp?jsessionid=0922cea337502fc2aeaa642f5ddb5a8c


//Comando para executar a aplicação pelo terminal: 
//      mvn spring-boot:run
//      java -jar target/todolist-1.0.0.jar

//Para testar as rotas:
//https://app.apidog.com/project/792875