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

public val SolidGroup.EnvelopeOpenText: ImageVector
    get() {
        if (_envelopeOpenText != null) {
            return _envelopeOpenText!!
        }
        _envelopeOpenText = Builder(name = "EnvelopeOpenText", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.4f, 96.0f)
                lineTo(144.0f, 96.0f)
                lineTo(107.8f, 96.0f)
                lineTo(96.0f, 96.0f)
                verticalLineToRelative(8.8f)
                lineTo(96.0f, 144.0f)
                verticalLineToRelative(40.4f)
                verticalLineToRelative(89.0f)
                lineTo(0.2f, 202.5f)
                curveToRelative(1.6f, -18.1f, 10.9f, -34.9f, 25.7f, -45.8f)
                lineTo(48.0f, 140.3f)
                lineTo(48.0f, 96.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(76.6f)
                lineToRelative(49.9f, -36.9f)
                curveTo(232.2f, 3.9f, 243.9f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(23.8f, 3.9f, 33.5f, 11.0f)
                lineTo(339.4f, 48.0f)
                lineTo(416.0f, 48.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                verticalLineToRelative(44.3f)
                lineToRelative(22.1f, 16.4f)
                curveToRelative(14.8f, 10.9f, 24.1f, 27.7f, 25.7f, 45.8f)
                lineTo(416.0f, 273.4f)
                verticalLineToRelative(-89.0f)
                lineTo(416.0f, 144.0f)
                lineTo(416.0f, 104.8f)
                lineTo(416.0f, 96.0f)
                lineTo(404.2f, 96.0f)
                lineTo(368.0f, 96.0f)
                lineTo(296.6f, 96.0f)
                lineTo(215.4f, 96.0f)
                close()
                moveTo(0.0f, 448.0f)
                lineTo(0.0f, 242.1f)
                lineTo(217.6f, 403.3f)
                curveToRelative(11.1f, 8.2f, 24.6f, 12.7f, 38.4f, 12.7f)
                reflectiveCurveToRelative(27.3f, -4.4f, 38.4f, -12.7f)
                lineTo(512.0f, 242.1f)
                lineTo(512.0f, 448.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                verticalLineToRelative(0.0f)
                close()
                moveTo(176.0f, 160.0f)
                lineTo(336.0f, 160.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(176.0f, 192.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(176.0f, 224.0f)
                lineTo(336.0f, 224.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(176.0f, 256.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _envelopeOpenText!!
    }

private var _envelopeOpenText: ImageVector? = null
