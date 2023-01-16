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

public val MaterialDesignIcons.ChatQuestion: ImageVector
    get() {
        if (_chatQuestion != null) {
            return _chatQuestion!!
        }
        _chatQuestion = Builder(name = "ChatQuestion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(6.5f, 3.0f, 2.0f, 6.6f, 2.0f, 11.0f)
                curveTo(2.0f, 13.1f, 3.0f, 15.1f, 4.8f, 16.5f)
                curveTo(4.8f, 17.1f, 4.4f, 18.7f, 2.0f, 21.0f)
                curveTo(2.0f, 21.0f, 5.5f, 21.0f, 8.5f, 18.5f)
                curveTo(9.6f, 18.8f, 10.8f, 19.0f, 12.0f, 19.0f)
                curveTo(17.5f, 19.0f, 22.0f, 15.4f, 22.0f, 11.0f)
                reflectiveCurveTo(17.5f, 3.0f, 12.0f, 3.0f)
                moveTo(13.0f, 15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                moveTo(14.8f, 10.0f)
                curveTo(14.5f, 10.4f, 14.1f, 10.6f, 13.7f, 10.8f)
                curveTo(13.4f, 11.0f, 13.3f, 11.1f, 13.2f, 11.3f)
                curveTo(13.0f, 11.5f, 13.0f, 11.7f, 13.0f, 12.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 11.5f, 11.1f, 11.2f, 11.3f, 10.9f)
                curveTo(11.5f, 10.7f, 11.9f, 10.4f, 12.4f, 10.1f)
                curveTo(12.7f, 10.0f, 12.9f, 9.8f, 13.0f, 9.6f)
                curveTo(13.1f, 9.4f, 13.2f, 9.1f, 13.2f, 8.9f)
                curveTo(13.2f, 8.6f, 13.1f, 8.4f, 12.9f, 8.2f)
                curveTo(12.7f, 8.0f, 12.4f, 7.9f, 12.1f, 7.9f)
                curveTo(11.8f, 7.9f, 11.6f, 8.0f, 11.4f, 8.1f)
                curveTo(11.2f, 8.2f, 11.1f, 8.4f, 11.1f, 8.7f)
                horizontalLineTo(9.1f)
                curveTo(9.2f, 8.0f, 9.5f, 7.4f, 10.0f, 7.0f)
                curveTo(10.5f, 6.6f, 11.2f, 6.5f, 12.1f, 6.5f)
                curveTo(13.0f, 6.5f, 13.8f, 6.7f, 14.3f, 7.1f)
                curveTo(14.8f, 7.5f, 15.1f, 8.1f, 15.1f, 8.8f)
                curveTo(15.2f, 9.2f, 15.1f, 9.6f, 14.8f, 10.0f)
                close()
            }
        }
        .build()
        return _chatQuestion!!
    }

private var _chatQuestion: ImageVector? = null
