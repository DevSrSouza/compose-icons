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

public val CssGgIcons.Abstract: ImageVector
    get() {
        if (_abstract != null) {
            return _abstract!!
        }
        _abstract = Builder(name = "Abstract", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                lineTo(16.0f, 8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0f, 19.0f)
                curveTo(12.761f, 19.0f, 15.0f, 16.761f, 15.0f, 14.0f)
                curveTo(15.0f, 11.239f, 12.761f, 9.0f, 10.0f, 9.0f)
                curveTo(7.239f, 9.0f, 5.0f, 11.239f, 5.0f, 14.0f)
                curveTo(5.0f, 16.761f, 7.239f, 19.0f, 10.0f, 19.0f)
                close()
                moveTo(10.0f, 16.0f)
                curveTo(11.105f, 16.0f, 12.0f, 15.105f, 12.0f, 14.0f)
                curveTo(12.0f, 12.895f, 11.105f, 12.0f, 10.0f, 12.0f)
                curveTo(8.895f, 12.0f, 8.0f, 12.895f, 8.0f, 14.0f)
                curveTo(8.0f, 15.105f, 8.895f, 16.0f, 10.0f, 16.0f)
                close()
            }
        }
        .build()
        return _abstract!!
    }

private var _abstract: ImageVector? = null
