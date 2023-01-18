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

public val FilledGroup.TagOff: ImageVector
    get() {
        if (_tagOff != null) {
            return _tagOff!!
        }
        _tagOff = Builder(name = "TagOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9998f, 17.0604f)
                lineTo(20.7197f, 21.7803f)
                curveTo(21.0126f, 22.0732f, 21.4874f, 22.0732f, 21.7803f, 21.7803f)
                curveTo(22.0732f, 21.4874f, 22.0732f, 21.0126f, 21.7803f, 20.7197f)
                lineTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(6.9423f, 8.003f)
                lineTo(3.4863f, 11.4632f)
                curveTo(2.218f, 12.7334f, 2.2196f, 14.7913f, 3.4901f, 16.0592f)
                lineTo(7.9518f, 20.5143f)
                curveTo(9.2229f, 21.7807f, 11.2787f, 21.7798f, 12.5481f, 20.5129f)
                lineTo(15.9998f, 17.0604f)
                close()
                moveTo(21.0492f, 12.0098f)
                lineTo(18.0602f, 14.9995f)
                lineTo(9.0018f, 5.9411f)
                lineTo(11.986f, 2.9533f)
                curveTo(12.5956f, 2.343f, 13.4228f, 2.0f, 14.2855f, 2.0f)
                horizontalLineTo(19.7508f)
                curveTo(20.9934f, 2.0f, 22.0008f, 3.0074f, 22.0008f, 4.25f)
                verticalLineTo(9.712f)
                curveTo(22.0008f, 10.5738f, 21.6585f, 11.4003f, 21.0492f, 12.0098f)
                close()
                moveTo(17.0008f, 5.5022f)
                curveTo(16.1724f, 5.5022f, 15.5008f, 6.1737f, 15.5008f, 7.0022f)
                curveTo(15.5008f, 7.8306f, 16.1724f, 8.5021f, 17.0008f, 8.5021f)
                curveTo(17.8292f, 8.5021f, 18.5007f, 7.8306f, 18.5007f, 7.0022f)
                curveTo(18.5007f, 6.1737f, 17.8292f, 5.5022f, 17.0008f, 5.5022f)
                close()
            }
        }
        .build()
        return _tagOff!!
    }

private var _tagOff: ImageVector? = null
