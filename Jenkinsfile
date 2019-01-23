node {

    withMaven(maven:'maven') {

        stage('Checkout') {
            git url: 'https://github.com/dannyvandijck/test.git', credentialsId: 'dannyvandijck', branch: 'master'
        }

        stage('Build') {
            sh 'mvn clean install'

            def pom = readMavenPom file:'pom.xml'
            print pom.version
            env.version = pom.version
        }

        stage('Image') {
            dir ('hello') {
                def app = docker.build "localhost:5000/hello:${env.version}"
                app.push()
            }
        }

        stage ('Run') {
            docker.image("localhost:5000/hello:${env.version}").run('-p 3333:3333 -h hello --name hello --link discovery')
        }
     

    }

}