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
                moveTo(18.9999f, 4.0f)
                curveTo(20.6568f, 4.0f, 21.9999f, 5.3432f, 21.9999f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(21.9999f, 18.6569f, 20.6568f, 20.0f, 18.9999f, 20.0f)
                horizontalLineTo(4.9999f)
                curveTo(3.3431f, 20.0f, 1.9999f, 18.6569f, 1.9999f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(1.9999f, 5.3432f, 3.3431f, 4.0f, 4.9999f, 4.0f)
                horizontalLineTo(18.9999f)
                close()
                moveTo(19.9999f, 9.6248f)
                horizontalLineTo(13.0f)
                curveTo(12.4478f, 9.6248f, 11.8442f, 9.2051f, 11.652f, 8.6873f)
                lineTo(10.6542f, 6.0f)
                horizontalLineTo(4.9999f)
                curveTo(4.4476f, 6.0f, 3.9999f, 6.4477f, 3.9999f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(3.9999f, 17.5523f, 4.4476f, 18.0f, 4.9999f, 18.0f)
                horizontalLineTo(18.9999f)
                curveTo(19.5522f, 18.0f, 19.9999f, 17.5523f, 19.9999f, 17.0f)
                verticalLineTo(9.6248f)
                close()
            }
        }
        .build()
        return _tab!!
    }

private var _tab: ImageVector? = null
