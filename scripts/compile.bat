cd ..

protoc -I=.\proto --java_out=.\client\src --grpc-java_out=.\client\src .\proto\KeyStore.proto
protoc -I=.\proto --java_out=.\server\src --grpc-java_out=.\server\src .\proto\KeyStore.proto

cd .\client
call mvn clean compile assembly:single

cd ..\server
call mvn clean compile assembly:single
