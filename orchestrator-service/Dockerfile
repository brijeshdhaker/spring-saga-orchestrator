# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM openjdk:8-jre-slim
 
MAINTAINER Brijesh K Dhaker <brijeshdhaker@gmail.com> 

CMD mkdir -p /apps/libs && mkdir -p /apps/configs
 
ADD target/orchestrator-service.jar /apps/
 
EXPOSE 8093

# Debug enable
# CMD java -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=docker -jar -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n /apps/orchestrator-service.jar

#
CMD java -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=docker -jar /apps/orchestrator-service.jar