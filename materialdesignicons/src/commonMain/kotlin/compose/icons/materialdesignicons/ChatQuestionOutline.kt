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

public val MaterialDesignIcons.ChatQuestionOutline: ImageVector
    get() {
        if (_chatQuestionOutline != null) {
            return _chatQuestionOutline!!
        }
        _chatQuestionOutline = Builder(name = "ChatQuestionOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(6.5f, 3.0f, 2.0f, 6.6f, 2.0f, 11.0f)
                curveTo(2.0f, 13.2f, 3.1f, 15.2f, 4.8f, 16.5f)
                curveTo(4.8f, 17.1f, 4.4f, 18.7f, 2.0f, 21.0f)
                curveTo(4.4f, 20.9f, 6.6f, 20.0f, 8.5f, 18.5f)
                curveTo(9.6f, 18.8f, 10.8f, 19.0f, 12.0f, 19.0f)
                curveTo(17.5f, 19.0f, 22.0f, 15.4f, 22.0f, 11.0f)
                reflectiveCurveTo(17.5f, 3.0f, 12.0f, 3.0f)
                moveTo(12.0f, 17.0f)
                curveTo(7.6f, 17.0f, 4.0f, 14.3f, 4.0f, 11.0f)
                reflectiveCurveTo(7.6f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(20.0f, 7.7f, 20.0f, 11.0f)
                reflectiveCurveTo(16.4f, 17.0f, 12.0f, 17.0f)
                moveTo(12.2f, 6.5f)
                curveTo(11.3f, 6.5f, 10.6f, 6.7f, 10.1f, 7.0f)
                curveTo(9.5f, 7.4f, 9.2f, 8.0f, 9.3f, 8.7f)
                horizontalLineTo(11.3f)
                curveTo(11.3f, 8.4f, 11.4f, 8.2f, 11.6f, 8.1f)
                curveTo(11.8f, 8.0f, 12.0f, 7.9f, 12.3f, 7.9f)
                curveTo(12.6f, 7.9f, 12.9f, 8.0f, 13.1f, 8.2f)
                curveTo(13.3f, 8.4f, 13.4f, 8.6f, 13.4f, 8.9f)
                curveTo(13.4f, 9.2f, 13.3f, 9.4f, 13.2f, 9.6f)
                curveTo(13.0f, 9.8f, 12.8f, 10.0f, 12.6f, 10.1f)
                curveTo(12.1f, 10.4f, 11.7f, 10.7f, 11.5f, 10.9f)
                curveTo(11.1f, 11.2f, 11.0f, 11.5f, 11.0f, 12.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 11.7f, 13.1f, 11.5f, 13.1f, 11.3f)
                curveTo(13.2f, 11.1f, 13.4f, 11.0f, 13.6f, 10.8f)
                curveTo(14.1f, 10.6f, 14.4f, 10.3f, 14.7f, 9.9f)
                curveTo(15.0f, 9.5f, 15.1f, 9.1f, 15.1f, 8.7f)
                curveTo(15.1f, 8.0f, 14.8f, 7.4f, 14.3f, 7.0f)
                curveTo(13.9f, 6.7f, 13.1f, 6.5f, 12.2f, 6.5f)
                moveTo(11.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _chatQuestionOutline!!
    }

private var _chatQuestionOutline: ImageVector? = null
