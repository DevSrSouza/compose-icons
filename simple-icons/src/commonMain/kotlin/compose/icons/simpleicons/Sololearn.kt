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

public val SimpleIcons.Sololearn: ImageVector
    get() {
        if (_sololearn != null) {
            return _sololearn!!
        }
        _sololearn = Builder(name = "Sololearn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.621f, 16.084f)
                arcToRelative(8.483f, 8.483f, 0.0f, false, true, -2.922f, 6.427f)
                curveToRelative(-0.603f, 0.53f, -0.19f, 1.522f, 0.613f, 1.442f)
                arcToRelative(9.039f, 9.039f, 0.0f, false, false, 1.587f, -0.3f)
                arcToRelative(8.32f, 8.32f, 0.0f, false, false, 5.787f, -5.887f)
                arcToRelative(8.555f, 8.555f, 0.0f, false, false, -8.258f, -10.832f)
                arcToRelative(9.012f, 9.012f, 0.0f, false, false, -1.045f, 0.06f)
                curveToRelative(-0.794f, 0.1f, -0.995f, 1.161f, -0.29f, 1.542f)
                curveToRelative(2.701f, 1.452f, 4.53f, 4.285f, 4.53f, 7.548f)
                close()
                moveTo(7.906f, 18.597f)
                arcToRelative(8.538f, 8.538f, 0.0f, false, true, -6.45f, -2.913f)
                curveToRelative(-0.532f, -0.6f, -1.527f, -0.19f, -1.446f, 0.61f)
                arcToRelative(8.943f, 8.943f, 0.0f, false, false, 0.3f, 1.582f)
                curveToRelative(0.794f, 2.823f, 3.064f, 5.026f, 5.907f, 5.766f)
                curveToRelative(5.727f, 1.492f, 10.87f, -2.773f, 10.87f, -8.229f)
                curveToRelative(0.0f, -0.35f, -0.02f, -0.7f, -0.06f, -1.04f)
                curveToRelative(-0.1f, -0.792f, -1.165f, -0.992f, -1.547f, -0.29f)
                arcToRelative(8.597f, 8.597f, 0.0f, false, true, -7.574f, 4.514f)
                close()
                moveTo(5.382f, 7.916f)
                arcToRelative(8.483f, 8.483f, 0.0f, false, true, 2.924f, -6.427f)
                curveToRelative(0.603f, -0.531f, 0.19f, -1.522f, -0.613f, -1.442f)
                arcToRelative(9.93f, 9.93f, 0.0f, false, false, -1.598f, 0.29f)
                arcTo(8.339f, 8.339f, 0.0f, false, false, 0.31f, 6.224f)
                arcToRelative(8.555f, 8.555f, 0.0f, false, false, 8.258f, 10.832f)
                curveToRelative(0.352f, 0.0f, 0.704f, -0.02f, 1.045f, -0.06f)
                curveToRelative(0.794f, -0.1f, 0.995f, -1.162f, 0.29f, -1.542f)
                arcToRelative(8.54f, 8.541f, 0.0f, false, true, -4.52f, -7.538f)
                close()
                moveTo(16.102f, 5.403f)
                arcToRelative(8.538f, 8.538f, 0.0f, false, true, 6.45f, 2.913f)
                curveToRelative(0.53f, 0.6f, 1.526f, 0.19f, 1.445f, -0.61f)
                arcToRelative(8.945f, 8.945f, 0.0f, false, false, -0.3f, -1.583f)
                curveTo(22.902f, 3.3f, 20.632f, 1.098f, 17.788f, 0.357f)
                curveTo(12.071f, -1.145f, 6.928f, 3.12f, 6.928f, 8.576f)
                curveToRelative(0.0f, 0.35f, 0.02f, 0.7f, 0.06f, 1.041f)
                curveToRelative(0.1f, 0.791f, 1.168f, 0.991f, 1.549f, 0.29f)
                arcTo(8.58f, 8.58f, 0.0f, false, true, 16.1f, 5.404f)
                close()
            }
        }
        .build()
        return _sololearn!!
    }

private var _sololearn: ImageVector? = null
