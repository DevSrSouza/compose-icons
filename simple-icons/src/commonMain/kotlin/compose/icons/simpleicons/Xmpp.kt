package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Xmpp: VectorAsset
    get() {
        if (_xmpp != null) {
            return _xmpp!!
        }
        _xmpp = VectorAssetBuilder(name = "Xmpp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.276f)
                lineToRelative(-3.401f, 1.318f)
                lineToRelative(-1.025f, 0.366f)
                lineToRelative(-3.08f, 0.911f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.01f, 0.18f, 0.016f, 0.361f, 0.016f, 0.543f)
                curveToRelative(0.0f, 3.353f, -1.693f, 7.444f, -4.51f, 10.386f)
                curveTo(9.183f, 13.859f, 7.49f, 9.768f, 7.49f, 6.415f)
                curveToRelative(0.0f, -0.182f, 0.006f, -0.363f, 0.016f, -0.543f)
                lineToRelative(0.0f, 0.0f)
                lineTo(4.426f, 4.96f)
                lineTo(3.401f, 4.594f)
                lineTo(0.0f, 3.276f)
                curveTo(0.146f, 8.978f, 4.854f, 14.9f, 10.498f, 18.17f)
                curveToRelative(-1.303f, 1.028f, -2.778f, 1.81f, -4.388f, 2.216f)
                lineToRelative(-0.004f, 0.339f)
                curveToRelative(1.716f, -0.146f, 3.333f, -0.599f, 4.822f, -1.279f)
                curveToRelative(0.359f, -0.148f, 0.717f, -0.308f, 1.072f, -0.479f)
                curveToRelative(0.355f, 0.171f, 0.712f, 0.33f, 1.071f, 0.478f)
                curveToRelative(1.489f, 0.68f, 3.107f, 1.133f, 4.822f, 1.279f)
                lineToRelative(-0.004f, -0.339f)
                curveToRelative(-1.61f, -0.405f, -3.085f, -1.188f, -4.388f, -2.216f)
                curveTo(19.146f, 14.9f, 23.854f, 8.978f, 24.0f, 3.276f)
                close()
            }
        }
        .build()
        return _xmpp!!
    }

private var _xmpp: VectorAsset? = null
