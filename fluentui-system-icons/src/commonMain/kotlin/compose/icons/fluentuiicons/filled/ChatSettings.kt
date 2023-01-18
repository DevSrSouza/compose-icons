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

public val FilledGroup.ChatSettings: ImageVector
    get() {
        if (_chatSettings != null) {
            return _chatSettings!!
        }
        _chatSettings = Builder(name = "ChatSettings", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 12.2628f, 21.9899f, 12.5232f, 21.97f, 12.7809f)
                curveTo(20.805f, 11.6771f, 19.2316f, 11.0f, 17.5f, 11.0f)
                curveTo(13.9101f, 11.0f, 11.0f, 13.9101f, 11.0f, 17.5f)
                curveTo(11.0f, 19.2316f, 11.6771f, 20.805f, 12.7809f, 21.97f)
                curveTo(12.5232f, 21.9899f, 12.2628f, 22.0f, 12.0f, 22.0f)
                curveTo(10.3596f, 22.0f, 8.7752f, 21.6039f, 7.3558f, 20.8583f)
                lineTo(3.0654f, 21.9753f)
                curveTo(2.6111f, 22.0937f, 2.1469f, 21.8213f, 2.0286f, 21.367f)
                curveTo(1.992f, 21.2266f, 1.992f, 21.0791f, 2.0285f, 20.9386f)
                lineTo(3.1449f, 16.6502f)
                curveTo(2.3972f, 15.2294f, 2.0f, 13.6428f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.2782f, 13.9756f)
                curveTo(14.593f, 15.0658f, 13.9386f, 16.1992f, 12.837f, 16.4718f)
                lineTo(12.2528f, 16.6163f)
                curveTo(12.2079f, 16.904f, 12.1846f, 17.1992f, 12.1846f, 17.5f)
                curveTo(12.1846f, 17.8147f, 12.2101f, 18.1232f, 12.2592f, 18.4234f)
                lineTo(12.7986f, 18.5533f)
                curveTo(13.9111f, 18.8212f, 14.5725f, 19.9663f, 14.2486f, 21.0638f)
                lineTo(14.0623f, 21.6951f)
                curveTo(14.5014f, 22.0807f, 15.0019f, 22.3939f, 15.5464f, 22.6166f)
                lineTo(16.0397f, 22.0979f)
                curveTo(16.8283f, 21.2687f, 18.1506f, 21.2689f, 18.9388f, 22.0984f)
                lineTo(19.4375f, 22.6232f)
                curveTo(19.9811f, 22.4029f, 20.4811f, 22.0927f, 20.9204f, 21.7103f)
                lineTo(20.7223f, 21.0244f)
                curveTo(20.4076f, 19.9341f, 21.062f, 18.8007f, 22.1635f, 18.5281f)
                lineTo(22.7472f, 18.3837f)
                curveTo(22.7922f, 18.096f, 22.8155f, 17.8008f, 22.8155f, 17.5f)
                curveTo(22.8155f, 17.1852f, 22.7899f, 16.8767f, 22.7409f, 16.5764f)
                lineTo(22.2019f, 16.4466f)
                curveTo(21.0894f, 16.1787f, 20.4281f, 15.0337f, 20.7519f, 13.9361f)
                lineTo(20.9381f, 13.3052f)
                curveTo(20.499f, 12.9195f, 19.9985f, 12.6063f, 19.4539f, 12.3835f)
                lineTo(18.9608f, 12.902f)
                curveTo(18.1722f, 13.7313f, 16.85f, 13.731f, 16.0617f, 12.9015f)
                lineTo(15.5629f, 12.3766f)
                curveTo(15.0193f, 12.5969f, 14.5194f, 12.907f, 14.0801f, 13.2894f)
                lineTo(14.2782f, 13.9756f)
                close()
                moveTo(17.5f, 16.0f)
                curveTo(18.3007f, 16.0f, 18.9497f, 16.6716f, 18.9497f, 17.5f)
                curveTo(18.9497f, 18.3284f, 18.3007f, 19.0f, 17.5f, 19.0f)
                curveTo(16.6994f, 19.0f, 16.0504f, 18.3284f, 16.0504f, 17.5f)
                curveTo(16.0504f, 16.6716f, 16.6994f, 16.0f, 17.5f, 16.0f)
                close()
            }
        }
        .build()
        return _chatSettings!!
    }

private var _chatSettings: ImageVector? = null
