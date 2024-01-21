package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Hurricane: ImageVector
    get() {
        if (_hurricane != null) {
            return _hurricane!!
        }
        _hurricane = Builder(name = "Hurricane", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 208.0f)
                curveTo(0.0f, 104.4f, 75.7f, 18.5f, 174.9f, 2.6f)
                curveTo(184.0f, 1.2f, 192.0f, 8.6f, 192.0f, 17.9f)
                lineTo(192.0f, 81.2f)
                curveToRelative(0.0f, 8.4f, 6.5f, 15.3f, 14.7f, 16.5f)
                curveTo(307.0f, 112.5f, 384.0f, 199.0f, 384.0f, 303.4f)
                curveToRelative(0.0f, 103.6f, -75.7f, 189.5f, -174.9f, 205.4f)
                curveToRelative(-9.2f, 1.5f, -17.1f, -5.9f, -17.1f, -15.2f)
                lineTo(192.0f, 430.2f)
                curveToRelative(0.0f, -8.4f, -6.5f, -15.3f, -14.7f, -16.5f)
                curveTo(77.0f, 398.9f, 0.0f, 312.4f, 0.0f, 208.0f)
                close()
                moveTo(288.0f, 256.0f)
                arcTo(96.0f, 96.0f, 0.0f, true, false, 96.0f, 256.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 192.0f, 0.0f)
                close()
                moveTo(192.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
