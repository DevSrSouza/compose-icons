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

public val LineAwesomeIcons.Glide: ImageVector
    get() {
        if (_glide != null) {
            return _glide!!
        }
        _glide = Builder(name = "Glide", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(15.9219f, 9.0f)
                curveTo(12.7829f, 9.0f, 11.1934f, 12.0983f, 11.1934f, 14.4063f)
                curveTo(11.1934f, 16.8013f, 12.5937f, 18.1289f, 14.9707f, 18.1289f)
                curveTo(15.2987f, 18.1289f, 15.2734f, 18.1015f, 15.2734f, 18.2285f)
                curveTo(14.8134f, 21.7435f, 12.8008f, 21.8576f, 12.8008f, 20.8066f)
                curveTo(12.8008f, 19.7386f, 14.0261f, 19.2086f, 14.0391f, 19.1426f)
                curveTo(14.0301f, 18.8096f, 12.7556f, 18.3906f, 12.4316f, 18.3906f)
                curveTo(11.5076f, 18.3906f, 11.0f, 19.8355f, 11.0f, 20.6055f)
                curveTo(11.0f, 22.0195f, 11.892f, 23.0f, 13.332f, 23.0f)
                curveTo(15.442f, 23.0f, 16.9839f, 20.8243f, 17.4609f, 18.9863f)
                curveTo(17.8729f, 17.3363f, 17.766f, 17.2606f, 17.998f, 17.1426f)
                curveTo(18.874f, 16.7006f, 19.2239f, 16.4082f, 20.2129f, 16.4082f)
                curveTo(20.6989f, 16.4082f, 21.0453f, 16.5097f, 21.8203f, 16.6367f)
                curveTo(21.8993f, 16.6397f, 22.0f, 16.5604f, 22.0f, 16.4824f)
                curveTo(22.0f, 16.2594f, 21.0898f, 14.8329f, 20.8848f, 14.7539f)
                curveTo(20.7888f, 14.7149f, 20.5698f, 14.6523f, 20.4648f, 14.6523f)
                curveTo(19.4538f, 14.6523f, 19.1138f, 15.1128f, 18.2598f, 15.5938f)
                lineTo(18.2363f, 15.5703f)
                curveTo(18.4243f, 14.2833f, 18.877f, 13.0661f, 18.877f, 11.7441f)
                curveTo(18.877f, 9.7911f, 17.8349f, 9.0f, 15.9219f, 9.0f)
                close()
                moveTo(16.0605f, 10.5156f)
                curveTo(16.5605f, 10.5156f, 16.5996f, 10.8788f, 16.5996f, 11.2988f)
                curveTo(16.5996f, 11.6838f, 16.5282f, 12.0721f, 16.4492f, 12.4531f)
                curveTo(16.1952f, 13.6701f, 15.9424f, 14.8963f, 15.6934f, 16.1133f)
                curveTo(15.6324f, 16.3893f, 15.3308f, 16.3281f, 15.0938f, 16.3281f)
                curveTo(14.0518f, 16.3281f, 13.7578f, 15.1919f, 13.7578f, 14.3379f)
                curveTo(13.7578f, 13.0549f, 14.2484f, 11.3562f, 15.4434f, 10.6992f)
                curveTo(15.6314f, 10.5902f, 15.8465f, 10.5156f, 16.0605f, 10.5156f)
                close()
            }
        }
        .build()
        return _glide!!
    }

private var _glide: ImageVector? = null
