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

public val SimpleIcons.Bitcoinsv: ImageVector
    get() {
        if (_bitcoinsv != null) {
            return _bitcoinsv!!
        }
        _bitcoinsv = Builder(name = "Bitcoinsv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.648f, 14.423f)
                lineToRelative(0.003f, -0.004f)
                arcToRelative(1.34f, 1.34f, 0.0f, false, true, -0.498f, 0.659f)
                curveToRelative(-0.269f, 0.189f, -0.647f, 0.338f, -1.188f, 0.364f)
                lineToRelative(-1.99f, 0.004f)
                verticalLineToRelative(-2.93f)
                curveToRelative(0.288f, 0.008f, 1.565f, -0.013f, 2.119f, 0.015f)
                curveToRelative(0.722f, 0.035f, 1.171f, 0.321f, 1.41f, 0.668f)
                curveToRelative(0.262f, 0.351f, 0.293f, 0.82f, 0.144f, 1.224f)
                close()
                moveTo(12.519f, 11.162f)
                curveToRelative(0.503f, -0.024f, 0.852f, -0.162f, 1.101f, -0.336f)
                curveToRelative(0.214f, -0.146f, 0.375f, -0.367f, 0.46f, -0.611f)
                curveToRelative(0.134f, -0.375f, 0.107f, -0.81f, -0.136f, -1.135f)
                curveToRelative(-0.223f, -0.319f, -0.638f, -0.584f, -1.306f, -0.616f)
                curveToRelative(-0.495f, -0.026f, -1.413f, -0.003f, -1.664f, -0.01f)
                verticalLineToRelative(2.709f)
                curveToRelative(0.025f, 0.004f, 1.539f, -0.001f, 1.545f, -0.001f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                close()
                moveTo(17.35f, 14.142f)
                curveToRelative(0.022f, -1.477f, -1.24f, -2.332f, -1.908f, -2.572f)
                curveToRelative(0.715f, -0.491f, 1.206f, -1.043f, 1.206f, -2.085f)
                curveToRelative(0.0f, -1.655f, -1.646f, -2.43f, -2.647f, -2.529f)
                curveToRelative(-0.082f, -0.009f, -0.31f, -0.013f, -0.31f, -0.013f)
                lineTo(13.691f, 5.361f)
                horizontalLineToRelative(-1.633f)
                lineToRelative(0.004f, 1.583f)
                lineTo(10.97f, 6.944f)
                lineTo(10.97f, 5.367f)
                lineTo(9.31f, 5.367f)
                verticalLineToRelative(1.569f)
                curveToRelative(-0.292f, 0.007f, -2.049f, 0.006f, -2.049f, 0.006f)
                verticalLineToRelative(1.401f)
                horizontalLineToRelative(0.571f)
                curveToRelative(0.601f, 0.016f, 0.822f, 0.362f, 0.798f, 0.677f)
                verticalLineToRelative(6.041f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, true, -0.371f, 0.391f)
                curveToRelative(-0.249f, 0.011f, -0.621f, 0.0f, -0.621f, 0.0f)
                lineToRelative(-0.32f, 1.588f)
                horizontalLineToRelative(1.996f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(1.661f)
                verticalLineToRelative(-1.591f)
                horizontalLineToRelative(1.091f)
                verticalLineToRelative(1.594f)
                horizontalLineToRelative(1.624f)
                verticalLineToRelative(-1.588f)
                curveToRelative(1.899f, 0.05f, 3.643f, -1.071f, 3.66f, -2.913f)
                close()
            }
        }
        .build()
        return _bitcoinsv!!
    }

private var _bitcoinsv: ImageVector? = null
