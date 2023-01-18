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

public val FilledGroup.TextLineSpacing: ImageVector
    get() {
        if (_textLineSpacing != null) {
            return _textLineSpacing!!
        }
        _textLineSpacing = Builder(name = "TextLineSpacing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.4142f)
                verticalLineTo(10.0f)
                curveTo(20.0f, 10.5523f, 19.5523f, 11.0f, 19.0f, 11.0f)
                curveTo(18.4477f, 11.0f, 18.0f, 10.5523f, 18.0f, 10.0f)
                verticalLineTo(6.4142f)
                lineTo(17.7071f, 6.7071f)
                curveTo(17.3166f, 7.0976f, 16.6834f, 7.0976f, 16.2929f, 6.7071f)
                curveTo(15.9024f, 6.3166f, 15.9024f, 5.6834f, 16.2929f, 5.2929f)
                lineTo(18.2929f, 3.2929f)
                curveTo(18.3888f, 3.197f, 18.4993f, 3.1247f, 18.6172f, 3.0759f)
                curveTo(18.7351f, 3.027f, 18.8644f, 3.0f, 19.0f, 3.0f)
                curveTo(19.1356f, 3.0f, 19.2649f, 3.027f, 19.3828f, 3.0759f)
                curveTo(19.5007f, 3.1247f, 19.6112f, 3.197f, 19.7071f, 3.2929f)
                lineTo(21.7071f, 5.2929f)
                curveTo(22.0976f, 5.6834f, 22.0976f, 6.3166f, 21.7071f, 6.7071f)
                curveTo(21.3166f, 7.0976f, 20.6834f, 7.0976f, 20.2929f, 6.7071f)
                lineTo(20.0f, 6.4142f)
                close()
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 5.4477f, 2.4477f, 5.0f, 3.0f, 5.0f)
                horizontalLineTo(11.0f)
                curveTo(11.5523f, 5.0f, 12.0f, 5.4477f, 12.0f, 6.0f)
                curveTo(12.0f, 6.5523f, 11.5523f, 7.0f, 11.0f, 7.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 7.0f, 2.0f, 6.5523f, 2.0f, 6.0f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 11.4477f, 2.4477f, 11.0f, 3.0f, 11.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 11.0f, 15.0f, 11.4477f, 15.0f, 12.0f)
                curveTo(15.0f, 12.5523f, 14.5523f, 13.0f, 14.0f, 13.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 13.0f, 2.0f, 12.5523f, 2.0f, 12.0f)
                close()
                moveTo(3.0f, 17.0f)
                curveTo(2.4477f, 17.0f, 2.0f, 17.4477f, 2.0f, 18.0f)
                curveTo(2.0f, 18.5523f, 2.4477f, 19.0f, 3.0f, 19.0f)
                horizontalLineTo(11.0f)
                curveTo(11.5523f, 19.0f, 12.0f, 18.5523f, 12.0f, 18.0f)
                curveTo(12.0f, 17.4477f, 11.5523f, 17.0f, 11.0f, 17.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(20.0f, 14.0f)
                verticalLineTo(17.5858f)
                lineTo(20.2929f, 17.2929f)
                curveTo(20.6834f, 16.9024f, 21.3166f, 16.9024f, 21.7071f, 17.2929f)
                curveTo(22.0976f, 17.6834f, 22.0976f, 18.3166f, 21.7071f, 18.7071f)
                lineTo(19.7071f, 20.7071f)
                curveTo(19.3166f, 21.0976f, 18.6834f, 21.0976f, 18.2929f, 20.7071f)
                lineTo(16.2929f, 18.7071f)
                curveTo(15.9024f, 18.3166f, 15.9024f, 17.6834f, 16.2929f, 17.2929f)
                curveTo(16.6834f, 16.9024f, 17.3166f, 16.9024f, 17.7071f, 17.2929f)
                lineTo(18.0f, 17.5858f)
                verticalLineTo(14.0f)
                curveTo(18.0f, 13.4477f, 18.4477f, 13.0f, 19.0f, 13.0f)
                curveTo(19.5523f, 13.0f, 20.0f, 13.4477f, 20.0f, 14.0f)
                close()
            }
        }
        .build()
        return _textLineSpacing!!
    }

private var _textLineSpacing: ImageVector? = null
