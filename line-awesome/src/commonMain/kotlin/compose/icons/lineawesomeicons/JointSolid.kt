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

public val LineAwesomeIcons.JointSolid: ImageVector
    get() {
        if (_jointSolid != null) {
            return _jointSolid!!
        }
        _jointSolid = Builder(name = "JointSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9063f, 3.9922f)
                curveTo(14.545f, 4.3535f, 14.2823f, 4.7921f, 13.9707f, 5.4746f)
                curveTo(13.6591f, 6.1572f, 13.3777f, 7.0175f, 13.375f, 7.9727f)
                curveTo(13.3723f, 8.9278f, 13.7022f, 10.007f, 14.5625f, 10.8301f)
                curveTo(15.4228f, 11.6531f, 16.7197f, 12.1964f, 18.5488f, 12.4297f)
                curveTo(20.0737f, 12.6242f, 21.0712f, 12.8939f, 21.6289f, 13.2285f)
                curveTo(22.1866f, 13.5632f, 22.4193f, 13.8978f, 22.5996f, 14.7168f)
                lineTo(24.5527f, 14.2852f)
                curveTo(24.293f, 13.1051f, 23.6525f, 12.1103f, 22.6582f, 11.5137f)
                curveTo(21.6639f, 10.9171f, 20.4298f, 10.6528f, 18.8027f, 10.4453f)
                curveTo(17.2453f, 10.2466f, 16.3901f, 9.8103f, 15.9453f, 9.3848f)
                curveTo(15.5005f, 8.9592f, 15.3735f, 8.5233f, 15.375f, 7.9785f)
                curveTo(15.3765f, 7.4338f, 15.5612f, 6.808f, 15.791f, 6.3047f)
                curveTo(16.0208f, 5.8014f, 16.3751f, 5.3515f, 16.3203f, 5.4063f)
                lineTo(14.9063f, 3.9922f)
                close()
                moveTo(20.4297f, 4.3125f)
                lineTo(20.4297f, 6.3125f)
                curveTo(21.0505f, 6.3125f, 21.8728f, 6.389f, 22.4824f, 6.7344f)
                curveTo(23.092f, 7.0798f, 23.5974f, 7.6085f, 23.7207f, 9.0703f)
                lineTo(23.7969f, 9.9863f)
                lineTo(24.7168f, 9.9863f)
                curveTo(25.2331f, 9.9863f, 26.3144f, 10.1534f, 26.8477f, 10.6191f)
                curveTo(27.1143f, 10.852f, 27.2949f, 11.1208f, 27.3574f, 11.6445f)
                curveTo(27.4199f, 12.1683f, 27.3261f, 12.9734f, 26.8555f, 14.1191f)
                lineTo(28.7051f, 14.8809f)
                curveTo(29.263f, 13.5226f, 29.4607f, 12.3876f, 29.3438f, 11.4082f)
                curveTo(29.2268f, 10.4288f, 28.7567f, 9.6326f, 28.1621f, 9.1133f)
                curveTo(27.2521f, 8.3184f, 26.2582f, 8.136f, 25.4531f, 8.0684f)
                curveTo(25.1072f, 6.623f, 24.3995f, 5.5215f, 23.4688f, 4.9941f)
                curveTo(22.3473f, 4.3588f, 21.1718f, 4.3125f, 20.4297f, 4.3125f)
                close()
                moveTo(30.0f, 16.0f)
                lineTo(2.0f, 17.0f)
                lineTo(2.0f, 23.0f)
                lineTo(30.0f, 24.0f)
                lineTo(30.0f, 16.0f)
                close()
                moveTo(28.0f, 18.0723f)
                lineTo(28.0f, 21.9277f)
                lineTo(26.0f, 21.8555f)
                lineTo(26.0f, 18.1445f)
                lineTo(28.0f, 18.0723f)
                close()
                moveTo(24.0f, 18.2148f)
                lineTo(24.0f, 21.7852f)
                lineTo(22.0f, 21.7129f)
                lineTo(22.0f, 18.2871f)
                lineTo(24.0f, 18.2148f)
                close()
                moveTo(20.0f, 18.3574f)
                lineTo(20.0f, 21.6426f)
                lineTo(4.0f, 21.0703f)
                lineTo(4.0f, 18.9297f)
                lineTo(20.0f, 18.3574f)
                close()
            }
        }
        .build()
        return _jointSolid!!
    }

private var _jointSolid: ImageVector? = null
