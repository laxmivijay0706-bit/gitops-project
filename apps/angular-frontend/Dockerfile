FROM nginx:alpine
# npm build output se copy karo (dist folder se), seedha index.html se nahi
COPY dist/angular-frontend/browser/index.html /usr/share/nginx/html/index.html
COPY nginx.conf /etc/nginx/nginx.conf
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
