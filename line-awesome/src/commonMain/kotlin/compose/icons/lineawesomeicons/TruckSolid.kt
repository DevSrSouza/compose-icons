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

public val LineAwesomeIcons.TruckSolid: ImageVector
    get() {
        if (_truckSolid != null) {
            return _truckSolid!!
        }
        _truckSolid = Builder(name = "TruckSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.0f)
                lineTo(1.0f, 25.0f)
                lineTo(4.156f, 25.0f)
                curveTo(4.602f, 26.719f, 6.148f, 28.0f, 8.0f, 28.0f)
                curveTo(9.852f, 28.0f, 11.398f, 26.719f, 11.844f, 25.0f)
                lineTo(20.156f, 25.0f)
                curveTo(20.602f, 26.719f, 22.148f, 28.0f, 24.0f, 28.0f)
                curveTo(25.852f, 28.0f, 27.398f, 26.719f, 27.844f, 25.0f)
                lineTo(31.0f, 25.0f)
                lineTo(31.0f, 14.594f)
                lineTo(30.719f, 14.281f)
                lineTo(24.719f, 8.281f)
                lineTo(24.406f, 8.0f)
                lineTo(19.0f, 8.0f)
                lineTo(19.0f, 4.0f)
                close()
                moveTo(3.0f, 6.0f)
                lineTo(17.0f, 6.0f)
                lineTo(17.0f, 23.0f)
                lineTo(11.844f, 23.0f)
                curveTo(11.398f, 21.281f, 9.852f, 20.0f, 8.0f, 20.0f)
                curveTo(6.148f, 20.0f, 4.602f, 21.281f, 4.156f, 23.0f)
                lineTo(3.0f, 23.0f)
                close()
                moveTo(19.0f, 10.0f)
                lineTo(23.563f, 10.0f)
                lineTo(29.0f, 15.438f)
                lineTo(29.0f, 23.0f)
                lineTo(27.844f, 23.0f)
                curveTo(27.398f, 21.281f, 25.852f, 20.0f, 24.0f, 20.0f)
                curveTo(22.148f, 20.0f, 20.602f, 21.281f, 20.156f, 23.0f)
                lineTo(19.0f, 23.0f)
                close()
                moveTo(8.0f, 22.0f)
                curveTo(9.117f, 22.0f, 10.0f, 22.883f, 10.0f, 24.0f)
                curveTo(10.0f, 25.117f, 9.117f, 26.0f, 8.0f, 26.0f)
                curveTo(6.883f, 26.0f, 6.0f, 25.117f, 6.0f, 24.0f)
                curveTo(6.0f, 22.883f, 6.883f, 22.0f, 8.0f, 22.0f)
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
        return _truckSolid!!
    }

private var _truckSolid: ImageVector? = null
