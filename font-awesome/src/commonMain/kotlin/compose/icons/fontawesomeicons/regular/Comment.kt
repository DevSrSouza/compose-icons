package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Comment: ImageVector
    get() {
        if (_comment != null) {
            return _comment!!
        }
        _comment = Builder(name = "Comment", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveTo(114.6f, 32.0f, 0.027f, 125.1f, 0.027f, 240.0f)
                curveToRelative(0.0f, 47.63f, 19.91f, 91.25f, 52.91f, 126.2f)
                curveToRelative(-14.88f, 39.5f, -45.87f, 72.88f, -46.37f, 73.25f)
                curveToRelative(-6.625f, 7.0f, -8.375f, 17.25f, -4.625f, 26.0f)
                curveTo(5.818f, 474.2f, 14.38f, 480.0f, 24.0f, 480.0f)
                curveToRelative(61.5f, 0.0f, 109.1f, -25.75f, 139.1f, -46.25f)
                curveTo(191.1f, 442.8f, 223.3f, 448.0f, 256.0f, 448.0f)
                curveToRelative(141.4f, 0.0f, 255.1f, -93.13f, 255.1f, -208.0f)
                reflectiveCurveTo(397.4f, 32.0f, 256.0f, 32.0f)
                close()
                moveTo(256.1f, 400.0f)
                curveToRelative(-26.75f, 0.0f, -53.12f, -4.125f, -78.38f, -12.12f)
                lineToRelative(-22.75f, -7.125f)
                lineToRelative(-19.5f, 13.75f)
                curveToRelative(-14.25f, 10.12f, -33.88f, 21.38f, -57.5f, 29.0f)
                curveToRelative(7.375f, -12.12f, 14.37f, -25.75f, 19.88f, -40.25f)
                lineToRelative(10.62f, -28.0f)
                lineToRelative(-20.62f, -21.87f)
                curveTo(69.82f, 314.1f, 48.07f, 282.2f, 48.07f, 240.0f)
                curveToRelative(0.0f, -88.25f, 93.25f, -160.0f, 208.0f, -160.0f)
                reflectiveCurveToRelative(208.0f, 71.75f, 208.0f, 160.0f)
                reflectiveCurveTo(370.8f, 400.0f, 256.1f, 400.0f)
                close()
            }
        }
        .build()
        return _comment!!
    }

private var _comment: ImageVector? = null
