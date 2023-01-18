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

public val RemixIcons.RadarFill: ImageVector
    get() {
        if (_radarFill != null) {
            return _radarFill!!
        }
        _radarFill = Builder(name = "RadarFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.368f, 4.398f)
                lineToRelative(-3.484f, 6.035f)
                lineToRelative(1.732f, 1.0f)
                lineTo(16.1f, 5.398f)
                curveToRelative(4.17f, 2.772f, 6.306f, 7.08f, 4.56f, 10.102f)
                curveToRelative(-1.86f, 3.222f, -7.189f, 3.355f, -11.91f, 0.63f)
                curveTo(4.029f, 13.402f, 1.48f, 8.721f, 3.34f, 5.5f)
                curveToRelative(1.745f, -3.023f, 6.543f, -3.327f, 11.028f, -1.102f)
                close()
                moveTo(15.884f, 1.773f)
                lineToRelative(1.732f, 1.0f)
                lineToRelative(-1.5f, 2.598f)
                lineToRelative(-1.732f, -1.0f)
                lineToRelative(1.5f, -2.598f)
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
        return _radarFill!!
    }

private var _radarFill: ImageVector? = null
