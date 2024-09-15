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

public val CssGgIcons.Icecream: ImageVector
    get() {
        if (_icecream != null) {
            return _icecream!!
        }
        _icecream = Builder(name = "Icecream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                curveTo(19.0f, 4.134f, 15.866f, 1.0f, 12.0f, 1.0f)
                curveTo(8.134f, 1.0f, 5.0f, 4.134f, 5.0f, 8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                curveTo(9.0f, 21.657f, 10.343f, 23.0f, 12.0f, 23.0f)
                curveTo(13.657f, 23.0f, 15.0f, 21.657f, 15.0f, 20.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(17.0f, 15.0f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 5.239f, 14.761f, 3.0f, 12.0f, 3.0f)
                curveTo(9.239f, 3.0f, 7.0f, 5.239f, 7.0f, 8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                curveTo(11.0f, 20.552f, 11.448f, 21.0f, 12.0f, 21.0f)
                curveTo(12.552f, 21.0f, 13.0f, 20.552f, 13.0f, 20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _icecream!!
    }

private var _icecream: ImageVector? = null
