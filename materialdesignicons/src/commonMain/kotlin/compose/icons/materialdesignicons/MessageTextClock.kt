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

public val MaterialDesignIcons.MessageTextClock: ImageVector
    get() {
        if (_messageTextClock != null) {
            return _messageTextClock!!
        }
        _messageTextClock = Builder(name = "MessageTextClock", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.41f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.11f, 2.0f, 20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(22.0f)
                lineTo(6.0f, 18.0f)
                horizontalLineTo(9.29f)
                curveTo(10.15f, 20.89f, 12.83f, 23.0f, 16.0f, 23.0f)
                curveTo(19.86f, 23.0f, 23.0f, 19.87f, 23.0f, 16.0f)
                curveTo(23.0f, 14.69f, 22.63f, 13.46f, 22.0f, 12.41f)
                moveTo(6.0f, 6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                moveTo(16.0f, 9.0f)
                curveTo(14.1f, 9.0f, 12.37f, 9.77f, 11.11f, 11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                moveTo(6.0f, 12.0f)
                horizontalLineTo(10.26f)
                curveTo(9.84f, 12.6f, 9.5f, 13.28f, 9.3f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                moveTo(16.0f, 20.85f)
                curveTo(13.32f, 20.85f, 11.15f, 18.68f, 11.15f, 16.0f)
                reflectiveCurveTo(13.32f, 11.15f, 16.0f, 11.15f)
                curveTo(18.67f, 11.15f, 20.85f, 13.32f, 20.85f, 16.0f)
                reflectiveCurveTo(18.67f, 20.85f, 16.0f, 20.85f)
                moveTo(16.5f, 15.82f)
                lineTo(18.94f, 17.23f)
                lineTo(18.19f, 18.53f)
                lineTo(15.0f, 16.69f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.82f)
                close()
            }
        }
        .build()
        return _messageTextClock!!
    }

private var _messageTextClock: ImageVector? = null
