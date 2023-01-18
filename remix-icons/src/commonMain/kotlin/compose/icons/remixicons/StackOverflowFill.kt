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

public val RemixIcons.StackOverflowFill: ImageVector
    get() {
        if (_stackOverflowFill != null) {
            return _stackOverflowFill!!
        }
        _stackOverflowFill = Builder(name = "StackOverflowFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 20.002f)
                lineTo(18.0f, 14.67f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.333f)
                lineTo(4.0f, 22.003f)
                lineTo(4.0f, 14.67f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.333f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(7.599f, 14.736f)
                lineToRelative(0.313f, -1.98f)
                lineToRelative(8.837f, 1.7f)
                lineToRelative(-0.113f, 1.586f)
                lineToRelative(-9.037f, -1.306f)
                close()
                moveTo(8.799f, 10.204f)
                lineToRelative(0.732f, -1.6f)
                lineToRelative(7.998f, 3.733f)
                lineToRelative(-0.733f, 1.599f)
                lineToRelative(-7.998f, -3.732f)
                close()
                moveTo(11.064f, 6.272f)
                lineToRelative(1.133f, -1.333f)
                lineToRelative(6.798f, 5.665f)
                lineToRelative(-1.133f, 1.333f)
                lineToRelative(-6.798f, -5.665f)
                close()
                moveTo(15.396f, 2.14f)
                lineToRelative(5.265f, 7.064f)
                lineToRelative(-1.4f, 1.067f)
                lineToRelative(-5.264f, -7.065f)
                lineToRelative(1.4f, -1.066f)
                close()
                moveTo(7.332f, 18.668f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.33f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-9.33f)
                close()
            }
        }
        .build()
        return _stackOverflowFill!!
    }

private var _stackOverflowFill: ImageVector? = null
