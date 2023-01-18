package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.MessengerFill: ImageVector
    get() {
        if (_messengerFill != null) {
            return _messengerFill!!
        }
        _messengerFill = Builder(name = "MessengerFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.634f, 0.0f, 10.0f, 4.127f, 10.0f, 9.7f)
                curveToRelative(0.0f, 5.573f, -4.366f, 9.7f, -10.0f, 9.7f)
                arcToRelative(10.894f, 10.894f, 0.0f, false, true, -2.895f, -0.384f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.534f, 0.039f)
                lineToRelative(-1.984f, 0.876f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -1.123f, -0.707f)
                lineToRelative(-0.055f, -1.78f)
                arcToRelative(0.797f, 0.797f, 0.0f, false, false, -0.268f, -0.57f)
                curveTo(3.195f, 17.135f, 2.0f, 14.617f, 2.0f, 11.7f)
                curveTo(2.0f, 6.127f, 6.367f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(5.995f, 14.537f)
                curveToRelative(-0.282f, 0.447f, 0.268f, 0.951f, 0.689f, 0.631f)
                lineToRelative(3.155f, -2.394f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.723f, 0.0f)
                lineToRelative(2.337f, 1.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.169f, -0.4f)
                lineToRelative(2.937f, -4.66f)
                curveToRelative(0.282f, -0.448f, -0.268f, -0.952f, -0.689f, -0.633f)
                lineToRelative(-3.155f, 2.396f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.723f, 0.0f)
                lineToRelative(-2.337f, -1.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.169f, 0.4f)
                lineToRelative(-2.937f, 4.66f)
                close()
            }
        }
        .build()
        return _messengerFill!!
    }

private var _messengerFill: ImageVector? = null
