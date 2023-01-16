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

public val MaterialDesignIcons.PriorityHigh: ImageVector
    get() {
        if (_priorityHigh != null) {
            return _priorityHigh!!
        }
        _priorityHigh = Builder(name = "PriorityHigh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                moveTo(14.0f, 13.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.5f)
                moveTo(14.0f, 8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                moveTo(2.0f, 12.5f)
                curveTo(2.0f, 8.92f, 4.92f, 6.0f, 8.5f, 6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                lineTo(12.0f, 7.0f)
                lineTo(9.0f, 10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.5f)
                curveTo(6.0f, 8.0f, 4.0f, 10.0f, 4.0f, 12.5f)
                curveTo(4.0f, 15.0f, 6.0f, 17.0f, 8.5f, 17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.5f)
                curveTo(4.92f, 19.0f, 2.0f, 16.08f, 2.0f, 12.5f)
                close()
            }
        }
        .build()
        return _priorityHigh!!
    }

private var _priorityHigh: ImageVector? = null
