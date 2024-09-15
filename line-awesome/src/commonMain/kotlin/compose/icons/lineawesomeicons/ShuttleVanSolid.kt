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

public val LineAwesomeIcons.ShuttleVanSolid: ImageVector
    get() {
        if (_shuttleVanSolid != null) {
            return _shuttleVanSolid!!
        }
        _shuttleVanSolid = Builder(name = "ShuttleVanSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                curveTo(3.355f, 5.0f, 2.0f, 6.355f, 2.0f, 8.0f)
                lineTo(2.0f, 25.0f)
                lineTo(5.156f, 25.0f)
                curveTo(5.602f, 26.719f, 7.148f, 28.0f, 9.0f, 28.0f)
                curveTo(10.852f, 28.0f, 12.398f, 26.719f, 12.844f, 25.0f)
                lineTo(20.156f, 25.0f)
                curveTo(20.602f, 26.719f, 22.148f, 28.0f, 24.0f, 28.0f)
                curveTo(25.852f, 28.0f, 27.398f, 26.719f, 27.844f, 25.0f)
                lineTo(31.0f, 25.0f)
                lineTo(31.0f, 14.563f)
                curveTo(31.0f, 14.0f, 30.828f, 13.445f, 30.531f, 12.969f)
                lineTo(26.438f, 6.406f)
                curveTo(25.891f, 5.531f, 24.938f, 5.0f, 23.906f, 5.0f)
                close()
                moveTo(5.0f, 7.0f)
                lineTo(10.0f, 7.0f)
                lineTo(10.0f, 13.0f)
                lineTo(4.0f, 13.0f)
                lineTo(4.0f, 8.0f)
                curveTo(4.0f, 7.438f, 4.438f, 7.0f, 5.0f, 7.0f)
                close()
                moveTo(12.0f, 7.0f)
                lineTo(18.0f, 7.0f)
                lineTo(18.0f, 13.0f)
                lineTo(12.0f, 13.0f)
                close()
                moveTo(20.0f, 7.0f)
                lineTo(23.906f, 7.0f)
                curveTo(24.254f, 7.0f, 24.566f, 7.176f, 24.75f, 7.469f)
                lineTo(28.188f, 13.0f)
                lineTo(20.0f, 13.0f)
                close()
                moveTo(4.0f, 15.0f)
                lineTo(29.0f, 15.0f)
                lineTo(29.0f, 17.0f)
                lineTo(26.0f, 17.0f)
                lineTo(26.0f, 19.0f)
                lineTo(29.0f, 19.0f)
                lineTo(29.0f, 23.0f)
                lineTo(27.844f, 23.0f)
                curveTo(27.398f, 21.281f, 25.852f, 20.0f, 24.0f, 20.0f)
                curveTo(22.148f, 20.0f, 20.602f, 21.281f, 20.156f, 23.0f)
                lineTo(12.844f, 23.0f)
                curveTo(12.398f, 21.281f, 10.852f, 20.0f, 9.0f, 20.0f)
                curveTo(7.148f, 20.0f, 5.602f, 21.281f, 5.156f, 23.0f)
                lineTo(4.0f, 23.0f)
                close()
                moveTo(9.0f, 22.0f)
                curveTo(10.117f, 22.0f, 11.0f, 22.883f, 11.0f, 24.0f)
                curveTo(11.0f, 25.117f, 10.117f, 26.0f, 9.0f, 26.0f)
                curveTo(7.883f, 26.0f, 7.0f, 25.117f, 7.0f, 24.0f)
                curveTo(7.0f, 22.883f, 7.883f, 22.0f, 9.0f, 22.0f)
                close()
                moveTo(24.0f, 22.0f)
                curveTo(25.117f, 22.0f, 26.0f, 22.883f, 26.0f, 24.0f)
                curveTo(26.0f, 25.117f, 25.117f, 26.0f, 24.0f, 26.0f)
                curveTo(22.883f, 26.0f, 22.0f, 25.117f, 22.0f, 24.0f)
                curveTo(22.0f, 22.883f, 22.883f, 22.0f, 24.0f, 22.0f)
                close()
            }
        }
        .build()
        return _shuttleVanSolid!!
    }

private var _shuttleVanSolid: ImageVector? = null
