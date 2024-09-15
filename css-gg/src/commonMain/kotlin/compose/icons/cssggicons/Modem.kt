package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
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

public val CssGgIcons.Modem: ImageVector
    get() {
        if (_modem != null) {
            return _modem!!
        }
        _modem = Builder(name = "Modem", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 16.634f)
                curveTo(18.0f, 17.186f, 17.552f, 17.634f, 17.0f, 17.634f)
                curveTo(16.448f, 17.634f, 16.0f, 17.186f, 16.0f, 16.634f)
                curveTo(16.0f, 16.082f, 16.448f, 15.634f, 17.0f, 15.634f)
                curveTo(17.552f, 15.634f, 18.0f, 16.082f, 18.0f, 16.634f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.866f, 3.134f)
                curveTo(5.388f, 2.858f, 4.776f, 3.022f, 4.5f, 3.5f)
                curveTo(4.224f, 3.978f, 4.388f, 4.59f, 4.866f, 4.866f)
                lineTo(18.32f, 12.634f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.634f)
                curveTo(2.0f, 18.843f, 3.791f, 20.634f, 6.0f, 20.634f)
                horizontalLineTo(18.0f)
                curveTo(20.209f, 20.634f, 22.0f, 18.843f, 22.0f, 16.634f)
                verticalLineTo(12.634f)
                lineTo(5.866f, 3.134f)
                close()
                moveTo(20.0f, 14.634f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.634f)
                curveTo(4.0f, 17.739f, 4.895f, 18.634f, 6.0f, 18.634f)
                horizontalLineTo(18.0f)
                curveTo(19.105f, 18.634f, 20.0f, 17.739f, 20.0f, 16.634f)
                verticalLineTo(14.634f)
                close()
            }
        }
        .build()
        return _modem!!
    }

private var _modem: ImageVector? = null
