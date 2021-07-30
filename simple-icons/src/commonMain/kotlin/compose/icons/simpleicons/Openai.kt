package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Openai: ImageVector
    get() {
        if (_openai != null) {
            return _openai!!
        }
        _openai = Builder(name = "Openai", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.2819f, 9.8211f)
                arcToRelative(5.9847f, 5.9847f, 0.0f, false, false, -0.5157f, -4.9108f)
                arcToRelative(6.0462f, 6.0462f, 0.0f, false, false, -6.5098f, -2.9f)
                arcTo(6.0651f, 6.0651f, 0.0f, false, false, 4.9807f, 4.1818f)
                arcToRelative(5.9847f, 5.9847f, 0.0f, false, false, -3.9977f, 2.9f)
                arcToRelative(6.0462f, 6.0462f, 0.0f, false, false, 0.7427f, 7.0966f)
                arcToRelative(5.98f, 5.98f, 0.0f, false, false, 0.511f, 4.9107f)
                arcToRelative(6.051f, 6.051f, 0.0f, false, false, 6.5146f, 2.9001f)
                arcTo(5.9847f, 5.9847f, 0.0f, false, false, 13.2599f, 24.0f)
                arcToRelative(6.0557f, 6.0557f, 0.0f, false, false, 5.7718f, -4.2058f)
                arcToRelative(5.9894f, 5.9894f, 0.0f, false, false, 3.9977f, -2.9001f)
                arcToRelative(6.0557f, 6.0557f, 0.0f, false, false, -0.7475f, -7.0729f)
                close()
                moveTo(13.2599f, 22.4292f)
                arcToRelative(4.4755f, 4.4755f, 0.0f, false, true, -2.8764f, -1.0408f)
                lineToRelative(0.1419f, -0.0804f)
                lineToRelative(4.7783f, -2.7582f)
                arcToRelative(0.7948f, 0.7948f, 0.0f, false, false, 0.3927f, -0.6813f)
                verticalLineToRelative(-6.7369f)
                lineToRelative(2.02f, 1.1686f)
                arcToRelative(0.071f, 0.071f, 0.0f, false, true, 0.038f, 0.052f)
                verticalLineToRelative(5.5826f)
                arcToRelative(4.504f, 4.504f, 0.0f, false, true, -4.4945f, 4.4944f)
                close()
                moveTo(3.5992f, 18.3038f)
                arcToRelative(4.4708f, 4.4708f, 0.0f, false, true, -0.5346f, -3.0137f)
                lineToRelative(0.142f, 0.0852f)
                lineToRelative(4.783f, 2.7582f)
                arcToRelative(0.7712f, 0.7712f, 0.0f, false, false, 0.7806f, 0.0f)
                lineToRelative(5.8428f, -3.3685f)
                verticalLineToRelative(2.3324f)
                arcToRelative(0.0804f, 0.0804f, 0.0f, false, true, -0.0332f, 0.0615f)
                lineTo(9.74f, 19.9502f)
                arcToRelative(4.4992f, 4.4992f, 0.0f, false, true, -6.1408f, -1.6464f)
                close()
                moveTo(2.3408f, 7.8956f)
                arcToRelative(4.485f, 4.485f, 0.0f, false, true, 2.3655f, -1.9728f)
                lineTo(4.7063f, 11.6f)
                arcToRelative(0.7664f, 0.7664f, 0.0f, false, false, 0.3879f, 0.6765f)
                lineToRelative(5.8144f, 3.3543f)
                lineToRelative(-2.0201f, 1.1685f)
                arcToRelative(0.0757f, 0.0757f, 0.0f, false, true, -0.071f, 0.0f)
                lineToRelative(-4.8303f, -2.7865f)
                arcTo(4.504f, 4.504f, 0.0f, false, true, 2.3408f, 7.872f)
                close()
                moveTo(18.9371f, 11.7514f)
                lineTo(13.1038f, 8.364f)
                lineTo(15.1192f, 7.2f)
                arcToRelative(0.0757f, 0.0757f, 0.0f, false, true, 0.071f, 0.0f)
                lineToRelative(4.8303f, 2.7913f)
                arcToRelative(4.4944f, 4.4944f, 0.0f, false, true, -0.6765f, 8.1042f)
                verticalLineToRelative(-5.6772f)
                arcToRelative(0.79f, 0.79f, 0.0f, false, false, -0.407f, -0.667f)
                close()
                moveTo(20.9478f, 8.7283f)
                lineToRelative(-0.142f, -0.0852f)
                lineToRelative(-4.7735f, -2.7818f)
                arcToRelative(0.7759f, 0.7759f, 0.0f, false, false, -0.7854f, 0.0f)
                lineTo(9.409f, 9.2297f)
                lineTo(9.409f, 6.8974f)
                arcToRelative(0.0662f, 0.0662f, 0.0f, false, true, 0.0284f, -0.0615f)
                lineToRelative(4.8303f, -2.7866f)
                arcToRelative(4.4992f, 4.4992f, 0.0f, false, true, 6.6802f, 4.66f)
                close()
                moveTo(8.3065f, 12.863f)
                lineToRelative(-2.02f, -1.1638f)
                arcToRelative(0.0804f, 0.0804f, 0.0f, false, true, -0.038f, -0.0567f)
                lineTo(6.2485f, 6.0742f)
                arcToRelative(4.4992f, 4.4992f, 0.0f, false, true, 7.3757f, -3.4537f)
                lineToRelative(-0.142f, 0.0805f)
                lineTo(8.704f, 5.459f)
                arcToRelative(0.7948f, 0.7948f, 0.0f, false, false, -0.3927f, 0.6813f)
                close()
                moveTo(9.4041f, 10.4976f)
                lineToRelative(2.602f, -1.4998f)
                lineToRelative(2.6069f, 1.4998f)
                verticalLineToRelative(2.9994f)
                lineToRelative(-2.5974f, 1.4997f)
                lineToRelative(-2.6067f, -1.4997f)
                close()
            }
        }
        .build()
        return _openai!!
    }

private var _openai: ImageVector? = null
