package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Trivy: ImageVector
    get() {
        if (_trivy != null) {
            return _trivy!!
        }
        _trivy = Builder(name = "Trivy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.375f, 7.311f)
                lineTo(1.962f, 5.918f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, 0.0f, -0.174f)
                lineTo(11.828f, 0.047f)
                arcToRelative(0.343f, 0.343f, 0.0f, false, true, 0.344f, 0.0f)
                lineToRelative(9.864f, 5.696f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, 0.0f, 0.175f)
                lineTo(19.624f, 7.31f)
                arcToRelative(0.962f, 0.962f, 0.0f, false, true, -0.052f, -0.074f)
                curveToRelative(-0.914f, -1.478f, -2.124f, -2.592f, -3.596f, -3.31f)
                curveToRelative(-4.088f, -1.994f, -9.164f, -0.505f, -11.6f, 3.385f)
                close()
                moveTo(12.262f, 23.899f)
                verticalLineToRelative(-3.14f)
                curveToRelative(5.693f, -2.087f, 9.01f, -7.766f, 7.588f, -12.985f)
                lineToRelative(2.436f, -1.42f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, 0.151f, 0.088f)
                verticalLineToRelative(11.645f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.05f, 0.087f)
                lineToRelative(-9.973f, 5.812f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.152f, -0.087f)
                close()
                moveTo(11.703f, 20.758f)
                verticalLineToRelative(3.14f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.151f, 0.086f)
                lineToRelative(-9.933f, -5.81f)
                arcToRelative(0.114f, 0.114f, 0.0f, false, true, -0.056f, -0.099f)
                lineTo(1.563f, 6.436f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, 0.15f, -0.087f)
                lineToRelative(2.44f, 1.41f)
                curveToRelative(-1.455f, 5.307f, 1.846f, 10.993f, 7.55f, 13.0f)
                close()
                moveTo(7.013f, 8.834f)
                lineTo(4.807f, 7.561f)
                curveToRelative(2.306f, -3.665f, 7.094f, -5.066f, 10.95f, -3.186f)
                curveToRelative(1.385f, 0.676f, 2.526f, 1.727f, 3.39f, 3.124f)
                lineToRelative(0.04f, 0.062f)
                lineToRelative(-2.195f, 1.268f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, false, -2.429f, -2.307f)
                curveToRelative(-2.603f, -1.27f, -5.901f, -0.253f, -7.552f, 2.311f)
                close()
                moveTo(16.35f, 14.034f)
                curveToRelative(0.813f, -1.371f, 1.088f, -2.99f, 0.798f, -4.685f)
                lineToRelative(2.255f, -1.314f)
                curveToRelative(1.245f, 4.86f, -1.864f, 10.169f, -7.14f, 12.192f)
                verticalLineToRelative(-3.072f)
                curveToRelative(1.86f, -0.67f, 3.272f, -1.747f, 4.087f, -3.12f)
                close()
                moveTo(4.6f, 8.018f)
                lineToRelative(2.27f, 1.31f)
                curveToRelative(-0.225f, 1.571f, 0.112f, 3.204f, 0.951f, 4.606f)
                curveToRelative(0.919f, 1.536f, 2.225f, 2.629f, 3.881f, 3.25f)
                verticalLineToRelative(3.045f)
                curveTo(6.327f, 18.25f, 3.297f, 13.042f, 4.601f, 8.017f)
                close()
                moveTo(9.903f, 10.504f)
                lineTo(7.444f, 9.084f)
                curveToRelative(1.52f, -2.34f, 4.53f, -3.268f, 6.9f, -2.112f)
                arcToRelative(5.075f, 5.075f, 0.0f, false, true, 2.216f, 2.108f)
                lineToRelative(-2.471f, 1.427f)
                arcToRelative(2.311f, 2.311f, 0.0f, false, false, -2.03f, -1.195f)
                curveToRelative(-0.825f, 0.0f, -1.645f, 0.43f, -2.156f, 1.192f)
                close()
                moveTo(14.241f, 11.026f)
                lineTo(16.684f, 9.618f)
                curveToRelative(0.22f, 1.51f, -0.043f, 2.945f, -0.765f, 4.162f)
                curveToRelative(-0.735f, 1.238f, -1.998f, 2.224f, -3.658f, 2.856f)
                verticalLineToRelative(-2.631f)
                curveToRelative(1.25f, -0.691f, 1.968f, -1.771f, 1.98f, -2.979f)
                close()
                moveTo(8.25f, 13.676f)
                arcTo(6.576f, 6.576f, 0.0f, false, true, 7.34f, 9.6f)
                lineToRelative(2.446f, 1.412f)
                curveToRelative(-0.016f, 1.271f, 0.73f, 2.437f, 1.917f, 2.997f)
                verticalLineToRelative(2.624f)
                arcToRelative(6.977f, 6.977f, 0.0f, false, true, -3.453f, -2.956f)
                close()
                moveTo(12.103f, 13.528f)
                lineTo(11.966f, 13.601f)
                lineTo(11.809f, 13.526f)
                curveToRelative(-1.023f, -0.504f, -1.524f, -1.606f, -1.557f, -2.417f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, true, 0.004f, -0.23f)
                arcToRelative(2.153f, 2.153f, 0.0f, false, true, 1.163f, -0.957f)
                curveToRelative(0.508f, -0.178f, 1.034f, -0.153f, 1.444f, 0.071f)
                curveToRelative(0.6f, 0.327f, 0.84f, 0.797f, 0.86f, 0.86f)
                curveToRelative(0.008f, 0.156f, 0.004f, 0.253f, 0.004f, 0.256f)
                curveToRelative(-0.038f, 0.981f, -0.63f, 1.863f, -1.624f, 2.419f)
                close()
            }
        }
        .build()
        return _trivy!!
    }

private var _trivy: ImageVector? = null
