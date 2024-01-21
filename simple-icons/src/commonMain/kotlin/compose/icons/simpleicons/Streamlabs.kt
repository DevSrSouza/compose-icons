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

public val SimpleIcons.Streamlabs: ImageVector
    get() {
        if (_streamlabs != null) {
            return _streamlabs!!
        }
        _streamlabs = Builder(name = "Streamlabs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.6878f, 1.3459f)
                arcToRelative(1.365f, 1.365f, 0.0f, false, false, -0.2734f, 0.0058f)
                curveToRelative(-0.528f, 0.066f, -1.0133f, 0.1616f, -1.4843f, 0.3086f)
                arcTo(10.0568f, 10.0568f, 0.0f, false, false, 0.3208f, 8.2697f)
                curveToRelative(-0.147f, 0.471f, -0.2445f, 0.9583f, -0.3105f, 1.4863f)
                curveToRelative(-0.091f, 0.734f, 0.431f, 1.4041f, 1.166f, 1.4961f)
                curveToRelative(0.734f, 0.091f, 1.404f, -0.43f, 1.496f, -1.164f)
                curveToRelative(0.05f, -0.406f, 0.119f, -0.7316f, 0.209f, -1.0196f)
                arcTo(7.3736f, 7.3736f, 0.0f, false, true, 7.727f, 4.221f)
                curveToRelative(0.288f, -0.09f, 0.6145f, -0.157f, 1.0195f, -0.207f)
                curveToRelative(0.735f, -0.092f, 1.255f, -0.7631f, 1.164f, -1.4981f)
                arcToRelative(1.3394f, 1.3394f, 0.0f, false, false, -1.2226f, -1.17f)
                close()
                moveTo(12.7366f, 6.5685f)
                curveToRelative(-2.629f, 0.0f, -3.9432f, 7.0E-4f, -4.9472f, 0.5117f)
                arcTo(4.684f, 4.684f, 0.0f, false, false, 5.7406f, 9.131f)
                curveToRelative(-0.512f, 1.004f, -0.5117f, 2.3183f, -0.5117f, 4.9473f)
                verticalLineToRelative(4.289f)
                curveToRelative(0.0f, 1.502f, -0.001f, 2.2542f, 0.291f, 2.8282f)
                curveToRelative(0.257f, 0.505f, 0.6679f, 0.9149f, 1.1719f, 1.1719f)
                curveToRelative(0.574f, 0.292f, 1.326f, 0.291f, 2.828f, 0.291f)
                horizontalLineToRelative(6.9706f)
                curveToRelative(2.628f, 0.0f, 3.9442f, 0.0012f, 4.9472f, -0.5098f)
                arcToRelative(4.6883f, 4.6883f, 0.0f, false, false, 2.0507f, -2.0508f)
                curveToRelative(0.512f, -1.004f, 0.5117f, -2.3182f, 0.5117f, -4.9472f)
                verticalLineToRelative(-1.0723f)
                curveToRelative(0.0f, -2.629f, 3.0E-4f, -3.9433f, -0.5117f, -4.9473f)
                arcToRelative(4.6883f, 4.6883f, 0.0f, false, false, -2.0507f, -2.0508f)
                curveToRelative(-1.003f, -0.511f, -2.3193f, -0.5117f, -4.9472f, -0.5117f)
                close()
                moveTo(13.2736f, 13.2736f)
                curveToRelative(0.741f, 0.0f, 1.3399f, 0.5998f, 1.3399f, 1.3398f)
                verticalLineToRelative(2.6836f)
                curveToRelative(0.0f, 0.74f, -0.5988f, 1.3399f, -1.3398f, 1.3399f)
                curveToRelative(-0.74f, 0.0f, -1.3418f, -0.5999f, -1.3418f, -1.3399f)
                verticalLineToRelative(-2.6836f)
                curveToRelative(0.0f, -0.74f, 0.6018f, -1.3398f, 1.3418f, -1.3398f)
                close()
                moveTo(18.6368f, 13.2736f)
                curveToRelative(0.74f, 0.0f, 1.3399f, 0.5998f, 1.3399f, 1.3398f)
                verticalLineToRelative(2.6836f)
                curveToRelative(0.0f, 0.74f, -0.5999f, 1.3399f, -1.3399f, 1.3399f)
                curveToRelative(-0.741f, 0.0f, -1.3398f, -0.5999f, -1.3398f, -1.3399f)
                verticalLineToRelative(-2.6836f)
                curveToRelative(0.0f, -0.74f, 0.5989f, -1.3398f, 1.3398f, -1.3398f)
                close()
            }
        }
        .build()
        return _streamlabs!!
    }

private var _streamlabs: ImageVector? = null
