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

public val SolidGroup.EnvelopeCircleCheck: ImageVector
    get() {
        if (_envelopeCircleCheck != null) {
            return _envelopeCircleCheck!!
        }
        _envelopeCircleCheck = Builder(name = "EnvelopeCircleCheck", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 64.0f)
                curveTo(21.5f, 64.0f, 0.0f, 85.5f, 0.0f, 112.0f)
                curveToRelative(0.0f, 15.1f, 7.1f, 29.3f, 19.2f, 38.4f)
                lineTo(236.8f, 313.6f)
                curveToRelative(11.4f, 8.5f, 27.0f, 8.5f, 38.4f, 0.0f)
                lineToRelative(57.4f, -43.0f)
                curveToRelative(23.9f, -59.8f, 79.7f, -103.3f, 146.3f, -109.8f)
                lineToRelative(13.9f, -10.4f)
                curveToRelative(12.1f, -9.1f, 19.2f, -23.3f, 19.2f, -38.4f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(48.0f, 64.0f)
                close()
                moveTo(294.4f, 339.2f)
                curveToRelative(-22.8f, 17.1f, -54.0f, 17.1f, -76.8f, 0.0f)
                lineTo(0.0f, 176.0f)
                lineTo(0.0f, 384.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(360.2f, 448.0f)
                curveTo(335.1f, 417.6f, 320.0f, 378.5f, 320.0f, 336.0f)
                curveToRelative(0.0f, -5.6f, 0.3f, -11.1f, 0.8f, -16.6f)
                lineToRelative(-26.4f, 19.8f)
                close()
                moveTo(640.0f, 336.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, -288.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 288.0f, 0.0f)
                close()
                moveTo(563.3f, 292.7f)
                curveToRelative(6.2f, 6.2f, 6.2f, 16.4f, 0.0f, 22.6f)
                lineToRelative(-72.0f, 72.0f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.2f, -22.6f, 0.0f)
                lineToRelative(-40.0f, -40.0f)
                curveToRelative(-6.2f, -6.2f, -6.2f, -16.4f, 0.0f, -22.6f)
                reflectiveCurveToRelative(16.4f, -6.2f, 22.6f, 0.0f)
                lineTo(480.0f, 353.4f)
                lineToRelative(60.7f, -60.7f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                close()
            }
        }
        .build()
        return _envelopeCircleCheck!!
    }

private var _envelopeCircleCheck: ImageVector? = null
