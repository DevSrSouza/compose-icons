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

public val SolidGroup.TicketSimple: ImageVector
    get() {
        if (_ticketSimple != null) {
            return _ticketSimple!!
        }
        _ticketSimple = Builder(name = "TicketSimple", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 128.0f)
                curveTo(0.0f, 92.7f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 8.8f, -7.4f, 15.7f, -15.7f, 18.6f)
                curveTo(541.5f, 217.1f, 528.0f, 235.0f, 528.0f, 256.0f)
                reflectiveCurveToRelative(13.5f, 38.9f, 32.3f, 45.4f)
                curveToRelative(8.3f, 2.9f, 15.7f, 9.8f, 15.7f, 18.6f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                verticalLineTo(320.0f)
                curveToRelative(0.0f, -8.8f, 7.4f, -15.7f, 15.7f, -18.6f)
                curveTo(34.5f, 294.9f, 48.0f, 277.0f, 48.0f, 256.0f)
                reflectiveCurveToRelative(-13.5f, -38.9f, -32.3f, -45.4f)
                curveTo(7.4f, 207.7f, 0.0f, 200.8f, 0.0f, 192.0f)
                verticalLineTo(128.0f)
                close()
            }
        }
        .build()
        return _ticketSimple!!
    }

private var _ticketSimple: ImageVector? = null
