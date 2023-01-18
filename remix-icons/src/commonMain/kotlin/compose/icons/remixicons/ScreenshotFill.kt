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

public val RemixIcons.ScreenshotFill: ImageVector
    get() {
        if (_screenshotFill != null) {
            return _screenshotFill!!
        }
        _screenshotFill = Builder(name = "ScreenshotFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.993f, 14.407f)
                lineToRelative(-1.552f, 1.552f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -1.418f, -1.41f)
                lineToRelative(1.555f, -1.556f)
                lineToRelative(-3.124f, -3.125f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -2.121f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(4.185f, 4.185f)
                lineToRelative(4.189f, -4.189f)
                lineToRelative(0.353f, 0.354f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 2.12f)
                lineToRelative(-3.128f, 3.13f)
                lineToRelative(1.561f, 1.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -1.414f, 1.414f)
                lineToRelative(-1.561f, -1.56f)
                close()
                moveTo(19.0f, 13.0f)
                lineTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(8.0f)
                lineTo(3.0f, 13.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(7.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(17.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _screenshotFill!!
    }

private var _screenshotFill: ImageVector? = null
