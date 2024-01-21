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

public val SolidGroup.Inbox: ImageVector
    get() {
        if (_inbox != null) {
            return _inbox!!
        }
        _inbox = Builder(name = "Inbox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(121.0f, 32.0f)
                curveTo(91.6f, 32.0f, 66.0f, 52.0f, 58.9f, 80.5f)
                lineTo(1.9f, 308.4f)
                curveTo(0.6f, 313.5f, 0.0f, 318.7f, 0.0f, 323.9f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(448.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(512.0f, 323.9f)
                curveToRelative(0.0f, -5.2f, -0.6f, -10.4f, -1.9f, -15.5f)
                lineToRelative(-57.0f, -227.9f)
                curveTo(446.0f, 52.0f, 420.4f, 32.0f, 391.0f, 32.0f)
                lineTo(121.0f, 32.0f)
                close()
                moveTo(121.0f, 96.0f)
                lineTo(391.0f, 96.0f)
                lineToRelative(48.0f, 192.0f)
                lineTo(387.8f, 288.0f)
                curveToRelative(-12.1f, 0.0f, -23.2f, 6.8f, -28.6f, 17.7f)
                lineToRelative(-14.3f, 28.6f)
                curveToRelative(-5.4f, 10.8f, -16.5f, 17.7f, -28.6f, 17.7f)
                lineTo(195.8f, 352.0f)
                curveToRelative(-12.1f, 0.0f, -23.2f, -6.8f, -28.6f, -17.7f)
                lineToRelative(-14.3f, -28.6f)
                curveToRelative(-5.4f, -10.8f, -16.5f, -17.7f, -28.6f, -17.7f)
                lineTo(73.0f, 288.0f)
                lineTo(121.0f, 96.0f)
                close()
            }
        }
        .build()
        return _inbox!!
    }

private var _inbox: ImageVector? = null
