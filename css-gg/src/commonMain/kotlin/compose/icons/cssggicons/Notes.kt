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

public val CssGgIcons.Notes: ImageVector
    get() {
        if (_notes != null) {
            return _notes!!
        }
        _notes = Builder(name = "Notes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 6.0f)
                curveTo(6.0f, 5.448f, 6.448f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 5.0f, 18.0f, 5.448f, 18.0f, 6.0f)
                curveTo(18.0f, 6.552f, 17.552f, 7.0f, 17.0f, 7.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 7.0f, 6.0f, 6.552f, 6.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                curveTo(6.0f, 9.448f, 6.448f, 9.0f, 7.0f, 9.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 9.0f, 18.0f, 9.448f, 18.0f, 10.0f)
                curveTo(18.0f, 10.552f, 17.552f, 11.0f, 17.0f, 11.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 11.0f, 6.0f, 10.552f, 6.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 13.0f)
                curveTo(6.448f, 13.0f, 6.0f, 13.448f, 6.0f, 14.0f)
                curveTo(6.0f, 14.552f, 6.448f, 15.0f, 7.0f, 15.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 15.0f, 18.0f, 14.552f, 18.0f, 14.0f)
                curveTo(18.0f, 13.448f, 17.552f, 13.0f, 17.0f, 13.0f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 18.0f)
                curveTo(6.0f, 17.448f, 6.448f, 17.0f, 7.0f, 17.0f)
                horizontalLineTo(11.0f)
                curveTo(11.552f, 17.0f, 12.0f, 17.448f, 12.0f, 18.0f)
                curveTo(12.0f, 18.552f, 11.552f, 19.0f, 11.0f, 19.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 19.0f, 6.0f, 18.552f, 6.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 4.0f)
                curveTo(2.0f, 2.343f, 3.343f, 1.0f, 5.0f, 1.0f)
                horizontalLineTo(19.0f)
                curveTo(20.657f, 1.0f, 22.0f, 2.343f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 21.657f, 20.657f, 23.0f, 19.0f, 23.0f)
                horizontalLineTo(5.0f)
                curveTo(3.343f, 23.0f, 2.0f, 21.657f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 3.0f, 20.0f, 3.448f, 20.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 20.552f, 19.552f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 21.0f, 4.0f, 20.552f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 3.448f, 4.448f, 3.0f, 5.0f, 3.0f)
                close()
            }
        }
        .build()
        return _notes!!
    }

private var _notes: ImageVector? = null
