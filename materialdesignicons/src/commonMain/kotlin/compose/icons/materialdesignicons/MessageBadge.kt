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

public val MaterialDesignIcons.MessageBadge: ImageVector
    get() {
        if (_messageBadge != null) {
            return _messageBadge!!
        }
        _messageBadge = Builder(name = "MessageBadge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveTo(14.0f, 5.8f, 16.2f, 8.0f, 19.0f, 8.0f)
                curveTo(20.1f, 8.0f, 21.2f, 7.6f, 22.0f, 7.0f)
                moveTo(16.0f, 3.0f)
                curveTo(16.0f, 4.7f, 17.3f, 6.0f, 19.0f, 6.0f)
                reflectiveCurveTo(22.0f, 4.7f, 22.0f, 3.0f)
                reflectiveCurveTo(20.7f, 0.0f, 19.0f, 0.0f)
                reflectiveCurveTo(16.0f, 1.3f, 16.0f, 3.0f)
                close()
            }
        }
        .build()
        return _messageBadge!!
    }

private var _messageBadge: ImageVector? = null
