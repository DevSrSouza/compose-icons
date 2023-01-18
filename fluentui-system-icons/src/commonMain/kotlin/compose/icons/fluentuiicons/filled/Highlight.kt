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

public val FilledGroup.Highlight: ImageVector
    get() {
        if (_highlight != null) {
            return _highlight!!
        }
        _highlight = Builder(name = "Highlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 2.0f)
                curveTo(4.0074f, 2.0f, 3.0f, 3.0074f, 3.0f, 4.25f)
                verticalLineTo(7.25f)
                curveTo(3.0f, 8.4926f, 4.0074f, 9.5f, 5.25f, 9.5f)
                horizontalLineTo(18.75f)
                curveTo(19.9926f, 9.5f, 21.0f, 8.4926f, 21.0f, 7.25f)
                verticalLineTo(4.25f)
                curveTo(21.0f, 3.0074f, 19.9926f, 2.0f, 18.75f, 2.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(5.0f, 11.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.75f)
                curveTo(19.0f, 12.9926f, 17.9926f, 14.0f, 16.75f, 14.0f)
                horizontalLineTo(7.25f)
                curveTo(6.0074f, 14.0f, 5.0f, 12.9926f, 5.0f, 11.75f)
                close()
                moveTo(7.5029f, 15.5f)
                horizontalLineTo(16.5013f)
                lineTo(16.5017f, 16.7881f)
                curveTo(16.5017f, 17.6031f, 16.0616f, 18.3494f, 15.36f, 18.7463f)
                lineTo(15.2057f, 18.8259f)
                lineTo(8.571f, 21.9321f)
                curveTo(8.1048f, 22.1504f, 7.574f, 21.8451f, 7.5095f, 21.3536f)
                lineTo(7.503f, 21.2529f)
                lineTo(7.5029f, 15.5f)
                close()
            }
        }
        .build()
        return _highlight!!
    }

private var _highlight: ImageVector? = null
