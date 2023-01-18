package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Alien: ImageVector
    get() {
        if (_alien != null) {
            return _alien!!
        }
        _alien = Builder(name = "Alien", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 18.0f)
                arcToRelative(94.1f, 94.1f, 0.0f, false, false, -94.0f, 94.0f)
                curveToRelative(0.0f, 23.6f, 12.4f, 54.2f, 33.2f, 81.8f)
                curveTo(83.3f, 215.2f, 107.7f, 238.0f, 128.0f, 238.0f)
                reflectiveCurveToRelative(44.7f, -22.8f, 60.8f, -44.2f)
                curveTo(209.6f, 166.2f, 222.0f, 135.6f, 222.0f, 112.0f)
                arcTo(94.1f, 94.1f, 0.0f, false, false, 128.0f, 18.0f)
                close()
                moveTo(179.2f, 186.6f)
                curveTo(161.5f, 210.2f, 140.9f, 226.0f, 128.0f, 226.0f)
                reflectiveCurveToRelative(-33.5f, -15.8f, -51.2f, -39.4f)
                curveTo(57.8f, 161.4f, 46.0f, 132.8f, 46.0f, 112.0f)
                arcToRelative(82.0f, 82.0f, 0.0f, false, true, 164.0f, 0.0f)
                curveTo(210.0f, 132.8f, 198.2f, 161.4f, 179.2f, 186.6f)
                close()
                moveTo(118.0f, 140.0f)
                verticalLineToRelative(-4.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 80.0f, 98.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 118.0f, 140.0f)
                close()
                moveTo(106.0f, 140.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, -26.0f, -26.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, 26.0f, 26.0f)
                close()
                moveTo(176.0f, 98.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, 38.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f)
                verticalLineToRelative(-4.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 176.0f, 98.0f)
                close()
                moveTo(178.0f, 116.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, -26.0f, 26.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, 26.0f, -26.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(150.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(112.0f, 190.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 150.0f, 184.0f)
                close()
            }
        }
        .build()
        return _alien!!
    }

private var _alien: ImageVector? = null
