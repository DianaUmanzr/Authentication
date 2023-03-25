# Devsu APP

## Content

* [Technology stack](#markdown-header-technology-stack)
* [URL](#markdown-header-how-to-test-the-software)
* [Build and Installation](#markdown-header-build-and-installation)


## Technology stack

Application is developed on Java 17 and Springboot 2.7.9

* Maven
* Java 17
* Spring boot 2.7.9

## URL
The application is deployed in Amazon Web Service using Fargate, ECS and Docker.

First you need to get a token with this URL:

POST - http://3.143.3.228:9091/token

Basic Authorization in POSTMAN with these credentials.

username: dumanzr
password: password

After when your token generated call this URL:

POST - http://3.143.3.228:9091/DevOps

Send a Bearer token in the Authorization and the header:

X-Parse-REST-API-Key=2f5ae96c-b558-4c7b-a590-a501ae1c3f6c

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
