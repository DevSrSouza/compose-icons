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

public val RegularGroup.StarOff: ImageVector
    get() {
        if (_starOff != null) {
            return _starOff!!
        }
        _starOff = Builder(name = "StarOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(7.0238f, 8.0846f)
                lineTo(3.1574f, 8.6464f)
                curveTo(2.0501f, 8.8073f, 1.6079f, 10.1681f, 2.4092f, 10.9491f)
                lineTo(6.2244f, 14.668f)
                lineTo(5.3237f, 19.9192f)
                curveTo(5.1346f, 21.0221f, 6.2921f, 21.8631f, 7.2825f, 21.3424f)
                lineTo(11.9984f, 18.8631f)
                lineTo(16.7143f, 21.3424f)
                curveTo(17.7047f, 21.8631f, 18.8622f, 21.0221f, 18.6731f, 19.9192f)
                lineTo(18.6348f, 19.6958f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(16.7978f, 17.8587f)
                lineTo(17.1433f, 19.8732f)
                lineTo(12.6266f, 17.4987f)
                curveTo(12.2333f, 17.2919f, 11.7635f, 17.2919f, 11.3702f, 17.4987f)
                lineTo(6.8535f, 19.8732f)
                lineTo(7.7161f, 14.8439f)
                curveTo(7.7913f, 14.4059f, 7.6461f, 13.9591f, 7.3279f, 13.6489f)
                lineTo(3.6738f, 10.0871f)
                lineTo(8.3472f, 9.408f)
                lineTo(16.7978f, 17.8587f)
                close()
                moveTo(20.323f, 10.0871f)
                lineTo(16.751f, 13.569f)
                lineTo(17.8117f, 14.6297f)
                lineTo(21.5877f, 10.9491f)
                curveTo(22.3889f, 10.168f, 21.9468f, 8.8073f, 20.8395f, 8.6464f)
                lineTo(15.567f, 7.8802f)
                lineTo(13.209f, 3.1025f)
                curveTo(12.7138f, 2.0991f, 11.283f, 2.0991f, 10.7878f, 3.1025f)
                lineTo(9.2998f, 6.1176f)
                lineTo(10.4198f, 7.2376f)
                lineTo(11.9984f, 4.0389f)
                lineTo(14.2568f, 8.6148f)
                curveTo(14.4534f, 9.0133f, 14.8335f, 9.2894f, 15.2732f, 9.3533f)
                lineTo(20.323f, 10.0871f)
                close()
            }
        }
        .build()
        return _starOff!!
    }

private var _starOff: ImageVector? = null
