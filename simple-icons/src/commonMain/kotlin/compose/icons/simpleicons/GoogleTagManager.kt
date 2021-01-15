package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.GoogleTagManager: ImageVector
    get() {
        if (_googleTagManager != null) {
            return _googleTagManager!!
        }
        _googleTagManager = Builder(name = "GoogleTagManager", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.93f, 18.136f)
                curveToRelative(1.62f, 0.0f, 2.933f, 1.313f, 2.933f, 2.932f)
                curveToRelative(0.0f, 1.62f, -1.312f, 2.932f, -2.932f, 2.932f)
                curveTo(10.31f, 24.0f, 9.0f, 22.688f, 9.0f, 21.069f)
                curveToRelative(0.0f, -1.62f, 1.312f, -2.932f, 2.93f, -2.932f)
                close()
                moveTo(23.12f, 9.878f)
                lineToRelative(-9.0f, -9.0f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0.0f)
                curveToRelative(-1.172f, 1.17f, -1.172f, 3.07f, 0.0f, 4.242f)
                lineToRelative(6.865f, 6.866f)
                lineToRelative(-4.493f, 4.588f)
                lineToRelative(2.12f, 2.21f)
                curveToRelative(0.58f, 0.622f, 0.9f, 1.433f, 0.9f, 2.283f)
                curveToRelative(0.0f, 0.313f, -0.044f, 0.615f, -0.125f, 0.903f)
                lineToRelative(7.974f, -7.85f)
                curveToRelative(1.173f, -1.17f, 1.173f, -3.07f, 0.0f, -4.242f)
                close()
                moveTo(11.67f, 7.49f)
                lineTo(9.59f, 5.41f)
                curveToRelative(-0.644f, -0.644f, -1.0f, -1.5f, -1.0f, -2.41f)
                curveToRelative(0.0f, -0.333f, 0.05f, -0.66f, 0.14f, -0.97f)
                lineTo(0.878f, 9.81f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.066f, 0.0f, 4.237f)
                lineToRelative(7.825f, 7.875f)
                arcToRelative(3.349f, 3.349f, 0.0f, false, true, -0.11f, -0.854f)
                curveToRelative(0.0f, -1.842f, 1.498f, -3.34f, 3.34f, -3.34f)
                curveToRelative(0.35f, 0.0f, 0.69f, 0.054f, 1.008f, 0.155f)
                lineToRelative(-5.706f, -5.955f)
                close()
            }
        }
        .build()
        return _googleTagManager!!
    }

private var _googleTagManager: ImageVector? = null
