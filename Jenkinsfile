pipeline {
    agent any
    tools {
        maven "MAVEN"
        jdk "JDK"
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
                dir("/collegeprof/src/main/java") {
                sh 'mvn -B -DskipTests clean package'
                }
            }
        }
     }
    post {

      }
   }
}
