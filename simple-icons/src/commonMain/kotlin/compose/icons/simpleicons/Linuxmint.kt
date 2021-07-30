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

public val SimpleIcons.Linuxmint: ImageVector
    get() {
        if (_linuxmint != null) {
            return _linuxmint!!
        }
        _linuxmint = Builder(name = "Linuxmint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 1.693f)
                verticalLineToRelative(4.193f)
                horizontalLineToRelative(1.828f)
                curveToRelative(1.276f, 0.0f, 1.502f, 0.865f, 1.502f, 2.058f)
                lineToRelative(0.01f, 7.412f)
                curveToRelative(0.0f, 3.84f, 3.44f, 6.951f, 7.68f, 6.951f)
                horizontalLineToRelative(10.464f)
                curveToRelative(1.342f, 0.0f, 2.516f, -0.83f, 2.516f, -2.108f)
                lineTo(24.0f, 8.706f)
                curveToRelative(0.0f, -3.84f, -3.44f, -6.95f, -7.683f, -6.95f)
                horizontalLineToRelative(-4.405f)
                verticalLineToRelative(-0.013f)
                lineTo(0.0f, 1.693f)
                close()
                moveTo(5.723f, 4.259f)
                horizontalLineToRelative(2.102f)
                lineTo(7.825f, 14.82f)
                curveToRelative(0.0f, 1.413f, 0.984f, 2.51f, 2.139f, 2.51f)
                lineToRelative(7.17f, 0.03f)
                curveToRelative(1.496f, 0.0f, 2.661f, -1.01f, 2.661f, -2.206f)
                lineToRelative(-0.012f, -5.607f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.386f, -0.91f)
                arcToRelative(1.224f, 1.224f, 0.0f, false, false, -0.917f, -0.384f)
                curveToRelative(-0.374f, 0.0f, -0.65f, 0.12f, -0.918f, 0.384f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.386f, 0.91f)
                verticalLineToRelative(4.798f)
                horizontalLineToRelative(-2.223f)
                lineTo(14.953f, 9.548f)
                curveToRelative(0.0f, -0.364f, -0.124f, -0.648f, -0.389f, -0.91f)
                arcToRelative(1.208f, 1.208f, 0.0f, false, false, -0.917f, -0.384f)
                curveToRelative(-0.366f, 0.0f, -0.647f, 0.12f, -0.914f, 0.384f)
                curveToRelative(-0.265f, 0.262f, -0.39f, 0.546f, -0.39f, 0.91f)
                verticalLineToRelative(4.798f)
                lineTo(10.12f, 14.346f)
                lineTo(10.12f, 9.548f)
                curveToRelative(0.0f, -0.95f, 0.36f, -1.792f, 1.042f, -2.466f)
                arcToRelative(3.445f, 3.445f, 0.0f, false, true, 2.485f, -1.022f)
                curveToRelative(0.937f, 0.0f, 1.752f, 0.345f, 2.413f, 0.97f)
                arcToRelative(3.448f, 3.448f, 0.0f, false, true, 2.42f, -0.97f)
                curveToRelative(0.954f, 0.0f, 1.803f, 0.348f, 2.485f, 1.022f)
                arcToRelative(3.385f, 3.385f, 0.0f, false, true, 1.041f, 2.466f)
                lineToRelative(0.009f, 5.991f)
                curveToRelative(-0.105f, 1.004f, -0.539f, 1.894f, -1.28f, 2.637f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(4.367f, 4.367f, 0.0f, false, true, -3.174f, 1.314f)
                lineTo(9.574f, 19.49f)
                verticalLineToRelative(-0.038f)
                curveToRelative(-0.976f, -0.103f, -1.846f, -0.519f, -2.57f, -1.217f)
                curveToRelative(-0.845f, -0.825f, -1.281f, -1.846f, -1.281f, -3.01f)
                lineTo(5.723f, 4.26f)
                close()
            }
        }
        .build()
        return _linuxmint!!
    }

private var _linuxmint: ImageVector? = null
