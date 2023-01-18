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

public val FilledGroup.Add: ImageVector
    get() {
        if (_add != null) {
            return _add!!
        }
        _add = Builder(name = "Add", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.8834f, 3.0067f)
                lineTo(12.0f, 3.0f)
                curveTo(12.5128f, 3.0f, 12.9355f, 3.386f, 12.9933f, 3.8834f)
                lineTo(13.0f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5128f, 11.0f, 20.9355f, 11.386f, 20.9933f, 11.8834f)
                lineTo(21.0f, 12.0f)
                curveTo(21.0f, 12.5128f, 20.614f, 12.9355f, 20.1166f, 12.9933f)
                lineTo(20.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                curveTo(13.0f, 20.5128f, 12.614f, 20.9355f, 12.1166f, 20.9933f)
                lineTo(12.0f, 21.0f)
                curveTo(11.4872f, 21.0f, 11.0645f, 20.614f, 11.0067f, 20.1166f)
                lineTo(11.0f, 20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4872f, 13.0f, 3.0645f, 12.614f, 3.0067f, 12.1166f)
                lineTo(3.0f, 12.0f)
                curveTo(3.0f, 11.4872f, 3.386f, 11.0645f, 3.8834f, 11.0067f)
                lineTo(4.0f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                curveTo(11.0f, 3.4872f, 11.386f, 3.0645f, 11.8834f, 3.0067f)
                lineTo(12.0f, 3.0f)
                lineTo(11.8834f, 3.0067f)
                close()
            }
        }
        .build()
        return _add!!
    }

private var _add: ImageVector? = null
