package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.BroadcastOff: ImageVector
    get() {
        if (_broadcastOff != null) {
            return _broadcastOff!!
        }
        _broadcastOff = Builder(name = "BroadcastOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6f, 14.2f)
                curveTo(17.9f, 13.5f, 18.0f, 12.8f, 18.0f, 12.0f)
                curveTo(18.0f, 8.7f, 15.3f, 6.0f, 12.0f, 6.0f)
                curveTo(11.2f, 6.0f, 10.4f, 6.2f, 9.8f, 6.4f)
                lineTo(11.4f, 8.0f)
                horizontalLineTo(12.0f)
                curveTo(14.2f, 8.0f, 16.0f, 9.8f, 16.0f, 12.0f)
                curveTo(16.0f, 12.2f, 16.0f, 12.4f, 15.9f, 12.6f)
                lineTo(17.6f, 14.2f)
                moveTo(12.0f, 4.0f)
                curveTo(16.4f, 4.0f, 20.0f, 7.6f, 20.0f, 12.0f)
                curveTo(20.0f, 13.4f, 19.6f, 14.6f, 19.0f, 15.7f)
                lineTo(20.5f, 17.2f)
                curveTo(21.4f, 15.7f, 22.0f, 13.9f, 22.0f, 12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                curveTo(10.1f, 2.0f, 8.3f, 2.5f, 6.8f, 3.5f)
                lineTo(8.3f, 5.0f)
                curveTo(9.4f, 4.3f, 10.6f, 4.0f, 12.0f, 4.0f)
                moveTo(3.3f, 2.5f)
                lineTo(2.0f, 3.8f)
                lineTo(4.1f, 5.9f)
                curveTo(2.8f, 7.6f, 2.0f, 9.7f, 2.0f, 12.0f)
                curveTo(2.0f, 15.7f, 4.0f, 18.9f, 7.0f, 20.6f)
                lineTo(8.0f, 18.9f)
                curveTo(5.6f, 17.5f, 4.0f, 14.9f, 4.0f, 12.0f)
                curveTo(4.0f, 10.2f, 4.6f, 8.6f, 5.5f, 7.3f)
                lineTo(7.0f, 8.8f)
                curveTo(6.4f, 9.7f, 6.0f, 10.8f, 6.0f, 12.0f)
                curveTo(6.0f, 14.2f, 7.2f, 16.1f, 9.0f, 17.2f)
                lineTo(10.0f, 15.5f)
                curveTo(8.8f, 14.8f, 8.0f, 13.5f, 8.0f, 12.1f)
                curveTo(8.0f, 11.5f, 8.2f, 10.9f, 8.4f, 10.3f)
                lineTo(10.0f, 11.9f)
                verticalLineTo(12.1f)
                curveTo(10.0f, 13.2f, 10.9f, 14.1f, 12.0f, 14.1f)
                horizontalLineTo(12.2f)
                lineTo(19.7f, 21.6f)
                lineTo(21.0f, 20.3f)
                lineTo(4.3f, 3.5f)
                lineTo(3.3f, 2.5f)
                close()
            }
        }
        .build()
        return _broadcastOff!!
    }

private var _broadcastOff: ImageVector? = null
