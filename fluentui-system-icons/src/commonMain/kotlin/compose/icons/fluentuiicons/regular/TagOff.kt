package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.TagOff: ImageVector
    get() {
        if (_tagOff != null) {
            return _tagOff!!
        }
        _tagOff = Builder(name = "TagOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9423f, 8.003f)
                lineTo(2.2197f, 3.2803f)
                curveTo(1.9268f, 2.9874f, 1.9268f, 2.5126f, 2.2197f, 2.2197f)
                curveTo(2.5126f, 1.9268f, 2.9874f, 1.9268f, 3.2803f, 2.2197f)
                lineTo(21.7803f, 20.7197f)
                curveTo(22.0732f, 21.0126f, 22.0732f, 21.4874f, 21.7803f, 21.7803f)
                curveTo(21.4874f, 22.0732f, 21.0126f, 22.0732f, 20.7197f, 21.7803f)
                lineTo(15.9998f, 17.0604f)
                lineTo(12.5481f, 20.5129f)
                curveTo(11.2787f, 21.7798f, 9.2229f, 21.7807f, 7.9518f, 20.5143f)
                lineTo(3.4901f, 16.0592f)
                curveTo(2.2196f, 14.7913f, 2.218f, 12.7334f, 3.4863f, 11.4632f)
                lineTo(6.9423f, 8.003f)
                close()
                moveTo(14.9391f, 15.9998f)
                lineTo(8.003f, 9.0637f)
                lineTo(4.5351f, 12.5358f)
                curveTo(3.8649f, 13.2207f, 3.87f, 14.3191f, 4.5498f, 14.9977f)
                lineTo(9.011f, 19.4522f)
                curveTo(9.6959f, 20.1345f, 10.8043f, 20.134f, 11.4879f, 19.4518f)
                lineTo(14.9391f, 15.9998f)
                close()
                moveTo(19.9884f, 10.9492f)
                lineTo(16.9995f, 13.9388f)
                lineTo(18.0602f, 14.9995f)
                lineTo(21.0492f, 12.0098f)
                curveTo(21.6585f, 11.4003f, 22.0008f, 10.5738f, 22.0008f, 9.712f)
                verticalLineTo(4.25f)
                curveTo(22.0008f, 3.0074f, 20.9934f, 2.0f, 19.7508f, 2.0f)
                horizontalLineTo(14.2855f)
                curveTo(13.4228f, 2.0f, 12.5956f, 2.343f, 11.986f, 2.9533f)
                lineTo(9.0018f, 5.9411f)
                lineTo(10.0624f, 7.0018f)
                lineTo(13.0473f, 4.0133f)
                curveTo(13.3755f, 3.6847f, 13.821f, 3.5f, 14.2855f, 3.5f)
                horizontalLineTo(19.7508f)
                curveTo(20.165f, 3.5f, 20.5008f, 3.8358f, 20.5008f, 4.25f)
                verticalLineTo(9.712f)
                curveTo(20.5008f, 10.176f, 20.3165f, 10.6211f, 19.9884f, 10.9492f)
                close()
                moveTo(17.0008f, 5.5022f)
                curveTo(17.8292f, 5.5022f, 18.5007f, 6.1737f, 18.5007f, 7.0022f)
                curveTo(18.5007f, 7.8306f, 17.8292f, 8.5021f, 17.0008f, 8.5021f)
                curveTo(16.1724f, 8.5021f, 15.5008f, 7.8306f, 15.5008f, 7.0022f)
                curveTo(15.5008f, 6.1737f, 16.1724f, 5.5022f, 17.0008f, 5.5022f)
                close()
            }
        }
        .build()
        return _tagOff!!
    }

private var _tagOff: ImageVector? = null
