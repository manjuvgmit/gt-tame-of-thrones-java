FROM alpine:3.12.0
RUN apk update
RUN apk upgrade

RUN apk add gradle
RUN apk add git

ADD . /source
RUN cd /source
WORKDIR /source

#RUN git clone https://github.com/manjuvgmit/geektrust-tame-of-thrones-java.git
#RUN cd geektrust-tame-of-thrones-java

RUN gradle clean build run --args="src/main/resources/input/sample.txt" --info
