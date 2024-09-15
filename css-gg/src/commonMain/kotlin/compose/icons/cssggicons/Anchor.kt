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

public val CssGgIcons.Anchor: ImageVector
    get() {
        if (_anchor != null) {
            return _anchor!!
        }
        _anchor = Builder(name = "Anchor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 6.0f)
                curveTo(15.0f, 7.306f, 14.165f, 8.417f, 13.0f, 8.829f)
                verticalLineTo(16.874f)
                curveTo(14.725f, 16.43f, 16.0f, 14.864f, 16.0f, 13.0f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 15.973f, 15.838f, 18.441f, 13.0f, 18.917f)
                verticalLineTo(20.0f)
                curveTo(13.0f, 20.552f, 12.552f, 21.0f, 12.0f, 21.0f)
                curveTo(11.448f, 21.0f, 11.0f, 20.552f, 11.0f, 20.0f)
                verticalLineTo(18.917f)
                curveTo(8.162f, 18.441f, 6.0f, 15.973f, 6.0f, 13.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 14.864f, 9.275f, 16.43f, 11.0f, 16.874f)
                verticalLineTo(8.829f)
                curveTo(9.835f, 8.417f, 9.0f, 7.306f, 9.0f, 6.0f)
                curveTo(9.0f, 4.343f, 10.343f, 3.0f, 12.0f, 3.0f)
                curveTo(13.657f, 3.0f, 15.0f, 4.343f, 15.0f, 6.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(12.552f, 7.0f, 13.0f, 6.552f, 13.0f, 6.0f)
                curveTo(13.0f, 5.448f, 12.552f, 5.0f, 12.0f, 5.0f)
                curveTo(11.448f, 5.0f, 11.0f, 5.448f, 11.0f, 6.0f)
                curveTo(11.0f, 6.552f, 11.448f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _anchor!!
    }

private var _anchor: ImageVector? = null
