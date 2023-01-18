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

public val RemixIcons.RainbowFill: ImageVector
    get() {
        if (_rainbowFill != null) {
            return _rainbowFill!!
        }
        _rainbowFill = Builder(name = "RainbowFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(6.075f, 0.0f, 11.0f, 4.925f, 11.0f, 11.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.75f, -7.996f)
                lineTo(12.0f, 7.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.996f, 7.75f)
                lineTo(4.0f, 15.0f)
                verticalLineToRelative(5.0f)
                lineTo(1.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                curveTo(1.0f, 8.925f, 5.925f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.0f, 7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.8f, -3.995f)
                lineTo(12.0f, 11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.995f, 3.8f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(5.0f)
                lineTo(5.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.0f, -7.0f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                lineTo(9.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _rainbowFill!!
    }

private var _rainbowFill: ImageVector? = null
