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

public val RemixIcons.SendPlaneLine: ImageVector
    get() {
        if (_sendPlaneLine != null) {
            return _sendPlaneLine!!
        }
        _sendPlaneLine = Builder(name = "SendPlaneLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.923f, 9.37f)
                curveToRelative(-0.51f, -0.205f, -0.504f, -0.51f, 0.034f, -0.689f)
                lineToRelative(19.086f, -6.362f)
                curveToRelative(0.529f, -0.176f, 0.832f, 0.12f, 0.684f, 0.638f)
                lineToRelative(-5.454f, 19.086f)
                curveToRelative(-0.15f, 0.529f, -0.475f, 0.553f, -0.717f, 0.07f)
                lineTo(11.0f, 13.0f)
                lineTo(1.923f, 9.37f)
                close()
                moveTo(6.813f, 9.17f)
                lineToRelative(5.636f, 2.255f)
                lineToRelative(3.04f, 6.082f)
                lineToRelative(3.546f, -12.41f)
                lineTo(6.812f, 9.17f)
                close()
            }
        }
        .build()
        return _sendPlaneLine!!
    }

private var _sendPlaneLine: ImageVector? = null
