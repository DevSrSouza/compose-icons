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

public val FilledGroup.List: ImageVector
    get() {
        if (_list != null) {
            return _list!!
        }
        _list = Builder(name = "List", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 17.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 17.0f, 16.0f, 17.4477f, 16.0f, 18.0f)
                curveTo(16.0f, 18.5128f, 15.614f, 18.9355f, 15.1166f, 18.9933f)
                lineTo(15.0f, 19.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 19.0f, 2.0f, 18.5523f, 2.0f, 18.0f)
                curveTo(2.0f, 17.4872f, 2.386f, 17.0645f, 2.8834f, 17.0067f)
                lineTo(3.0f, 17.0f)
                horizontalLineTo(15.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(3.0f, 11.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 11.0f, 22.0f, 11.4477f, 22.0f, 12.0f)
                curveTo(22.0f, 12.5128f, 21.614f, 12.9355f, 21.1166f, 12.9933f)
                lineTo(21.0f, 13.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 13.0f, 2.0f, 12.5523f, 2.0f, 12.0f)
                curveTo(2.0f, 11.4872f, 2.386f, 11.0645f, 2.8834f, 11.0067f)
                lineTo(3.0f, 11.0f)
                horizontalLineTo(21.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(3.0f, 5.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 5.0f, 19.0f, 5.4477f, 19.0f, 6.0f)
                curveTo(19.0f, 6.5128f, 18.614f, 6.9355f, 18.1166f, 6.9933f)
                lineTo(18.0f, 7.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 7.0f, 2.0f, 6.5523f, 2.0f, 6.0f)
                curveTo(2.0f, 5.4872f, 2.386f, 5.0645f, 2.8834f, 5.0067f)
                lineTo(3.0f, 5.0f)
                horizontalLineTo(18.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _list!!
    }

private var _list: ImageVector? = null
