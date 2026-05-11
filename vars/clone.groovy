def call(String url, String branch({
  echo "Clonning the code from ${url}{branch:${branch})"
  git url: "${GitUrl}",branch:"${GitBranch}"
  echo "Code cloning successfull"
}

                                   
