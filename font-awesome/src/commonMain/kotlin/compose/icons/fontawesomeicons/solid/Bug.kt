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

public val SolidGroup.Bug: ImageVector
    get() {
        if (_bug != null) {
            return _bug!!
        }
        _bug = Builder(name = "Bug", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(511.988f, 288.9f)
                curveToRelative(-0.478f, 17.43f, -15.217f, 31.1f, -32.653f, 31.1f)
                horizontalLineTo(424.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 21.864f, -4.882f, 42.584f, -13.6f, 61.145f)
                lineToRelative(60.228f, 60.228f)
                curveToRelative(12.496f, 12.497f, 12.496f, 32.758f, 0.0f, 45.255f)
                curveToRelative(-12.498f, 12.497f, -32.759f, 12.496f, -45.256f, 0.0f)
                lineToRelative(-54.736f, -54.736f)
                curveTo(345.886f, 467.965f, 314.351f, 480.0f, 280.0f, 480.0f)
                verticalLineTo(236.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-24.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(244.0f)
                curveToRelative(-34.351f, 0.0f, -65.886f, -12.035f, -90.636f, -32.108f)
                lineToRelative(-54.736f, 54.736f)
                curveToRelative(-12.498f, 12.497f, -32.759f, 12.496f, -45.256f, 0.0f)
                curveToRelative(-12.496f, -12.497f, -12.496f, -32.758f, 0.0f, -45.255f)
                lineToRelative(60.228f, -60.228f)
                curveTo(92.882f, 378.584f, 88.0f, 357.864f, 88.0f, 336.0f)
                verticalLineToRelative(-16.0f)
                horizontalLineTo(32.666f)
                curveTo(15.23f, 320.0f, 0.491f, 306.33f, 0.013f, 288.9f)
                curveTo(-0.484f, 270.816f, 14.028f, 256.0f, 32.0f, 256.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(-58.745f)
                lineToRelative(-46.628f, -46.628f)
                curveToRelative(-12.496f, -12.497f, -12.496f, -32.758f, 0.0f, -45.255f)
                curveToRelative(12.498f, -12.497f, 32.758f, -12.497f, 45.256f, 0.0f)
                lineTo(141.255f, 160.0f)
                horizontalLineToRelative(229.489f)
                lineToRelative(54.627f, -54.627f)
                curveToRelative(12.498f, -12.497f, 32.758f, -12.497f, 45.256f, 0.0f)
                curveToRelative(12.496f, 12.497f, 12.496f, 32.758f, 0.0f, 45.255f)
                lineTo(424.0f, 197.255f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(17.972f, 0.0f, 32.484f, 14.816f, 31.988f, 32.9f)
                close()
                moveTo(257.0f, 0.0f)
                curveToRelative(-61.856f, 0.0f, -112.0f, 50.144f, -112.0f, 112.0f)
                horizontalLineToRelative(224.0f)
                curveTo(369.0f, 50.144f, 318.856f, 0.0f, 257.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bug!!
    }

private var _bug: ImageVector? = null
