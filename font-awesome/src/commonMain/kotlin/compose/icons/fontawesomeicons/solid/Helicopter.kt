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

public val SolidGroup.Helicopter: ImageVector
    get() {
        if (_helicopter != null) {
            return _helicopter!!
        }
        _helicopter = Builder(name = "Helicopter", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.0f, 384.0f)
                horizontalLineToRelative(272.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                curveToRelative(0.0f, -123.71f, -100.29f, -224.0f, -224.0f, -224.0f)
                lineTo(384.0f, 64.0f)
                horizontalLineToRelative(176.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(576.0f, 16.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                lineTo(144.0f, 0.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(176.0f)
                verticalLineToRelative(64.0f)
                lineTo(112.0f, 128.0f)
                lineTo(68.8f, 70.4f)
                curveTo(65.78f, 66.37f, 61.03f, 64.0f, 56.0f, 64.0f)
                lineTo(16.01f, 64.0f)
                curveTo(5.6f, 64.0f, -2.04f, 73.78f, 0.49f, 83.88f)
                lineTo(32.0f, 192.0f)
                lineToRelative(160.0f, 64.0f)
                lineToRelative(86.4f, 115.2f)
                arcTo(31.992f, 31.992f, 0.0f, false, false, 304.0f, 384.0f)
                close()
                moveTo(416.0f, 195.51f)
                curveTo(478.55f, 208.3f, 528.03f, 257.44f, 540.79f, 320.0f)
                lineTo(416.0f, 320.0f)
                lineTo(416.0f, 195.51f)
                close()
                moveTo(635.37f, 458.81f)
                lineToRelative(-22.15f, -22.2f)
                curveToRelative(-6.25f, -6.26f, -16.24f, -6.1f, -22.64f, 0.01f)
                curveToRelative(-7.09f, 6.77f, -13.84f, 11.25f, -24.64f, 11.25f)
                lineTo(240.0f, 447.87f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.18f, -16.0f, 16.03f)
                verticalLineToRelative(32.06f)
                curveToRelative(0.0f, 8.85f, 7.16f, 16.03f, 16.0f, 16.03f)
                horizontalLineToRelative(325.94f)
                curveToRelative(14.88f, 0.0f, 35.3f, -0.47f, 68.45f, -29.52f)
                curveToRelative(7.02f, -6.14f, 7.57f, -17.05f, 0.98f, -23.66f)
                close()
            }
        }
        .build()
        return _helicopter!!
    }

private var _helicopter: ImageVector? = null
