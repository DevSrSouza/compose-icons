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

public val FilledGroup.Shapes: ImageVector
    get() {
        if (_shapes != null) {
            return _shapes!!
        }
        _shapes = Builder(name = "Shapes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 8.75f)
                curveTo(2.0f, 5.0221f, 5.0221f, 2.0f, 8.75f, 2.0f)
                curveTo(12.2244f, 2.0f, 15.0857f, 4.625f, 15.4588f, 8.0f)
                horizontalLineTo(12.25f)
                curveTo(9.9028f, 8.0f, 8.0f, 9.9028f, 8.0f, 12.25f)
                verticalLineTo(15.4588f)
                curveTo(4.625f, 15.0857f, 2.0f, 12.2244f, 2.0f, 8.75f)
                close()
                moveTo(12.25f, 9.0f)
                curveTo(10.4551f, 9.0f, 9.0f, 10.4551f, 9.0f, 12.25f)
                verticalLineTo(18.75f)
                curveTo(9.0f, 20.5449f, 10.4551f, 22.0f, 12.25f, 22.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 22.0f, 22.0f, 20.5449f, 22.0f, 18.75f)
                verticalLineTo(12.25f)
                curveTo(22.0f, 10.4551f, 20.5449f, 9.0f, 18.75f, 9.0f)
                horizontalLineTo(12.25f)
                close()
            }
        }
        .build()
        return _shapes!!
    }

private var _shapes: ImageVector? = null
