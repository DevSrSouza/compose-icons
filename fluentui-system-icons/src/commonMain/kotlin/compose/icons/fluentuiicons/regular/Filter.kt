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

public val RegularGroup.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 16.0f)
                curveTo(13.9142f, 16.0f, 14.25f, 16.3358f, 14.25f, 16.75f)
                curveTo(14.25f, 17.1642f, 13.9142f, 17.5f, 13.5f, 17.5f)
                horizontalLineTo(10.5f)
                curveTo(10.0858f, 17.5f, 9.75f, 17.1642f, 9.75f, 16.75f)
                curveTo(9.75f, 16.3358f, 10.0858f, 16.0f, 10.5f, 16.0f)
                horizontalLineTo(13.5f)
                close()
                moveTo(16.5f, 11.0f)
                curveTo(16.9142f, 11.0f, 17.25f, 11.3358f, 17.25f, 11.75f)
                curveTo(17.25f, 12.1642f, 16.9142f, 12.5f, 16.5f, 12.5f)
                horizontalLineTo(7.5f)
                curveTo(7.0858f, 12.5f, 6.75f, 12.1642f, 6.75f, 11.75f)
                curveTo(6.75f, 11.3358f, 7.0858f, 11.0f, 7.5f, 11.0f)
                horizontalLineTo(16.5f)
                close()
                moveTo(19.5f, 6.0f)
                curveTo(19.9142f, 6.0f, 20.25f, 6.3358f, 20.25f, 6.75f)
                curveTo(20.25f, 7.1642f, 19.9142f, 7.5f, 19.5f, 7.5f)
                horizontalLineTo(4.5f)
                curveTo(4.0858f, 7.5f, 3.75f, 7.1642f, 3.75f, 6.75f)
                curveTo(3.75f, 6.3358f, 4.0858f, 6.0f, 4.5f, 6.0f)
                horizontalLineTo(19.5f)
                close()
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
