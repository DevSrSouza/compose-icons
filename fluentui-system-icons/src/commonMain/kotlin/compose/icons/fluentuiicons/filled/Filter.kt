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

public val FilledGroup.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 16.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 16.0f, 15.0f, 16.4477f, 15.0f, 17.0f)
                curveTo(15.0f, 17.5128f, 14.614f, 17.9355f, 14.1166f, 17.9933f)
                lineTo(14.0f, 18.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4477f, 18.0f, 9.0f, 17.5523f, 9.0f, 17.0f)
                curveTo(9.0f, 16.4872f, 9.386f, 16.0645f, 9.8834f, 16.0067f)
                lineTo(10.0f, 16.0f)
                horizontalLineTo(14.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 11.0f, 17.0f, 11.4477f, 17.0f, 12.0f)
                curveTo(17.0f, 12.5128f, 16.614f, 12.9355f, 16.1166f, 12.9933f)
                lineTo(16.0f, 13.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 13.0f, 7.0f, 12.5523f, 7.0f, 12.0f)
                curveTo(7.0f, 11.4872f, 7.386f, 11.0645f, 7.8834f, 11.0067f)
                lineTo(8.0f, 11.0f)
                horizontalLineTo(16.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(5.0f, 6.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 6.0f, 20.0f, 6.4477f, 20.0f, 7.0f)
                curveTo(20.0f, 7.5128f, 19.614f, 7.9355f, 19.1166f, 7.9933f)
                lineTo(19.0f, 8.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 8.0f, 4.0f, 7.5523f, 4.0f, 7.0f)
                curveTo(4.0f, 6.4872f, 4.386f, 6.0645f, 4.8834f, 6.0067f)
                lineTo(5.0f, 6.0f)
                horizontalLineTo(19.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
