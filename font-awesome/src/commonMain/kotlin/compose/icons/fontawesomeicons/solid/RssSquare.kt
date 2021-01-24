package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.RssSquare: ImageVector
    get() {
        if (_rssSquare != null) {
            return _rssSquare!!
        }
        _rssSquare = Builder(name = "RssSquare", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.49f, 32.0f, 0.0f, 53.49f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                lineTo(448.0f, 80.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(112.0f, 416.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.49f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.49f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.49f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(269.533f, 416.0f)
                horizontalLineToRelative(-34.335f)
                curveToRelative(-6.011f, 0.0f, -11.051f, -4.636f, -11.442f, -10.634f)
                curveToRelative(-5.214f, -80.05f, -69.243f, -143.92f, -149.123f, -149.123f)
                curveToRelative(-5.997f, -0.39f, -10.633f, -5.431f, -10.633f, -11.441f)
                verticalLineToRelative(-34.335f)
                curveToRelative(0.0f, -6.535f, 5.468f, -11.777f, 11.994f, -11.425f)
                curveToRelative(110.546f, 5.974f, 198.997f, 94.536f, 204.964f, 204.964f)
                curveToRelative(0.352f, 6.526f, -4.89f, 11.994f, -11.425f, 11.994f)
                close()
                moveTo(372.56f, 416.0f)
                horizontalLineToRelative(-34.334f)
                curveToRelative(-6.161f, 0.0f, -11.175f, -4.882f, -11.427f, -11.038f)
                curveToRelative(-5.598f, -136.535f, -115.204f, -246.161f, -251.76f, -251.76f)
                curveTo(68.882f, 152.949f, 64.0f, 147.935f, 64.0f, 141.774f)
                lineTo(64.0f, 107.44f)
                curveToRelative(0.0f, -6.454f, 5.338f, -11.664f, 11.787f, -11.432f)
                curveToRelative(167.83f, 6.025f, 302.21f, 141.191f, 308.205f, 308.205f)
                curveToRelative(0.232f, 6.449f, -4.978f, 11.787f, -11.432f, 11.787f)
                close()
            }
        }
        .build()
        return _rssSquare!!
    }

private var _rssSquare: ImageVector? = null
