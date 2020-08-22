FROM alpine:3.12.0
RUN apk update
RUN apk upgrade

RUN apk add git
RUN apk add gradle
RUN apk add openjdk8

ADD . /source
RUN cd /source
WORKDIR /source

#RUN git clone https://github.com/manjuvgmit/geektrust-tame-of-thrones-java.git
#RUN cd geektrust-tame-of-thrones-java

#RUN sh ./gradlew build
#RUN export $PATH=$PATH:$GRADLE_HOME
RUN gradle clean build run --args="docs/input-01.txt" --info
