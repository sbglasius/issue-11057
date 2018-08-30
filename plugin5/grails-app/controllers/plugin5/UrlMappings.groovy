package plugin5

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "/plugin5"(view: "/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
        log.info("Loaded plugin5 UrlMappings")
    }
}
