package moraj.securityservice

import org.springframework.security.access.annotation.Secured



class SecureController {

  /*  def index() {
        render 'Secure access only'
    }*/

    @Secured(['ROLE_ADMIN'])
    def index = {
        render 'Secure access only'
    }
}
