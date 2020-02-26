config.mode = "development"; // [production|development|none]
//config.mode = "production"; // [production|development|none]
if (config.mode === "production") {
    config.optimization = {
        minimize: true
    };
}