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

public val LineAwesomeIcons.PhoneSquareAltSolid: ImageVector
    get() {
        if (_phoneSquareAltSolid != null) {
            return _phoneSquareAltSolid!!
        }
        _phoneSquareAltSolid = Builder(name = "PhoneSquareAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(20.127f, 9.0f)
                curveTo(19.615f, 9.0f, 19.1344f, 9.1985f, 18.7734f, 9.5605f)
                lineTo(17.623f, 10.7109f)
                curveTo(16.9f, 11.4339f, 16.9f, 12.6959f, 17.623f, 13.4199f)
                lineTo(19.3301f, 15.127f)
                curveTo(18.8031f, 15.898f, 18.1975f, 16.6213f, 17.5215f, 17.2813f)
                lineTo(17.2695f, 17.5313f)
                curveTo(16.6155f, 18.2013f, 15.893f, 18.806f, 15.123f, 19.332f)
                lineTo(13.416f, 17.625f)
                curveTo(13.055f, 17.263f, 12.5735f, 17.0645f, 12.0625f, 17.0645f)
                curveTo(11.5515f, 17.0645f, 11.07f, 17.263f, 10.707f, 17.625f)
                lineTo(9.5566f, 18.7773f)
                curveTo(8.8126f, 19.5223f, 8.8126f, 20.7364f, 9.5586f, 21.4844f)
                lineTo(10.5117f, 22.4395f)
                curveTo(11.0397f, 22.9655f, 11.802f, 23.1396f, 12.498f, 22.8926f)
                lineTo(12.6289f, 22.8496f)
                curveTo(13.1319f, 22.6846f, 14.3107f, 22.2981f, 16.1777f, 21.0371f)
                curveTo(17.0857f, 20.4251f, 17.9354f, 19.7165f, 18.6934f, 18.9395f)
                lineTo(18.9277f, 18.7051f)
                curveTo(19.7117f, 17.9391f, 20.4192f, 17.0916f, 21.0332f, 16.1836f)
                curveTo(22.2942f, 14.3146f, 22.6797f, 13.1358f, 22.8457f, 12.6328f)
                lineTo(22.8887f, 12.502f)
                curveTo(22.9617f, 12.293f, 22.998f, 12.0763f, 22.998f, 11.8633f)
                curveTo(22.998f, 11.3673f, 22.8026f, 10.8846f, 22.4336f, 10.5156f)
                lineTo(21.4805f, 9.5605f)
                curveTo(21.1175f, 9.1985f, 20.638f, 9.0f, 20.127f, 9.0f)
                close()
            }
        }
        .build()
        return _phoneSquareAltSolid!!
    }

private var _phoneSquareAltSolid: ImageVector? = null
