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

public val RemixIcons.ThumbDownFill: ImageVector
    get() {
        if (_thumbDownFill != null) {
            return _thumbDownFill!!
        }
        _thumbDownFill = Builder(name = "ThumbDownFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(19.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(16.707f, 16.293f)
                lineToRelative(-6.4f, 6.4f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.654f, 0.047f)
                lineTo(8.8f, 22.1f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.553f, -1.57f)
                lineTo(9.4f, 16.0f)
                lineTo(3.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-2.104f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.15f, -0.762f)
                lineTo(4.246f, 3.62f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.17f, 3.0f)
                lineTo(16.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(11.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.293f, 0.707f)
                close()
            }
        }
        .build()
        return _thumbDownFill!!
    }

private var _thumbDownFill: ImageVector? = null
