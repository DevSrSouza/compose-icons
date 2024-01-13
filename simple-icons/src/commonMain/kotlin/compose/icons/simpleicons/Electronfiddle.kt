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

public val SimpleIcons.Electronfiddle: ImageVector
    get() {
        if (_electronfiddle != null) {
            return _electronfiddle!!
        }
        _electronfiddle = Builder(name = "Electronfiddle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                curveToRelative(-0.6312f, 0.0f, -1.1429f, 0.5117f, -1.1429f, 1.1429f)
                verticalLineToRelative(13.8583f)
                curveToRelative(-1.9716f, 0.5075f, -3.4285f, 2.2973f, -3.4285f, 4.4274f)
                curveTo(3.4286f, 21.9533f, 5.4753f, 24.0f, 8.0f, 24.0f)
                curveToRelative(2.5247f, 0.0f, 4.5714f, -2.0467f, 4.5714f, -4.5714f)
                curveToRelative(0.0f, -2.1301f, -1.4569f, -3.92f, -3.4285f, -4.4274f)
                verticalLineToRelative(-4.7155f)
                horizontalLineToRelative(4.7346f)
                curveToRelative(0.541f, 0.0f, 0.9796f, -0.5117f, 0.9796f, -1.1428f)
                curveToRelative(0.0f, -0.6312f, -0.4386f, -1.1429f, -0.9796f, -1.1429f)
                lineTo(9.143f, 8.0f)
                lineTo(9.143f, 2.2857f)
                horizontalLineToRelative(10.2857f)
                curveToRelative(0.6312f, 0.0f, 1.1428f, -0.5117f, 1.1428f, -1.1428f)
                curveTo(20.5714f, 0.5117f, 20.0598f, 0.0f, 19.4286f, 0.0f)
                close()
                moveTo(8.0f, 17.1429f)
                curveToRelative(1.2624f, 0.0f, 2.2857f, 1.0233f, 2.2857f, 2.2857f)
                curveToRelative(0.0f, 1.2623f, -1.0233f, 2.2857f, -2.2857f, 2.2857f)
                curveToRelative(-1.2624f, 0.0f, -2.2857f, -1.0234f, -2.2857f, -2.2857f)
                curveToRelative(0.0f, -1.2624f, 1.0233f, -2.2857f, 2.2857f, -2.2857f)
                close()
            }
        }
        .build()
        return _electronfiddle!!
    }

private var _electronfiddle: ImageVector? = null
