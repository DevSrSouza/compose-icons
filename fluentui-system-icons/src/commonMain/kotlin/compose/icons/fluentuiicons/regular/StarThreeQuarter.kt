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

public val RegularGroup.StarThreeQuarter: ImageVector
    get() {
        if (_starThreeQuarter != null) {
            return _starThreeQuarter!!
        }
        _starThreeQuarter = Builder(name = "StarThreeQuarter", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.211f, 3.1025f)
                lineTo(15.0f, 6.7275f)
                verticalLineTo(6.7315f)
                lineTo(15.567f, 7.8802f)
                lineTo(20.8395f, 8.6464f)
                curveTo(21.9468f, 8.8073f, 22.3889f, 10.168f, 21.5877f, 10.9491f)
                lineTo(17.7724f, 14.668f)
                lineTo(18.6731f, 19.9192f)
                curveTo(18.8622f, 21.022f, 17.7047f, 21.863f, 16.7143f, 21.3424f)
                lineTo(11.9994f, 18.8636f)
                lineTo(7.2845f, 21.3424f)
                curveTo(7.0774f, 21.4513f, 6.8629f, 21.5006f, 6.655f, 21.5004f)
                curveTo(5.868f, 21.501f, 5.174f, 20.7921f, 5.3237f, 19.9192f)
                lineTo(6.2244f, 14.668f)
                lineTo(2.4092f, 10.9491f)
                curveTo(1.6079f, 10.168f, 2.0501f, 8.8073f, 3.1574f, 8.6464f)
                lineTo(8.4299f, 7.8802f)
                lineTo(10.7878f, 3.1025f)
                curveTo(11.0356f, 2.6005f, 11.5176f, 2.3496f, 11.9994f, 2.35f)
                curveTo(12.4812f, 2.3496f, 12.9632f, 2.6005f, 13.211f, 3.1025f)
                close()
                moveTo(15.0f, 9.2839f)
                verticalLineTo(18.7464f)
                lineTo(17.1433f, 19.8732f)
                lineTo(16.2807f, 14.8438f)
                curveTo(16.2056f, 14.4059f, 16.3508f, 13.9591f, 16.6689f, 13.6489f)
                lineTo(20.323f, 10.0871f)
                lineTo(15.2732f, 9.3533f)
                curveTo(15.179f, 9.3396f, 15.0875f, 9.3162f, 15.0f, 9.2839f)
                close()
            }
        }
        .build()
        return _starThreeQuarter!!
    }

private var _starThreeQuarter: ImageVector? = null
