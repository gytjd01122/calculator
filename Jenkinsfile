pipeline {
    agent any
    stages{
        stage('checkout') {
            steps {
                git url: 'https://github.com/gytjd01122/calculator.git'
            }
        }
        stage (Compile) {
            steps {
                sh './gradlew compileJava'
            }
        }
        stage ("Unit test") {
            steps {
                sh "./gradlew test"
            }
        }
        stage ("Code Coverage") {
            steps {
                sh "./gradlew jacocoTestReport"
                /*
                publishHTML ([
                    reportDir: 'build/reports/jacoco/test/html',
                    reportFiles: 'index.html',
                    reportName: "JaCoCo Report"
                ])
                */
                sh "./gradlew jacocoTestCoverageVerification"
                
            }
        }
        stage("Static code analysis") {
            steps {
                sh "./gradlew checkstyleMain"
                /*
                publishHTML target: [
                    allowMissing: true, 
                    alwaysLinkToLastBuild: false, 
                    keepAll: false, 
                    reportDir: 'build/reports/checkstyle/',
                    reportFiles: 'main.html',
                    reportName: "Checkstyle Report"
                ]
                */
            }
        }
        stage("Package") {
            steps {
                sh "./gradlew build"
            }
        }
        stage("Docker build"){
            steps {
                sh "sudo docker build -t localhost:5000/myname/calculator ."
            }
        }

    }
}


