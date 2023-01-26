package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.VoiceOverOff: ImageVector
    get() {
        if (_voiceOverOff != null) {
            return _voiceOverOff!!
        }
        _voiceOverOff = Builder(name = "VoiceOverOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.72f, 6.41f)
                curveToRelative(-0.35f, 0.35f, -0.44f, 0.88f, -0.25f, 1.35f)
                curveToRelative(0.3f, 0.75f, 0.32f, 1.58f, 0.05f, 2.34f)
                curveToRelative(-0.16f, 0.46f, -0.06f, 0.98f, 0.29f, 1.32f)
                curveToRelative(0.6f, 0.6f, 1.66f, 0.47f, 2.02f, -0.31f)
                curveToRelative(0.64f, -1.39f, 0.6f, -2.99f, -0.12f, -4.41f)
                curveToRelative(-0.4f, -0.75f, -1.41f, -0.88f, -1.99f, -0.29f)
                close()
                moveTo(19.18f, 2.89f)
                curveToRelative(-0.4f, 0.4f, -0.46f, 1.02f, -0.13f, 1.48f)
                curveToRelative(1.93f, 2.68f, 1.95f, 6.25f, 0.09f, 9.07f)
                curveToRelative(-0.31f, 0.46f, -0.23f, 1.08f, 0.16f, 1.47f)
                curveToRelative(0.51f, 0.51f, 1.38f, 0.46f, 1.81f, -0.13f)
                curveToRelative(2.57f, -3.51f, 2.52f, -8.2f, -0.17f, -11.77f)
                curveToRelative(-0.43f, -0.56f, -1.26f, -0.62f, -1.76f, -0.12f)
                close()
                moveTo(9.43f, 5.04f)
                lineToRelative(3.53f, 3.53f)
                curveToRelative(-0.2f, -1.86f, -1.67f, -3.33f, -3.53f, -3.53f)
                close()
                moveTo(3.71f, 3.56f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(1.91f, 1.91f)
                curveToRelative(-0.56f, 0.89f, -0.79f, 2.01f, -0.47f, 3.2f)
                curveToRelative(0.36f, 1.33f, 1.44f, 2.4f, 2.77f, 2.77f)
                curveToRelative(1.19f, 0.33f, 2.31f, 0.09f, 3.2f, -0.47f)
                lineToRelative(4.4f, 4.4f)
                curveTo(13.74f, 15.6f, 10.78f, 15.0f, 9.0f, 15.0f)
                curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.37f, -0.11f, -0.7f, -0.29f, -1.02f)
                lineToRelative(2.31f, 2.31f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(5.12f, 3.56f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                close()
            }
        }
        .build()
        return _voiceOverOff!!
    }

private var _voiceOverOff: ImageVector? = null
