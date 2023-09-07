def call() {
        def timestampVersion = sh(script: "date -d @\$(date +%s) +'%Y-%m-%dT%H-%M-%SZ'", returnStdout: true).trim()
        def IS_CRON_JOB = "${currentBuild.rawBuild.getCause(hudson.triggers.TimerTrigger.TimerTriggerCause) != null ? 'true' : 'false'}"

        if (IS_CRON_JOB.toBoolean()) {
                sh "echo RUN-CRONJOB --- TIME ${timestampVersion}"
        } else {
                sh "echo RUN-MANUAL"
        }
}