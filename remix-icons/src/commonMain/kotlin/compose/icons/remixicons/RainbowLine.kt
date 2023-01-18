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

public val RemixIcons.RainbowLine: ImageVector
    get() {
        if (_rainbowLine != null) {
            return _rainbowLine!!
        }
        _rainbowLine = Builder(name = "RainbowLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(6.075f, 0.0f, 11.0f, 4.925f, 11.0f, 11.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -8.735f, -8.996f)
                lineTo(12.0f, 6.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -8.996f, 8.735f)
                lineTo(3.0f, 15.0f)
                verticalLineToRelative(5.0f)
                lineTo(1.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                curveTo(1.0f, 8.925f, 5.925f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.0f, 7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.783f, -4.995f)
                lineTo(12.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.995f, 4.783f)
                lineTo(7.0f, 15.0f)
                verticalLineToRelative(5.0f)
                lineTo(5.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.0f, -7.0f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.883f, -0.993f)
                lineTo(12.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineTo(11.0f, 15.0f)
                verticalLineToRelative(5.0f)
                lineTo(9.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _rainbowLine!!
    }

private var _rainbowLine: ImageVector? = null
