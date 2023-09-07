def call() {
//        def timestampVersion = sh(script: "date -d @\$(date +%s) +'%Y-%m-%dT%H-%M-%SZ'", returnStdout: true).trim()

        sh "Cronjob ${timestampVersion}!!!"
}