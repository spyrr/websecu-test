FROM httpd:latest
LABEL maintainer="spyrr"

COPY conf/httpd.conf /usr/local/apache2/conf/
COPY conf/httpd-vhosts.conf /usr/local/apache2/conf/extra/

EXPOSE 80
ENTRYPOINT ["/usr/local/bin/httpd-foreground"]
