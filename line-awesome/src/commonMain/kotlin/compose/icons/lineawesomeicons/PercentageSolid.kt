package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.PercentageSolid: ImageVector
    get() {
        if (_percentageSolid != null) {
            return _percentageSolid!!
        }
        _percentageSolid = Builder(name = "PercentageSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(10.3555f, 9.0f, 9.0f, 10.3555f, 9.0f, 12.0f)
                lineTo(9.0f, 13.0f)
                curveTo(9.0f, 14.6445f, 10.3555f, 16.0f, 12.0f, 16.0f)
                curveTo(13.6445f, 16.0f, 15.0f, 14.6445f, 15.0f, 13.0f)
                lineTo(15.0f, 12.0f)
                curveTo(15.0f, 10.3555f, 13.6445f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(19.5938f, 9.0f)
                lineTo(10.0f, 23.0f)
                lineTo(12.4063f, 23.0f)
                lineTo(22.0f, 9.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(12.5664f, 11.0f, 13.0f, 11.4336f, 13.0f, 12.0f)
                lineTo(13.0f, 13.0f)
                curveTo(13.0f, 13.5664f, 12.5664f, 14.0f, 12.0f, 14.0f)
                curveTo(11.4336f, 14.0f, 11.0f, 13.5664f, 11.0f, 13.0f)
                lineTo(11.0f, 12.0f)
                curveTo(11.0f, 11.4336f, 11.4336f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(20.0f, 16.0f)
                curveTo(18.3555f, 16.0f, 17.0f, 17.3555f, 17.0f, 19.0f)
                lineTo(17.0f, 20.0f)
                curveTo(17.0f, 21.6445f, 18.3555f, 23.0f, 20.0f, 23.0f)
                curveTo(21.6445f, 23.0f, 23.0f, 21.6445f, 23.0f, 20.0f)
                lineTo(23.0f, 19.0f)
                curveTo(23.0f, 17.3555f, 21.6445f, 16.0f, 20.0f, 16.0f)
                close()
                moveTo(20.0f, 18.0f)
                curveTo(20.5664f, 18.0f, 21.0f, 18.4336f, 21.0f, 19.0f)
                lineTo(21.0f, 20.0f)
                curveTo(21.0f, 20.5664f, 20.5664f, 21.0f, 20.0f, 21.0f)
                curveTo(19.4336f, 21.0f, 19.0f, 20.5664f, 19.0f, 20.0f)
                lineTo(19.0f, 19.0f)
                curveTo(19.0f, 18.4336f, 19.4336f, 18.0f, 20.0f, 18.0f)
                close()
            }
        }
        .build()
        return _percentageSolid!!
    }

private var _percentageSolid: ImageVector? = null
