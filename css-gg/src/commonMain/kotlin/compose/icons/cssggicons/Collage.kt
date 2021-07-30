package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Collage: ImageVector
    get() {
        if (_collage != null) {
            return _collage!!
        }
        _collage = Builder(name = "Collage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 5.0f)
                curveTo(4.0f, 3.3431f, 5.3432f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(18.6569f, 2.0f, 20.0f, 3.3431f, 20.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(20.0f, 20.6569f, 18.6569f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(5.3432f, 22.0f, 4.0f, 20.6569f, 4.0f, 19.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(13.0f, 4.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 4.0f, 18.0f, 4.4477f, 18.0f, 5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(13.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 20.0f, 18.0f, 19.5523f, 18.0f, 19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(11.0f, 4.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 4.0f, 6.0f, 4.4477f, 6.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(6.0f, 19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 20.0f, 6.0f, 19.5523f, 6.0f, 19.0f)
                close()
            }
        }
        .build()
        return _collage!!
    }

private var _collage: ImageVector? = null
