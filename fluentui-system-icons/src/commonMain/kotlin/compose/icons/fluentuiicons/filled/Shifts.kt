package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Shifts: ImageVector
    get() {
        if (_shifts != null) {
            return _shifts!!
        }
        _shifts = Builder(name = "Shifts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 3.0f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(11.75f, 6.0f)
                curveTo(11.3358f, 6.0f, 11.0f, 6.3358f, 11.0f, 6.75f)
                verticalLineTo(12.75f)
                curveTo(11.0f, 13.1642f, 11.3358f, 13.5f, 11.75f, 13.5f)
                horizontalLineTo(16.2483f)
                curveTo(16.6625f, 13.5f, 16.9983f, 13.1642f, 16.9983f, 12.75f)
                curveTo(16.9983f, 12.3358f, 16.6625f, 12.0f, 16.2483f, 12.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(6.75f)
                curveTo(12.5f, 6.3358f, 12.1642f, 6.0f, 11.75f, 6.0f)
                close()
            }
        }
        .build()
        return _shifts!!
    }

private var _shifts: ImageVector? = null
