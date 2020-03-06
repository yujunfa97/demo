FROM openjdk:8-jre-alpine
LABEL maintainer="opm <yujunfa97@163.com>"
ARG PROJECT_FILE
COPY $PROJECT_FILE /opt/application.tar
RUN mkdir /opt/application
RUN tar -xvf /opt/application.tar -C /opt/application
RUN rm -rf /opt/application.tar
RUN echo "https://mirror.tuna.tsinghua.edu.cn/alpine/v3.4/main/" > /etc/apk/repositories
RUN apk update \
    && apk upgrade \
    #安装bash支持，原生只支持sh
    && apk add --no-cache bash \
    bash-doc \
    bash-completion \
    #安装ps支持，原生ps显示有问题
    && apk add --no-cache procps\
    procps-doc\
    && rm -rf /var/cache/* \
    && /bin/bash
#修改文件所属用户和用户组
RUN chown -R `whoami` /opt/application
RUN chgrp -R `whoami` /opt/application
EXPOSE 8761
ENTRYPOINT ["bash","/opt/application/scripts/start.sh"]