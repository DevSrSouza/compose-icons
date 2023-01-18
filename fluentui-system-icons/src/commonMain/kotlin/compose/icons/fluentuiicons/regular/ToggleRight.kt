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

public val RegularGroup.ToggleRight: ImageVector
    get() {
        if (_toggleRight != null) {
            return _toggleRight!!
        }
        _toggleRight = Builder(name = "ToggleRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.75f, 14.5f)
                curveTo(18.1307f, 14.5f, 19.25f, 13.3807f, 19.25f, 12.0f)
                curveTo(19.25f, 10.6193f, 18.1307f, 9.5f, 16.75f, 9.5f)
                curveTo(15.3693f, 9.5f, 14.25f, 10.6193f, 14.25f, 12.0f)
                curveTo(14.25f, 13.3807f, 15.3693f, 14.5f, 16.75f, 14.5f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 9.2386f, 4.2386f, 7.0f, 7.0f, 7.0f)
                horizontalLineTo(17.0f)
                curveTo(19.7614f, 7.0f, 22.0f, 9.2386f, 22.0f, 12.0f)
                curveTo(22.0f, 14.7614f, 19.7614f, 17.0f, 17.0f, 17.0f)
                horizontalLineTo(7.0f)
                curveTo(4.2386f, 17.0f, 2.0f, 14.7614f, 2.0f, 12.0f)
                close()
                moveTo(7.0f, 8.5f)
                curveTo(5.067f, 8.5f, 3.5f, 10.067f, 3.5f, 12.0f)
                curveTo(3.5f, 13.933f, 5.067f, 15.5f, 7.0f, 15.5f)
                horizontalLineTo(17.0f)
                curveTo(18.933f, 15.5f, 20.5f, 13.933f, 20.5f, 12.0f)
                curveTo(20.5f, 10.067f, 18.933f, 8.5f, 17.0f, 8.5f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _toggleRight!!
    }

private var _toggleRight: ImageVector? = null
