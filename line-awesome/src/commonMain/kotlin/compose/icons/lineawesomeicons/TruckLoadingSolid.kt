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

public val LineAwesomeIcons.TruckLoadingSolid: ImageVector
    get() {
        if (_truckLoadingSolid != null) {
            return _truckLoadingSolid!!
        }
        _truckLoadingSolid = Builder(name = "TruckLoadingSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 5.0f)
                lineTo(17.0f, 21.074f)
                lineTo(2.732f, 25.035f)
                lineTo(3.268f, 26.963f)
                lineTo(20.016f, 22.314f)
                curveTo(20.179f, 24.925f, 22.349f, 27.0f, 25.0f, 27.0f)
                curveTo(27.757f, 27.0f, 30.0f, 24.757f, 30.0f, 22.0f)
                curveTo(30.0f, 19.243f, 27.757f, 17.0f, 25.0f, 17.0f)
                curveTo(22.902f, 17.0f, 21.108f, 18.302f, 20.367f, 20.139f)
                lineTo(19.0f, 20.518f)
                lineTo(19.0f, 7.0f)
                lineTo(30.0f, 7.0f)
                lineTo(30.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                close()
                moveTo(12.461f, 9.764f)
                lineTo(1.916f, 12.787f)
                lineTo(4.691f, 22.471f)
                lineTo(15.236f, 19.445f)
                lineTo(12.461f, 9.764f)
                close()
                moveTo(11.09f, 12.236f)
                lineTo(12.764f, 18.074f)
                lineTo(6.064f, 19.994f)
                lineTo(4.391f, 14.158f)
                lineTo(11.09f, 12.236f)
                close()
                moveTo(25.0f, 19.0f)
                curveTo(26.654f, 19.0f, 28.0f, 20.346f, 28.0f, 22.0f)
                curveTo(28.0f, 23.654f, 26.654f, 25.0f, 25.0f, 25.0f)
                curveTo(23.346f, 25.0f, 22.0f, 23.654f, 22.0f, 22.0f)
                curveTo(22.0f, 20.346f, 23.346f, 19.0f, 25.0f, 19.0f)
                close()
            }
        }
        .build()
        return _truckLoadingSolid!!
    }

private var _truckLoadingSolid: ImageVector? = null
