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

public val FilledGroup.ProjectionScreenDismiss: ImageVector
    get() {
        if (_projectionScreenDismiss != null) {
            return _projectionScreenDismiss!!
        }
        _projectionScreenDismiss = Builder(name = "ProjectionScreenDismiss", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 6.5f)
                curveTo(23.0f, 9.5376f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 9.5376f, 12.0f, 6.5f)
                curveTo(12.0f, 3.4624f, 14.4624f, 1.0f, 17.5f, 1.0f)
                curveTo(20.5376f, 1.0f, 23.0f, 3.4624f, 23.0f, 6.5f)
                close()
                moveTo(15.8536f, 4.1465f)
                curveTo(15.6583f, 3.9512f, 15.3417f, 3.9512f, 15.1464f, 4.1465f)
                curveTo(14.9512f, 4.3417f, 14.9512f, 4.6583f, 15.1464f, 4.8535f)
                lineTo(16.7929f, 6.5f)
                lineTo(15.1464f, 8.1465f)
                curveTo(14.9512f, 8.3417f, 14.9512f, 8.6583f, 15.1464f, 8.8535f)
                curveTo(15.3417f, 9.0488f, 15.6583f, 9.0488f, 15.8536f, 8.8535f)
                lineTo(17.5f, 7.2071f)
                lineTo(19.1464f, 8.8535f)
                curveTo(19.3417f, 9.0488f, 19.6583f, 9.0488f, 19.8536f, 8.8535f)
                curveTo(20.0488f, 8.6583f, 20.0488f, 8.3417f, 19.8536f, 8.1465f)
                lineTo(18.2071f, 6.5f)
                lineTo(19.8536f, 4.8535f)
                curveTo(20.0488f, 4.6583f, 20.0488f, 4.3417f, 19.8536f, 4.1465f)
                curveTo(19.6583f, 3.9512f, 19.3417f, 3.9512f, 19.1464f, 4.1465f)
                lineTo(17.5f, 5.7929f)
                lineTo(15.8536f, 4.1465f)
                close()
                moveTo(17.5f, 13.0f)
                curveTo(18.7886f, 13.0f, 19.9897f, 12.625f, 21.0f, 11.9782f)
                verticalLineTo(13.25f)
                curveTo(21.0f, 15.3211f, 19.3211f, 17.0f, 17.25f, 17.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(19.5f)
                horizontalLineTo(16.25f)
                curveTo(16.6642f, 19.5f, 17.0f, 19.8358f, 17.0f, 20.25f)
                curveTo(17.0f, 20.6642f, 16.6642f, 21.0f, 16.25f, 21.0f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 21.0f, 7.0f, 20.6642f, 7.0f, 20.25f)
                curveTo(7.0f, 19.8358f, 7.3358f, 19.5f, 7.75f, 19.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.75f)
                curveTo(4.6789f, 17.0f, 3.0f, 15.3211f, 3.0f, 13.25f)
                verticalLineTo(5.9146f)
                curveTo(2.4174f, 5.7087f, 2.0f, 5.1531f, 2.0f, 4.5f)
                curveTo(2.0f, 3.6716f, 2.6716f, 3.0f, 3.5f, 3.0f)
                horizontalLineTo(12.0218f)
                curveTo(11.375f, 4.0103f, 11.0f, 5.2114f, 11.0f, 6.5f)
                curveTo(11.0f, 10.0899f, 13.9101f, 13.0f, 17.5f, 13.0f)
                close()
            }
        }
        .build()
        return _projectionScreenDismiss!!
    }

private var _projectionScreenDismiss: ImageVector? = null
