pipeline{
    agent any
    
    stages{
        stage('a'){
            steps{
                echo 'A0'
            }
        }
        stage('b'){
            steps{
                echo 'B0'
            }
        }
        stage('c'){
            steps{
                echo 'C0'
            }
        }
    }
}