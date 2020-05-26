package me.topits.demo;

import com.google.common.collect.Lists;
import me.topits.CodeGenerator;

import java.util.List;

/**
 * @author Wang Ziyue
 * @since 2020/5/25 16:39
 */
public class MysqlGenerator {

    public static void tableGenerator(List<String> tableList, String moduleName) {
        String databaseUrl = "jdbc:mysql://106.14.113.48:3306/itsme_remote?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8";
        String databaseUser = "root";
        String databasePassword = "ziyue.wang";
        String author = "Wang Ziyue";
        String projectPath = "D:\\git\\itsme-demo";
        String packageName = "me.topits";

        for (String tableName : tableList) {
            CodeGenerator codeGenerator = new CodeGenerator()
                    .setDatabaseUrl(databaseUrl)
                    .setDatabaseUser(databaseUser)
                    .setDatabasePassword(databasePassword)
                    .setAuthor(author)
                    .setProjectPath(projectPath)
                    .setPackageName(packageName)
                    .setTableName(tableName)
                    .setModuleName(moduleName);
            codeGenerator.execute();
        }
    }

    public static void main(String[] args) {
        List<String> tableList = Lists.newArrayList();
        tableList.add("im_demo");
        tableGenerator(tableList, "base");
    }

}
