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

public val RemixIcons.ClipboardFill: ImageVector
    get() {
        if (_clipboardFill != null) {
            return _clipboardFill!!
        }
        _clipboardFill = Builder(name = "ClipboardFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 4.0f)
                horizontalLineToRelative(2.007f)
                curveToRelative(0.548f, 0.0f, 0.993f, 0.445f, 0.993f, 0.993f)
                verticalLineToRelative(16.014f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, -0.993f, 0.993f)
                lineTo(3.993f, 22.0f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 3.0f, 21.007f)
                lineTo(3.0f, 4.993f)
                curveTo(3.0f, 4.445f, 3.445f, 4.0f, 3.993f, 4.0f)
                lineTo(6.0f, 4.0f)
                close()
                moveTo(8.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.0f)
                lineTo(8.0f, 6.0f)
                lineTo(8.0f, 2.0f)
                close()
            }
        }
        .build()
        return _clipboardFill!!
    }

private var _clipboardFill: ImageVector? = null
