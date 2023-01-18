package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.TumblrLine: ImageVector
    get() {
        if (_tumblrLine != null) {
            return _tumblrLine!!
        }
        _tumblrLine = Builder(name = "TumblrLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.0f)
                curveToRelative(1.075f, 0.0f, 3.497f, -0.673f, 3.497f, -4.5f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.003f)
                verticalLineToRelative(2.91f)
                curveTo(13.0f, 15.39f, 13.0f, 16.595f, 13.0f, 17.0f)
                curveToRelative(-0.002f, 2.208f, 1.615f, 3.4f, 4.785f, 3.4f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(-2.242f)
                curveToRelative(-2.402f, 0.002f, -4.546f, -2.035f, -4.546f, -4.545f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _tumblrLine!!
    }

private var _tumblrLine: ImageVector? = null
