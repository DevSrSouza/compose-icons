package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Harbor: VectorAsset
    get() {
        if (_harbor != null) {
            return _harbor!!
        }
        _harbor = VectorAssetBuilder(name = "Harbor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0573f, 0.0022f)
                curveTo(7.455f, -0.0207f, 3.2453f, 2.5912f, 1.2218f, 6.7248f)
                curveTo(-0.8016f, 10.8584f, -0.282f, 15.7852f, 2.5591f, 19.4059f)
                curveToRelative(2.841f, 3.6208f, 7.5027f, 5.2974f, 11.999f, 4.3153f)
                curveToRelative(4.4963f, -0.982f, 8.0346f, -4.4498f, 9.1071f, -8.9254f)
                curveToRelative(0.0062f, -0.0249f, 0.0133f, -0.0494f, 0.0192f, -0.0746f)
                curveToRelative(0.209f, -0.8929f, 0.315f, -1.8069f, 0.3156f, -2.724f)
                curveToRelative(0.0f, -0.0317f, -0.0022f, -0.063f, -0.0024f, -0.0948f)
                curveToRelative(-0.0012f, -0.1373f, -0.0095f, -0.2726f, -0.0152f, -0.4088f)
                curveToRelative(-0.019f, -0.2669f, 0.0399f, 0.2645f, 0.0f, 0.0f)
                curveToRelative(0.0399f, 0.2645f, -0.019f, -0.2669f, 0.0f, 0.0f)
                verticalLineToRelative(-3.0E-4f)
                arcToRelative(11.9318f, 11.9318f, 0.0f, false, false, -0.2045f, -1.7663f)
                curveToRelative(-0.0334f, -0.173f, -0.0672f, -0.3458f, -0.1078f, -0.5164f)
                arcToRelative(11.9097f, 11.9097f, 0.0f, false, false, -0.9547f, -2.6018f)
                curveToRelative(-0.0077f, -0.0151f, -0.0141f, -0.0311f, -0.0219f, -0.046f)
                arcToRelative(12.0382f, 12.0382f, 0.0f, false, false, -1.2805f, -1.99f)
                curveToRelative(-0.0694f, -0.088f, -0.1363f, -0.178f, -0.208f, -0.2638f)
                arcToRelative(12.1001f, 12.1001f, 0.0f, false, false, -2.0533f, -1.9417f)
                arcToRelative(12.4056f, 12.4056f, 0.0f, false, false, -0.3305f, -0.2362f)
                arcToRelative(11.9978f, 11.9978f, 0.0f, false, false, -6.7639f, -2.129f)
                close()
                moveTo(12.2716f, 2.2127f)
                arcToRelative(9.7818f, 9.7818f, 0.0f, false, true, 4.9926f, 1.5378f)
                lineToRelative(-5.683f, 5.9103f)
                lineToRelative(7.8255f, -4.05f)
                arcToRelative(9.8492f, 9.8492f, 0.0f, false, true, 1.1544f, 1.6475f)
                curveToRelative(0.0066f, 0.012f, 0.0123f, 0.0244f, 0.0189f, 0.0365f)
                lineToRelative(-8.8448f, 2.8423f)
                lineToRelative(9.7994f, -0.3337f)
                arcToRelative(9.7295f, 9.7295f, 0.0f, false, true, 0.2246f, 1.5305f)
                lineToRelative(-10.178f, -0.7304f)
                lineToRelative(9.985f, 3.4641f)
                curveToRelative(-0.98f, 4.5004f, -4.9603f, 7.7119f, -9.5662f, 7.7182f)
                curveToRelative(-0.0895f, 0.0f, -0.178f, -0.0043f, -0.267f, -0.0067f)
                lineToRelative(-0.1026f, -1.2554f)
                lineToRelative(-4.7386f, -2.0882f)
                lineToRelative(-0.1597f, 1.8055f)
                curveToRelative(0.1982f, 0.1234f, -0.2066f, -0.1087f, 0.0f, 0.0f)
                curveToRelative(-0.2066f, -0.1087f, 0.1982f, 0.1234f, 0.0f, 0.0f)
                arcToRelative(9.787f, 9.787f, 0.0f, false, true, -4.5209f, -8.2437f)
                curveToRelative(-0.0038f, -5.5141f, 4.5485f, -9.9416f, 10.0604f, -9.7846f)
                close()
                moveTo(9.1434f, 5.9054f)
                arcToRelative(0.201f, 0.201f, 0.0f, false, false, -0.1943f, 0.2f)
                verticalLineToRelative(0.1467f)
                lineTo(6.82f, 8.3357f)
                verticalLineToRelative(0.6525f)
                horizontalLineToRelative(0.3834f)
                verticalLineToRelative(2.27f)
                lineTo(6.82f, 11.2582f)
                verticalLineToRelative(1.1125f)
                horizontalLineToRelative(0.6088f)
                lineToRelative(-0.1408f, 1.5896f)
                lineToRelative(3.948f, 1.7396f)
                lineToRelative(-0.2724f, -3.3292f)
                horizontalLineToRelative(0.5167f)
                verticalLineToRelative(-1.1125f)
                horizontalLineToRelative(-0.3832f)
                verticalLineToRelative(-2.27f)
                horizontalLineToRelative(0.3832f)
                verticalLineToRelative(-0.6525f)
                lineTo(9.3509f, 6.252f)
                verticalLineToRelative(-0.1467f)
                arcToRelative(0.201f, 0.201f, 0.0f, false, false, -0.2075f, -0.2f)
                close()
                moveTo(7.8197f, 8.9882f)
                horizontalLineToRelative(2.6607f)
                verticalLineToRelative(2.27f)
                horizontalLineToRelative(-0.6312f)
                verticalLineToRelative(-0.9695f)
                curveToRelative(0.0f, -0.932f, -1.398f, -0.932f, -1.398f, 0.0f)
                verticalLineToRelative(0.9695f)
                horizontalLineToRelative(-0.6315f)
                close()
                moveTo(7.2387f, 14.5162f)
                lineToRelative(-0.0665f, 0.7506f)
                lineToRelative(4.1788f, 1.8414f)
                lineToRelative(-0.0662f, -0.8092f)
                close()
                moveTo(7.1231f, 15.8226f)
                lineToRelative(-0.0662f, 0.7506f)
                lineToRelative(4.4092f, 1.9431f)
                lineToRelative(-0.0662f, -0.809f)
                close()
                moveTo(7.0077f, 17.1291f)
                lineToRelative(-0.0665f, 0.7503f)
                lineToRelative(4.64f, 2.045f)
                lineToRelative(-0.066f, -0.8088f)
                close()
            }
        }
        .build()
        return _harbor!!
    }

private var _harbor: VectorAsset? = null
