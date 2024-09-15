package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.Stories: ImageVector
    get() {
        if (_stories != null) {
            return _stories!!
        }
        _stories = Builder(name = "Stories", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 6.0f)
                horizontalLineTo(9.0f)
                curveTo(8.448f, 6.0f, 8.0f, 6.448f, 8.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(8.0f, 17.552f, 8.448f, 18.0f, 9.0f, 18.0f)
                horizontalLineTo(15.0f)
                curveTo(15.552f, 18.0f, 16.0f, 17.552f, 16.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(16.0f, 6.448f, 15.552f, 6.0f, 15.0f, 6.0f)
                close()
                moveTo(9.0f, 4.0f)
                curveTo(7.343f, 4.0f, 6.0f, 5.343f, 6.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(6.0f, 18.657f, 7.343f, 20.0f, 9.0f, 20.0f)
                horizontalLineTo(15.0f)
                curveTo(16.657f, 20.0f, 18.0f, 18.657f, 18.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(18.0f, 5.343f, 16.657f, 4.0f, 15.0f, 4.0f)
                horizontalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 5.448f, 2.448f, 5.0f, 3.0f, 5.0f)
                curveTo(3.552f, 5.0f, 4.0f, 5.448f, 4.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 18.552f, 3.552f, 19.0f, 3.0f, 19.0f)
                curveTo(2.448f, 19.0f, 2.0f, 18.552f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                curveTo(20.0f, 5.448f, 20.448f, 5.0f, 21.0f, 5.0f)
                curveTo(21.552f, 5.0f, 22.0f, 5.448f, 22.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.552f, 21.552f, 19.0f, 21.0f, 19.0f)
                curveTo(20.448f, 19.0f, 20.0f, 18.552f, 20.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _stories!!
    }

private var _stories: ImageVector? = null
