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

public val SimpleIcons.Clion: ImageVector
    get() {
        if (_clion != null) {
            return _clion!!
        }
        _clion = Builder(name = "Clion", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(7.041f, 3.0f)
                arcToRelative(5.049f, 5.049f, 0.0f, false, true, 0.219f, 0.0f)
                curveToRelative(1.86f, 0.0f, 3.0f, 0.6f, 3.9f, 1.56f)
                lineTo(9.78f, 6.18f)
                curveTo(9.0f, 5.46f, 8.22f, 5.04f, 7.26f, 5.04f)
                curveToRelative(-1.68f, 0.0f, -2.88f, 1.38f, -2.88f, 3.12f)
                curveToRelative(0.0f, 1.68f, 1.2f, 3.12f, 2.88f, 3.12f)
                curveToRelative(1.14f, 0.0f, 1.86f, -0.48f, 2.64f, -1.14f)
                lineToRelative(1.38f, 1.38f)
                curveToRelative(-1.02f, 1.08f, -2.16f, 1.8f, -4.08f, 1.8f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, true, -5.1f, -5.16f)
                arcTo(5.049f, 5.049f, 0.0f, false, true, 7.04f, 3.0f)
                close()
                moveTo(12.779f, 3.12f)
                lineTo(15.0f, 3.12f)
                verticalLineToRelative(8.1f)
                horizontalLineToRelative(4.32f)
                verticalLineToRelative(1.86f)
                horizontalLineToRelative(-6.54f)
                lineTo(12.78f, 3.12f)
                close()
                moveTo(2.28f, 19.5f)
                horizontalLineToRelative(9.0f)
                lineTo(11.28f, 21.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _clion!!
    }

private var _clion: ImageVector? = null
