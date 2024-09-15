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
                moveTo(7.156f, 5.0f)
                lineTo(7.0f, 5.844f)
                lineTo(5.0f, 18.844f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 18.844f)
                lineTo(25.0f, 5.844f)
                lineTo(24.844f, 5.0f)
                close()
                moveTo(8.875f, 7.0f)
                lineTo(23.125f, 7.0f)
                lineTo(24.813f, 18.0f)
                lineTo(18.0f, 18.0f)
                lineTo(18.0f, 19.0f)
                curveTo(18.0f, 20.117f, 17.117f, 21.0f, 16.0f, 21.0f)
                curveTo(14.883f, 21.0f, 14.0f, 20.117f, 14.0f, 19.0f)
                lineTo(14.0f, 18.0f)
                lineTo(7.188f, 18.0f)
                close()
                moveTo(7.0f, 20.0f)
                lineTo(12.188f, 20.0f)
                curveTo(12.641f, 21.711f, 14.152f, 23.0f, 16.0f, 23.0f)
                curveTo(17.848f, 23.0f, 19.359f, 21.711f, 19.813f, 20.0f)
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
