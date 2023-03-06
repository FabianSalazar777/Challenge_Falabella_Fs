// Estructura y creación del reporte con cucumber y node.js


const report = require("multiple-cucumber-html-reporter");

report.generate({
  jsonDir: "./TestExecution/report/",
  reportPath: "./TestExecution/report/",
  openReportInBrowser: true,
  displayReportTime: true,
  metadata: {
    browser: {
      name: "chrome",
      version: " 110.0.5481.178 64bits",
    },
    device: "Local test machine",
    platform: {
      name: "Windows",
      version: "21H2",
    },
  },
  customData: {
    title: "Run info",
    data: [
      { label: "Project", value: "Custom project" },
      { label: "Release", value: "1.2.3" },
      { label: "Cycle", value: "B11221.34321" },
      { label: "Execution Start Time of Report", value: new Date().toLocaleString("es-CL", {timeZone: "America/Santiago"}) },
      { label: "Execution End Time of Report", value: new Date().toLocaleString("es-CL", {timeZone: "America/Santiago"}) },
    ],
  },
});