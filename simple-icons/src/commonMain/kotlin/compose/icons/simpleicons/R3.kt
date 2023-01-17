package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.R3: ImageVector
    get() {
        if (_r3 != null) {
            return _r3!!
        }
        _r3 = Builder(name = "R3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.457f)
                curveToRelative(0.0f, 0.841f, -0.688f, 1.53f, -1.53f, 1.53f)
                curveToRelative(-0.842f, 0.0f, -1.53f, -0.689f, -1.53f, -1.53f)
                arcToRelative(1.53f, 1.53f, 0.0f, true, true, 3.06f, 0.0f)
                close()
                moveTo(6.147f, 2.853f)
                curveToRelative(-1.123f, 0.0f, -2.172f, 0.3f, -3.08f, 0.828f)
                verticalLineToRelative(-0.828f)
                lineTo(0.0f, 2.853f)
                verticalLineToRelative(12.134f)
                horizontalLineToRelative(3.067f)
                lineTo(3.067f, 9.0f)
                arcToRelative(3.077f, 3.077f, 0.0f, false, true, 3.08f, -3.08f)
                lineToRelative(1.029f, -0.007f)
                lineToRelative(2.105f, -3.06f)
                lineTo(6.147f, 2.853f)
                close()
                moveTo(14.893f, 8.933f)
                lineTo(16.971f, 5.913f)
                verticalLineToRelative(-3.06f)
                horizontalLineToRelative(-6.615f)
                lineToRelative(-2.104f, 3.06f)
                horizontalLineToRelative(4.99f)
                lineToRelative(-2.565f, 3.735f)
                lineToRelative(1.53f, 2.653f)
                arcToRelative(3.098f, 3.098f, 0.0f, false, true, 4.65f, 2.686f)
                curveToRelative(0.0f, 1.717f, -1.39f, 3.1f, -3.1f, 3.1f)
                curveToRelative(-1.71f, 0.0f, -3.1f, -1.39f, -3.1f, -3.1f)
                horizontalLineToRelative(-3.06f)
                curveToRelative(0.0f, 3.4f, 2.76f, 6.16f, 6.154f, 6.16f)
                curveToRelative(3.4f, 0.0f, 6.16f, -2.76f, 6.16f, -6.16f)
                arcToRelative(6.162f, 6.162f, 0.0f, false, false, -5.018f, -6.054f)
                close()
            }
        }
        .build()
        return _r3!!
    }

private var _r3: ImageVector? = null
