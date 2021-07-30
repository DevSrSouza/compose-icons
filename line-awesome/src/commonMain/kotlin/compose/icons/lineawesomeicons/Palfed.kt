package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Palfed: ImageVector
    get() {
        if (_palfed != null) {
            return _palfed!!
        }
        _palfed = Builder(name = "Palfed", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                curveTo(13.45f, 4.0f, 13.0f, 4.45f, 13.0f, 5.0f)
                lineTo(13.0f, 6.0f)
                curveTo(8.582f, 6.0f, 5.0f, 7.791f, 5.0f, 10.0f)
                lineTo(4.0f, 10.0f)
                curveTo(2.9f, 10.0f, 2.0f, 10.9f, 2.0f, 12.0f)
                curveTo(2.0f, 13.1f, 2.9f, 14.0f, 4.0f, 14.0f)
                lineTo(5.375f, 14.0f)
                lineTo(6.7813f, 25.248f)
                curveTo(6.9063f, 26.249f, 7.7566f, 27.0f, 8.7656f, 27.0f)
                lineTo(23.2344f, 27.0f)
                curveTo(24.2434f, 27.0f, 25.0947f, 26.249f, 25.2207f, 25.248f)
                lineTo(26.625f, 14.0f)
                lineTo(28.0f, 14.0f)
                curveTo(29.1f, 14.0f, 30.0f, 13.1f, 30.0f, 12.0f)
                curveTo(30.0f, 10.9f, 29.1f, 10.0f, 28.0f, 10.0f)
                lineTo(27.0f, 10.0f)
                curveTo(27.0f, 7.791f, 23.418f, 6.0f, 19.0f, 6.0f)
                lineTo(19.0f, 5.0f)
                curveTo(19.0f, 4.45f, 18.55f, 4.0f, 18.0f, 4.0f)
                lineTo(14.0f, 4.0f)
                close()
                moveTo(15.3281f, 8.1875f)
                curveTo(15.7088f, 8.2228f, 16.0487f, 8.5056f, 16.1406f, 8.9688f)
                curveTo(19.8036f, 7.8428f, 23.0f, 9.0181f, 23.0f, 12.6211f)
                curveTo(23.0f, 16.5741f, 19.085f, 20.3658f, 16.0f, 19.6348f)
                lineTo(16.0f, 24.709f)
                lineTo(16.0f, 24.7188f)
                curveTo(16.01f, 24.8918f, 16.0588f, 25.3525f, 15.7598f, 25.6875f)
                curveTo(15.2728f, 26.2255f, 14.0641f, 26.1956f, 13.9121f, 24.5566f)
                curveTo(13.7041f, 22.3036f, 13.9214f, 14.099f, 13.9824f, 12.252f)
                curveTo(12.8914f, 13.013f, 11.0156f, 14.8026f, 11.0156f, 16.1016f)
                curveTo(11.0256f, 16.2286f, 11.0349f, 16.3059f, 11.0449f, 16.3359f)
                curveTo(11.0549f, 16.3359f, 11.3753f, 16.1973f, 11.6133f, 16.1973f)
                curveTo(12.9633f, 16.1973f, 12.6638f, 18.4355f, 10.8828f, 18.4355f)
                curveTo(9.7928f, 18.4365f, 9.0f, 17.5199f, 9.0f, 16.2559f)
                curveTo(9.0f, 14.1249f, 11.1764f, 11.4039f, 14.1094f, 9.8359f)
                curveTo(14.1604f, 9.2069f, 14.2616f, 8.7193f, 14.6426f, 8.4043f)
                curveTo(14.8556f, 8.2329f, 15.0997f, 8.1663f, 15.3281f, 8.1875f)
                close()
                moveTo(18.5391f, 10.6836f)
                curveTo(17.7605f, 10.6923f, 16.9034f, 10.886f, 16.1504f, 11.1602f)
                curveTo(16.0854f, 13.1592f, 16.025f, 15.2562f, 16.0f, 17.2402f)
                curveTo(16.035f, 17.3822f, 16.1299f, 17.5547f, 16.7539f, 17.5547f)
                curveTo(18.5919f, 17.5547f, 20.9191f, 15.3828f, 20.9141f, 12.6738f)
                curveTo(20.9141f, 11.1701f, 19.8367f, 10.6691f, 18.5391f, 10.6836f)
                close()
            }
        }
        .build()
        return _palfed!!
    }

private var _palfed: ImageVector? = null
