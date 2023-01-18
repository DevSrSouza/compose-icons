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

public val RemixIcons.EmphasisCn: ImageVector
    get() {
        if (_emphasisCn != null) {
            return _emphasisCn!!
        }
        _emphasisCn = Builder(name = "EmphasisCn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(6.5f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(17.5f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(13.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.968f)
                arcToRelative(18.222f, 18.222f, 0.0f, false, true, -3.621f, 6.302f)
                arcToRelative(14.685f, 14.685f, 0.0f, false, false, 5.327f, 3.042f)
                lineToRelative(-0.536f, 1.93f)
                arcTo(16.685f, 16.685f, 0.0f, false, true, 12.0f, 13.726f)
                arcToRelative(16.696f, 16.696f, 0.0f, false, true, -6.202f, 3.547f)
                lineToRelative(-0.536f, -1.929f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, false, 5.327f, -3.042f)
                arcToRelative(18.077f, 18.077f, 0.0f, false, true, -2.822f, -4.3f)
                horizontalLineToRelative(2.24f)
                arcTo(16.031f, 16.031f, 0.0f, false, false, 12.0f, 10.876f)
                arcToRelative(16.168f, 16.168f, 0.0f, false, false, 2.91f, -4.876f)
                lineTo(5.0f, 6.0f)
                lineTo(5.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _emphasisCn!!
    }

private var _emphasisCn: ImageVector? = null
