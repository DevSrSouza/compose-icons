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

public val SimpleIcons.Tailwindcss: ImageVector
    get() {
        if (_tailwindcss != null) {
            return _tailwindcss!!
        }
        _tailwindcss = Builder(name = "Tailwindcss", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 4.8f)
                curveToRelative(-3.2f, 0.0f, -5.2f, 1.6f, -6.0f, 4.8f)
                curveToRelative(1.2f, -1.6f, 2.6f, -2.2f, 4.2f, -1.8f)
                curveToRelative(0.913f, 0.228f, 1.565f, 0.89f, 2.288f, 1.624f)
                curveTo(13.666f, 10.618f, 15.027f, 12.0f, 18.001f, 12.0f)
                curveToRelative(3.2f, 0.0f, 5.2f, -1.6f, 6.0f, -4.8f)
                curveToRelative(-1.2f, 1.6f, -2.6f, 2.2f, -4.2f, 1.8f)
                curveToRelative(-0.913f, -0.228f, -1.565f, -0.89f, -2.288f, -1.624f)
                curveTo(16.337f, 6.182f, 14.976f, 4.8f, 12.001f, 4.8f)
                close()
                moveTo(6.001f, 12.0f)
                curveToRelative(-3.2f, 0.0f, -5.2f, 1.6f, -6.0f, 4.8f)
                curveToRelative(1.2f, -1.6f, 2.6f, -2.2f, 4.2f, -1.8f)
                curveToRelative(0.913f, 0.228f, 1.565f, 0.89f, 2.288f, 1.624f)
                curveToRelative(1.177f, 1.194f, 2.538f, 2.576f, 5.512f, 2.576f)
                curveToRelative(3.2f, 0.0f, 5.2f, -1.6f, 6.0f, -4.8f)
                curveToRelative(-1.2f, 1.6f, -2.6f, 2.2f, -4.2f, 1.8f)
                curveToRelative(-0.913f, -0.228f, -1.565f, -0.89f, -2.288f, -1.624f)
                curveTo(10.337f, 13.382f, 8.976f, 12.0f, 6.001f, 12.0f)
                close()
            }
        }
        .build()
        return _tailwindcss!!
    }

private var _tailwindcss: ImageVector? = null
