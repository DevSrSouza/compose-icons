package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
                moveTo(269.53f, 416.0f)
                horizontalLineToRelative(-34.33f)
                curveToRelative(-6.01f, 0.0f, -11.05f, -4.64f, -11.44f, -10.63f)
                curveToRelative(-5.21f, -80.05f, -69.24f, -143.92f, -149.12f, -149.12f)
                curveToRelative(-6.0f, -0.39f, -10.63f, -5.43f, -10.63f, -11.44f)
                verticalLineToRelative(-34.33f)
                curveToRelative(0.0f, -6.53f, 5.47f, -11.78f, 11.99f, -11.43f)
                curveToRelative(110.55f, 5.97f, 199.0f, 94.54f, 204.96f, 204.96f)
                curveToRelative(0.35f, 6.53f, -4.89f, 11.99f, -11.43f, 11.99f)
                close()
                moveTo(372.56f, 416.0f)
                horizontalLineToRelative(-34.33f)
                curveToRelative(-6.16f, 0.0f, -11.18f, -4.88f, -11.43f, -11.04f)
                curveToRelative(-5.6f, -136.54f, -115.2f, -246.16f, -251.76f, -251.76f)
                curveTo(68.88f, 152.95f, 64.0f, 147.93f, 64.0f, 141.77f)
                lineTo(64.0f, 107.44f)
                curveToRelative(0.0f, -6.45f, 5.34f, -11.66f, 11.79f, -11.43f)
                curveToRelative(167.83f, 6.03f, 302.21f, 141.19f, 308.2f, 308.2f)
                curveToRelative(0.23f, 6.45f, -4.98f, 11.79f, -11.43f, 11.79f)
                close()
            }
        }
        .build()
        return _rssSquare!!
    }

private var _rssSquare: ImageVector? = null
