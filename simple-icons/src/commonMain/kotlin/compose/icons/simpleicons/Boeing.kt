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

public val SimpleIcons.Boeing: ImageVector
    get() {
        if (_boeing != null) {
            return _boeing!!
        }
        _boeing = Builder(name = "Boeing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9044f, 17.2866f)
                arcToRelative(6.0512f, 6.0512f, 0.0f, false, true, -3.7595f, -1.3008f)
                curveToRelative(1.2048f, -2.7146f, 3.6545f, -6.3581f, 6.998f, -9.9166f)
                arcToRelative(6.0702f, 6.0702f, 0.0f, false, true, 2.2617f, 7.729f)
                curveToRelative(-1.0599f, -0.49f, -2.0497f, -1.106f, -2.8876f, -1.8798f)
                lineToRelative(1.8307f, 3.4375f)
                arcToRelative(6.0582f, 6.0582f, 0.0f, false, true, -4.4433f, 1.9307f)
                moveTo(0.8292f, 11.2115f)
                arcToRelative(6.0752f, 6.0752f, 0.0f, false, true, 6.0762f, -6.0772f)
                curveToRelative(0.8998f, 0.0f, 1.7527f, 0.196f, 2.5226f, 0.546f)
                curveToRelative(-3.2935f, 2.9095f, -5.8432f, 6.293f, -7.353f, 9.2177f)
                arcToRelative(6.0512f, 6.0512f, 0.0f, false, true, -1.2458f, -3.6875f)
                moveToRelative(12.3403f, 2.9126f)
                arcToRelative(6.862f, 6.862f, 0.0f, false, false, 0.6419f, -2.9126f)
                curveToRelative(0.0f, -2.3997f, -1.2248f, -4.5144f, -3.0846f, -5.7532f)
                arcToRelative(49.6072f, 49.6072f, 0.0f, false, true, 3.5825f, -3.3416f)
                arcTo(31.1727f, 31.1727f, 0.0f, false, false, 10.11f, 5.0903f)
                arcToRelative(6.907f, 6.907f, 0.0f, false, false, -8.4368f, 10.6265f)
                curveTo(0.3493f, 18.5795f, 0.1193f, 20.8781f, 1.285f, 21.654f)
                curveToRelative(1.2489f, 0.832f, 3.9625f, -0.6769f, 5.5903f, -3.1345f)
                curveToRelative(0.0f, 0.0f, -2.5177f, 2.2736f, -3.9015f, 1.7517f)
                curveToRelative(-0.8519f, -0.322f, -0.8549f, -1.6248f, -0.152f, -3.4925f)
                arcToRelative(6.871f, 6.871f, 0.0f, false, false, 4.0835f, 1.3378f)
                curveToRelative(1.8937f, 0.0f, 3.6065f, -0.7599f, 4.8533f, -1.9917f)
                lineToRelative(0.245f, 0.462f)
                curveToRelative(3.0095f, -0.245f, 11.9963f, -0.483f, 11.9963f, -0.483f)
                curveToRelative(0.0f, -0.431f, -5.9502f, -0.04f, -10.8325f, -1.9797f)
            }
        }
        .build()
        return _boeing!!
    }

private var _boeing: ImageVector? = null
