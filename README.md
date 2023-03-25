# Devsu APP

## Content

* [Technology stack](#markdown-header-technology-stack)
* [URL](#markdown-header-how-to-test-the-software)
* [Build and Installation](#markdown-header-build-and-installation)
* [Configuration](#markdown-header-configuration)
* [How to test the software](#markdown-header-how-to-test-the-software)


## Technology stack

Application is developed on Java 17 and Springboot 2.7.9

* Maven
* Java 17
* Spring boot 2.7.9

## Known issues
Url application is: 

The application is deployed in Amazon Web Service using Fargate, ECS and Docker.

http://3.143.3.228:9091/token


## Build and Installation

```bash
$ mvn clean package
```
This generates an executable file called `component.jar`

Commands to run the application with docker

- First let's build the image with the last .jar version generated and push it.
  `docker build -f Dockerfile -t devsu_app .`

- You can get the last image from docker hub:
  `docker pull dianaumanzr/devsu`

- Run docker image
  `docker run -p 10555:9091 dianaumanzr/devsu`

Command to run the application with docker compose
  `docker-compose up -d`

KUBERNETES

Install minikube in local, check the minikube ip

go to kubernetes file and execute the command
  `kubectl create -f devsu-deployment.yml,devsu-svc.yml`

Check the services
  `kubectl get services`

Set the service into minikube
`minikube service devsu-app`

The pod is running in port 30391

Check the url, the ip is minikube ip and the port assigned in NodePort in the file devsu-svc.yml
`http://192.168.49.2:30391/token`

## How to test the software

The Test are developed in Junit test. To run these you need Maven command line

To run all Test case, you need run the following command

```
mvn test

```

Test by Class
```
mvn -Dtest="CLASS_TO_RUN" test

```

Test by Method
```
mvn test -Dtest="CLASS_TO_TEST#METHOD_TO_TEST"  

```

## Known issues
N\A
