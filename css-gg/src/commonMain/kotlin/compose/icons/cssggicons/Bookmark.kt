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

public val CssGgIcons.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 20.0f)
                horizontalLineTo(17.172f)
                lineTo(12.707f, 15.535f)
                curveTo(12.317f, 15.145f, 11.684f, 15.145f, 11.293f, 15.535f)
                lineTo(6.828f, 20.0f)
                lineTo(5.0f, 20.0f)
                verticalLineTo(7.0f)
                curveTo(5.0f, 5.343f, 6.343f, 4.0f, 8.0f, 4.0f)
                horizontalLineTo(16.0f)
                curveTo(17.657f, 4.0f, 19.0f, 5.343f, 19.0f, 7.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(17.0f, 7.0f)
                curveTo(17.0f, 6.448f, 16.552f, 6.0f, 16.0f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(7.448f, 6.0f, 7.0f, 6.448f, 7.0f, 7.0f)
                verticalLineTo(17.0f)
                lineTo(9.879f, 14.121f)
                curveTo(11.05f, 12.95f, 12.95f, 12.95f, 14.121f, 14.121f)
                lineTo(17.0f, 17.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
