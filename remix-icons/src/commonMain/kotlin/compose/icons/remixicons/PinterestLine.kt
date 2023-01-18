package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.PinterestLine: ImageVector
    get() {
        if (_pinterestLine != null) {
            return _pinterestLine!!
        }
        _pinterestLine = Builder(name = "PinterestLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.49f, 19.191f)
                curveToRelative(0.024f, -0.336f, 0.072f, -0.671f, 0.144f, -1.001f)
                curveToRelative(0.063f, -0.295f, 0.254f, -1.13f, 0.534f, -2.34f)
                lineToRelative(0.007f, -0.03f)
                lineToRelative(0.387f, -1.668f)
                curveToRelative(0.079f, -0.34f, 0.14f, -0.604f, 0.181f, -0.692f)
                arcToRelative(3.46f, 3.46f, 0.0f, false, true, -0.284f, -1.423f)
                curveToRelative(0.0f, -1.337f, 0.756f, -2.373f, 1.736f, -2.373f)
                curveToRelative(0.36f, -0.006f, 0.704f, 0.15f, 0.942f, 0.426f)
                curveToRelative(0.238f, 0.275f, 0.348f, 0.644f, 0.302f, 0.996f)
                curveToRelative(0.0f, 0.453f, -0.085f, 0.798f, -0.453f, 2.035f)
                curveToRelative(-0.071f, 0.238f, -0.12f, 0.404f, -0.166f, 0.571f)
                curveToRelative(-0.051f, 0.188f, -0.095f, 0.358f, -0.132f, 0.522f)
                curveToRelative(-0.096f, 0.386f, -0.008f, 0.797f, 0.237f, 1.106f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 1.006f, 0.456f)
                curveToRelative(1.492f, 0.0f, 2.6f, -1.985f, 2.6f, -4.548f)
                curveToRelative(0.0f, -1.97f, -1.29f, -3.274f, -3.432f, -3.274f)
                arcTo(3.878f, 3.878f, 0.0f, false, false, 9.2f, 9.1f)
                arcToRelative(4.13f, 4.13f, 0.0f, false, false, -1.195f, 2.961f)
                arcToRelative(2.553f, 2.553f, 0.0f, false, false, 0.512f, 1.644f)
                curveToRelative(0.181f, 0.14f, 0.25f, 0.383f, 0.175f, 0.59f)
                curveToRelative(-0.041f, 0.168f, -0.14f, 0.552f, -0.176f, 0.68f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, -0.216f, 0.297f)
                arcToRelative(0.388f, 0.388f, 0.0f, false, true, -0.355f, 0.002f)
                curveToRelative(-1.16f, -0.479f, -1.796f, -1.778f, -1.796f, -3.44f)
                curveToRelative(0.0f, -2.985f, 2.491f, -5.584f, 6.192f, -5.584f)
                curveToRelative(3.135f, 0.0f, 5.481f, 2.329f, 5.481f, 5.14f)
                curveToRelative(0.0f, 3.532f, -1.932f, 6.104f, -4.69f, 6.104f)
                arcToRelative(2.508f, 2.508f, 0.0f, false, true, -2.046f, -0.959f)
                lineToRelative(-0.043f, 0.177f)
                lineToRelative(-0.207f, 0.852f)
                lineToRelative(-0.002f, 0.007f)
                curveToRelative(-0.146f, 0.6f, -0.248f, 1.017f, -0.288f, 1.174f)
                curveToRelative(-0.106f, 0.355f, -0.24f, 0.703f, -0.4f, 1.04f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -1.656f, -0.593f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _pinterestLine!!
    }

private var _pinterestLine: ImageVector? = null
