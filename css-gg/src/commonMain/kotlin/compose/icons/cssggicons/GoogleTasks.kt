package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.GoogleTasks: ImageVector
    get() {
        if (_googleTasks != null) {
            return _googleTasks!!
        }
        _googleTasks = Builder(name = "GoogleTasks", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.768f, 5.714f)
                curveTo(17.478f, 4.868f, 18.739f, 4.758f, 19.586f, 5.468f)
                curveTo(20.432f, 6.178f, 20.542f, 7.439f, 19.832f, 8.286f)
                lineTo(10.833f, 19.01f)
                curveTo(10.123f, 19.856f, 8.862f, 19.967f, 8.015f, 19.257f)
                curveTo(7.169f, 18.547f, 7.059f, 17.285f, 7.769f, 16.439f)
                lineTo(16.768f, 5.714f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.74f)
                curveTo(3.0f, 11.635f, 3.895f, 10.74f, 5.0f, 10.74f)
                curveTo(6.105f, 10.74f, 7.0f, 11.635f, 7.0f, 12.74f)
                curveTo(7.0f, 13.844f, 6.105f, 14.74f, 5.0f, 14.74f)
                curveTo(3.895f, 14.74f, 3.0f, 13.844f, 3.0f, 12.74f)
                close()
            }
        }
        .build()
        return _googleTasks!!
    }

private var _googleTasks: ImageVector? = null
