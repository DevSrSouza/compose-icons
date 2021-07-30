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

public val SolidGroup.Blog: ImageVector
    get() {
        if (_blog != null) {
            return _blog!!
        }
        _blog = Builder(name = "Blog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.2f, 226.8f)
                curveToRelative(-14.6f, -2.9f, -28.2f, 8.9f, -28.2f, 23.8f)
                lineTo(144.0f, 301.0f)
                curveToRelative(0.0f, 10.2f, 7.1f, 18.4f, 16.7f, 22.0f)
                curveToRelative(18.2f, 6.8f, 31.3f, 24.4f, 31.3f, 45.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                reflectiveCurveToRelative(-48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(96.0f, 120.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(24.0f, 96.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineToRelative(248.0f)
                curveToRelative(0.0f, 89.5f, 82.1f, 160.2f, 175.0f, 140.7f)
                curveToRelative(54.4f, -11.4f, 98.3f, -55.4f, 109.7f, -109.7f)
                curveToRelative(17.4f, -82.9f, -37.0f, -157.2f, -112.5f, -172.2f)
                close()
                moveTo(209.0f, 0.0f)
                curveToRelative(-9.2f, -0.5f, -17.0f, 6.8f, -17.0f, 16.0f)
                verticalLineToRelative(31.6f)
                curveToRelative(0.0f, 8.5f, 6.6f, 15.5f, 15.0f, 15.9f)
                curveToRelative(129.4f, 7.0f, 233.4f, 112.0f, 240.9f, 241.5f)
                curveToRelative(0.5f, 8.4f, 7.5f, 15.0f, 15.9f, 15.0f)
                horizontalLineToRelative(32.1f)
                curveToRelative(9.2f, 0.0f, 16.5f, -7.8f, 16.0f, -17.0f)
                curveTo(503.4f, 139.8f, 372.2f, 8.6f, 209.0f, 0.0f)
                close()
                moveTo(209.3f, 96.0f)
                curveToRelative(-9.3f, -0.7f, -17.3f, 6.7f, -17.3f, 16.1f)
                verticalLineToRelative(32.1f)
                curveToRelative(0.0f, 8.4f, 6.5f, 15.3f, 14.8f, 15.9f)
                curveToRelative(76.8f, 6.3f, 138.0f, 68.2f, 144.9f, 145.2f)
                curveToRelative(0.8f, 8.3f, 7.6f, 14.7f, 15.9f, 14.7f)
                horizontalLineToRelative(32.2f)
                curveToRelative(9.3f, 0.0f, 16.8f, -8.0f, 16.1f, -17.3f)
                curveToRelative(-8.4f, -110.1f, -96.5f, -198.2f, -206.6f, -206.7f)
                close()
            }
        }
        .build()
        return _blog!!
    }

private var _blog: ImageVector? = null
