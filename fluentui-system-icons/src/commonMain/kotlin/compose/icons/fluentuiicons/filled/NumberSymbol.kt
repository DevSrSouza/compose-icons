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

public val FilledGroup.NumberSymbol: ImageVector
    get() {
        if (_numberSymbol != null) {
            return _numberSymbol!!
        }
        _numberSymbol = Builder(name = "NumberSymbol", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9848f, 3.1646f)
                curveTo(11.0756f, 2.6199f, 10.7076f, 2.1046f, 10.1629f, 2.0138f)
                curveTo(9.6181f, 1.9229f, 9.1028f, 2.2909f, 9.012f, 2.8357f)
                lineTo(8.1512f, 7.9977f)
                lineTo(3.9994f, 8.0002f)
                curveTo(3.4471f, 8.0005f, 2.9996f, 8.4485f, 3.0f, 9.0007f)
                curveTo(3.0003f, 9.553f, 3.4483f, 10.0005f, 4.0005f, 10.0002f)
                lineTo(7.8176f, 9.9979f)
                lineTo(7.1505f, 13.9983f)
                lineTo(2.9996f, 14.0002f)
                curveTo(2.4473f, 14.0004f, 1.9998f, 14.4483f, 2.0f, 15.0006f)
                curveTo(2.0003f, 15.5529f, 2.4482f, 16.0004f, 3.0004f, 16.0002f)
                lineTo(6.817f, 15.9985f)
                lineTo(6.0103f, 20.8357f)
                curveTo(5.9195f, 21.3804f, 6.2875f, 21.8957f, 6.8322f, 21.9865f)
                curveTo(7.377f, 22.0774f, 7.8923f, 21.7094f, 7.9831f, 21.1646f)
                lineTo(8.8448f, 15.9976f)
                lineTo(13.8203f, 15.9953f)
                lineTo(13.0136f, 20.8358f)
                curveTo(12.9228f, 21.3805f, 13.2908f, 21.8958f, 13.8356f, 21.9865f)
                curveTo(14.3803f, 22.0773f, 14.8956f, 21.7093f, 14.9863f, 21.1646f)
                lineTo(15.848f, 15.9944f)
                lineTo(20.0004f, 15.9926f)
                curveTo(20.5527f, 15.9923f, 21.0002f, 15.5444f, 21.0f, 14.9921f)
                curveTo(20.9998f, 14.4399f, 20.5518f, 13.9923f, 19.9996f, 13.9926f)
                lineTo(16.1814f, 13.9943f)
                lineTo(16.8483f, 9.9926f)
                lineTo(21.0005f, 9.9902f)
                curveTo(21.5528f, 9.9898f, 22.0003f, 9.5419f, 22.0f, 8.9896f)
                curveTo(21.9996f, 8.4373f, 21.5517f, 7.9898f, 20.9994f, 7.9901f)
                lineTo(17.1817f, 7.9924f)
                lineTo(17.9863f, 3.1646f)
                curveTo(18.0771f, 2.6198f, 17.7091f, 2.1046f, 17.1644f, 2.0138f)
                curveTo(16.6196f, 1.923f, 16.1044f, 2.291f, 16.0136f, 2.8358f)
                lineTo(15.1539f, 7.9936f)
                lineTo(10.179f, 7.9965f)
                lineTo(10.9848f, 3.1646f)
                close()
                moveTo(9.8455f, 9.9967f)
                lineTo(14.8206f, 9.9938f)
                lineTo(14.1537f, 13.9952f)
                lineTo(9.1783f, 13.9974f)
                lineTo(9.8455f, 9.9967f)
                close()
            }
        }
        .build()
        return _numberSymbol!!
    }

private var _numberSymbol: ImageVector? = null
