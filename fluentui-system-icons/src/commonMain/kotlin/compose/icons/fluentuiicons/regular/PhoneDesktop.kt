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

public val RegularGroup.PhoneDesktop: ImageVector
    get() {
        if (_phoneDesktop != null) {
            return _phoneDesktop!!
        }
        _phoneDesktop = Builder(name = "PhoneDesktop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2554f, 8.9999f)
                curveTo(9.2219f, 8.9999f, 10.0054f, 9.7834f, 10.0054f, 10.7499f)
                verticalLineTo(20.25f)
                curveTo(10.0054f, 21.2165f, 9.2219f, 22.0f, 8.2554f, 22.0f)
                horizontalLineTo(3.751f)
                curveTo(2.7845f, 22.0f, 2.001f, 21.2165f, 2.001f, 20.25f)
                verticalLineTo(10.7499f)
                curveTo(2.001f, 9.7834f, 2.7845f, 8.9999f, 3.751f, 8.9999f)
                horizontalLineTo(8.2554f)
                close()
                moveTo(8.2554f, 10.4999f)
                horizontalLineTo(3.751f)
                curveTo(3.6129f, 10.4999f, 3.501f, 10.6118f, 3.501f, 10.7499f)
                verticalLineTo(20.25f)
                curveTo(3.501f, 20.3881f, 3.6129f, 20.5f, 3.751f, 20.5f)
                horizontalLineTo(8.2554f)
                curveTo(8.3935f, 20.5f, 8.5054f, 20.3881f, 8.5054f, 20.25f)
                verticalLineTo(10.7499f)
                curveTo(8.5054f, 10.6118f, 8.3935f, 10.4999f, 8.2554f, 10.4999f)
                close()
                moveTo(6.2503f, 18.0f)
                curveTo(6.6646f, 18.0f, 7.0003f, 18.3358f, 7.0003f, 18.75f)
                curveTo(7.0003f, 19.1297f, 6.7182f, 19.4435f, 6.3521f, 19.4932f)
                lineTo(6.2503f, 19.5f)
                horizontalLineTo(5.7503f)
                curveTo(5.3361f, 19.5f, 5.0003f, 19.1642f, 5.0003f, 18.75f)
                curveTo(5.0003f, 18.3703f, 5.2825f, 18.0565f, 5.6486f, 18.0068f)
                lineTo(5.7503f, 18.0f)
                horizontalLineTo(6.2503f)
                close()
                moveTo(19.7504f, 2.0f)
                curveTo(20.9412f, 2.0f, 21.916f, 2.9252f, 21.9952f, 4.096f)
                lineTo(22.0004f, 4.25f)
                verticalLineTo(13.25f)
                curveTo(22.0004f, 14.4409f, 21.0752f, 15.4156f, 19.9044f, 15.4948f)
                lineTo(19.7504f, 15.5f)
                horizontalLineTo(16.0044f)
                verticalLineTo(17.5f)
                horizontalLineTo(17.2504f)
                curveTo(17.6646f, 17.5f, 18.0004f, 17.8358f, 18.0004f, 18.25f)
                curveTo(18.0004f, 18.6297f, 17.7182f, 18.9435f, 17.3521f, 18.9932f)
                lineTo(17.2504f, 19.0f)
                horizontalLineTo(11.0004f)
                verticalLineTo(17.5f)
                horizontalLineTo(14.5044f)
                verticalLineTo(15.5f)
                horizontalLineTo(11.0004f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.7504f)
                curveTo(20.13f, 14.0f, 20.4438f, 13.7178f, 20.4935f, 13.3518f)
                lineTo(20.5004f, 13.25f)
                verticalLineTo(4.25f)
                curveTo(20.5004f, 3.8358f, 20.1646f, 3.5f, 19.7504f, 3.5f)
                horizontalLineTo(6.2503f)
                curveTo(5.8707f, 3.5f, 5.5569f, 3.7822f, 5.5072f, 4.1482f)
                lineTo(5.5003f, 4.25f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0003f)
                verticalLineTo(4.25f)
                curveTo(4.0003f, 3.0591f, 4.9255f, 2.0844f, 6.0963f, 2.0052f)
                lineTo(6.2503f, 2.0f)
                horizontalLineTo(19.7504f)
                close()
            }
        }
        .build()
        return _phoneDesktop!!
    }

private var _phoneDesktop: ImageVector? = null
