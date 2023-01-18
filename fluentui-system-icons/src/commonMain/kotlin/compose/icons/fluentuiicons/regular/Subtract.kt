package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Subtract: ImageVector
    get() {
        if (_subtract != null) {
            return _subtract!!
        }
        _subtract = Builder(name = "Subtract", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7539f, 12.5f)
                horizontalLineTo(20.2458f)
                curveTo(20.66f, 12.5f, 20.9958f, 12.1642f, 20.9958f, 11.75f)
                curveTo(20.9958f, 11.3358f, 20.66f, 11.0f, 20.2458f, 11.0f)
                horizontalLineTo(3.7539f)
                curveTo(3.3397f, 11.0f, 3.0039f, 11.3358f, 3.0039f, 11.75f)
                curveTo(3.0039f, 12.1642f, 3.3397f, 12.5f, 3.7539f, 12.5f)
                close()
            }
        }
        .build()
        return _subtract!!
    }

private var _subtract: ImageVector? = null
