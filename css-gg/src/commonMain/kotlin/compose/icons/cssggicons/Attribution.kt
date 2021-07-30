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
                curveTo(6.7403f, 8.0f, 7.3866f, 7.5978f, 7.7324f, 7.0f)
                horizontalLineTo(14.0f)
                curveTo(15.1046f, 7.0f, 16.0f, 7.8954f, 16.0f, 9.0f)
                curveTo(16.0f, 10.1046f, 15.1046f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(10.0f)
                curveTo(7.7909f, 11.0f, 6.0f, 12.7909f, 6.0f, 15.0f)
                curveTo(6.0f, 17.2091f, 7.7909f, 19.0f, 10.0f, 19.0f)
                horizontalLineTo(16.2676f)
                curveTo(16.6134f, 19.5978f, 17.2597f, 20.0f, 18.0f, 20.0f)
                curveTo(19.1046f, 20.0f, 20.0f, 19.1046f, 20.0f, 18.0f)
                curveTo(20.0f, 16.8954f, 19.1046f, 16.0f, 18.0f, 16.0f)
                curveTo(17.2597f, 16.0f, 16.6134f, 16.4022f, 16.2676f, 17.0f)
                horizontalLineTo(10.0f)
                curveTo(8.8954f, 17.0f, 8.0f, 16.1046f, 8.0f, 15.0f)
                curveTo(8.0f, 13.8954f, 8.8954f, 13.0f, 10.0f, 13.0f)
                horizontalLineTo(14.0f)
                curveTo(16.2091f, 13.0f, 18.0f, 11.2091f, 18.0f, 9.0f)
                curveTo(18.0f, 6.7909f, 16.2091f, 5.0f, 14.0f, 5.0f)
                horizontalLineTo(7.7324f)
                curveTo(7.3866f, 4.4022f, 6.7403f, 4.0f, 6.0f, 4.0f)
                curveTo(4.8954f, 4.0f, 4.0f, 4.8954f, 4.0f, 6.0f)
                curveTo(4.0f, 7.1046f, 4.8954f, 8.0f, 6.0f, 8.0f)
                close()
            }
        }
        .build()
        return _attribution!!
    }

private var _attribution: ImageVector? = null
