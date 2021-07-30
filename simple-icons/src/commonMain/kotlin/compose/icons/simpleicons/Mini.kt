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

public val SimpleIcons.Mini: ImageVector
    get() {
        if (_mini != null) {
            return _mini!!
        }
        _mini = Builder(name = "Mini", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 9.1723f)
                horizontalLineToRelative(7.5563f)
                curveToRelative(0.48f, -0.749f, 1.1108f, -1.3428f, 1.8935f, -1.7828f)
                curveToRelative(0.7822f, -0.4393f, 1.6314f, -0.659f, 2.5484f, -0.659f)
                curveToRelative(0.9163f, 0.0f, 1.7673f, 0.2203f, 2.5526f, 0.6615f)
                curveToRelative(0.7852f, 0.4412f, 1.4154f, 1.035f, 1.8892f, 1.7803f)
                lineTo(24.0f, 9.1723f)
                lineToRelative(-0.7483f, 0.7483f)
                horizontalLineToRelative(-6.3994f)
                arcToRelative(4.278f, 4.278f, 0.0f, false, true, 0.299f, 0.8886f)
                horizontalLineToRelative(5.2333f)
                lineToRelative(-0.7483f, 0.749f)
                horizontalLineToRelative(-4.3692f)
                curveToRelative(0.0129f, 0.1932f, 0.019f, 0.3396f, 0.019f, 0.4393f)
                curveToRelative(0.0f, 0.0997f, -0.0061f, 0.2468f, -0.019f, 0.44f)
                horizontalLineToRelative(3.4904f)
                lineToRelative(-0.7489f, 0.7483f)
                horizontalLineToRelative(-2.8572f)
                arcToRelative(4.0661f, 4.0661f, 0.0f, false, true, -0.299f, 0.8844f)
                horizontalLineToRelative(2.264f)
                lineToRelative(-0.7582f, 0.7483f)
                lineTo(16.44f, 14.8185f)
                curveToRelative(-0.4738f, 0.7464f, -1.104f, 1.3421f, -1.8892f, 1.7858f)
                curveToRelative(-0.7853f, 0.4437f, -1.6363f, 0.6652f, -2.5526f, 0.6652f)
                curveToRelative(-0.917f, 0.0f, -1.7662f, -0.2209f, -2.5484f, -0.6627f)
                curveToRelative(-0.7827f, -0.4425f, -1.4135f, -1.0388f, -1.8935f, -1.7883f)
                lineTo(5.6418f, 14.8185f)
                lineToRelative(-0.744f, -0.7483f)
                horizontalLineToRelative(2.2597f)
                arcToRelative(4.093f, 4.093f, 0.0f, false, true, -0.296f, -0.8844f)
                lineTo(4.0062f, 13.1858f)
                lineToRelative(-0.7582f, -0.7483f)
                horizontalLineToRelative(3.4898f)
                curveToRelative(-0.0129f, -0.1932f, -0.019f, -0.3403f, -0.019f, -0.44f)
                curveToRelative(0.0f, -0.0997f, 0.0061f, -0.2461f, 0.019f, -0.4393f)
                horizontalLineToRelative(-4.36f)
                lineToRelative(-0.7581f, -0.749f)
                horizontalLineToRelative(5.2418f)
                arcToRelative(4.306f, 4.306f, 0.0f, false, true, 0.296f, -0.8886f)
                lineTo(0.7483f, 9.9206f)
                close()
                moveTo(7.8437f, 10.2437f)
                curveToRelative(-0.2382f, 0.5581f, -0.3575f, 1.1428f, -0.3575f, 1.7538f)
                curveToRelative(0.0f, 0.6111f, 0.1193f, 1.1963f, 0.3575f, 1.7545f)
                curveToRelative(0.2381f, 0.5575f, 0.5594f, 1.0394f, 0.963f, 1.4443f)
                curveToRelative(0.4038f, 0.405f, 0.8838f, 0.7268f, 1.44f, 0.9662f)
                curveToRelative(0.5564f, 0.2393f, 1.1404f, 0.3587f, 1.7515f, 0.3587f)
                curveToRelative(0.6104f, 0.0f, 1.195f, -0.1194f, 1.7532f, -0.3587f)
                curveToRelative(0.5575f, -0.2394f, 1.0388f, -0.5613f, 1.4424f, -0.9662f)
                curveToRelative(0.4037f, -0.405f, 0.725f, -0.8868f, 0.9656f, -1.4443f)
                curveToRelative(0.24f, -0.5582f, 0.36f, -1.1434f, 0.36f, -1.7545f)
                curveToRelative(0.0f, -0.611f, -0.12f, -1.1957f, -0.36f, -1.7538f)
                curveToRelative(-0.2406f, -0.5582f, -0.5619f, -1.0388f, -0.9656f, -1.4425f)
                curveToRelative(-0.4036f, -0.403f, -0.8849f, -0.7243f, -1.4424f, -0.9637f)
                curveToRelative(-0.5582f, -0.2393f, -1.1428f, -0.3587f, -1.7532f, -0.3587f)
                curveToRelative(-0.6111f, 0.0f, -1.1951f, 0.1194f, -1.7514f, 0.3587f)
                curveToRelative(-0.5563f, 0.2394f, -1.0363f, 0.5607f, -1.44f, 0.9637f)
                curveToRelative(-0.4037f, 0.4037f, -0.725f, 0.8843f, -0.9631f, 1.4425f)
                close()
                moveTo(8.3975f, 13.1858f)
                horizontalLineToRelative(0.4677f)
                lineToRelative(-0.0135f, -1.7729f)
                lineToRelative(0.5661f, 1.773f)
                lineToRelative(0.52f, -0.0032f)
                lineToRelative(0.5557f, -1.7606f)
                verticalLineToRelative(1.7637f)
                horizontalLineToRelative(0.4991f)
                verticalLineToRelative(-2.3766f)
                lineToRelative(-0.7028f, -6.0E-4f)
                lineToRelative(-0.603f, 1.8954f)
                lineToRelative(-0.6148f, -1.893f)
                lineToRelative(-0.6745f, -0.0018f)
                close()
                moveTo(11.5305f, 13.1858f)
                horizontalLineToRelative(0.4953f)
                verticalLineToRelative(-2.3766f)
                horizontalLineToRelative(-0.4953f)
                close()
                moveTo(12.5637f, 13.1858f)
                horizontalLineToRelative(0.477f)
                verticalLineToRelative(-1.712f)
                lineToRelative(0.9488f, 1.712f)
                horizontalLineToRelative(0.5754f)
                verticalLineToRelative(-2.3766f)
                horizontalLineToRelative(-0.4677f)
                verticalLineToRelative(1.7219f)
                lineToRelative(-0.9489f, -1.7219f)
                horizontalLineToRelative(-0.5846f)
                close()
                moveTo(15.112f, 13.1858f)
                horizontalLineToRelative(0.4862f)
                verticalLineToRelative(-2.3766f)
                horizontalLineToRelative(-0.4862f)
                close()
            }
        }
        .build()
        return _mini!!
    }

private var _mini: ImageVector? = null
