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

public val CssGgIcons.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(name = "Laptop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 4.8954f, 3.8954f, 4.0f, 5.0f, 4.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1046f, 4.0f, 21.0f, 4.8954f, 21.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 15.1046f, 20.1046f, 16.0f, 19.0f, 16.0f)
                horizontalLineTo(5.0f)
                curveTo(3.8954f, 16.0f, 3.0f, 15.1046f, 3.0f, 14.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(5.0f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 18.0f)
                curveTo(1.4477f, 18.0f, 1.0f, 18.4477f, 1.0f, 19.0f)
                curveTo(1.0f, 19.5523f, 1.4477f, 20.0f, 2.0f, 20.0f)
                horizontalLineTo(22.0f)
                curveTo(22.5523f, 20.0f, 23.0f, 19.5523f, 23.0f, 19.0f)
                curveTo(23.0f, 18.4477f, 22.5523f, 18.0f, 22.0f, 18.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null
