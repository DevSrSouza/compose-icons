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

public val SolidGroup.EnvelopesBulk: ImageVector
    get() {
        if (_envelopesBulk != null) {
            return _envelopesBulk!!
        }
        _envelopesBulk = Builder(name = "EnvelopesBulk", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 0.0f)
                curveTo(110.3f, 0.0f, 96.0f, 14.3f, 96.0f, 32.0f)
                lineTo(96.0f, 224.0f)
                horizontalLineToRelative(96.0f)
                lineTo(192.0f, 192.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineTo(480.0f, 128.0f)
                lineTo(480.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(128.0f, 0.0f)
                close()
                moveTo(256.0f, 160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineTo(384.0f, 416.0f)
                lineTo(576.0f, 416.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(608.0f, 192.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(256.0f, 160.0f)
                close()
                moveTo(496.0f, 224.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(496.0f, 288.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(480.0f, 240.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(64.0f, 256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(13.0f)
                lineTo(187.1f, 415.9f)
                curveToRelative(1.4f, 1.0f, 3.1f, 1.6f, 4.9f, 1.6f)
                reflectiveCurveToRelative(3.5f, -0.6f, 4.9f, -1.6f)
                lineTo(352.0f, 301.0f)
                lineTo(352.0f, 288.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(64.0f, 256.0f)
                close()
                moveTo(352.0f, 340.8f)
                lineTo(216.0f, 441.6f)
                curveToRelative(-6.9f, 5.1f, -15.3f, 7.9f, -24.0f, 7.9f)
                reflectiveCurveToRelative(-17.0f, -2.8f, -24.0f, -7.9f)
                lineTo(32.0f, 340.8f)
                lineTo(32.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(320.0f, 512.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(352.0f, 340.8f)
                close()
            }
        }
        .build()
        return _envelopesBulk!!
    }

private var _envelopesBulk: ImageVector? = null
