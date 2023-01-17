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

public val SolidGroup.AudioDescription: ImageVector
    get() {
        if (_audioDescription != null) {
            return _audioDescription!!
        }
        _audioDescription = Builder(name = "AudioDescription", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(512.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(576.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(213.5f, 173.3f)
                lineToRelative(72.0f, 144.0f)
                curveToRelative(5.9f, 11.9f, 1.1f, 26.3f, -10.7f, 32.2f)
                reflectiveCurveToRelative(-26.3f, 1.1f, -32.2f, -10.7f)
                lineToRelative(-9.4f, -18.9f)
                lineTo(150.9f, 319.9f)
                lineToRelative(-9.4f, 18.9f)
                curveToRelative(-5.9f, 11.9f, -20.3f, 16.7f, -32.2f, 10.7f)
                reflectiveCurveToRelative(-16.7f, -20.3f, -10.7f, -32.2f)
                lineToRelative(72.0f, -144.0f)
                curveToRelative(4.1f, -8.1f, 12.4f, -13.3f, 21.5f, -13.3f)
                reflectiveCurveToRelative(17.4f, 5.1f, 21.5f, 13.3f)
                close()
                moveTo(213.1f, 279.9f)
                lineTo(192.0f, 237.7f)
                lineToRelative(-21.1f, 42.2f)
                horizontalLineToRelative(42.2f)
                close()
                moveTo(304.0f, 184.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(-43.0f, 96.0f, -96.0f, 96.0f)
                lineTo(328.0f, 352.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(304.0f, 184.0f)
                close()
                moveTo(352.0f, 208.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(352.0f, 208.0f)
                close()
            }
        }
        .build()
        return _audioDescription!!
    }

private var _audioDescription: ImageVector? = null
