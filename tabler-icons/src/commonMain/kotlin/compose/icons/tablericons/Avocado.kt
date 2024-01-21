package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Avocado: ImageVector
    get() {
        if (_avocado != null) {
            return _avocado!!
        }
        _avocado = Builder(name = "Avocado", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.8f, 14.04f)
                arcToRelative(3.905f, 3.905f, 0.0f, false, true, 1.337f, -2.075f)
                curveToRelative(1.195f, -0.985f, 1.816f, -2.285f, 1.863f, -3.902f)
                curveToRelative(-0.047f, -1.43f, -0.54f, -2.626f, -1.477f, -3.586f)
                curveToRelative(-0.96f, -0.938f, -2.156f, -1.43f, -3.585f, -1.477f)
                curveToRelative(-1.618f, 0.047f, -2.918f, 0.668f, -3.903f, 1.863f)
                curveToRelative(-0.562f, 0.68f, -1.254f, 1.125f, -2.074f, 1.336f)
                curveToRelative(-0.938f, 0.188f, -1.828f, 0.48f, -2.672f, 0.88f)
                curveToRelative(-0.844f, 0.398f, -1.559f, 0.878f, -2.144f, 1.44f)
                curveToRelative(-1.43f, 1.501f, -2.145f, 3.224f, -2.145f, 5.169f)
                curveToRelative(0.0f, 1.946f, 0.715f, 3.668f, 2.145f, 5.168f)
                curveToRelative(1.5f, 1.429f, 3.222f, 2.144f, 5.168f, 2.144f)
                curveToRelative(1.945f, 0.0f, 3.667f, -0.715f, 5.167f, -2.145f)
                curveToRelative(0.563f, -0.585f, 1.055f, -1.3f, 1.477f, -2.144f)
                curveToRelative(0.398f, -0.844f, 0.68f, -1.723f, 0.844f, -2.637f)
                verticalLineToRelative(-0.035f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.87f, 10.036f)
                curveToRelative(-0.942f, 0.112f, -1.794f, 0.538f, -2.556f, 1.278f)
                curveToRelative(-0.74f, 0.762f, -1.166f, 1.614f, -1.278f, 2.556f)
                curveToRelative(-0.135f, 0.92f, 0.112f, 1.704f, 0.74f, 2.354f)
                curveToRelative(0.65f, 0.628f, 1.435f, 0.875f, 2.354f, 0.74f)
                curveToRelative(0.942f, -0.112f, 1.794f, -0.538f, 2.556f, -1.278f)
                curveToRelative(0.74f, -0.762f, 1.166f, -1.614f, 1.278f, -2.556f)
                curveToRelative(0.135f, -0.92f, -0.112f, -1.704f, -0.74f, -2.354f)
                curveToRelative(-0.65f, -0.628f, -1.435f, -0.875f, -2.354f, -0.74f)
                close()
            }
        }
        .build()
        return _avocado!!
    }

private var _avocado: ImageVector? = null
