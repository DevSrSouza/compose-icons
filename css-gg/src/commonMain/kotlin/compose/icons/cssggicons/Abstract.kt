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
                curveTo(12.7614f, 19.0f, 15.0f, 16.7614f, 15.0f, 14.0f)
                curveTo(15.0f, 11.2386f, 12.7614f, 9.0f, 10.0f, 9.0f)
                curveTo(7.2386f, 9.0f, 5.0f, 11.2386f, 5.0f, 14.0f)
                curveTo(5.0f, 16.7614f, 7.2386f, 19.0f, 10.0f, 19.0f)
                close()
                moveTo(10.0f, 16.0f)
                curveTo(11.1046f, 16.0f, 12.0f, 15.1046f, 12.0f, 14.0f)
                curveTo(12.0f, 12.8954f, 11.1046f, 12.0f, 10.0f, 12.0f)
                curveTo(8.8954f, 12.0f, 8.0f, 12.8954f, 8.0f, 14.0f)
                curveTo(8.0f, 15.1046f, 8.8954f, 16.0f, 10.0f, 16.0f)
                close()
            }
        }
        .build()
        return _abstract!!
    }

private var _abstract: ImageVector? = null
