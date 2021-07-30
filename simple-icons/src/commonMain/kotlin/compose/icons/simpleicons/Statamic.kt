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

public val SimpleIcons.Statamic: ImageVector
    get() {
        if (_statamic != null) {
            return _statamic!!
        }
        _statamic = Builder(name = "Statamic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.78f, 21.639f)
                curveToRelative(1.754f, 0.0f, 2.398f, -0.756f, 2.398f, -2.607f)
                verticalLineToRelative(-3.62f)
                curveToRelative(0.0f, -1.722f, 0.837f, -2.704f, 1.641f, -3.17f)
                curveToRelative(0.242f, -0.145f, 0.242f, -0.483f, 0.0f, -0.644f)
                curveToRelative(-0.836f, -0.531f, -1.64f, -1.642f, -1.64f, -3.122f)
                verticalLineToRelative(-3.54f)
                curveToRelative(0.0f, -1.996f, -0.548f, -2.575f, -2.302f, -2.575f)
                lineTo(4.123f, 2.361f)
                curveToRelative(-1.754f, 0.0f, -2.301f, 0.58f, -2.301f, 2.575f)
                verticalLineToRelative(3.556f)
                curveToRelative(0.0f, 1.48f, -0.805f, 2.59f, -1.641f, 3.122f)
                arcToRelative(0.377f, 0.377f, 0.0f, false, false, 0.0f, 0.643f)
                curveToRelative(0.804f, 0.451f, 1.64f, 1.433f, 1.64f, 3.17f)
                verticalLineToRelative(3.605f)
                curveToRelative(0.0f, 1.85f, 0.645f, 2.607f, 2.399f, 2.607f)
                close()
                moveTo(11.96f, 18.34f)
                curveToRelative(-1.883f, 0.0f, -3.25f, -0.563f, -4.522f, -1.673f)
                arcToRelative(0.891f, 0.891f, 0.0f, false, true, -0.29f, -0.676f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, true, 0.193f, -0.563f)
                lineToRelative(0.403f, -0.515f)
                curveToRelative(0.193f, -0.242f, 0.402f, -0.354f, 0.643f, -0.354f)
                curveToRelative(0.274f, 0.0f, 0.531f, 0.112f, 0.805f, 0.29f)
                arcToRelative(5.331f, 5.331f, 0.0f, false, false, 2.993f, 0.884f)
                curveToRelative(0.885f, 0.0f, 1.593f, -0.37f, 1.593f, -1.126f)
                curveToRelative(0.0f, -1.963f, -6.533f, -0.885f, -6.533f, -5.294f)
                curveToRelative(0.0f, -2.366f, 1.93f, -3.685f, 4.441f, -3.685f)
                curveToRelative(1.77f, 0.0f, 3.074f, 0.515f, 4.04f, 1.126f)
                curveToRelative(0.24f, 0.161f, 0.402f, 0.483f, 0.402f, 0.805f)
                curveToRelative(0.0f, 0.193f, -0.049f, 0.37f, -0.161f, 0.53f)
                lineToRelative(-0.29f, 0.435f)
                curveToRelative(-0.21f, 0.29f, -0.45f, 0.435f, -0.756f, 0.435f)
                curveToRelative(-0.21f, 0.0f, -0.435f, -0.08f, -0.676f, -0.193f)
                arcToRelative(5.07f, 5.07f, 0.0f, false, false, -2.398f, -0.564f)
                curveToRelative(-0.95f, 0.0f, -1.513f, 0.515f, -1.513f, 1.046f)
                curveToRelative(0.0f, 2.012f, 6.534f, 0.918f, 6.534f, 5.198f)
                curveToRelative(0.0f, 2.414f, -1.947f, 3.894f, -4.908f, 3.894f)
                close()
            }
        }
        .build()
        return _statamic!!
    }

private var _statamic: ImageVector? = null
