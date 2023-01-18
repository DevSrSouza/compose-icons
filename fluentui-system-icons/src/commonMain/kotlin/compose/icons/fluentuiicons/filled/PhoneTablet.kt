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

public val FilledGroup.PhoneTablet: ImageVector
    get() {
        if (_phoneTablet != null) {
            return _phoneTablet!!
        }
        _phoneTablet = Builder(name = "PhoneTablet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2554f, 6.9999f)
                curveTo(9.2219f, 6.9999f, 10.0054f, 7.7834f, 10.0054f, 8.7499f)
                verticalLineTo(18.25f)
                curveTo(10.0054f, 19.2165f, 9.2219f, 20.0f, 8.2554f, 20.0f)
                horizontalLineTo(3.751f)
                curveTo(2.7845f, 20.0f, 2.001f, 19.2165f, 2.001f, 18.25f)
                verticalLineTo(8.7499f)
                curveTo(2.001f, 7.7834f, 2.7845f, 6.9999f, 3.751f, 6.9999f)
                horizontalLineTo(8.2554f)
                close()
                moveTo(6.2532f, 16.4952f)
                horizontalLineTo(5.7532f)
                lineTo(5.6514f, 16.502f)
                curveTo(5.2853f, 16.5517f, 5.0032f, 16.8655f, 5.0032f, 17.2452f)
                curveTo(5.0032f, 17.6249f, 5.2853f, 17.9387f, 5.6514f, 17.9883f)
                lineTo(5.7532f, 17.9952f)
                horizontalLineTo(6.2532f)
                lineTo(6.355f, 17.9883f)
                curveTo(6.721f, 17.9387f, 7.0032f, 17.6249f, 7.0032f, 17.2452f)
                curveTo(7.0032f, 16.8655f, 6.721f, 16.5517f, 6.355f, 16.502f)
                lineTo(6.2532f, 16.4952f)
                close()
                moveTo(19.7504f, 4.0f)
                curveTo(20.9412f, 4.0f, 21.916f, 4.9252f, 21.9952f, 6.096f)
                lineTo(22.0004f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(22.0004f, 15.9409f, 21.0752f, 16.9156f, 19.9044f, 16.9948f)
                lineTo(19.7504f, 17.0f)
                horizontalLineTo(11.0f)
                lineTo(11.0004f, 8.5f)
                curveTo(11.0004f, 7.1745f, 9.9688f, 6.09f, 8.6647f, 6.0053f)
                lineTo(8.5003f, 6.0f)
                lineTo(6.014f, 6.0004f)
                curveTo(6.1323f, 4.9288f, 7.0031f, 4.0839f, 8.0863f, 4.0059f)
                lineTo(8.2503f, 4.0f)
                horizontalLineTo(19.7504f)
                close()
                moveTo(15.2504f, 13.5f)
                horizontalLineTo(12.7504f)
                curveTo(12.3361f, 13.5f, 12.0004f, 13.8358f, 12.0004f, 14.25f)
                curveTo(12.0004f, 14.6297f, 12.2825f, 14.9435f, 12.6486f, 14.9932f)
                lineTo(12.7504f, 15.0f)
                horizontalLineTo(15.2504f)
                curveTo(15.6646f, 15.0f, 16.0004f, 14.6642f, 16.0004f, 14.25f)
                curveTo(16.0004f, 13.8703f, 15.7182f, 13.5565f, 15.3521f, 13.5068f)
                lineTo(15.2504f, 13.5f)
                close()
            }
        }
        .build()
        return _phoneTablet!!
    }

private var _phoneTablet: ImageVector? = null
