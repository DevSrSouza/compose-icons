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

public val SimpleIcons.Smrt: ImageVector
    get() {
        if (_smrt != null) {
            return _smrt!!
        }
        _smrt = Builder(name = "Smrt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6535f, 13.753f)
                curveToRelative(0.8096f, 4.4368f, 4.677f, 7.8105f, 9.3392f, 7.8105f)
                curveToRelative(4.677f, 0.0f, 8.6171f, -4.0882f, 9.3967f, -8.5422f)
                horizontalLineToRelative(-2.5631f)
                curveToRelative(-0.7499f, 3.0597f, -3.5506f, 6.0385f, -6.8334f, 6.0385f)
                curveToRelative(-2.3686f, 0.0f, -4.4526f, -1.1984f, -5.727f, -2.999f)
                horizontalLineToRelative(5.292f)
                curveToRelative(0.435f, 0.0f, 0.8542f, -0.2304f, 1.214f, -0.7029f)
                lineToRelative(1.2895f, -1.8584f)
                curveToRelative(0.121f, -0.2305f, 0.3448f, -0.3601f, 0.6145f, -0.3601f)
                horizontalLineToRelative(7.54f)
                lineTo(24.0f, 10.8318f)
                lineTo(13.6117f, 10.8318f)
                curveToRelative(-0.2535f, 0.0f, -0.48f, 0.144f, -0.6148f, 0.3284f)
                lineToRelative(-1.7089f, 2.2932f)
                curveToRelative(-0.1037f, 0.1728f, -0.2852f, 0.288f, -0.4946f, 0.288f)
                close()
                moveTo(21.3318f, 10.2467f)
                curveToRelative(-0.8096f, -4.4396f, -4.6468f, -7.8102f, -9.3242f, -7.8102f)
                curveToRelative(-4.677f, 0.0f, -8.4993f, 3.9755f, -9.2786f, 8.4299f)
                horizontalLineToRelative(2.5634f)
                curveToRelative(0.7496f, -3.0598f, 3.4322f, -5.9265f, 6.7302f, -5.9265f)
                curveToRelative(2.3686f, 0.0f, 4.452f, 1.1985f, 5.7263f, 2.9964f)
                horizontalLineToRelative(-5.3065f)
                curveToRelative(-0.4348f, 0.0f, -0.8545f, 0.2305f, -1.2143f, 0.7058f)
                lineToRelative(-1.2892f, 1.8581f)
                curveToRelative(-0.121f, 0.2305f, -0.3448f, 0.3604f, -0.6148f, 0.3604f)
                horizontalLineToRelative(-7.54f)
                lineTo(0.0f, 13.1365f)
                horizontalLineToRelative(10.3883f)
                curveToRelative(0.2535f, 0.0f, 0.48f, -0.144f, 0.6148f, -0.3284f)
                lineToRelative(1.7089f, -2.3107f)
                curveToRelative(0.1037f, -0.1729f, 0.2852f, -0.2881f, 0.4946f, -0.2881f)
                close()
            }
        }
        .build()
        return _smrt!!
    }

private var _smrt: ImageVector? = null
