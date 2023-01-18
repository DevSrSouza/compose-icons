package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.RadarLine: ImageVector
    get() {
        if (_radarLine != null) {
            return _radarLine!!
        }
        _radarLine = Builder(name = "RadarLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.506f, 3.623f)
                lineToRelative(-1.023f, 1.772f)
                curveToRelative(-2.91f, -0.879f, -5.514f, -0.45f, -6.411f, 1.105f)
                curveToRelative(-1.178f, 2.04f, 0.79f, 5.652f, 4.678f, 7.897f)
                reflectiveCurveToRelative(8.0f, 2.142f, 9.178f, 0.103f)
                curveToRelative(0.898f, -1.555f, -0.033f, -4.024f, -2.249f, -6.105f)
                lineToRelative(1.023f, -1.772f)
                curveToRelative(3.082f, 2.709f, 4.463f, 6.27f, 2.958f, 8.877f)
                curveToRelative(-1.86f, 3.222f, -7.189f, 3.355f, -11.91f, 0.63f)
                curveTo(4.029f, 13.402f, 1.48f, 8.721f, 3.34f, 5.5f)
                curveToRelative(1.505f, -2.607f, 5.28f, -3.192f, 9.166f, -1.877f)
                close()
                moveTo(15.884f, 1.773f)
                lineToRelative(1.732f, 1.0f)
                lineToRelative(-5.0f, 8.66f)
                lineToRelative(-1.732f, -1.0f)
                lineToRelative(5.0f, -8.66f)
                close()
                moveTo(6.732f, 20.0f)
                lineTo(17.0f, 20.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.017f, 22.0f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, true, -0.883f, -0.5f)
                arcToRelative(1.005f, 1.005f, 0.0f, false, true, 0.0f, -1.0f)
                lineToRelative(2.25f, -3.897f)
                lineToRelative(1.732f, 1.0f)
                lineTo(6.732f, 20.0f)
                close()
            }
        }
        .build()
        return _radarLine!!
    }

private var _radarLine: ImageVector? = null
