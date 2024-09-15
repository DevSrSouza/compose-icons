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

public val CssGgIcons.File: ImageVector
    get() {
        if (_file != null) {
            return _file!!
        }
        _file = Builder(name = "File", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 5.0f)
                curveTo(3.0f, 3.343f, 4.343f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(17.866f, 2.0f, 21.0f, 5.134f, 21.0f, 9.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.657f, 19.657f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 22.0f, 3.0f, 20.657f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(13.0f, 4.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 4.0f, 5.0f, 4.448f, 5.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(5.0f, 19.552f, 5.448f, 20.0f, 6.0f, 20.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 20.0f, 19.0f, 19.552f, 19.0f, 19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(18.584f, 7.0f)
                curveTo(17.941f, 5.529f, 16.611f, 4.427f, 15.0f, 4.1f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.584f)
                close()
            }
        }
        .build()
        return _file!!
    }

private var _file: ImageVector? = null
