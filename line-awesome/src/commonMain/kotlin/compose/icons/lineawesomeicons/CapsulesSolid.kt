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

public val LineAwesomeIcons.CapsulesSolid: ImageVector
    get() {
        if (_capsulesSolid != null) {
            return _capsulesSolid!!
        }
        _capsulesSolid = Builder(name = "CapsulesSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.0f)
                curveTo(5.467f, 5.0f, 3.0f, 7.468f, 3.0f, 10.5f)
                lineTo(3.0f, 21.5f)
                curveTo(3.0f, 24.532f, 5.467f, 27.0f, 8.5f, 27.0f)
                curveTo(11.533f, 27.0f, 14.0f, 24.532f, 14.0f, 21.5f)
                lineTo(14.0f, 16.4043f)
                lineTo(20.0547f, 24.7363f)
                curveTo(21.1297f, 26.2163f, 22.8087f, 27.0039f, 24.5117f, 27.0039f)
                curveTo(25.6327f, 27.0039f, 26.7633f, 26.6621f, 27.7383f, 25.9551f)
                lineTo(27.7383f, 25.9531f)
                curveTo(30.1913f, 24.1701f, 30.7351f, 20.7245f, 28.9531f, 18.2715f)
                lineTo(22.4883f, 9.3711f)
                curveTo(20.7033f, 6.9171f, 17.2606f, 6.3723f, 14.8066f, 8.1563f)
                curveTo(14.4268f, 8.4323f, 14.0993f, 8.7517f, 13.8125f, 9.0977f)
                curveTo(13.1901f, 6.7436f, 11.0475f, 5.0f, 8.5f, 5.0f)
                close()
                moveTo(8.5f, 7.0f)
                curveTo(10.43f, 7.0f, 12.0f, 8.57f, 12.0f, 10.5f)
                lineTo(12.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                lineTo(5.0f, 10.5f)
                curveTo(5.0f, 8.57f, 6.57f, 7.0f, 8.5f, 7.0f)
                close()
                moveTo(18.0352f, 9.1055f)
                curveTo(19.1182f, 9.1055f, 20.1861f, 9.6059f, 20.8711f, 10.5469f)
                lineTo(23.5156f, 14.1855f)
                lineTo(17.8535f, 18.3027f)
                lineTo(15.207f, 14.6621f)
                curveTo(14.072f, 13.1001f, 14.4214f, 10.9084f, 15.9824f, 9.7734f)
                curveTo(16.6024f, 9.3234f, 17.3222f, 9.1055f, 18.0352f, 9.1055f)
                close()
                moveTo(24.6914f, 15.8027f)
                lineTo(27.3379f, 19.4453f)
                curveTo(28.4719f, 21.0073f, 28.1235f, 23.2009f, 26.5625f, 24.3359f)
                curveTo(25.0015f, 25.4709f, 22.8078f, 25.1225f, 21.6738f, 23.5605f)
                lineTo(19.0293f, 19.9199f)
                lineTo(24.6914f, 15.8027f)
                close()
                moveTo(5.0f, 17.0f)
                lineTo(12.0f, 17.0f)
                lineTo(12.0f, 21.5f)
                curveTo(12.0f, 23.43f, 10.43f, 25.0f, 8.5f, 25.0f)
                curveTo(6.57f, 25.0f, 5.0f, 23.43f, 5.0f, 21.5f)
                lineTo(5.0f, 17.0f)
                close()
            }
        }
        .build()
        return _capsulesSolid!!
    }

private var _capsulesSolid: ImageVector? = null
