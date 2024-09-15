package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Attribution: ImageVector
    get() {
        if (_attribution != null) {
            return _attribution!!
        }
        _attribution = Builder(name = "Attribution", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                curveTo(6.74f, 8.0f, 7.387f, 7.598f, 7.732f, 7.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 7.0f, 16.0f, 7.895f, 16.0f, 9.0f)
                curveTo(16.0f, 10.105f, 15.105f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(10.0f)
                curveTo(7.791f, 11.0f, 6.0f, 12.791f, 6.0f, 15.0f)
                curveTo(6.0f, 17.209f, 7.791f, 19.0f, 10.0f, 19.0f)
                horizontalLineTo(16.268f)
                curveTo(16.613f, 19.598f, 17.26f, 20.0f, 18.0f, 20.0f)
                curveTo(19.105f, 20.0f, 20.0f, 19.105f, 20.0f, 18.0f)
                curveTo(20.0f, 16.895f, 19.105f, 16.0f, 18.0f, 16.0f)
                curveTo(17.26f, 16.0f, 16.613f, 16.402f, 16.268f, 17.0f)
                horizontalLineTo(10.0f)
                curveTo(8.895f, 17.0f, 8.0f, 16.105f, 8.0f, 15.0f)
                curveTo(8.0f, 13.895f, 8.895f, 13.0f, 10.0f, 13.0f)
                horizontalLineTo(14.0f)
                curveTo(16.209f, 13.0f, 18.0f, 11.209f, 18.0f, 9.0f)
                curveTo(18.0f, 6.791f, 16.209f, 5.0f, 14.0f, 5.0f)
                horizontalLineTo(7.732f)
                curveTo(7.387f, 4.402f, 6.74f, 4.0f, 6.0f, 4.0f)
                curveTo(4.895f, 4.0f, 4.0f, 4.895f, 4.0f, 6.0f)
                curveTo(4.0f, 7.105f, 4.895f, 8.0f, 6.0f, 8.0f)
                close()
            }
        }
        .build()
        return _attribution!!
    }

private var _attribution: ImageVector? = null
