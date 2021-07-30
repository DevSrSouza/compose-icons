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

public val SimpleIcons.Jcb: ImageVector
    get() {
        if (_jcb != null) {
            return _jcb!!
        }
        _jcb = Builder(name = "Jcb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.05f, 9.8643f)
                curveToRelative(0.9723f, 0.0736f, 1.7257f, 0.3671f, 2.3545f, 0.6843f)
                verticalLineToRelative(-1.31f)
                reflectiveCurveToRelative(-1.2577f, -0.3162f, -2.4408f, -0.368f)
                curveToRelative(-4.1256f, -0.1849f, -5.295f, 1.4344f, -5.295f, 3.1292f)
                curveToRelative(0.0f, 1.6947f, 1.1694f, 3.3145f, 5.295f, 3.1296f)
                curveToRelative(1.1831f, -0.0536f, 2.4408f, -0.3694f, 2.4408f, -0.3694f)
                verticalLineToRelative(-1.3086f)
                curveToRelative(-0.6193f, 0.3081f, -1.3826f, 0.6107f, -2.3545f, 0.683f)
                curveToRelative(-1.6793f, 0.1272f, -2.6898f, -0.6907f, -2.6898f, -2.1342f)
                curveToRelative(0.0f, -1.4448f, 1.0105f, -2.2613f, 2.6898f, -2.1354f)
                moveToRelative(7.685f, 4.1223f)
                curveToRelative(-0.0513f, 0.0105f, -0.1581f, 0.02f, -0.215f, 0.02f)
                horizontalLineToRelative(-1.8005f)
                lineTo(18.7195f, 12.376f)
                lineTo(20.52f, 12.376f)
                curveToRelative(0.0568f, 0.0f, 0.1636f, 0.01f, 0.2149f, 0.02f)
                arcToRelative(0.8056f, 0.8056f, 0.0f, false, true, 0.6325f, 0.7951f)
                curveToRelative(0.0f, 0.4162f, -0.2872f, 0.721f, -0.6325f, 0.796f)
                close()
                moveTo(18.7195f, 9.9497f)
                horizontalLineToRelative(1.6325f)
                curveToRelative(0.059f, 0.0f, 0.1454f, 0.0077f, 0.1772f, 0.0137f)
                curveToRelative(0.3376f, 0.0572f, 0.6256f, 0.3307f, 0.6256f, 0.7392f)
                curveToRelative(0.0f, 0.409f, -0.288f, 0.6815f, -0.626f, 0.7392f)
                arcToRelative(1.571f, 1.571f, 0.0f, false, true, -0.1773f, 0.0137f)
                horizontalLineToRelative(-1.6311f)
                lineTo(18.7204f, 9.9506f)
                close()
                moveTo(22.2189f, 11.9353f)
                verticalLineToRelative(-0.0364f)
                curveToRelative(0.9133f, -0.1331f, 1.4149f, -0.726f, 1.4149f, -1.4199f)
                curveToRelative(0.0f, -0.8828f, -0.7343f, -1.3916f, -1.7293f, -1.4416f)
                curveToRelative(-0.0772f, -0.0032f, -0.203f, -0.011f, -0.3044f, -0.011f)
                horizontalLineToRelative(-5.3323f)
                verticalLineToRelative(5.9467f)
                horizontalLineToRelative(5.7548f)
                curveToRelative(1.13f, 0.0f, 1.9774f, -0.6043f, 1.9774f, -1.5466f)
                curveToRelative(0.0f, -0.8701f, -0.7724f, -1.4222f, -1.781f, -1.4917f)
                close()
                moveTo(4.3545f, 12.6141f)
                curveToRelative(0.0f, 0.8787f, -0.5906f, 1.5311f, -1.6656f, 1.5311f)
                curveToRelative(-0.917f, 0.0f, -1.8174f, -0.2726f, -2.6889f, -0.6938f)
                lineTo(0.0f, 14.76f)
                reflectiveCurveToRelative(1.4021f, 0.383f, 3.191f, 0.383f)
                curveToRelative(2.9714f, 0.0f, 3.8374f, -1.125f, 3.8374f, -2.529f)
                lineTo(7.0284f, 9.0266f)
                lineTo(4.3541f, 9.0266f)
                verticalLineToRelative(3.5876f)
                close()
            }
        }
        .build()
        return _jcb!!
    }

private var _jcb: ImageVector? = null
