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

public val RegularGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7878f, 3.1021f)
                curveTo(11.283f, 2.0988f, 12.7138f, 2.0988f, 13.209f, 3.1021f)
                lineTo(15.567f, 7.8799f)
                lineTo(20.8395f, 8.646f)
                curveTo(21.9468f, 8.8069f, 22.3889f, 10.1677f, 21.5877f, 10.9487f)
                lineTo(17.7724f, 14.6676f)
                lineTo(18.6731f, 19.9189f)
                curveTo(18.8622f, 21.0217f, 17.7047f, 21.8627f, 16.7143f, 21.342f)
                lineTo(11.9984f, 18.8627f)
                lineTo(7.2825f, 21.342f)
                curveTo(6.2921f, 21.8627f, 5.1346f, 21.0217f, 5.3237f, 19.9189f)
                lineTo(6.2244f, 14.6676f)
                lineTo(2.4092f, 10.9487f)
                curveTo(1.6079f, 10.1677f, 2.0501f, 8.8069f, 3.1574f, 8.646f)
                lineTo(8.4299f, 7.8799f)
                lineTo(10.7878f, 3.1021f)
                close()
                moveTo(11.9984f, 4.0385f)
                lineTo(9.7401f, 8.6144f)
                curveTo(9.5434f, 9.0129f, 9.1633f, 9.289f, 8.7236f, 9.3529f)
                lineTo(3.6738f, 10.0867f)
                lineTo(7.3279f, 13.6486f)
                curveTo(7.6461f, 13.9587f, 7.7913f, 14.4055f, 7.7161f, 14.8435f)
                lineTo(6.8535f, 19.8729f)
                lineTo(11.3702f, 17.4983f)
                curveTo(11.7635f, 17.2915f, 12.2333f, 17.2915f, 12.6266f, 17.4983f)
                lineTo(17.1433f, 19.8729f)
                lineTo(16.2807f, 14.8435f)
                curveTo(16.2056f, 14.4055f, 16.3508f, 13.9587f, 16.6689f, 13.6486f)
                lineTo(20.323f, 10.0867f)
                lineTo(15.2732f, 9.3529f)
                curveTo(14.8335f, 9.289f, 14.4534f, 9.0129f, 14.2568f, 8.6144f)
                lineTo(11.9984f, 4.0385f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
