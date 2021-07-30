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

public val CssGgIcons.InsertBeforeO: ImageVector
    get() {
        if (_insertBeforeO != null) {
            return _insertBeforeO!!
        }
        _insertBeforeO = Builder(name = "InsertBeforeO", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(4.4477f, 3.0f, 4.0f, 2.5523f, 4.0f, 2.0f)
                curveTo(4.0f, 1.4477f, 4.4477f, 1.0f, 5.0f, 1.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 1.0f, 20.0f, 1.4477f, 20.0f, 2.0f)
                curveTo(20.0f, 2.5523f, 19.5523f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 15.0f)
                curveTo(8.4477f, 15.0f, 8.0f, 14.5523f, 8.0f, 14.0f)
                curveTo(8.0f, 13.4477f, 8.4477f, 13.0f, 9.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                curveTo(11.0f, 10.4477f, 11.4477f, 10.0f, 12.0f, 10.0f)
                curveTo(12.5523f, 10.0f, 13.0f, 10.4477f, 13.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 13.0f, 16.0f, 13.4477f, 16.0f, 14.0f)
                curveTo(16.0f, 14.5523f, 15.5523f, 15.0f, 15.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                curveTo(13.0f, 17.5523f, 12.5523f, 18.0f, 12.0f, 18.0f)
                curveTo(11.4477f, 18.0f, 11.0f, 17.5523f, 11.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 14.0f)
                curveTo(4.0f, 18.4183f, 7.5817f, 22.0f, 12.0f, 22.0f)
                curveTo(16.4183f, 22.0f, 20.0f, 18.4183f, 20.0f, 14.0f)
                curveTo(20.0f, 9.5817f, 16.4183f, 6.0f, 12.0f, 6.0f)
                curveTo(7.5817f, 6.0f, 4.0f, 9.5817f, 4.0f, 14.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(8.6863f, 8.0f, 6.0f, 10.6863f, 6.0f, 14.0f)
                curveTo(6.0f, 17.3137f, 8.6863f, 20.0f, 12.0f, 20.0f)
                curveTo(15.3137f, 20.0f, 18.0f, 17.3137f, 18.0f, 14.0f)
                curveTo(18.0f, 10.6863f, 15.3137f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _insertBeforeO!!
    }

private var _insertBeforeO: ImageVector? = null
