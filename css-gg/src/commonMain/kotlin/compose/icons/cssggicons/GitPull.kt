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
                curveTo(7.0f, 3.895f, 7.895f, 3.0f, 9.0f, 3.0f)
                curveTo(10.105f, 3.0f, 11.0f, 3.895f, 11.0f, 5.0f)
                curveTo(11.0f, 5.342f, 10.914f, 5.663f, 10.763f, 5.945f)
                horizontalLineTo(11.344f)
                curveTo(13.553f, 5.945f, 15.344f, 7.736f, 15.344f, 9.945f)
                verticalLineTo(11.224f)
                curveTo(15.93f, 11.573f, 16.323f, 12.213f, 16.323f, 12.945f)
                curveTo(16.323f, 14.049f, 15.428f, 14.945f, 14.323f, 14.945f)
                curveTo(13.218f, 14.945f, 12.323f, 14.049f, 12.323f, 12.945f)
                curveTo(12.323f, 12.196f, 12.734f, 11.543f, 13.344f, 11.2f)
                verticalLineTo(9.945f)
                curveTo(13.344f, 8.84f, 12.448f, 7.945f, 11.344f, 7.945f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.268f)
                curveTo(10.598f, 17.613f, 11.0f, 18.26f, 11.0f, 19.0f)
                curveTo(11.0f, 20.105f, 10.105f, 21.0f, 9.0f, 21.0f)
                curveTo(7.895f, 21.0f, 7.0f, 20.105f, 7.0f, 19.0f)
                curveTo(7.0f, 18.26f, 7.402f, 17.613f, 8.0f, 17.268f)
                verticalLineTo(6.732f)
                curveTo(7.402f, 6.387f, 7.0f, 5.74f, 7.0f, 5.0f)
                close()
            }
        }
        .build()
        return _gitPull!!
    }

private var _gitPull: ImageVector? = null
