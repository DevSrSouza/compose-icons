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

public val LineAwesomeIcons.TruckMovingSolid: ImageVector
    get() {
        if (_truckMovingSolid != null) {
            return _truckMovingSolid!!
        }
        _truckMovingSolid = Builder(name = "TruckMovingSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.0f)
                lineTo(1.0f, 25.0f)
                lineTo(4.1563f, 25.0f)
                curveTo(4.6016f, 26.7188f, 6.1484f, 28.0f, 8.0f, 28.0f)
                curveTo(9.8516f, 28.0f, 11.3984f, 26.7188f, 11.8438f, 25.0f)
                lineTo(20.1563f, 25.0f)
                curveTo(20.6016f, 26.7188f, 22.1484f, 28.0f, 24.0f, 28.0f)
                curveTo(25.8516f, 28.0f, 27.3984f, 26.7188f, 27.8438f, 25.0f)
                lineTo(31.0f, 25.0f)
                lineTo(31.0f, 14.5938f)
                lineTo(30.7188f, 14.2813f)
                lineTo(24.7188f, 8.2813f)
                lineTo(24.4063f, 8.0f)
                lineTo(19.0f, 8.0f)
                lineTo(19.0f, 4.0f)
                close()
                moveTo(3.0f, 6.0f)
                lineTo(17.0f, 6.0f)
                lineTo(17.0f, 23.0f)
                lineTo(11.8438f, 23.0f)
                curveTo(11.3984f, 21.2813f, 9.8516f, 20.0f, 8.0f, 20.0f)
                curveTo(6.1484f, 20.0f, 4.6016f, 21.2813f, 4.1563f, 23.0f)
                lineTo(3.0f, 23.0f)
                close()
                moveTo(19.0f, 10.0f)
                lineTo(23.5625f, 10.0f)
                lineTo(29.0f, 15.4375f)
                lineTo(29.0f, 23.0f)
                lineTo(27.8438f, 23.0f)
                curveTo(27.3984f, 21.2813f, 25.8516f, 20.0f, 24.0f, 20.0f)
                curveTo(22.1484f, 20.0f, 20.6016f, 21.2813f, 20.1563f, 23.0f)
                lineTo(19.0f, 23.0f)
                close()
                moveTo(8.0f, 22.0f)
                curveTo(9.1172f, 22.0f, 10.0f, 22.8828f, 10.0f, 24.0f)
                curveTo(10.0f, 25.1172f, 9.1172f, 26.0f, 8.0f, 26.0f)
                curveTo(6.8828f, 26.0f, 6.0f, 25.1172f, 6.0f, 24.0f)
                curveTo(6.0f, 22.8828f, 6.8828f, 22.0f, 8.0f, 22.0f)
                close()
                moveTo(24.0f, 22.0f)
                curveTo(25.1172f, 22.0f, 26.0f, 22.8828f, 26.0f, 24.0f)
                curveTo(26.0f, 25.1172f, 25.1172f, 26.0f, 24.0f, 26.0f)
                curveTo(22.8828f, 26.0f, 22.0f, 25.1172f, 22.0f, 24.0f)
                curveTo(22.0f, 22.8828f, 22.8828f, 22.0f, 24.0f, 22.0f)
                close()
            }
        }
        .build()
        return _truckMovingSolid!!
    }

private var _truckMovingSolid: ImageVector? = null
