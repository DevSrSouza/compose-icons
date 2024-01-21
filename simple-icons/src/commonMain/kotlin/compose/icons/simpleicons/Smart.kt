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

public val SimpleIcons.Smart: ImageVector
    get() {
        if (_smart != null) {
            return _smart!!
        }
        _smart = Builder(name = "Smart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.85f, 0.846f)
                arcTo(11.138f, 11.138f, 0.0f, false, false, 0.0f, 11.979f)
                verticalLineToRelative(0.04f)
                arcToRelative(11.136f, 11.136f, 0.0f, false, false, 10.844f, 11.135f)
                horizontalLineToRelative(0.283f)
                arcToRelative(10.983f, 10.983f, 0.0f, false, false, 4.041f, -0.758f)
                arcToRelative(0.395f, 0.395f, 0.0f, false, false, 0.256f, -0.369f)
                verticalLineToRelative(-5.564f)
                arcToRelative(0.21f, 0.21f, 0.0f, false, false, -0.274f, -0.195f)
                curveToRelative(-1.202f, 0.489f, -2.215f, 0.957f, -3.96f, 0.957f)
                arcToRelative(5.222f, 5.222f, 0.0f, false, true, -5.22f, -5.22f)
                arcToRelative(5.22f, 5.22f, 0.0f, false, true, 5.22f, -5.22f)
                curveToRelative(1.745f, 0.0f, 2.758f, 0.467f, 3.96f, 0.955f)
                arcToRelative(0.21f, 0.21f, 0.0f, false, false, 0.274f, -0.193f)
                lineTo(15.424f, 1.979f)
                arcToRelative(0.395f, 0.395f, 0.0f, false, false, -0.256f, -0.37f)
                arcToRelative(10.983f, 10.983f, 0.0f, false, false, -4.037f, -0.763f)
                close()
                moveTo(16.713f, 2.666f)
                verticalLineToRelative(18.67f)
                arcToRelative(0.238f, 0.238f, 0.0f, false, false, 0.377f, 0.19f)
                curveToRelative(3.413f, -2.122f, 6.91f, -8.16f, 6.91f, -9.52f)
                curveToRelative(0.0f, -1.36f, -3.497f, -7.396f, -6.91f, -9.522f)
                arcToRelative(0.238f, 0.238f, 0.0f, false, false, -0.377f, 0.182f)
                close()
            }
        }
        .build()
        return _smart!!
    }

private var _smart: ImageVector? = null
