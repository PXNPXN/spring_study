## ��������
```xml
    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.3.5</version>
        </dependency>
        <!--��ӵ�Ԫ��������junit-->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.1</version>
            <scope>test</scope>
        </dependency>
```

## ע��˵��
- @Autowired���Զ�װ��ͨ�����ͣ�����
    ���Autowired����Ψһ�Զ�װ�������ԣ�����Ҫͨ��@Qualifier(value="xxxx")
- @Nullable �ֶα�������ע�⣬˵������ֶο���Ϊnull
- @Resource���Զ�װ��ͨ�����֣�����
- @Component��������������ϣ�˵������౻Spring�����ˣ�����bean!
