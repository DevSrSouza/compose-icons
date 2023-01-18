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

public val RegularGroup.DocumentEdit: ImageVector
    get() {
        if (_documentEdit != null) {
            return _documentEdit!!
        }
        _documentEdit = Builder(name = "DocumentEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 3.5f)
                curveTo(5.8358f, 3.5f, 5.5f, 3.8358f, 5.5f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(5.5f, 20.1642f, 5.8358f, 20.5f, 6.25f, 20.5f)
                horizontalLineTo(10.0293f)
                curveTo(9.9222f, 21.0483f, 10.0375f, 21.5732f, 10.3007f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 22.0f, 4.0f, 20.9926f, 4.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(4.0f, 3.0074f, 5.0074f, 2.0f, 6.25f, 2.0f)
                horizontalLineTo(12.3358f)
                curveTo(12.7999f, 2.0f, 13.245f, 2.1844f, 13.5732f, 2.5126f)
                lineTo(19.4874f, 8.4268f)
                curveTo(19.8156f, 8.755f, 20.0f, 9.2001f, 20.0f, 9.6642f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.8698f)
                curveTo(19.7592f, 9.9945f, 19.6484f, 9.9945f, 19.5378f, 10.0f)
                horizontalLineTo(14.0f)
                curveTo(12.8954f, 10.0f, 12.0f, 9.1046f, 12.0f, 8.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(13.5f, 4.5607f)
                verticalLineTo(8.0f)
                curveTo(13.5f, 8.2761f, 13.7239f, 8.5f, 14.0f, 8.5f)
                horizontalLineTo(17.4393f)
                lineTo(13.5f, 4.5607f)
                close()
                moveTo(19.7133f, 11.0f)
                horizontalLineTo(19.7154f)
                curveTo(20.3f, 11.0003f, 20.8845f, 11.2234f, 21.3305f, 11.6695f)
                curveTo(22.2231f, 12.5621f, 22.2231f, 14.0093f, 21.3305f, 14.9019f)
                lineTo(15.4281f, 20.8043f)
                curveTo(15.084f, 21.1485f, 14.6528f, 21.3926f, 14.1806f, 21.5106f)
                lineTo(12.3499f, 21.9683f)
                curveTo(11.5538f, 22.1674f, 10.8326f, 21.4462f, 11.0317f, 20.6501f)
                lineTo(11.4894f, 18.8194f)
                curveTo(11.6074f, 18.3472f, 11.8515f, 17.916f, 12.1957f, 17.5719f)
                lineTo(18.0981f, 11.6695f)
                curveTo(18.5441f, 11.2234f, 19.1287f, 11.0003f, 19.7133f, 11.0f)
                close()
            }
        }
        .build()
        return _documentEdit!!
    }

private var _documentEdit: ImageVector? = null
