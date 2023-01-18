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

public val RemixIcons.ThumbUpFill: ImageVector
    get() {
        if (_thumbUpFill != null) {
            return _thumbUpFill!!
        }
        _thumbUpFill = Builder(name = "ThumbUpFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(12.0f)
                lineTo(2.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(1.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(7.293f, 7.707f)
                lineToRelative(6.4f, -6.4f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.654f, -0.047f)
                lineToRelative(0.853f, 0.64f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.553f, 1.57f)
                lineTo(14.6f, 8.0f)
                lineTo(21.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(2.104f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.15f, 0.762f)
                lineToRelative(-3.095f, 7.515f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.925f, 0.619f)
                lineTo(8.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(7.0f, 8.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.293f, -0.707f)
                close()
            }
        }
        .build()
        return _thumbUpFill!!
    }

private var _thumbUpFill: ImageVector? = null
