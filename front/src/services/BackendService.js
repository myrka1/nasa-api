import axios from "axios";

const http = axios.create({
    baseURL: "http://localhost:8080"
});

export const BackendService = {
    dailyPicture() {
        return http.get(`/daily`);
    },
    specificPicture(date) {
        return http.get(`/specific/${date}`);
    },
}