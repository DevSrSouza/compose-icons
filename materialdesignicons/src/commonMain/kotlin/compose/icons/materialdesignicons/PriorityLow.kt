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

public val MaterialDesignIcons.PriorityLow: ImageVector
    get() {
        if (_priorityLow != null) {
            return _priorityLow!!
        }
        _priorityLow = Builder(name = "PriorityLow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 5.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                moveTo(14.0f, 10.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.5f)
                moveTo(14.0f, 16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                moveTo(2.0f, 11.5f)
                curveTo(2.0f, 15.08f, 4.92f, 18.0f, 8.5f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                lineTo(12.0f, 17.0f)
                lineTo(9.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.5f)
                curveTo(6.0f, 16.0f, 4.0f, 14.0f, 4.0f, 11.5f)
                curveTo(4.0f, 9.0f, 6.0f, 7.0f, 8.5f, 7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.5f)
                curveTo(4.92f, 5.0f, 2.0f, 7.92f, 2.0f, 11.5f)
                close()
            }
        }
        .build()
        return _priorityLow!!
    }

private var _priorityLow: ImageVector? = null
