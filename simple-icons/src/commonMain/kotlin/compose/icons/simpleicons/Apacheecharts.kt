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

public val SimpleIcons.Apacheecharts: ImageVector
    get() {
        if (_apacheecharts != null) {
            return _apacheecharts!!
        }
        _apacheecharts = Builder(name = "Apacheecharts", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(11.208f, 5.307f)
                curveToRelative(2.192f, -0.025f, 4.366f, 1.134f, 5.43f, 3.304f)
                curveToRelative(0.909f, 1.852f, 0.878f, 3.61f, -0.098f, 5.645f)
                curveToRelative(-0.477f, 0.995f, -0.487f, 1.06f, -0.241f, 1.578f)
                curveToRelative(0.214f, 0.452f, 0.727f, 0.779f, 1.221f, 0.779f)
                curveToRelative(0.454f, 0.0f, 1.15f, -0.586f, 1.252f, -1.054f)
                curveToRelative(0.1f, -0.454f, -0.193f, -1.118f, -0.607f, -1.377f)
                arcToRelative(10.11f, 10.11f, 0.0f, false, true, -0.393f, -0.255f)
                curveToRelative(-0.129f, -0.1f, 0.42f, -0.38f, 0.741f, -0.38f)
                curveToRelative(0.687f, 0.0f, 1.247f, 0.526f, 1.375f, 1.29f)
                curveToRelative(0.055f, 0.333f, 0.134f, 0.422f, 0.44f, 0.502f)
                curveToRelative(0.859f, 0.222f, 1.297f, 1.451f, 0.755f, 2.116f)
                curveToRelative(-0.22f, 0.27f, -0.23f, 0.271f, -0.305f, 0.042f)
                curveToRelative(-0.267f, -0.801f, -0.666f, -1.12f, -1.403f, -1.12f)
                curveToRelative(-0.319f, 0.0f, -0.572f, 0.128f, -1.098f, 0.556f)
                curveToRelative(-1.006f, 0.82f, -1.866f, 1.303f, -2.907f, 1.632f)
                curveToRelative(-1.276f, 0.384f, -2.752f, 0.478f, -4.086f, 0.156f)
                curveToRelative(-2.162f, -0.431f, -4.232f, -2.11f, -5.252f, -4.257f)
                curveTo(4.758f, 11.782f, 5.135f, 9.0f, 7.033f, 7.077f)
                arcToRelative(5.924f, 5.924f, 0.0f, false, true, 4.175f, -1.77f)
                close()
            }
        }
        .build()
        return _apacheecharts!!
    }

private var _apacheecharts: ImageVector? = null
