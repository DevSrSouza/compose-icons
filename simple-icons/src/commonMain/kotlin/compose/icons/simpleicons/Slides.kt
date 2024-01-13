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

public val SimpleIcons.Slides: ImageVector
    get() {
        if (_slides != null) {
            return _slides!!
        }
        _slides = Builder(name = "Slides", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.695f, 0.395f)
                lineTo(4.578f, 0.97f)
                lineToRelative(5.7f, 0.552f)
                close()
                moveTo(2.252f, 1.246f)
                lineTo(2.212f, 1.652f)
                lineTo(6.44f, 1.652f)
                close()
                moveTo(0.0f, 2.152f)
                lineTo(0.0f, 21.85f)
                horizontalLineToRelative(19.697f)
                lineTo(19.697f, 2.152f)
                close()
                moveTo(20.197f, 2.988f)
                lineTo(20.197f, 20.24f)
                lineToRelative(1.66f, -17.092f)
                close()
                moveTo(22.281f, 3.953f)
                lineTo(20.631f, 20.955f)
                lineTo(24.0f, 4.301f)
                close()
                moveTo(9.928f, 7.361f)
                curveToRelative(0.595f, 0.0f, 1.127f, 0.075f, 1.593f, 0.227f)
                curveToRelative(0.467f, 0.152f, 0.7f, 0.321f, 0.7f, 0.508f)
                curveToRelative(0.0f, 0.151f, -0.068f, 0.347f, -0.201f, 0.586f)
                curveToRelative(-0.135f, 0.239f, -0.255f, 0.359f, -0.36f, 0.359f)
                curveToRelative(-0.012f, 0.0f, -0.086f, -0.035f, -0.226f, -0.105f)
                arcToRelative(2.82f, 2.82f, 0.0f, false, false, -1.34f, -0.315f)
                curveToRelative(-0.496f, 0.0f, -0.88f, 0.103f, -1.155f, 0.307f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, false, -0.412f, 0.797f)
                curveToRelative(0.0f, 0.326f, 0.103f, 0.583f, 0.307f, 0.77f)
                curveToRelative(0.204f, 0.186f, 0.55f, 0.355f, 1.041f, 0.507f)
                curveToRelative(1.097f, 0.339f, 1.841f, 0.709f, 2.232f, 1.111f)
                curveToRelative(0.391f, 0.403f, 0.586f, 1.01f, 0.586f, 1.82f)
                curveToRelative(0.0f, 0.812f, -0.289f, 1.481f, -0.867f, 2.006f)
                curveToRelative(-0.578f, 0.526f, -1.269f, 0.788f, -2.074f, 0.788f)
                curveToRelative(-0.805f, 0.0f, -1.499f, -0.12f, -2.082f, -0.36f)
                curveToRelative(-0.584f, -0.239f, -0.875f, -0.47f, -0.875f, -0.691f)
                curveToRelative(0.0f, -0.117f, 0.073f, -0.292f, 0.219f, -0.526f)
                curveToRelative(0.145f, -0.233f, 0.275f, -0.35f, 0.392f, -0.35f)
                curveToRelative(0.012f, 0.0f, 0.106f, 0.056f, 0.281f, 0.167f)
                curveToRelative(0.176f, 0.11f, 0.426f, 0.223f, 0.752f, 0.334f)
                curveToRelative(0.327f, 0.11f, 0.72f, 0.166f, 1.182f, 0.166f)
                curveToRelative(0.461f, 0.0f, 0.841f, -0.132f, 1.139f, -0.395f)
                curveToRelative(0.297f, -0.262f, 0.445f, -0.619f, 0.445f, -1.068f)
                curveToRelative(0.0f, -0.45f, -0.13f, -0.8f, -0.393f, -1.05f)
                curveToRelative(-0.262f, -0.252f, -0.786f, -0.488f, -1.568f, -0.71f)
                curveToRelative(-0.782f, -0.221f, -1.347f, -0.503f, -1.697f, -0.848f)
                curveToRelative(-0.35f, -0.344f, -0.526f, -0.866f, -0.526f, -1.566f)
                curveToRelative(0.0f, -0.7f, 0.268f, -1.287f, 0.805f, -1.76f)
                curveToRelative(0.537f, -0.472f, 1.238f, -0.709f, 2.102f, -0.709f)
                close()
                moveTo(15.788f, 22.35f)
                lineTo(19.953f, 22.754f)
                lineTo(19.993f, 22.35f)
                close()
                moveTo(16.914f, 22.963f)
                lineTo(20.094f, 23.605f)
                lineTo(20.16f, 23.277f)
                close()
            }
        }
        .build()
        return _slides!!
    }

private var _slides: ImageVector? = null
