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

public val SimpleIcons.Icicibank: ImageVector
    get() {
        if (_icicibank != null) {
            return _icicibank!!
        }
        _icicibank = Builder(name = "Icicibank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9258f, 2.0961f)
                curveTo(19.279f, -1.6476f, 12.698f, -0.2426f, 7.2138f, 5.2416f)
                curveToRelative(-5.484f, 5.475f, -7.7865f, 12.9625f, -5.1397f, 16.7062f)
                curveToRelative(0.8728f, 1.2386f, 2.1837f, 1.902f, 3.7386f, 2.0522f)
                curveToRelative(1.0516f, 0.0078f, 1.9129f, -1.1846f, 2.6158f, -2.7774f)
                curveToRelative(0.7252f, -1.6678f, 1.1694f, -3.218f, 1.5138f, -4.6592f)
                curveToRelative(0.5077f, -2.2934f, 0.544f, -3.934f, 0.29f, -4.2786f)
                curveToRelative(-0.435f, -0.5801f, -1.4321f, -0.435f, -2.5561f, 0.2176f)
                curveToRelative(-0.544f, 0.2991f, -1.26f, 0.0997f, -0.408f, -0.9336f)
                curveToRelative(0.8612f, -1.0425f, 4.2605f, -3.5625f, 5.4933f, -3.9523f)
                curveToRelative(1.3415f, -0.3898f, 2.8734f, 0.136f, 2.3568f, 1.6226f)
                curveToRelative(-0.3706f, 1.0847f, -5.0473f, 13.486f, -1.596f, 12.2719f)
                curveToRelative(1.1049f, -0.747f, 2.205f, -1.6497f, 3.2639f, -2.7086f)
                curveToRelative(5.4841f, -5.475f, 7.7865f, -12.9625f, 5.1396f, -16.7063f)
                close()
                moveTo(16.5596f, 5.3051f)
                curveToRelative(-1.0969f, 1.0968f, -2.52f, 1.4865f, -3.1364f, 0.852f)
                curveToRelative(-0.6617f, -0.6345f, -0.272f, -2.0577f, 0.8249f, -3.1726f)
                curveToRelative(1.1058f, -1.115f, 2.529f, -1.4594f, 3.1454f, -0.834f)
                curveToRelative(0.6345f, 0.6436f, 0.2448f, 2.0487f, -0.834f, 3.1545f)
                close()
            }
        }
        .build()
        return _icicibank!!
    }

private var _icicibank: ImageVector? = null
