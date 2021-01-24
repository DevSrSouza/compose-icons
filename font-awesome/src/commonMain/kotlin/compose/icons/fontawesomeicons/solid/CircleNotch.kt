package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) {
            return _circleNotch!!
        }
        _circleNotch = Builder(name = "CircleNotch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 39.056f)
                verticalLineToRelative(16.659f)
                curveToRelative(0.0f, 10.804f, 7.281f, 20.159f, 17.686f, 23.066f)
                curveTo(383.204f, 100.434f, 440.0f, 171.518f, 440.0f, 256.0f)
                curveToRelative(0.0f, 101.689f, -82.295f, 184.0f, -184.0f, 184.0f)
                curveToRelative(-101.689f, 0.0f, -184.0f, -82.295f, -184.0f, -184.0f)
                curveToRelative(0.0f, -84.47f, 56.786f, -155.564f, 134.312f, -177.219f)
                curveTo(216.719f, 75.874f, 224.0f, 66.517f, 224.0f, 55.712f)
                verticalLineTo(39.064f)
                curveToRelative(0.0f, -15.709f, -14.834f, -27.153f, -30.046f, -23.234f)
                curveTo(86.603f, 43.482f, 7.394f, 141.206f, 8.003f, 257.332f)
                curveToRelative(0.72f, 137.052f, 111.477f, 246.956f, 248.531f, 246.667f)
                curveTo(393.255f, 503.711f, 504.0f, 392.788f, 504.0f, 256.0f)
                curveToRelative(0.0f, -115.633f, -79.14f, -212.779f, -186.211f, -240.236f)
                curveTo(302.678f, 11.889f, 288.0f, 23.456f, 288.0f, 39.056f)
                close()
            }
        }
        .build()
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null
