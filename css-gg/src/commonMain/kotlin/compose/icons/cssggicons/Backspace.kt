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
                moveTo(17.743f, 8.464f)
                lineTo(19.157f, 9.879f)
                lineTo(17.036f, 12.0f)
                lineTo(19.157f, 14.121f)
                lineTo(17.743f, 15.536f)
                lineTo(15.621f, 13.414f)
                lineTo(13.5f, 15.535f)
                lineTo(12.086f, 14.121f)
                lineTo(14.207f, 12.0f)
                lineTo(12.086f, 9.879f)
                lineTo(13.5f, 8.465f)
                lineTo(15.621f, 10.586f)
                lineTo(17.743f, 8.464f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.586f, 19.0f)
                lineTo(2.293f, 12.707f)
                curveTo(1.902f, 12.317f, 1.902f, 11.683f, 2.293f, 11.293f)
                lineTo(8.586f, 5.0f)
                horizontalLineTo(22.586f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.586f)
                close()
                moveTo(9.414f, 7.0f)
                lineTo(4.414f, 12.0f)
                lineTo(9.414f, 17.0f)
                horizontalLineTo(20.586f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.414f)
                close()
            }
        }
        .build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
