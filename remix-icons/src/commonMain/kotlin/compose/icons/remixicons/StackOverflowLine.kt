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

public val RemixIcons.StackOverflowLine: ImageVector
    get() {
        if (_stackOverflowLine != null) {
            return _stackOverflowLine!!
        }
        _stackOverflowLine = Builder(name = "StackOverflowLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 20.002f)
                lineTo(18.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.002f)
                lineTo(4.0f, 22.002f)
                lineTo(4.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.002f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(7.5f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(7.577f, 13.62f)
                lineToRelative(0.347f, -1.97f)
                lineToRelative(8.864f, 1.563f)
                lineToRelative(-0.348f, 1.97f)
                lineToRelative(-8.863f, -1.563f)
                close()
                moveTo(9.211f, 8.116f)
                lineToRelative(1.0f, -1.732f)
                lineToRelative(7.794f, 4.5f)
                lineToRelative(-1.0f, 1.732f)
                lineToRelative(-7.794f, -4.5f)
                close()
                moveTo(12.628f, 3.503f)
                lineToRelative(1.532f, -1.286f)
                lineToRelative(5.785f, 6.895f)
                lineToRelative(-1.532f, 1.285f)
                lineToRelative(-5.785f, -6.894f)
                close()
            }
        }
        .build()
        return _stackOverflowLine!!
    }

private var _stackOverflowLine: ImageVector? = null
