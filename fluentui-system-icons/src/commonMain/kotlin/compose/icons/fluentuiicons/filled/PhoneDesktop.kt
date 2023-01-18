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

public val FilledGroup.PhoneDesktop: ImageVector
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
                moveTo(6.2532f, 18.4952f)
                horizontalLineTo(5.7532f)
                lineTo(5.6514f, 18.502f)
                curveTo(5.2853f, 18.5517f, 5.0032f, 18.8655f, 5.0032f, 19.2452f)
                curveTo(5.0032f, 19.6249f, 5.2853f, 19.9387f, 5.6514f, 19.9883f)
                lineTo(5.7532f, 19.9952f)
                horizontalLineTo(6.2532f)
                lineTo(6.355f, 19.9883f)
                curveTo(6.721f, 19.9387f, 7.0032f, 19.6249f, 7.0032f, 19.2452f)
                curveTo(7.0032f, 18.8655f, 6.721f, 18.5517f, 6.355f, 18.502f)
                lineTo(6.2532f, 18.4952f)
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
                verticalLineTo(10.5f)
                curveTo(11.0004f, 9.1745f, 9.9688f, 8.09f, 8.6647f, 8.0053f)
                lineTo(8.5003f, 8.0f)
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
