<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

   <bean class="com.stream.beans.Question" id="QueId">
   <constructor-arg type="int" value="1"></constructor-arg>
   <constructor-arg type="String" value="What Is HTML"></constructor-arg>
   <constructor-arg>
   <map>
   <entry key="Html is Front End Language" value="British physicist"></entry>
   
   <entry key="HTML IS Platform independence " value="British"></entry>
   
   
   
   
   </map>
   </constructor-arg>
   
   
   </bean>

</beans>
