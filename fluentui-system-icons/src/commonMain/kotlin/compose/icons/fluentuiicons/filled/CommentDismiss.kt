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

public val FilledGroup.CommentDismiss: ImageVector
    get() {
        if (_commentDismiss != null) {
            return _commentDismiss!!
        }
        _commentDismiss = Builder(name = "CommentDismiss", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveTo(19.2465f, 13.0f, 20.8321f, 12.3112f, 22.0f, 11.1904f)
                verticalLineTo(14.75f)
                curveTo(22.0f, 16.5449f, 20.5449f, 18.0f, 18.75f, 18.0f)
                horizontalLineTo(13.0f)
                lineTo(8.0f, 21.75f)
                curveTo(7.176f, 22.368f, 6.0f, 21.7801f, 6.0f, 20.75f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 18.0f, 2.0f, 16.5449f, 2.0f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 4.4551f, 3.4551f, 3.0f, 5.25f, 3.0f)
                horizontalLineTo(12.0218f)
                curveTo(11.375f, 4.0103f, 11.0f, 5.2114f, 11.0f, 6.5f)
                curveTo(11.0f, 10.0899f, 13.9101f, 13.0f, 17.5f, 13.0f)
                close()
            }
        }
        .build()
        return _commentDismiss!!
    }

private var _commentDismiss: ImageVector? = null
