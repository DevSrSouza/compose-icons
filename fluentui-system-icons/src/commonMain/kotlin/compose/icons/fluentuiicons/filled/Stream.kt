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

public val FilledGroup.Stream: ImageVector
    get() {
        if (_stream != null) {
            return _stream!!
        }
        _stream = Builder(name = "Stream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                curveTo(9.0f, 7.134f, 12.134f, 4.0f, 16.0f, 4.0f)
                horizontalLineTo(17.5f)
                curveTo(18.0523f, 4.0f, 18.5f, 3.5523f, 18.5f, 3.0f)
                curveTo(18.5f, 2.4477f, 18.0523f, 2.0f, 17.5f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(11.0294f, 2.0f, 7.0f, 6.0294f, 7.0f, 11.0f)
                curveTo(7.0f, 11.5523f, 6.5523f, 12.0f, 6.0f, 12.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 12.0f, 2.0f, 12.4477f, 2.0f, 13.0f)
                curveTo(2.0f, 13.5523f, 2.4477f, 14.0f, 3.0f, 14.0f)
                horizontalLineTo(6.0f)
                curveTo(7.6568f, 14.0f, 9.0f, 12.6569f, 9.0f, 11.0f)
                close()
                moveTo(17.0f, 8.0f)
                curveTo(14.7909f, 8.0f, 13.0f, 9.7909f, 13.0f, 12.0f)
                curveTo(13.0f, 15.3137f, 10.3137f, 18.0f, 7.0f, 18.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 18.0f, 2.0f, 17.5523f, 2.0f, 17.0f)
                curveTo(2.0f, 16.4477f, 2.4477f, 16.0f, 3.0f, 16.0f)
                horizontalLineTo(7.0f)
                curveTo(9.2091f, 16.0f, 11.0f, 14.2091f, 11.0f, 12.0f)
                curveTo(11.0f, 8.6863f, 13.6863f, 6.0f, 17.0f, 6.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 6.0f, 22.0f, 6.4477f, 22.0f, 7.0f)
                curveTo(22.0f, 7.5523f, 21.5523f, 8.0f, 21.0f, 8.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveTo(17.4477f, 12.0f, 17.0f, 12.4477f, 17.0f, 13.0f)
                curveTo(17.0f, 17.9706f, 12.9706f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 22.0f, 5.0f, 21.5523f, 5.0f, 21.0f)
                curveTo(5.0f, 20.4477f, 5.4477f, 20.0f, 6.0f, 20.0f)
                horizontalLineTo(8.0f)
                curveTo(11.866f, 20.0f, 15.0f, 16.866f, 15.0f, 13.0f)
                curveTo(15.0f, 11.3431f, 16.3431f, 10.0f, 18.0f, 10.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 10.0f, 22.0f, 10.4477f, 22.0f, 11.0f)
                curveTo(22.0f, 11.5523f, 21.5523f, 12.0f, 21.0f, 12.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _stream!!
    }

private var _stream: ImageVector? = null
