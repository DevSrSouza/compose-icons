package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.InboxSolid: ImageVector
    get() {
        if (_inboxSolid != null) {
            return _inboxSolid!!
        }
        _inboxSolid = Builder(name = "InboxSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.1563f, 5.0f)
                lineTo(7.0f, 5.8438f)
                lineTo(5.0f, 18.8438f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 18.8438f)
                lineTo(25.0f, 5.8438f)
                lineTo(24.8438f, 5.0f)
                close()
                moveTo(8.875f, 7.0f)
                lineTo(23.125f, 7.0f)
                lineTo(24.8125f, 18.0f)
                lineTo(18.0f, 18.0f)
                lineTo(18.0f, 19.0f)
                curveTo(18.0f, 20.1172f, 17.1172f, 21.0f, 16.0f, 21.0f)
                curveTo(14.8828f, 21.0f, 14.0f, 20.1172f, 14.0f, 19.0f)
                lineTo(14.0f, 18.0f)
                lineTo(7.1875f, 18.0f)
                close()
                moveTo(7.0f, 20.0f)
                lineTo(12.1875f, 20.0f)
                curveTo(12.6406f, 21.7109f, 14.1523f, 23.0f, 16.0f, 23.0f)
                curveTo(17.8477f, 23.0f, 19.3594f, 21.7109f, 19.8125f, 20.0f)
                lineTo(25.0f, 20.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
            }
        }
        .build()
        return _inboxSolid!!
    }

private var _inboxSolid: ImageVector? = null
