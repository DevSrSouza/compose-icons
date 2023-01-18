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

public val RemixIcons.MotorbikeFill: ImageVector
    get() {
        if (_motorbikeFill != null) {
            return _motorbikeFill!!
        }
        _motorbikeFill = Builder(name = "MotorbikeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.365f, 10.0f)
                lineTo(11.2f, 8.0f)
                lineTo(17.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.144f)
                lineTo(9.0f, 12.0f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.365f)
                close()
                moveTo(9.281f, 15.06f)
                lineToRelative(2.925f, -1.065f)
                lineToRelative(0.684f, 1.88f)
                lineToRelative(-2.925f, 1.064f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -0.684f, -1.88f)
                close()
                moveTo(5.5f, 20.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                close()
                moveTo(18.5f, 22.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 0.0f, -9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.0f, 9.0f)
                close()
                moveTo(18.5f, 20.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                close()
                moveTo(4.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(2.6f, -1.733f)
                lineToRelative(0.28f, -1.046f)
                lineToRelative(1.932f, 0.518f)
                lineToRelative(-1.922f, 7.131f)
                lineToRelative(-1.822f, -0.888f)
                lineToRelative(0.118f, -0.44f)
                lineTo(9.0f, 16.0f)
                lineToRelative(-1.0f, -2.0f)
                lineTo(4.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(16.092f, 6.0f)
                lineTo(20.0f, 6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.816f)
                lineToRelative(1.92f, 5.276f)
                lineToRelative(-1.88f, 0.684f)
                lineTo(15.056f, 9.0f)
                lineTo(15.0f, 9.0f)
                verticalLineToRelative(-0.152f)
                lineTo(13.6f, 5.0f)
                lineTo(11.0f, 5.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(1.092f, 3.0f)
                close()
            }
        }
        .build()
        return _motorbikeFill!!
    }

private var _motorbikeFill: ImageVector? = null
