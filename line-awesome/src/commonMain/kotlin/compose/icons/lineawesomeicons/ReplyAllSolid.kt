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
                moveTo(10.281f, 5.281f)
                lineTo(2.281f, 13.281f)
                lineTo(1.594f, 14.0f)
                lineTo(2.281f, 14.719f)
                lineTo(10.281f, 22.719f)
                lineTo(11.719f, 21.281f)
                lineTo(4.438f, 14.0f)
                lineTo(11.719f, 6.719f)
                close()
                moveTo(15.281f, 5.281f)
                lineTo(7.281f, 13.281f)
                lineTo(6.594f, 14.0f)
                lineTo(7.281f, 14.719f)
                lineTo(15.281f, 22.719f)
                lineTo(16.719f, 21.281f)
                lineTo(10.438f, 15.0f)
                lineTo(23.0f, 15.0f)
                curveTo(25.773f, 15.0f, 28.0f, 17.227f, 28.0f, 20.0f)
                curveTo(28.0f, 22.773f, 25.773f, 25.0f, 23.0f, 25.0f)
                lineTo(23.0f, 27.0f)
                curveTo(26.855f, 27.0f, 30.0f, 23.855f, 30.0f, 20.0f)
                curveTo(30.0f, 16.145f, 26.855f, 13.0f, 23.0f, 13.0f)
                lineTo(10.438f, 13.0f)
                lineTo(16.719f, 6.719f)
                close()
            }
        }
        .build()
        return _replyAllSolid!!
    }

private var _replyAllSolid: ImageVector? = null
