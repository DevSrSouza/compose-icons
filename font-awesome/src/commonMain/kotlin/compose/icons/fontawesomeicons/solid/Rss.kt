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

public val SolidGroup.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = Builder(name = "Rss", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.08f, 415.96f)
                curveToRelative(0.0f, 35.37f, -28.67f, 64.04f, -64.04f, 64.04f)
                reflectiveCurveTo(0.0f, 451.33f, 0.0f, 415.96f)
                reflectiveCurveToRelative(28.67f, -64.04f, 64.04f, -64.04f)
                reflectiveCurveToRelative(64.04f, 28.67f, 64.04f, 64.04f)
                close()
                moveTo(303.74f, 463.21f)
                curveToRelative(-8.35f, -154.6f, -132.18f, -278.59f, -286.95f, -286.95f)
                curveTo(7.66f, 175.76f, 0.0f, 183.1f, 0.0f, 192.25f)
                verticalLineToRelative(48.07f)
                curveToRelative(0.0f, 8.41f, 6.49f, 15.47f, 14.89f, 16.02f)
                curveToRelative(111.83f, 7.28f, 201.47f, 96.7f, 208.77f, 208.77f)
                curveToRelative(0.55f, 8.4f, 7.6f, 14.89f, 16.02f, 14.89f)
                horizontalLineToRelative(48.07f)
                curveToRelative(9.15f, 0.0f, 16.49f, -7.66f, 15.99f, -16.79f)
                close()
                moveTo(447.99f, 463.5f)
                curveTo(439.6f, 229.68f, 251.46f, 40.44f, 16.5f, 32.01f)
                curveTo(7.47f, 31.69f, 0.0f, 38.98f, 0.0f, 48.02f)
                verticalLineToRelative(48.07f)
                curveToRelative(0.0f, 8.63f, 6.84f, 15.65f, 15.45f, 16.0f)
                curveToRelative(191.18f, 7.84f, 344.63f, 161.32f, 352.46f, 352.46f)
                curveToRelative(0.35f, 8.62f, 7.37f, 15.45f, 16.0f, 15.45f)
                horizontalLineToRelative(48.07f)
                curveToRelative(9.03f, -0.0f, 16.33f, -7.47f, 16.0f, -16.5f)
                close()
            }
        }
        .build()
        return _rss!!
    }

private var _rss: ImageVector? = null
