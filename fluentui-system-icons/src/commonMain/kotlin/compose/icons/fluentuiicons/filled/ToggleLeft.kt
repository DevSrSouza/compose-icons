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

public val FilledGroup.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) {
            return _toggleLeft!!
        }
        _toggleLeft = Builder(name = "ToggleLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 7.0f)
                curveTo(19.7614f, 7.0f, 22.0f, 9.2386f, 22.0f, 12.0f)
                curveTo(22.0f, 14.7614f, 19.7614f, 17.0f, 17.0f, 17.0f)
                horizontalLineTo(7.0f)
                curveTo(4.2386f, 17.0f, 2.0f, 14.7614f, 2.0f, 12.0f)
                curveTo(2.0f, 9.2386f, 4.2386f, 7.0f, 7.0f, 7.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(7.25f, 14.5f)
                curveTo(8.6307f, 14.5f, 9.75f, 13.3807f, 9.75f, 12.0f)
                curveTo(9.75f, 10.6193f, 8.6307f, 9.5f, 7.25f, 9.5f)
                curveTo(5.8693f, 9.5f, 4.75f, 10.6193f, 4.75f, 12.0f)
                curveTo(4.75f, 13.3807f, 5.8693f, 14.5f, 7.25f, 14.5f)
                close()
            }
        }
        .build()
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null
