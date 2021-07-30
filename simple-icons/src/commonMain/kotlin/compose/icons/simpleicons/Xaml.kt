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

public val SimpleIcons.Xaml: ImageVector
    get() {
        if (_xaml != null) {
            return _xaml!!
        }
        _xaml = Builder(name = "Xaml", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3912f, 1.5373f)
                arcToRelative(0.7847f, 0.7847f, 0.0f, false, false, -0.679f, 0.3914f)
                lineToRelative(-5.6065f, 9.678f)
                arcToRelative(0.7847f, 0.7847f, 0.0f, false, false, 0.0f, 0.7867f)
                lineToRelative(5.6065f, 9.6779f)
                arcToRelative(0.7847f, 0.7847f, 0.0f, false, false, 0.679f, 0.3914f)
                horizontalLineToRelative(11.2176f)
                curveToRelative(0.28f, 0.0f, 0.5387f, -0.1492f, 0.679f, -0.3914f)
                lineToRelative(5.6065f, -9.678f)
                arcToRelative(0.7847f, 0.7847f, 0.0f, false, false, 0.0f, -0.7867f)
                lineToRelative(-5.6065f, -9.6779f)
                arcToRelative(0.7848f, 0.7848f, 0.0f, false, false, -0.679f, -0.3914f)
                close()
                moveTo(6.4214f, 2.3743f)
                horizontalLineToRelative(10.542f)
                lineToRelative(-5.2093f, 9.2112f)
                lineTo(5.9679f, 11.5855f)
                lineToRelative(4.7196f, -8.1747f)
                arcToRelative(0.1308f, 0.1308f, 0.0f, false, false, -0.1132f, -0.1962f)
                lineTo(7.5062f, 3.213f)
                arcToRelative(0.2615f, 0.2615f, 0.0f, false, false, -0.2266f, 0.1307f)
                lineToRelative(-4.7633f, 8.2419f)
                horizontalLineToRelative(-1.431f)
                close()
                moveTo(17.7539f, 2.6768f)
                lineTo(23.1549f, 12.0f)
                lineToRelative(-5.3722f, 9.2735f)
                lineToRelative(-5.2987f, -9.2784f)
                close()
                moveTo(17.9251f, 5.5016f)
                arcToRelative(0.1295f, 0.1295f, 0.0f, false, false, -0.1132f, 0.0665f)
                lineToRelative(-1.5186f, 2.689f)
                arcToRelative(0.2616f, 0.2616f, 0.0f, false, false, 0.0013f, 0.2595f)
                lineToRelative(1.943f, 3.3611f)
                arcToRelative(0.2615f, 0.2615f, 0.0f, false, true, 0.0f, 0.2617f)
                lineToRelative(-1.9268f, 3.3375f)
                arcToRelative(0.2616f, 0.2616f, 0.0f, false, false, -6.0E-4f, 0.2605f)
                lineToRelative(1.5272f, 2.6742f)
                curveToRelative(0.05f, 0.0877f, 0.1763f, 0.088f, 0.2268f, 6.0E-4f)
                lineToRelative(3.5503f, -6.1431f)
                arcToRelative(0.5231f, 0.5231f, 0.0f, false, false, -1.0E-4f, -0.5238f)
                lineTo(18.039f, 5.567f)
                arcToRelative(0.1295f, 0.1295f, 0.0f, false, false, -0.1139f, -0.0653f)
                close()
                moveTo(1.09f, 12.4225f)
                horizontalLineToRelative(1.4363f)
                lineToRelative(4.7634f, 8.2314f)
                arcToRelative(0.2616f, 0.2616f, 0.0f, false, false, 0.2262f, 0.1305f)
                lineToRelative(3.0718f, 0.0018f)
                arcToRelative(0.1308f, 0.1308f, 0.0f, false, false, 0.1133f, -0.1962f)
                lineToRelative(-4.7215f, -8.1675f)
                horizontalLineToRelative(5.7848f)
                lineToRelative(5.2557f, 9.2032f)
                lineTo(6.4214f, 21.6257f)
                close()
            }
        }
        .build()
        return _xaml!!
    }

private var _xaml: ImageVector? = null
