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

public val CssGgIcons.Trello: ImageVector
    get() {
        if (_trello != null) {
            return _trello!!
        }
        _trello = Builder(name = "Trello", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                curveTo(6.0f, 6.4477f, 6.4477f, 6.0f, 7.0f, 6.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 6.0f, 11.0f, 6.4477f, 11.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(11.0f, 17.5523f, 10.5523f, 18.0f, 10.0f, 18.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 18.0f, 6.0f, 17.5523f, 6.0f, 17.0f)
                verticalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.0f)
                curveTo(13.0f, 6.4477f, 13.4477f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 6.0f, 18.0f, 6.4477f, 18.0f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(18.0f, 13.5523f, 17.5523f, 14.0f, 17.0f, 14.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 14.0f, 13.0f, 13.5523f, 13.0f, 13.0f)
                verticalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 4.0f)
                curveTo(2.0f, 2.8954f, 2.8954f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 2.0f, 22.0f, 2.8954f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 21.1046f, 21.1046f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 22.0f, 2.0f, 21.1046f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(4.0f, 4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _trello!!
    }

private var _trello: ImageVector? = null
