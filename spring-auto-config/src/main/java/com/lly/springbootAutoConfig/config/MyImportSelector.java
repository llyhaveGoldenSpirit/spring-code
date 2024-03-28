package com.lly.springbootAutoConfig.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //读取配置文件的内容
        List<String> imports = new ArrayList<>();
        //将配置文件每一行的内容作为需要导入的类的类的全限定名
        InputStream is = MyImportSelector.class.getClassLoader().getResourceAsStream("myConfig.imports");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;
        while (true){
            try {
                if (!((line = br.readLine())!=null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }finally {
                if (br!=null){
                    try {
                        br.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            imports.add(line);
        }
        return imports.toArray(new String[0]);
    }
}
