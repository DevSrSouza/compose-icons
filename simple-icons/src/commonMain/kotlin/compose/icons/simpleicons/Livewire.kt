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

public val SimpleIcons.Livewire: ImageVector
    get() {
        if (_livewire != null) {
            return _livewire!!
        }
        _livewire = Builder(name = "Livewire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 0.0f)
                curveTo(6.1735f, 0.0f, 1.4482f, 4.9569f, 1.4482f, 11.0723f)
                curveToRelative(0.0f, 2.0888f, 0.5518f, 4.0417f, 1.5098f, 5.709f)
                curveToRelative(0.2492f, 0.2796f, 0.544f, 0.4843f, 0.9649f, 0.4843f)
                curveToRelative(1.3388f, 0.0f, 1.2678f, -2.0644f, 2.6074f, -2.0644f)
                curveToRelative(1.3395f, 0.0f, 1.4111f, 2.0644f, 2.75f, 2.0644f)
                curveToRelative(1.3388f, 0.0f, 1.2659f, -2.0644f, 2.6054f, -2.0644f)
                curveToRelative(0.5845f, 0.0f, 0.9278f, 0.3967f, 1.2403f, 0.8398f)
                curveToRelative(-0.2213f, -0.2055f, -0.4794f, -0.3476f, -0.8203f, -0.3476f)
                curveToRelative(-1.1956f, 0.0f, -1.3063f, 1.6771f, -2.2012f, 2.1406f)
                verticalLineToRelative(4.5097f)
                curveToRelative(0.0f, 0.9145f, 0.7418f, 1.6563f, 1.6562f, 1.6563f)
                curveToRelative(0.9145f, 0.0f, 1.6563f, -0.7418f, 1.6563f, -1.6563f)
                verticalLineToRelative(-5.8925f)
                curveToRelative(0.308f, 0.4332f, 0.647f, 0.8144f, 1.2207f, 0.8144f)
                curveToRelative(1.3388f, 0.0f, 1.266f, -2.0644f, 2.6055f, -2.0644f)
                curveToRelative(0.465f, 0.0f, 0.7734f, 0.2552f, 1.039f, 0.58f)
                curveToRelative(-0.1294f, -0.0533f, -0.2695f, -0.0878f, -0.4297f, -0.0878f)
                curveToRelative(-1.1582f, 0.0f, -1.296f, 1.574f, -2.1171f, 2.0937f)
                verticalLineToRelative(2.4356f)
                curveToRelative(0.0f, 0.823f, 0.6672f, 1.4902f, 1.4902f, 1.4902f)
                reflectiveCurveToRelative(1.4902f, -0.6672f, 1.4902f, -1.4902f)
                lineTo(18.7158f, 16.371f)
                curveToRelative(0.3234f, 0.4657f, 0.6684f, 0.8945f, 1.2774f, 0.8945f)
                curveToRelative(0.7955f, 0.0f, 1.093f, -0.7287f, 1.4843f, -1.3203f)
                curveToRelative(0.6878f, -1.4704f, 1.0743f, -3.1245f, 1.0743f, -4.873f)
                curveTo(22.5518f, 4.9569f, 17.8284f, 0.0f, 12.001f, 0.0f)
                close()
                moveTo(11.4346f, 2.877f)
                curveToRelative(2.8797f, 0.0f, 5.2148f, 2.7836f, 5.2148f, 5.8066f)
                curveToRelative(0.0f, 3.023f, -1.5455f, 5.1504f, -5.2148f, 5.1504f)
                curveToRelative(-3.6693f, 0.0f, -5.2149f, -2.1274f, -5.2149f, -5.1504f)
                reflectiveCurveTo(8.5548f, 2.877f, 11.4346f, 2.877f)
                close()
                moveTo(10.0322f, 4.537f)
                arcToRelative(1.9554f, 2.1583f, 0.0f, false, false, -1.955f, 2.1582f)
                arcToRelative(1.9554f, 2.1583f, 0.0f, false, false, 1.955f, 2.1582f)
                arcToRelative(1.9554f, 2.1583f, 0.0f, false, false, 1.9551f, -2.1582f)
                arcToRelative(1.9554f, 2.1583f, 0.0f, false, false, -1.955f, -2.1582f)
                close()
                moveTo(9.7061f, 5.201f)
                arcToRelative(0.9777f, 0.9961f, 0.0f, false, true, 0.9785f, 0.9962f)
                arcToRelative(0.9777f, 0.9961f, 0.0f, false, true, -0.9785f, 0.996f)
                arcToRelative(0.9777f, 0.9961f, 0.0f, false, true, -0.9766f, -0.996f)
                arcToRelative(0.9777f, 0.9961f, 0.0f, false, true, 0.9766f, -0.9961f)
                close()
                moveTo(6.7568f, 15.6935f)
                curveToRelative(-1.0746f, 0.0f, -1.2724f, 1.3542f, -1.9511f, 1.9648f)
                verticalLineToRelative(1.7813f)
                curveToRelative(0.0f, 0.823f, 0.6672f, 1.4902f, 1.4902f, 1.4902f)
                reflectiveCurveToRelative(1.4902f, -0.6672f, 1.4902f, -1.4902f)
                verticalLineToRelative(-3.1817f)
                curveToRelative(-0.2643f, -0.3237f, -0.5767f, -0.5644f, -1.0293f, -0.5644f)
                close()
            }
        }
        .build()
        return _livewire!!
    }

private var _livewire: ImageVector? = null
