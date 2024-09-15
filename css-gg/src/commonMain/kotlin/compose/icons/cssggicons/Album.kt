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

public val CssGgIcons.Album: ImageVector
    get() {
        if (_album != null) {
            return _album!!
        }
        _album = Builder(name = "Album", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 19.0f)
                curveTo(2.0f, 20.657f, 3.343f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(20.657f, 22.0f, 22.0f, 20.657f, 22.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 3.343f, 20.657f, 2.0f, 19.0f, 2.0f)
                horizontalLineTo(5.0f)
                curveTo(3.343f, 2.0f, 2.0f, 3.343f, 2.0f, 5.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(20.0f, 19.0f)
                curveTo(20.0f, 19.552f, 19.552f, 20.0f, 19.0f, 20.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 20.0f, 4.0f, 19.552f, 4.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(4.0f, 4.448f, 4.448f, 4.0f, 5.0f, 4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.011f)
                lineTo(12.395f, 12.011f)
                lineTo(14.0f, 9.864f)
                lineTo(15.605f, 12.011f)
                horizontalLineTo(18.0f)
                lineTo(18.0f, 4.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 4.0f, 20.0f, 4.448f, 20.0f, 5.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(16.0f, 4.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.336f)
                lineTo(14.0f, 6.66f)
                lineTo(16.0f, 9.336f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _album!!
    }

private var _album: ImageVector? = null
