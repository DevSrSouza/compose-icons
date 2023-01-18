package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.87f, 2.6688f)
                lineTo(20.8385f, 7.6373f)
                curveTo(21.7172f, 8.516f, 21.7172f, 9.9406f, 20.8385f, 10.8193f)
                lineTo(12.1567f, 19.4998f)
                lineTo(18.2546f, 19.5f)
                curveTo(18.6343f, 19.5f, 18.9481f, 19.7821f, 18.9977f, 20.1482f)
                lineTo(19.0046f, 20.25f)
                curveTo(19.0046f, 20.6297f, 18.7224f, 20.9435f, 18.3563f, 20.9931f)
                lineTo(18.2546f, 21.0f)
                lineTo(9.8446f, 21.0012f)
                curveTo(9.2283f, 21.0348f, 8.6009f, 20.8163f, 8.1302f, 20.3456f)
                lineTo(3.1617f, 15.377f)
                curveTo(2.283f, 14.4984f, 2.283f, 13.0737f, 3.1617f, 12.1951f)
                lineTo(12.688f, 2.6688f)
                curveTo(13.5667f, 1.7901f, 14.9913f, 1.7901f, 15.87f, 2.6688f)
                close()
                moveTo(11.6977f, 17.7583f)
                lineTo(5.743f, 11.8035f)
                lineTo(4.2367f, 13.2701f)
                curveTo(3.9438f, 13.5629f, 3.9438f, 14.0378f, 4.2367f, 14.3307f)
                lineTo(9.1825f, 19.2763f)
                curveTo(9.4799f, 19.5646f, 9.9547f, 19.5571f, 10.243f, 19.2596f)
                lineTo(11.6977f, 17.7583f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
