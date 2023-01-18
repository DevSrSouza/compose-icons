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

public val RegularGroup.StarOneQuarter: ImageVector
    get() {
        if (_starOneQuarter != null) {
            return _starOneQuarter!!
        }
        _starOneQuarter = Builder(name = "StarOneQuarter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.209f, 3.1025f)
                curveTo(12.7138f, 2.0991f, 11.283f, 2.0991f, 10.7878f, 3.1025f)
                lineTo(8.4299f, 7.8802f)
                lineTo(3.1574f, 8.6464f)
                curveTo(2.0501f, 8.8073f, 1.6079f, 10.168f, 2.4092f, 10.9491f)
                lineTo(6.2244f, 14.668f)
                lineTo(5.3237f, 19.9192f)
                curveTo(5.1744f, 20.7898f, 5.8643f, 21.4972f, 6.6487f, 21.5004f)
                curveTo(6.8585f, 21.5016f, 7.0752f, 21.4524f, 7.2845f, 21.3424f)
                lineTo(9.0f, 20.4405f)
                verticalLineTo(20.4394f)
                lineTo(11.9984f, 18.8631f)
                lineTo(16.7143f, 21.3424f)
                curveTo(17.7047f, 21.863f, 18.8622f, 21.022f, 18.6731f, 19.9192f)
                lineTo(17.7724f, 14.668f)
                lineTo(21.5877f, 10.9491f)
                curveTo(22.3889f, 10.168f, 21.9468f, 8.8073f, 20.8395f, 8.6464f)
                lineTo(15.567f, 7.8802f)
                lineTo(13.209f, 3.1025f)
                close()
                moveTo(9.0f, 18.7448f)
                verticalLineTo(9.2827f)
                curveTo(9.3195f, 9.1639f, 9.5861f, 8.9268f, 9.7401f, 8.6148f)
                lineTo(11.9984f, 4.0389f)
                lineTo(14.2568f, 8.6148f)
                curveTo(14.4534f, 9.0132f, 14.8335f, 9.2894f, 15.2732f, 9.3533f)
                lineTo(20.323f, 10.0871f)
                lineTo(16.6689f, 13.6489f)
                curveTo(16.3508f, 13.9591f, 16.2056f, 14.4059f, 16.2807f, 14.8438f)
                lineTo(17.1433f, 19.8732f)
                lineTo(12.6266f, 17.4987f)
                curveTo(12.2333f, 17.2919f, 11.7635f, 17.2919f, 11.3702f, 17.4987f)
                lineTo(9.0f, 18.7448f)
                close()
            }
        }
        .build()
        return _starOneQuarter!!
    }

private var _starOneQuarter: ImageVector? = null
