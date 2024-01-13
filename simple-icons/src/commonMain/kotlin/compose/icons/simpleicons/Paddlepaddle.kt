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

public val SimpleIcons.Paddlepaddle: ImageVector
    get() {
        if (_paddlepaddle != null) {
            return _paddlepaddle!!
        }
        _paddlepaddle = Builder(name = "Paddlepaddle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.1719f, 4.8315f)
                curveToRelative(-0.6339f, 0.0f, -1.1503f, 0.5145f, -1.1503f, 1.1483f)
                reflectiveCurveToRelative(0.5164f, 1.1503f, 1.1503f, 1.1503f)
                reflectiveCurveToRelative(1.1483f, -0.5164f, 1.1483f, -1.1503f)
                reflectiveCurveToRelative(-0.5145f, -1.1483f, -1.1483f, -1.1483f)
                close()
                moveTo(22.1635f, 4.8315f)
                curveToRelative(-0.6339f, 0.0f, -1.1503f, 0.5145f, -1.1503f, 1.1483f)
                reflectiveCurveToRelative(0.5164f, 1.1503f, 1.1503f, 1.1503f)
                curveToRelative(0.6339f, 0.0f, 1.1483f, -0.5164f, 1.1483f, -1.1503f)
                reflectiveCurveTo(22.7973f, 4.8315f, 22.1635f, 4.8315f)
                close()
                moveTo(6.6724f, 8.0071f)
                curveToRelative(-0.0331f, 0.0f, -0.0626f, 0.0189f, -0.0762f, 0.0488f)
                lineToRelative(-1.953f, 4.2927f)
                lineTo(0.7529f, 12.3487f)
                curveToRelative(-0.0514f, 0.0f, -0.098f, 0.0293f, -0.1191f, 0.0762f)
                lineToRelative(-0.6269f, 1.3983f)
                curveToRelative(-0.0215f, 0.0481f, 0.0136f, 0.1035f, 0.0664f, 0.1035f)
                horizontalLineToRelative(3.8533f)
                lineToRelative(-2.328f, 5.1208f)
                curveToRelative(-0.0255f, 0.0559f, 0.0147f, 0.1211f, 0.0762f, 0.1211f)
                horizontalLineToRelative(1.6561f)
                curveToRelative(0.0331f, 0.0f, 0.0644f, -0.0206f, 0.0781f, -0.0508f)
                lineToRelative(4.9977f, -10.9913f)
                curveToRelative(0.0253f, -0.0559f, -0.0148f, -0.1191f, -0.0762f, -0.1191f)
                close()
                moveTo(10.1507f, 8.0071f)
                curveToRelative(-0.0248f, 0.0f, -0.0483f, 0.0143f, -0.0586f, 0.0371f)
                lineToRelative(-0.58f, 1.2851f)
                curveToRelative(-0.0191f, 0.0422f, 0.0124f, 0.0898f, 0.0586f, 0.0898f)
                horizontalLineToRelative(1.0233f)
                curveToRelative(0.217f, -0.0031f, 0.3774f, 0.0114f, 0.5547f, 0.0391f)
                curveToRelative(0.825f, 0.1282f, 1.336f, 0.733f, 1.3241f, 1.5351f)
                curveToRelative(-0.0112f, 0.7579f, -0.6403f, 1.3612f, -1.3983f, 1.3612f)
                lineTo(7.4086f, 12.3546f)
                curveToRelative(-0.0624f, 0.0f, -0.1188f, 0.0369f, -0.1445f, 0.0937f)
                lineToRelative(-0.6094f, 1.3397f)
                curveToRelative(-0.0295f, 0.0648f, 0.0188f, 0.1367f, 0.0898f, 0.1367f)
                horizontalLineToRelative(4.2849f)
                curveToRelative(1.7768f, 0.0f, 3.1942f, -1.5331f, 2.9959f, -3.2986f)
                curveToRelative(-0.1616f, -1.4398f, -1.3401f, -2.5687f, -2.8103f, -2.6189f)
                curveToRelative(-0.0133f, -5.0E-4f, -0.0264f, 0.0011f, -0.0391f, 0.0039f)
                arcToRelative(0.0615f, 0.0615f, 0.0f, false, false, -0.0215f, -0.0039f)
                close()
                moveTo(16.6269f, 8.0071f)
                curveToRelative(-0.0331f, 0.0f, -0.0644f, 0.0187f, -0.0781f, 0.0488f)
                lineToRelative(-4.9977f, 10.9913f)
                curveToRelative(-0.0253f, 0.0559f, 0.0168f, 0.1211f, 0.0781f, 0.1211f)
                horizontalLineToRelative(1.6561f)
                curveToRelative(0.0329f, 0.0f, 0.0626f, -0.0208f, 0.0762f, -0.0508f)
                lineToRelative(4.9997f, -10.9913f)
                curveToRelative(0.0255f, -0.0559f, -0.0166f, -0.1191f, -0.0781f, -0.1191f)
                close()
                moveTo(20.1052f, 8.0071f)
                curveToRelative(-0.025f, 0.0f, -0.0463f, 0.0143f, -0.0566f, 0.0371f)
                lineToRelative(-0.58f, 1.2851f)
                curveToRelative(-0.0189f, 0.0422f, 0.0106f, 0.0898f, 0.0566f, 0.0898f)
                horizontalLineToRelative(1.0233f)
                curveToRelative(0.2172f, -0.0031f, 0.3774f, 0.0114f, 0.5547f, 0.0391f)
                curveToRelative(0.825f, 0.1282f, 1.3378f, 0.733f, 1.3261f, 1.5351f)
                curveToRelative(-0.0114f, 0.7579f, -0.6403f, 1.3612f, -1.3983f, 1.3612f)
                horizontalLineToRelative(-3.6678f)
                curveToRelative(-0.0625f, 0.0f, -0.1188f, 0.0369f, -0.1445f, 0.0937f)
                lineToRelative(-0.6094f, 1.3397f)
                curveToRelative(-0.0293f, 0.0648f, 0.0186f, 0.1367f, 0.0898f, 0.1367f)
                horizontalLineToRelative(4.2849f)
                curveToRelative(1.7766f, 0.0f, 3.1961f, -1.5331f, 2.9978f, -3.2986f)
                curveToRelative(-0.1616f, -1.4398f, -1.3422f, -2.5687f, -2.8123f, -2.6189f)
                curveToRelative(-0.0134f, -5.0E-4f, -0.0264f, 0.0011f, -0.0391f, 0.0039f)
                arcToRelative(0.0611f, 0.0611f, 0.0f, false, false, -0.0215f, -0.0039f)
                close()
            }
        }
        .build()
        return _paddlepaddle!!
    }

private var _paddlepaddle: ImageVector? = null
