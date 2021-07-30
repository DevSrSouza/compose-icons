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

public val LineAwesomeIcons.Gripfire: ImageVector
    get() {
        if (_gripfire != null) {
            return _gripfire!!
        }
        _gripfire = Builder(name = "Gripfire", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6855f, 1.0f)
                curveTo(15.7065f, 1.2f, 15.7168f, 1.3996f, 15.7168f, 1.5996f)
                curveTo(15.7168f, 7.1776f, 7.0f, 10.9215f, 7.0f, 17.8555f)
                curveTo(7.0f, 20.8665f, 9.4857f, 22.8814f, 11.5137f, 24.6484f)
                curveTo(15.3757f, 27.4704f, 16.1426f, 28.7342f, 16.1426f, 29.6563f)
                curveTo(16.1426f, 30.2673f, 16.0f, 30.678f, 16.0f, 31.0f)
                curveTo(16.768f, 29.989f, 16.8572f, 29.0743f, 16.8672f, 28.1973f)
                curveTo(16.8672f, 26.4083f, 15.6094f, 24.7881f, 14.2754f, 22.9551f)
                curveTo(13.3264f, 21.6101f, 11.7695f, 20.3779f, 11.7695f, 18.7559f)
                curveTo(11.7695f, 14.2889f, 18.0f, 11.3448f, 18.0f, 6.4668f)
                curveTo(18.0f, 3.6218f, 15.9835f, 1.144f, 15.6855f, 1.0f)
                close()
                moveTo(19.375f, 9.0f)
                lineTo(19.6152f, 9.4336f)
                curveTo(19.7562f, 9.7446f, 19.8203f, 10.0878f, 19.8203f, 10.4648f)
                curveTo(19.8203f, 13.1578f, 16.3375f, 17.17f, 16.1855f, 17.502f)
                curveTo(16.0545f, 17.812f, 16.0f, 18.1451f, 16.0f, 18.4551f)
                curveTo(16.0f, 19.6741f, 16.9112f, 21.0039f, 17.0742f, 21.0039f)
                curveTo(17.2162f, 21.0039f, 20.484f, 17.6561f, 20.582f, 15.7051f)
                curveTo(20.962f, 16.4141f, 21.125f, 17.0687f, 21.125f, 17.7227f)
                curveTo(21.125f, 20.2057f, 18.6055f, 23.5742f, 18.6055f, 23.5742f)
                curveTo(18.6055f, 24.2722f, 20.5271f, 26.7773f, 20.7441f, 26.7773f)
                curveTo(20.8091f, 26.7773f, 20.8855f, 26.7008f, 20.9395f, 26.6348f)
                curveTo(23.2295f, 24.2628f, 25.0f, 21.503f, 25.0f, 18.377f)
                curveTo(25.0f, 17.9f, 24.9561f, 17.4006f, 24.8691f, 16.8906f)
                curveTo(24.1411f, 12.8676f, 20.374f, 9.388f, 19.375f, 9.0f)
                close()
            }
        }
        .build()
        return _gripfire!!
    }

private var _gripfire: ImageVector? = null
