pipeline {
    agent any
    tools {
        maven "Maven3.8"
        jdk "JDK11"
    }
    stages {
        stage('Initialize'){
            steps{
                echo "PATH = ${MAVEN_HOME}/bin:${PATH}"
                echo "MAVEN_HOME = D:\\Tools\\apache\\apache-maven-3.8.4-bin\\apache-maven-3.8.4"
            }
        }
        stage('Build') {
            steps {
                dir("/collegeprof") {
                sh 'mvn -B  clean install'
                }
            }
        }
     }
   
   }

