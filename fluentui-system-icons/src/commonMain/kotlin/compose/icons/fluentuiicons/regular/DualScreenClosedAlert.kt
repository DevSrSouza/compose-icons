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

public val RegularGroup.DualScreenClosedAlert: ImageVector
    get() {
        if (_dualScreenClosedAlert != null) {
            return _dualScreenClosedAlert!!
        }
        _dualScreenClosedAlert = Builder(name = "DualScreenClosedAlert", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4986f, 2.0f)
                lineTo(16.5014f, 2.0f)
                curveTo(17.561f, 2.003f, 18.5763f, 2.4252f, 19.3255f, 3.1745f)
                curveTo(20.0747f, 3.9237f, 20.497f, 4.939f, 20.5f, 5.9986f)
                lineTo(20.5f, 6.0f)
                lineTo(20.5f, 8.519f)
                lineTo(21.8841f, 10.1799f)
                curveTo(22.0083f, 10.329f, 22.0351f, 10.5364f, 21.9528f, 10.7121f)
                curveTo(21.8705f, 10.8878f, 21.694f, 11.0f, 21.5f, 11.0f)
                horizontalLineTo(11.5f)
                curveTo(11.306f, 11.0f, 11.1295f, 10.8878f, 11.0472f, 10.7121f)
                curveTo(10.9649f, 10.5364f, 10.9917f, 10.329f, 11.1159f, 10.1799f)
                lineTo(12.5f, 8.519f)
                verticalLineTo(5.9986f)
                curveTo(12.503f, 4.939f, 12.9253f, 3.9237f, 13.6745f, 3.1745f)
                curveTo(14.4238f, 2.4252f, 15.439f, 2.003f, 16.4986f, 2.0f)
                close()
                moveTo(5.75f, 5.0f)
                horizontalLineTo(11.6028f)
                curveTo(11.5359f, 5.3253f, 11.501f, 5.6587f, 11.5f, 5.9957f)
                verticalLineTo(6.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(14.75f)
                curveTo(15.1642f, 19.5f, 15.5f, 19.1642f, 15.5f, 18.75f)
                verticalLineTo(13.8293f)
                curveTo(15.8128f, 13.9398f, 16.1494f, 14.0f, 16.5f, 14.0f)
                curveTo(16.6704f, 14.0f, 16.8374f, 13.9858f, 17.0f, 13.9585f)
                verticalLineTo(18.75f)
                curveTo(17.0f, 19.9926f, 15.9926f, 21.0f, 14.75f, 21.0f)
                horizontalLineTo(5.75f)
                curveTo(5.3358f, 21.0f, 5.0f, 20.6642f, 5.0f, 20.25f)
                verticalLineTo(5.75f)
                curveTo(5.0f, 5.3358f, 5.3358f, 5.0f, 5.75f, 5.0f)
                close()
                moveTo(15.504f, 12.7319f)
                curveTo(15.2015f, 12.5563f, 14.9508f, 12.3038f, 14.7773f, 12.0f)
                horizontalLineTo(18.2227f)
                curveTo(18.0492f, 12.3038f, 17.7985f, 12.5563f, 17.496f, 12.7319f)
                curveTo(17.1934f, 12.9076f, 16.8498f, 13.0001f, 16.5f, 13.0001f)
                curveTo(16.1502f, 13.0001f, 15.8066f, 12.9076f, 15.504f, 12.7319f)
                close()
            }
        }
        .build()
        return _dualScreenClosedAlert!!
    }

private var _dualScreenClosedAlert: ImageVector? = null
