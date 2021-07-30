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

public val LineAwesomeIcons.WarehouseSolid: ImageVector
    get() {
        if (_warehouseSolid != null) {
            return _warehouseSolid!!
        }
        _warehouseSolid = Builder(name = "WarehouseSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.9063f)
                lineTo(3.625f, 10.0625f)
                lineTo(3.0f, 10.3438f)
                lineTo(3.0f, 27.0f)
                lineTo(29.0f, 27.0f)
                lineTo(29.0f, 10.3438f)
                lineTo(28.375f, 10.0625f)
                close()
                moveTo(16.0f, 7.0938f)
                lineTo(27.0f, 11.6875f)
                lineTo(27.0f, 25.0f)
                lineTo(25.0f, 25.0f)
                lineTo(25.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                lineTo(7.0f, 25.0f)
                lineTo(5.0f, 25.0f)
                lineTo(5.0f, 11.6875f)
                close()
                moveTo(9.0f, 16.0f)
                lineTo(23.0f, 16.0f)
                lineTo(23.0f, 25.0f)
                lineTo(9.0f, 25.0f)
                close()
            }
        }
        .build()
        return _warehouseSolid!!
    }

private var _warehouseSolid: ImageVector? = null
