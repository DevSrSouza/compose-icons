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

public val SolidGroup.Trailer: ImageVector
    get() {
        if (_trailer != null) {
            return _trailer!!
        }
        _trailer = Builder(name = "Trailer", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 32.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                lineTo(0.0f, 336.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineTo(65.1f, 384.0f)
                curveToRelative(7.8f, -54.3f, 54.4f, -96.0f, 110.9f, -96.0f)
                reflectiveCurveToRelative(103.1f, 41.7f, 110.9f, 96.0f)
                lineTo(488.0f, 384.0f)
                horizontalLineToRelative(8.0f)
                lineTo(608.0f, 384.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(544.0f, 320.0f)
                lineTo(544.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(48.0f, 32.0f)
                close()
                moveTo(80.0f, 96.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 131.2f)
                curveToRelative(-11.4f, 5.9f, -22.2f, 12.9f, -32.0f, 21.0f)
                lineTo(64.0f, 112.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(176.0f, 224.0f)
                curveToRelative(-5.4f, 0.0f, -10.7f, 0.2f, -16.0f, 0.7f)
                lineTo(160.0f, 112.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 112.7f)
                curveToRelative(-5.3f, -0.5f, -10.6f, -0.7f, -16.0f, -0.7f)
                close()
                moveTo(256.0f, 243.2f)
                lineTo(256.0f, 112.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 152.2f)
                curveToRelative(-9.8f, -8.1f, -20.6f, -15.2f, -32.0f, -21.0f)
                close()
                moveTo(368.0f, 96.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 192.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -192.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(480.0f, 112.0f)
                lineToRelative(0.0f, 192.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -192.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                close()
                moveTo(176.0f, 480.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 0.0f, -160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 0.0f, 160.0f)
                close()
                moveTo(176.0f, 368.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _trailer!!
    }

private var _trailer: ImageVector? = null
