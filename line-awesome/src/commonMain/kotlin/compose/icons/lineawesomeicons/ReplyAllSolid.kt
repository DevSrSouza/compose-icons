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

public val LineAwesomeIcons.ReplyAllSolid: ImageVector
    get() {
        if (_replyAllSolid != null) {
            return _replyAllSolid!!
        }
        _replyAllSolid = Builder(name = "ReplyAllSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.2813f, 5.2813f)
                lineTo(2.2813f, 13.2813f)
                lineTo(1.5938f, 14.0f)
                lineTo(2.2813f, 14.7188f)
                lineTo(10.2813f, 22.7188f)
                lineTo(11.7188f, 21.2813f)
                lineTo(4.4375f, 14.0f)
                lineTo(11.7188f, 6.7188f)
                close()
                moveTo(15.2813f, 5.2813f)
                lineTo(7.2813f, 13.2813f)
                lineTo(6.5938f, 14.0f)
                lineTo(7.2813f, 14.7188f)
                lineTo(15.2813f, 22.7188f)
                lineTo(16.7188f, 21.2813f)
                lineTo(10.4375f, 15.0f)
                lineTo(23.0f, 15.0f)
                curveTo(25.7734f, 15.0f, 28.0f, 17.2266f, 28.0f, 20.0f)
                curveTo(28.0f, 22.7734f, 25.7734f, 25.0f, 23.0f, 25.0f)
                lineTo(23.0f, 27.0f)
                curveTo(26.8555f, 27.0f, 30.0f, 23.8555f, 30.0f, 20.0f)
                curveTo(30.0f, 16.1445f, 26.8555f, 13.0f, 23.0f, 13.0f)
                lineTo(10.4375f, 13.0f)
                lineTo(16.7188f, 6.7188f)
                close()
            }
        }
        .build()
        return _replyAllSolid!!
    }

private var _replyAllSolid: ImageVector? = null
