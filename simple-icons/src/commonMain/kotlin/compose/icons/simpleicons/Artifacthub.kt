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

public val SimpleIcons.Artifacthub: ImageVector
    get() {
        if (_artifacthub != null) {
            return _artifacthub!!
        }
        _artifacthub = Builder(name = "Artifacthub", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 24.0004f)
                curveToRelative(-0.617f, 0.0012f, -1.2421f, -0.1722f, -1.7801f, -0.5f)
                lineToRelative(-7.5097f, -4.2926f)
                curveToRelative(-1.0176f, -0.6168f, -1.64f, -1.7177f, -1.6407f, -2.9077f)
                lineTo(1.0694f, 7.7297f)
                curveToRelative(0.0f, -1.253f, 0.6369f, -2.3695f, 1.7601f, -3.0101f)
                lineTo(10.2504f, 0.4789f)
                curveToRelative(1.08f, -0.6387f, 2.4151f, -0.6377f, 3.4952f, 0.001f)
                lineToRelative(7.4198f, 4.2376f)
                curveToRelative(1.0801f, 0.5961f, 1.7714f, 1.7341f, 1.7627f, 3.0101f)
                verticalLineToRelative(8.582f)
                curveToRelative(0.0f, 0.9677f, -0.4434f, 2.1639f, -1.6367f, 2.8986f)
                lineToRelative(-7.5107f, 4.2922f)
                curveToRelative(-0.5635f, 0.344f, -1.1986f, 0.5f, -1.7817f, 0.5f)
                close()
                moveTo(11.4999f, 2.6535f)
                lineTo(3.9551f, 6.9622f)
                curveToRelative(-0.2006f, 0.1567f, -0.3791f, 0.3691f, -0.379f, 0.7675f)
                lineToRelative(0.001f, 8.6704f)
                curveToRelative(0.0375f, 0.2204f, 0.1189f, 0.4281f, 0.373f, 0.6346f)
                lineToRelative(7.5598f, 4.3166f)
                curveToRelative(0.266f, 0.172f, 0.664f, 0.21f, 0.985f, 0.0f)
                lineToRelative(7.5179f, -4.2966f)
                curveToRelative(0.2317f, -0.1484f, 0.371f, -0.3886f, 0.41f, -0.6536f)
                lineTo(20.4229f, 7.7297f)
                curveToRelative(0.0095f, -0.2988f, -0.1359f, -0.5886f, -0.377f, -0.7655f)
                lineTo(12.4999f, 2.6525f)
                curveToRelative(-0.3906f, -0.2393f, -0.7592f, -0.1558f, -1.0f, 0.001f)
                close()
            }
        }
        .build()
        return _artifacthub!!
    }

private var _artifacthub: ImageVector? = null
