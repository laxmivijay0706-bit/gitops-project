from flask import Flask, jsonify
import logging

logging.basicConfig(
    level=logging.INFO,
    format='%(asctime)s [%(levelname)s] %(name)s: %(message)s'
)
logger = logging.getLogger(__name__)

app = Flask(__name__)

@app.route('/health')
def health():
    logger.info("Health check requested")
    return jsonify({"status": "healthy", "service": "python-backend"})

@app.route('/api/data')
def get_data():
    logger.info("Data endpoint called")
    return jsonify({"message": "LIVE DEMO for Sir - Pipeline Working!", "version": "1.0"})

if __name__ == '__main__':
    logger.info("Python backend starting on port 5000")
    app.run(host='0.0.0.0', port=5000)
