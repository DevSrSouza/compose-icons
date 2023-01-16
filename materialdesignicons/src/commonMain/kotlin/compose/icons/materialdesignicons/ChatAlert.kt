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

public val MaterialDesignIcons.ChatAlert: ImageVector
    get() {
        if (_chatAlert != null) {
            return _chatAlert!!
        }
        _chatAlert = Builder(name = "ChatAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(17.5f, 3.0f, 22.0f, 6.58f, 22.0f, 11.0f)
                curveTo(22.0f, 15.42f, 17.5f, 19.0f, 12.0f, 19.0f)
                curveTo(10.76f, 19.0f, 9.57f, 18.82f, 8.47f, 18.5f)
                curveTo(5.55f, 21.0f, 2.0f, 21.0f, 2.0f, 21.0f)
                curveTo(4.33f, 18.67f, 4.7f, 17.1f, 4.75f, 16.5f)
                curveTo(3.05f, 15.07f, 2.0f, 13.13f, 2.0f, 11.0f)
                curveTo(2.0f, 6.58f, 6.5f, 3.0f, 12.0f, 3.0f)
                moveTo(11.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                moveTo(11.0f, 12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _chatAlert!!
    }

private var _chatAlert: ImageVector? = null
