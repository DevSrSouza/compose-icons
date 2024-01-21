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

public val SimpleIcons.Osgeo: ImageVector
    get() {
        if (_osgeo != null) {
            return _osgeo!!
        }
        _osgeo = Builder(name = "Osgeo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3874f, 0.0f)
                lineTo(9.8823f, 2.6374f)
                curveToRelative(-4.102f, 0.9191f, -7.2047f, 4.4486f, -7.4712f, 8.7637f)
                horizontalLineToRelative(2.4102f)
                curveToRelative(0.2933f, -3.5026f, 3.0766f, -6.2865f, 6.5661f, -6.5795f)
                lineTo(11.3874f, 2.4242f)
                close()
                moveTo(12.5998f, 2.4114f)
                lineTo(12.5998f, 4.8216f)
                curveToRelative(3.4892f, 0.293f, 6.2726f, 3.0763f, 6.5655f, 6.5655f)
                lineTo(23.9997f, 11.3871f)
                lineToRelative(-2.6368f, -1.5046f)
                curveToRelative(-0.9188f, -4.102f, -4.448f, -7.205f, -8.7631f, -7.4712f)
                close()
                moveTo(11.9869f, 5.7005f)
                lineTo(11.241f, 10.2555f)
                lineTo(12.7328f, 11.2541f)
                lineTo(13.7314f, 12.7459f)
                lineTo(18.2864f, 11.9866f)
                lineTo(13.7314f, 11.2407f)
                lineTo(15.7025f, 8.2839f)
                lineTo(12.7462f, 10.2555f)
                close()
                moveTo(12.7328f, 11.2541f)
                lineTo(8.2842f, 8.2844f)
                lineToRelative(2.9702f, 4.4481f)
                lineToRelative(4.4481f, 2.9702f)
                close()
                moveTo(11.2544f, 12.7325f)
                lineTo(10.2552f, 11.2413f)
                lineTo(5.7008f, 12.0f)
                lineToRelative(4.5544f, 0.7459f)
                lineToRelative(-1.9711f, 2.9569f)
                lineToRelative(2.9435f, -1.9711f)
                lineToRelative(0.7593f, 4.5544f)
                lineToRelative(0.7587f, -4.5544f)
                close()
                moveTo(11.9869f, 11.4673f)
                curveToRelative(0.2796f, 0.0f, 0.5193f, 0.2398f, 0.5193f, 0.5193f)
                curveToRelative(0.0f, 0.2799f, -0.2264f, 0.5199f, -0.5193f, 0.5199f)
                reflectiveCurveToRelative(-0.5193f, -0.24f, -0.5193f, -0.5199f)
                curveToRelative(0.0f, -0.293f, 0.2398f, -0.5193f, 0.5193f, -0.5193f)
                close()
                moveTo(3.0E-4f, 12.5995f)
                lineToRelative(2.6374f, 1.5046f)
                curveToRelative(0.9191f, 4.1023f, 4.448f, 7.2056f, 8.7632f, 7.4717f)
                verticalLineToRelative(-2.4108f)
                curveToRelative(-3.5026f, -0.293f, -6.2859f, -3.0763f, -6.5789f, -6.5655f)
                lineTo(2.4244f, 12.5995f)
                close()
                moveTo(19.1653f, 12.5995f)
                curveToRelative(-0.293f, 3.4892f, -3.0763f, 6.2726f, -6.5655f, 6.5655f)
                lineTo(12.5998f, 24.0f)
                lineToRelative(1.5046f, -2.6374f)
                curveToRelative(4.102f, -0.9188f, 7.2053f, -4.448f, 7.4717f, -8.7632f)
                close()
            }
        }
        .build()
        return _osgeo!!
    }

private var _osgeo: ImageVector? = null
