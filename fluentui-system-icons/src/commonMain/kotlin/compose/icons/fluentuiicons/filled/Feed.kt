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

public val FilledGroup.Feed: ImageVector
    get() {
        if (_feed != null) {
            return _feed!!
        }
        _feed = Builder(name = "Feed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 21.0f)
                curveTo(15.9411f, 20.9936f, 16.7494f, 20.3272f, 16.9342f, 19.4032f)
                lineTo(17.4149f, 17.0f)
                horizontalLineTo(20.25f)
                curveTo(21.2165f, 17.0f, 22.0f, 16.2165f, 22.0f, 15.25f)
                verticalLineTo(9.2612f)
                curveTo(22.0f, 8.0161f, 20.9937f, 7.006f, 19.75f, 7.0f)
                verticalLineTo(6.9961f)
                horizontalLineTo(14.5f)
                verticalLineTo(5.25f)
                curveTo(14.5f, 4.0074f, 13.4926f, 3.0f, 12.25f, 3.0f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 3.0f, 2.0f, 4.0074f, 2.0f, 5.25f)
                verticalLineTo(17.75f)
                curveTo(2.0f, 19.5449f, 3.4551f, 21.0f, 5.25f, 21.0f)
                horizontalLineTo(14.9864f)
                lineTo(15.0f, 21.0f)
                close()
                moveTo(17.5216f, 8.8177f)
                lineTo(15.4633f, 19.109f)
                curveTo(15.4179f, 19.3363f, 15.2183f, 19.5f, 14.9864f, 19.5f)
                curveTo(14.7178f, 19.5f, 14.5f, 19.2822f, 14.5f, 19.0136f)
                verticalLineTo(8.4961f)
                horizontalLineTo(17.6109f)
                curveTo(17.5737f, 8.5997f, 17.5437f, 8.7071f, 17.5216f, 8.8177f)
                close()
                moveTo(5.7783f, 8.5f)
                curveTo(5.3641f, 8.5f, 5.0283f, 8.1642f, 5.0283f, 7.75f)
                curveTo(5.0283f, 7.3358f, 5.3641f, 7.0f, 5.7783f, 7.0f)
                curveTo(6.1925f, 7.0f, 6.5283f, 7.3358f, 6.5283f, 7.75f)
                curveTo(6.5283f, 8.1642f, 6.1925f, 8.5f, 5.7783f, 8.5f)
                close()
                moveTo(5.0313f, 15.75f)
                curveTo(5.0313f, 15.3358f, 5.367f, 15.0f, 5.7813f, 15.0f)
                horizontalLineTo(10.7812f)
                curveTo(11.1955f, 15.0f, 11.5312f, 15.3358f, 11.5312f, 15.75f)
                curveTo(11.5312f, 16.1642f, 11.1955f, 16.5f, 10.7812f, 16.5f)
                horizontalLineTo(5.7813f)
                curveTo(5.367f, 16.5f, 5.0313f, 16.1642f, 5.0313f, 15.75f)
                close()
                moveTo(5.7813f, 11.0f)
                horizontalLineTo(10.7812f)
                curveTo(11.1955f, 11.0f, 11.5312f, 11.3358f, 11.5312f, 11.75f)
                curveTo(11.5312f, 12.1642f, 11.1955f, 12.5f, 10.7812f, 12.5f)
                horizontalLineTo(5.7813f)
                curveTo(5.367f, 12.5f, 5.0313f, 12.1642f, 5.0313f, 11.75f)
                curveTo(5.0313f, 11.3358f, 5.367f, 11.0f, 5.7813f, 11.0f)
                close()
            }
        }
        .build()
        return _feed!!
    }

private var _feed: ImageVector? = null
