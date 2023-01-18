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

public val RegularGroup.DeleteDismiss: ImageVector
    get() {
        if (_deleteDismiss != null) {
            return _deleteDismiss!!
        }
        _deleteDismiss = Builder(name = "DeleteDismiss", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 5.0f)
                curveTo(14.0f, 3.8954f, 13.1046f, 3.0f, 12.0f, 3.0f)
                curveTo(10.8954f, 3.0f, 10.0f, 3.8954f, 10.0f, 5.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(8.5f, 5.0f)
                curveTo(8.5f, 3.067f, 10.067f, 1.5f, 12.0f, 1.5f)
                curveTo(13.933f, 1.5f, 15.5f, 3.067f, 15.5f, 5.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 5.0f, 22.0f, 5.3358f, 22.0f, 5.75f)
                curveTo(22.0f, 6.1642f, 21.6642f, 6.5f, 21.25f, 6.5f)
                horizontalLineTo(19.9309f)
                lineTo(19.4281f, 11.6953f)
                curveTo(18.9712f, 11.4644f, 18.4833f, 11.2858f, 17.9722f, 11.1674f)
                lineTo(18.4239f, 6.5f)
                horizontalLineTo(5.5761f)
                lineTo(6.7342f, 18.4667f)
                curveTo(6.8458f, 19.62f, 7.815f, 20.5f, 8.9737f, 20.5f)
                horizontalLineTo(10.7322f)
                curveTo(11.0194f, 21.051f, 11.3832f, 21.5557f, 11.8096f, 22.0f)
                horizontalLineTo(8.9737f)
                curveTo(7.0425f, 22.0f, 5.4271f, 20.5334f, 5.2411f, 18.6112f)
                lineTo(4.0691f, 6.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 6.5f, 2.0f, 6.1642f, 2.0f, 5.75f)
                curveTo(2.0f, 5.3358f, 2.3358f, 5.0f, 2.75f, 5.0f)
                horizontalLineTo(8.5f)
                close()
                moveTo(22.0f, 17.5f)
                curveTo(22.0f, 20.5376f, 19.5376f, 23.0f, 16.5f, 23.0f)
                curveTo(13.4624f, 23.0f, 11.0f, 20.5376f, 11.0f, 17.5f)
                curveTo(11.0f, 14.4624f, 13.4624f, 12.0f, 16.5f, 12.0f)
                curveTo(19.5376f, 12.0f, 22.0f, 14.4624f, 22.0f, 17.5f)
                close()
                moveTo(14.8536f, 15.1464f)
                curveTo(14.6583f, 14.9512f, 14.3417f, 14.9512f, 14.1464f, 15.1464f)
                curveTo(13.9512f, 15.3417f, 13.9512f, 15.6583f, 14.1464f, 15.8536f)
                lineTo(15.7929f, 17.5f)
                lineTo(14.1464f, 19.1464f)
                curveTo(13.9512f, 19.3417f, 13.9512f, 19.6583f, 14.1464f, 19.8536f)
                curveTo(14.3417f, 20.0488f, 14.6583f, 20.0488f, 14.8536f, 19.8536f)
                lineTo(16.5f, 18.2071f)
                lineTo(18.1464f, 19.8536f)
                curveTo(18.3417f, 20.0488f, 18.6583f, 20.0488f, 18.8536f, 19.8536f)
                curveTo(19.0488f, 19.6583f, 19.0488f, 19.3417f, 18.8536f, 19.1464f)
                lineTo(17.2071f, 17.5f)
                lineTo(18.8536f, 15.8536f)
                curveTo(19.0488f, 15.6583f, 19.0488f, 15.3417f, 18.8536f, 15.1464f)
                curveTo(18.6583f, 14.9512f, 18.3417f, 14.9512f, 18.1464f, 15.1464f)
                lineTo(16.5f, 16.7929f)
                lineTo(14.8536f, 15.1464f)
                close()
            }
        }
        .build()
        return _deleteDismiss!!
    }

private var _deleteDismiss: ImageVector? = null
