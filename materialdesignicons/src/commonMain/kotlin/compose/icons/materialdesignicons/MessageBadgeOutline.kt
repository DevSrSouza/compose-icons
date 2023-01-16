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

public val MaterialDesignIcons.MessageBadgeOutline: ImageVector
    get() {
        if (_messageBadgeOutline != null) {
            return _messageBadgeOutline!!
        }
        _messageBadgeOutline = Builder(name = "MessageBadgeOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 17.1f, 21.1f, 18.0f, 20.0f, 18.0f)
                horizontalLineTo(6.0f)
                lineTo(2.0f, 22.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.9f, 2.9f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(14.1f)
                curveTo(14.0f, 2.3f, 14.0f, 2.7f, 14.0f, 3.0f)
                reflectiveCurveTo(14.0f, 3.7f, 14.1f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.9f)
                curveTo(20.7f, 7.8f, 21.4f, 7.4f, 22.0f, 7.0f)
                moveTo(16.0f, 3.0f)
                curveTo(16.0f, 4.7f, 17.3f, 6.0f, 19.0f, 6.0f)
                reflectiveCurveTo(22.0f, 4.7f, 22.0f, 3.0f)
                reflectiveCurveTo(20.7f, 0.0f, 19.0f, 0.0f)
                reflectiveCurveTo(16.0f, 1.3f, 16.0f, 3.0f)
                close()
            }
        }
        .build()
        return _messageBadgeOutline!!
    }

private var _messageBadgeOutline: ImageVector? = null
