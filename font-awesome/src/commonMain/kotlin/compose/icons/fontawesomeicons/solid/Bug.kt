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
                moveTo(511.99f, 288.9f)
                curveToRelative(-0.48f, 17.43f, -15.22f, 31.1f, -32.65f, 31.1f)
                horizontalLineTo(424.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 21.86f, -4.88f, 42.58f, -13.6f, 61.15f)
                lineToRelative(60.23f, 60.23f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.76f, 0.0f, 45.26f)
                curveToRelative(-12.5f, 12.5f, -32.76f, 12.5f, -45.26f, 0.0f)
                lineToRelative(-54.74f, -54.74f)
                curveTo(345.89f, 467.96f, 314.35f, 480.0f, 280.0f, 480.0f)
                verticalLineTo(236.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-24.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(244.0f)
                curveToRelative(-34.35f, 0.0f, -65.89f, -12.03f, -90.64f, -32.11f)
                lineToRelative(-54.74f, 54.74f)
                curveToRelative(-12.5f, 12.5f, -32.76f, 12.5f, -45.26f, 0.0f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.76f, 0.0f, -45.26f)
                lineToRelative(60.23f, -60.23f)
                curveTo(92.88f, 378.58f, 88.0f, 357.86f, 88.0f, 336.0f)
                verticalLineToRelative(-16.0f)
                horizontalLineTo(32.67f)
                curveTo(15.23f, 320.0f, 0.49f, 306.33f, 0.01f, 288.9f)
                curveTo(-0.48f, 270.82f, 14.03f, 256.0f, 32.0f, 256.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(-58.74f)
                lineToRelative(-46.63f, -46.63f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.76f, 0.0f, -45.26f)
                curveToRelative(12.5f, -12.5f, 32.76f, -12.5f, 45.26f, 0.0f)
                lineTo(141.26f, 160.0f)
                horizontalLineToRelative(229.49f)
                lineToRelative(54.63f, -54.63f)
                curveToRelative(12.5f, -12.5f, 32.76f, -12.5f, 45.26f, 0.0f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.76f, 0.0f, 45.26f)
                lineTo(424.0f, 197.26f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(17.97f, 0.0f, 32.48f, 14.82f, 31.99f, 32.9f)
                close()
                moveTo(257.0f, 0.0f)
                curveToRelative(-61.86f, 0.0f, -112.0f, 50.14f, -112.0f, 112.0f)
                horizontalLineToRelative(224.0f)
                curveTo(369.0f, 50.14f, 318.86f, 0.0f, 257.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bug!!
    }

private var _bug: ImageVector? = null
