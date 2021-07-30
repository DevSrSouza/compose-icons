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

public val CssGgIcons.GitPull: ImageVector
    get() {
        if (_gitPull != null) {
            return _gitPull!!
        }
        _gitPull = Builder(name = "GitPull", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                curveTo(7.0f, 3.8954f, 7.8954f, 3.0f, 9.0f, 3.0f)
                curveTo(10.1046f, 3.0f, 11.0f, 3.8954f, 11.0f, 5.0f)
                curveTo(11.0f, 5.3417f, 10.9143f, 5.6634f, 10.7633f, 5.9447f)
                horizontalLineTo(11.3438f)
                curveTo(13.5529f, 5.9447f, 15.3438f, 7.7356f, 15.3438f, 9.9447f)
                verticalLineTo(11.2244f)
                curveTo(15.9301f, 11.5731f, 16.323f, 12.213f, 16.323f, 12.9447f)
                curveTo(16.323f, 14.0493f, 15.4276f, 14.9447f, 14.323f, 14.9447f)
                curveTo(13.2184f, 14.9447f, 12.323f, 14.0493f, 12.323f, 12.9447f)
                curveTo(12.323f, 12.1959f, 12.7345f, 11.5432f, 13.3438f, 11.2004f)
                verticalLineTo(9.9447f)
                curveTo(13.3438f, 8.8401f, 12.4483f, 7.9447f, 11.3438f, 7.9447f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.2676f)
                curveTo(10.5978f, 17.6134f, 11.0f, 18.2597f, 11.0f, 19.0f)
                curveTo(11.0f, 20.1046f, 10.1046f, 21.0f, 9.0f, 21.0f)
                curveTo(7.8954f, 21.0f, 7.0f, 20.1046f, 7.0f, 19.0f)
                curveTo(7.0f, 18.2597f, 7.4022f, 17.6134f, 8.0f, 17.2676f)
                verticalLineTo(6.7324f)
                curveTo(7.4022f, 6.3866f, 7.0f, 5.7403f, 7.0f, 5.0f)
                close()
            }
        }
        .build()
        return _gitPull!!
    }

private var _gitPull: ImageVector? = null
