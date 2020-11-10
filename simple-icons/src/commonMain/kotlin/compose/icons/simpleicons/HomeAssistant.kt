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

public val SimpleIcons.HomeAssistant: VectorAsset
    get() {
        if (_homeAssistant != null) {
            return _homeAssistant!!
        }
        _homeAssistant = VectorAssetBuilder(name = "HomeAssistant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9922f, 1.3945f)
                arcToRelative(0.7041f, 0.7041f, 0.0f, false, false, -0.498f, 0.211f)
                lineTo(0.1621f, 13.0977f)
                arcTo(0.5634f, 0.5634f, 0.0f, false, false, 0.0f, 13.494f)
                arcToRelative(0.567f, 0.567f, 0.0f, false, false, 0.5664f, 0.5664f)
                lineTo(2.67f, 14.0604f)
                verticalLineToRelative(8.0743f)
                curveToRelative(0.0f, 0.2603f, 0.2104f, 0.4707f, 0.4707f, 0.4707f)
                horizontalLineToRelative(7.9473f)
                verticalLineToRelative(-3.6836f)
                lineTo(8.037f, 15.8672f)
                arcToRelative(2.42f, 2.42f, 0.0f, false, true, -0.9473f, 0.1933f)
                curveToRelative(-1.3379f, 0.0f, -2.4218f, -1.0868f, -2.4218f, -2.4257f)
                curveToRelative(0.0f, -1.339f, 1.084f, -2.4239f, 2.4218f, -2.4239f)
                curveToRelative(1.338f, 0.0f, 2.422f, 1.085f, 2.422f, 2.4239f)
                curveToRelative(0.0f, 0.3359f, -0.068f, 0.6563f, -0.1915f, 0.9472f)
                lineToRelative(1.7676f, 1.7676f)
                verticalLineToRelative(-5.375f)
                curveTo(10.2f, 10.615f, 9.5723f, 9.744f, 9.5723f, 8.7266f)
                curveToRelative(0.0f, -1.339f, 1.0859f, -2.4258f, 2.4238f, -2.4258f)
                curveToRelative(1.338f, 0.0f, 2.4219f, 1.0868f, 2.4219f, 2.4258f)
                curveToRelative(0.0f, 1.0174f, -0.6259f, 1.8884f, -1.5137f, 2.248f)
                verticalLineToRelative(5.375f)
                lineToRelative(1.7656f, -1.7676f)
                arcToRelative(2.4205f, 2.4205f, 0.0f, false, true, -0.1914f, -0.9472f)
                curveToRelative(0.0f, -1.339f, 1.086f, -2.4239f, 2.4238f, -2.4239f)
                curveToRelative(1.338f, 0.0f, 2.422f, 1.085f, 2.422f, 2.4239f)
                curveToRelative(0.0f, 1.3389f, -1.084f, 2.4257f, -2.422f, 2.4257f)
                arcToRelative(2.42f, 2.42f, 0.0f, false, true, -0.9472f, -0.1933f)
                lineToRelative(-3.0508f, 3.0547f)
                verticalLineToRelative(3.6836f)
                horizontalLineToRelative(7.9473f)
                arcToRelative(0.4702f, 0.4702f, 0.0f, false, false, 0.4707f, -0.4707f)
                verticalLineToRelative(-8.0743f)
                horizontalLineToRelative(2.1113f)
                arcToRelative(0.5686f, 0.5686f, 0.0f, false, false, 0.3965f, -0.162f)
                curveToRelative(0.2233f, -0.2185f, 0.2262f, -0.5775f, 0.0078f, -0.8008f)
                lineToRelative(-2.5156f, -2.5723f)
                lineTo(21.3223f, 6.4707f)
                curveToRelative(0.0f, -0.2603f, -0.2104f, -0.4727f, -0.4707f, -0.4727f)
                horizontalLineToRelative(-1.9649f)
                curveToRelative(-0.2603f, 0.0f, -0.4707f, 0.2124f, -0.4707f, 0.4727f)
                verticalLineToRelative(1.1035f)
                lineTo(12.5f, 1.6035f)
                arcToRelative(0.7056f, 0.7056f, 0.0f, false, false, -0.5078f, -0.209f)
                close()
                moveTo(11.9961f, 7.7559f)
                curveToRelative(-0.5352f, 0.0f, -0.9688f, 0.4351f, -0.9688f, 0.9707f)
                curveToRelative(0.0f, 0.5355f, 0.4336f, 0.9687f, 0.9688f, 0.9687f)
                arcToRelative(0.9683f, 0.9683f, 0.0f, false, false, 0.9687f, -0.9687f)
                curveToRelative(0.0f, -0.5356f, -0.4335f, -0.9707f, -0.9687f, -0.9707f)
                close()
                moveTo(7.0898f, 12.666f)
                arcToRelative(0.9683f, 0.9683f, 0.0f, false, false, -0.9687f, 0.9688f)
                curveToRelative(0.0f, 0.5355f, 0.4336f, 0.9707f, 0.9687f, 0.9707f)
                curveToRelative(0.5352f, 0.0f, 0.9688f, -0.4352f, 0.9688f, -0.9707f)
                arcToRelative(0.9683f, 0.9683f, 0.0f, false, false, -0.9688f, -0.9688f)
                close()
                moveTo(16.9023f, 12.666f)
                curveToRelative(-0.5351f, 0.0f, -0.9707f, 0.4332f, -0.9707f, 0.9688f)
                curveToRelative(0.0f, 0.5355f, 0.4356f, 0.9707f, 0.9707f, 0.9707f)
                curveToRelative(0.5352f, 0.0f, 0.9688f, -0.4352f, 0.9688f, -0.9707f)
                arcToRelative(0.9683f, 0.9683f, 0.0f, false, false, -0.9688f, -0.9688f)
                close()
            }
        }
        .build()
        return _homeAssistant!!
    }

private var _homeAssistant: VectorAsset? = null
