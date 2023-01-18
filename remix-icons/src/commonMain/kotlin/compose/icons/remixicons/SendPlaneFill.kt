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

public val RemixIcons.SendPlaneFill: ImageVector
    get() {
        if (_sendPlaneFill != null) {
            return _sendPlaneFill!!
        }
        _sendPlaneFill = Builder(name = "SendPlaneFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.946f, 9.315f)
                curveToRelative(-0.522f, -0.174f, -0.527f, -0.455f, 0.01f, -0.634f)
                lineToRelative(19.087f, -6.362f)
                curveToRelative(0.529f, -0.176f, 0.832f, 0.12f, 0.684f, 0.638f)
                lineToRelative(-5.454f, 19.086f)
                curveToRelative(-0.15f, 0.529f, -0.455f, 0.547f, -0.679f, 0.045f)
                lineTo(12.0f, 14.0f)
                lineToRelative(6.0f, -8.0f)
                lineToRelative(-8.0f, 6.0f)
                lineToRelative(-8.054f, -2.685f)
                close()
            }
        }
        .build()
        return _sendPlaneFill!!
    }

private var _sendPlaneFill: ImageVector? = null
