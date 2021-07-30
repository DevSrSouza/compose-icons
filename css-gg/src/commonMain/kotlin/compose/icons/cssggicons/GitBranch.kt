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

public val CssGgIcons.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) {
            return _gitBranch!!
        }
        _gitBranch = Builder(name = "GitBranch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                curveTo(7.8954f, 3.0f, 7.0f, 3.8954f, 7.0f, 5.0f)
                curveTo(7.0f, 5.7403f, 7.4022f, 6.3866f, 8.0f, 6.7324f)
                verticalLineTo(17.2676f)
                curveTo(7.4022f, 17.6134f, 7.0f, 18.2597f, 7.0f, 19.0f)
                curveTo(7.0f, 20.1046f, 7.8954f, 21.0f, 9.0f, 21.0f)
                curveTo(9.7403f, 21.0f, 10.3866f, 20.5978f, 10.7324f, 20.0f)
                horizontalLineTo(11.9585f)
                curveTo(14.1676f, 20.0f, 15.9585f, 18.2091f, 15.9585f, 16.0f)
                verticalLineTo(14.7324f)
                curveTo(16.5563f, 14.3866f, 16.9585f, 13.7403f, 16.9585f, 13.0f)
                curveTo(16.9585f, 11.8954f, 16.0631f, 11.0f, 14.9585f, 11.0f)
                curveTo(13.8539f, 11.0f, 12.9585f, 11.8954f, 12.9585f, 13.0f)
                curveTo(12.9585f, 13.7403f, 13.3607f, 14.3866f, 13.9585f, 14.7324f)
                verticalLineTo(16.0f)
                curveTo(13.9585f, 17.1046f, 13.0631f, 18.0f, 11.9585f, 18.0f)
                horizontalLineTo(10.7324f)
                curveTo(10.5568f, 17.6964f, 10.3036f, 17.4432f, 10.0f, 17.2676f)
                verticalLineTo(6.7324f)
                curveTo(10.5978f, 6.3866f, 11.0f, 5.7403f, 11.0f, 5.0f)
                curveTo(11.0f, 3.8954f, 10.1046f, 3.0f, 9.0f, 3.0f)
                close()
            }
        }
        .build()
        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
