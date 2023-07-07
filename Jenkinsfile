pipeline{
    agent any
    stages{
        stage ('Compile stage'){
            steps{
                withMaven(maven: '3_6_3'){
                    sh 'mvn clean install'
                }
            }
        }
        stage ('Test stage'){
            steps{
                withMaven(maven: '3_6_3'){
                    sh 'mvn test'
                }
            }
        }
        stage ('Cucumber report stage'){
            steps{
                cucumber buildStatus: 'UNSTABLE',
                reportTitle: 'My pretty report'
                fileIncludePattern: '**/cucumber.json',
                jsonReportDirectory: 'cucumber_report'
            }
        }
    }
}