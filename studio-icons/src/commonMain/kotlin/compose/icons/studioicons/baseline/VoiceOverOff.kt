package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.VoiceOverOff: ImageVector
    get() {
        if (_voiceOverOff != null) {
            return _voiceOverOff!!
        }
        _voiceOverOff = Builder(name = "VoiceOverOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.99f, 9.18f)
                curveToRelative(0.0f, -0.06f, 0.01f, -0.12f, 0.01f, -0.18f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-0.06f, 0.0f, -0.12f, 0.01f, -0.18f, 0.01f)
                lineToRelative(4.17f, 4.17f)
                close()
                moveTo(6.89f, 5.62f)
                lineTo(4.27f, 3.0f)
                lineTo(3.0f, 4.27f)
                lineToRelative(2.62f, 2.62f)
                curveTo(5.23f, 7.5f, 5.0f, 8.22f, 5.0f, 9.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.78f, 0.0f, 1.5f, -0.23f, 2.11f, -0.62f)
                lineTo(19.73f, 21.0f)
                lineTo(21.0f, 19.73f)
                lineToRelative(-8.62f, -8.62f)
                lineToRelative(-5.49f, -5.49f)
                close()
                moveTo(9.0f, 15.0f)
                curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f)
                close()
                moveTo(16.76f, 5.36f)
                lineToRelative(-1.68f, 1.69f)
                curveToRelative(0.84f, 1.18f, 0.84f, 2.71f, 0.0f, 3.89f)
                lineToRelative(1.68f, 1.69f)
                curveToRelative(2.02f, -2.02f, 2.02f, -5.07f, 0.0f, -7.27f)
                close()
                moveTo(20.07f, 2.0f)
                lineToRelative(-1.63f, 1.63f)
                curveToRelative(2.77f, 3.02f, 2.77f, 7.56f, 0.0f, 10.74f)
                lineTo(20.07f, 16.0f)
                curveToRelative(3.9f, -3.89f, 3.91f, -9.95f, 0.0f, -14.0f)
                close()
            }
        }
        .build()
        return _voiceOverOff!!
    }

private var _voiceOverOff: ImageVector? = null
