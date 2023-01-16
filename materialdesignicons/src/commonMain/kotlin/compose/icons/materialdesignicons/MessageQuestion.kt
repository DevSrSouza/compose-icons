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

public val MaterialDesignIcons.MessageQuestion: ImageVector
    get() {
        if (_messageQuestion != null) {
            return _messageQuestion!!
        }
        _messageQuestion = Builder(name = "MessageQuestion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(22.0f)
                lineTo(6.0f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 18.0f, 22.0f, 17.1f, 22.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                moveTo(13.0f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                moveTo(14.8f, 9.0f)
                curveTo(14.5f, 9.4f, 14.1f, 9.6f, 13.7f, 9.8f)
                curveTo(13.4f, 10.0f, 13.3f, 10.1f, 13.2f, 10.3f)
                curveTo(13.0f, 10.5f, 13.0f, 10.7f, 13.0f, 11.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 10.5f, 11.1f, 10.2f, 11.3f, 9.9f)
                curveTo(11.5f, 9.7f, 11.9f, 9.4f, 12.4f, 9.1f)
                curveTo(12.7f, 9.0f, 12.9f, 8.8f, 13.0f, 8.6f)
                curveTo(13.1f, 8.4f, 13.2f, 8.1f, 13.2f, 7.9f)
                curveTo(13.2f, 7.6f, 13.1f, 7.4f, 12.9f, 7.2f)
                curveTo(12.7f, 7.0f, 12.4f, 6.9f, 12.1f, 6.9f)
                curveTo(11.8f, 6.9f, 11.6f, 7.0f, 11.4f, 7.1f)
                curveTo(11.2f, 7.2f, 11.1f, 7.4f, 11.1f, 7.7f)
                horizontalLineTo(9.1f)
                curveTo(9.2f, 7.0f, 9.5f, 6.4f, 10.0f, 6.0f)
                curveTo(10.5f, 5.6f, 11.2f, 5.5f, 12.1f, 5.5f)
                curveTo(13.0f, 5.5f, 13.8f, 5.7f, 14.3f, 6.1f)
                curveTo(14.8f, 6.5f, 15.1f, 7.1f, 15.1f, 7.8f)
                curveTo(15.2f, 8.2f, 15.1f, 8.6f, 14.8f, 9.0f)
                close()
            }
        }
        .build()
        return _messageQuestion!!
    }

private var _messageQuestion: ImageVector? = null
