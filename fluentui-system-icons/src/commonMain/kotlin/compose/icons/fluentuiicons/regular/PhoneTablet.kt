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

public val RegularGroup.PhoneTablet: ImageVector
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
                moveTo(8.2554f, 8.4999f)
                horizontalLineTo(3.751f)
                curveTo(3.6129f, 8.4999f, 3.501f, 8.6118f, 3.501f, 8.7499f)
                verticalLineTo(18.25f)
                curveTo(3.501f, 18.3881f, 3.6129f, 18.5f, 3.751f, 18.5f)
                horizontalLineTo(8.2554f)
                curveTo(8.3935f, 18.5f, 8.5054f, 18.3881f, 8.5054f, 18.25f)
                verticalLineTo(8.7499f)
                curveTo(8.5054f, 8.6118f, 8.3935f, 8.4999f, 8.2554f, 8.4999f)
                close()
                moveTo(6.2532f, 16.0f)
                curveTo(6.6674f, 16.0f, 7.0032f, 16.3358f, 7.0032f, 16.75f)
                curveTo(7.0032f, 17.1297f, 6.721f, 17.4435f, 6.355f, 17.4932f)
                lineTo(6.2532f, 17.5f)
                horizontalLineTo(5.7532f)
                curveTo(5.339f, 17.5f, 5.0032f, 17.1642f, 5.0032f, 16.75f)
                curveTo(5.0032f, 16.3703f, 5.2853f, 16.0565f, 5.6514f, 16.0068f)
                lineTo(5.7532f, 16.0f)
                horizontalLineTo(6.2532f)
                close()
                moveTo(19.7504f, 4.0f)
                curveTo(20.9412f, 4.0f, 21.916f, 4.9252f, 21.9952f, 6.096f)
                lineTo(22.0004f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(22.0004f, 15.9409f, 21.0752f, 16.9156f, 19.9044f, 16.9948f)
                lineTo(19.7504f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(19.7504f)
                curveTo(20.13f, 15.5f, 20.4438f, 15.2178f, 20.4935f, 14.8518f)
                lineTo(20.5004f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(20.5004f, 5.8703f, 20.2182f, 5.5565f, 19.8521f, 5.5068f)
                lineTo(19.7504f, 5.5f)
                horizontalLineTo(8.2503f)
                curveTo(7.9239f, 5.5f, 7.6462f, 5.7085f, 7.5432f, 5.9996f)
                lineTo(6.014f, 6.0004f)
                curveTo(6.1323f, 4.9288f, 7.0031f, 4.0839f, 8.0863f, 4.0059f)
                lineTo(8.2503f, 4.0f)
                horizontalLineTo(19.7504f)
                close()
                moveTo(15.2504f, 13.0f)
                curveTo(15.6646f, 13.0f, 16.0004f, 13.3358f, 16.0004f, 13.75f)
                curveTo(16.0004f, 14.1642f, 15.6646f, 14.5f, 15.2504f, 14.5f)
                horizontalLineTo(12.7504f)
                curveTo(12.3361f, 14.5f, 12.0004f, 14.1642f, 12.0004f, 13.75f)
                curveTo(12.0004f, 13.3358f, 12.3361f, 13.0f, 12.7504f, 13.0f)
                horizontalLineTo(15.2504f)
                close()
            }
        }
        .build()
        return _phoneTablet!!
    }

private var _phoneTablet: ImageVector? = null
