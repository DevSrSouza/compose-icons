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

public val SimpleIcons.Upstash: ImageVector
    get() {
        if (_upstash != null) {
            return _upstash!!
        }
        _upstash = Builder(name = "Upstash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8027f, 0.0f)
                curveTo(11.193f, 0.0f, 8.583f, 0.9952f, 6.5918f, 2.9863f)
                curveToRelative(-3.9823f, 3.9823f, -3.9823f, 10.4396f, 0.0f, 14.4219f)
                curveToRelative(1.9911f, 1.9911f, 5.2198f, 1.9911f, 7.211f, 0.0f)
                curveToRelative(1.991f, -1.9911f, 1.991f, -5.2198f, 0.0f, -7.211f)
                lineTo(12.0f, 12.0f)
                curveToRelative(0.9956f, 0.9956f, 0.9956f, 2.6098f, 0.0f, 3.6055f)
                curveToRelative(-0.9956f, 0.9955f, -2.6099f, 0.9955f, -3.6055f, 0.0f)
                curveToRelative(-2.9866f, -2.9868f, -2.9866f, -7.8297f, 0.0f, -10.8164f)
                curveToRelative(2.9868f, -2.9868f, 7.8297f, -2.9868f, 10.8164f, 0.0f)
                lineToRelative(1.8028f, -1.8028f)
                curveTo(19.0225f, 0.9952f, 16.4125f, 0.0f, 13.8027f, 0.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(-0.9956f, -0.9956f, -0.9956f, -2.6098f, 0.0f, -3.6055f)
                curveToRelative(0.9956f, -0.9955f, 2.6098f, -0.9955f, 3.6055f, 0.0f)
                curveToRelative(2.9867f, 2.9868f, 2.9867f, 7.8297f, 0.0f, 10.8164f)
                curveToRelative(-2.9867f, 2.9868f, -7.8297f, 2.9868f, -10.8164f, 0.0f)
                lineToRelative(-1.8028f, 1.8028f)
                curveToRelative(3.9823f, 3.9822f, 10.4396f, 3.9822f, 14.4219f, 0.0f)
                curveToRelative(3.9823f, -3.9824f, 3.9823f, -10.4396f, 0.0f, -14.4219f)
                curveToRelative(-0.9956f, -0.9956f, -2.3006f, -1.4922f, -3.6055f, -1.4922f)
                curveToRelative(-1.3048f, 0.0f, -2.6099f, 0.4966f, -3.6054f, 1.4922f)
                curveToRelative(-1.9912f, 1.9912f, -1.9912f, 5.2198f, 0.0f, 7.211f)
                close()
            }
        }
        .build()
        return _upstash!!
    }

private var _upstash: ImageVector? = null
