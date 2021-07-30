package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace = Builder(name = "Backspace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7427f, 8.4645f)
                lineTo(19.1569f, 9.8787f)
                lineTo(17.0356f, 12.0f)
                lineTo(19.157f, 14.1214f)
                lineTo(17.7428f, 15.5356f)
                lineTo(15.6214f, 13.4142f)
                lineTo(13.5f, 15.5355f)
                lineTo(12.0858f, 14.1213f)
                lineTo(14.2072f, 12.0f)
                lineTo(12.0859f, 9.8788f)
                lineTo(13.5002f, 8.4646f)
                lineTo(15.6214f, 10.5858f)
                lineTo(17.7427f, 8.4645f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.5858f, 19.0f)
                lineTo(2.2929f, 12.7071f)
                curveTo(1.9024f, 12.3166f, 1.9024f, 11.6834f, 2.2929f, 11.2929f)
                lineTo(8.5858f, 5.0f)
                horizontalLineTo(22.5857f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.5858f)
                close()
                moveTo(9.4142f, 7.0f)
                lineTo(4.4142f, 12.0f)
                lineTo(9.4142f, 17.0f)
                horizontalLineTo(20.5857f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.4142f)
                close()
            }
        }
        .build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
