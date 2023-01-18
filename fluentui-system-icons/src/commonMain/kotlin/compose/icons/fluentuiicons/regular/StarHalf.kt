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

public val RegularGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9993f, 2.35f)
                curveTo(11.5175f, 2.3497f, 11.0356f, 2.6005f, 10.7878f, 3.1025f)
                lineTo(8.4299f, 7.8802f)
                lineTo(3.1574f, 8.6464f)
                curveTo(2.0501f, 8.8073f, 1.6079f, 10.168f, 2.4092f, 10.9491f)
                lineTo(6.2244f, 14.668f)
                lineTo(5.3237f, 19.9192f)
                curveTo(5.174f, 20.7921f, 5.868f, 21.501f, 6.655f, 21.5004f)
                curveTo(6.8629f, 21.5006f, 7.0774f, 21.4513f, 7.2845f, 21.3424f)
                lineTo(11.9994f, 18.8636f)
                lineTo(16.7143f, 21.3424f)
                curveTo(17.7047f, 21.863f, 18.8622f, 21.022f, 18.6731f, 19.9192f)
                lineTo(17.7724f, 14.668f)
                lineTo(21.5877f, 10.9491f)
                curveTo(22.3889f, 10.168f, 21.9468f, 8.8073f, 20.8395f, 8.6464f)
                lineTo(15.567f, 7.8802f)
                lineTo(13.209f, 3.1025f)
                curveTo(12.9617f, 2.6014f, 12.4803f, 2.3505f, 11.9993f, 2.35f)
                curveTo(11.9991f, 2.35f, 11.9995f, 2.35f, 11.9993f, 2.35f)
                close()
                moveTo(12.0f, 17.3436f)
                verticalLineTo(4.0421f)
                lineTo(14.2568f, 8.6148f)
                curveTo(14.4534f, 9.0132f, 14.8335f, 9.2894f, 15.2732f, 9.3533f)
                lineTo(20.323f, 10.0871f)
                lineTo(16.6689f, 13.6489f)
                curveTo(16.3508f, 13.9591f, 16.2056f, 14.4059f, 16.2807f, 14.8438f)
                lineTo(17.1433f, 19.8732f)
                lineTo(12.6266f, 17.4987f)
                curveTo(12.4305f, 17.3955f, 12.2153f, 17.3439f, 12.0f, 17.3436f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
