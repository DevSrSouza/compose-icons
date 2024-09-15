package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.Add: ImageVector
    get() {
        if (_add != null) {
            return _add!!
        }
        _add = Builder(name = "Add", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 7.0f)
                curveTo(13.0f, 6.448f, 12.552f, 6.0f, 12.0f, 6.0f)
                curveTo(11.448f, 6.0f, 11.0f, 6.448f, 11.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 11.0f, 6.0f, 11.448f, 6.0f, 12.0f)
                curveTo(6.0f, 12.552f, 6.448f, 13.0f, 7.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                curveTo(11.0f, 17.552f, 11.448f, 18.0f, 12.0f, 18.0f)
                curveTo(12.552f, 18.0f, 13.0f, 17.552f, 13.0f, 17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 13.0f, 18.0f, 12.552f, 18.0f, 12.0f)
                curveTo(18.0f, 11.448f, 17.552f, 11.0f, 17.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _add!!
    }

private var _add: ImageVector? = null
