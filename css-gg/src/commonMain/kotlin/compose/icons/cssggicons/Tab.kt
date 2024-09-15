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

public val CssGgIcons.Tab: ImageVector
    get() {
        if (_tab != null) {
            return _tab!!
        }
        _tab = Builder(name = "Tab", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 4.0f)
                curveTo(20.657f, 4.0f, 22.0f, 5.343f, 22.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 18.657f, 20.657f, 20.0f, 19.0f, 20.0f)
                horizontalLineTo(5.0f)
                curveTo(3.343f, 20.0f, 2.0f, 18.657f, 2.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 5.343f, 3.343f, 4.0f, 5.0f, 4.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(20.0f, 9.625f)
                horizontalLineTo(13.0f)
                curveTo(12.448f, 9.625f, 11.844f, 9.205f, 11.652f, 8.687f)
                lineTo(10.654f, 6.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 6.0f, 4.0f, 6.448f, 4.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 17.552f, 4.448f, 18.0f, 5.0f, 18.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 18.0f, 20.0f, 17.552f, 20.0f, 17.0f)
                verticalLineTo(9.625f)
                close()
            }
        }
        .build()
        return _tab!!
    }

private var _tab: ImageVector? = null
