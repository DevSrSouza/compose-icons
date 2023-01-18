package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 76.0f)
                lineTo(169.8f, 76.0f)
                arcToRelative(25.4f, 25.4f, 0.0f, false, false, 6.3f, -4.5f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -39.6f, -39.6f)
                curveToRelative(-3.6f, 3.6f, -6.4f, 9.2f, -8.5f, 16.7f)
                curveToRelative(-2.1f, -7.5f, -4.9f, -13.1f, -8.5f, -16.7f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 79.9f, 71.5f)
                arcTo(25.4f, 25.4f, 0.0f, false, false, 86.2f, 76.0f)
                lineTo(40.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 88.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 132.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 76.0f)
                close()
                moveTo(142.1f, 37.6f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, true, 14.2f, -5.9f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 14.1f, 34.2f)
                curveToRelative(-7.2f, 7.2f, -27.3f, 9.5f, -38.3f, 10.0f)
                curveTo(132.6f, 64.9f, 134.9f, 44.8f, 142.1f, 37.6f)
                close()
                moveTo(85.6f, 37.6f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 28.3f, 0.0f)
                curveToRelative(7.2f, 7.2f, 9.5f, 27.3f, 10.0f, 38.3f)
                curveToRelative(-11.0f, -0.5f, -31.1f, -2.8f, -38.3f, -10.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 85.6f, 37.6f)
                close()
                moveTo(36.0f, 120.0f)
                lineTo(36.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(84.0f)
                verticalLineToRelative(40.0f)
                lineTo(40.0f, 124.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 120.0f)
                close()
                moveTo(52.0f, 200.0f)
                lineTo(52.0f, 132.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(72.0f)
                lineTo(56.0f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 52.0f, 200.0f)
                close()
                moveTo(204.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(132.0f, 204.0f)
                lineTo(132.0f, 132.0f)
                horizontalLineToRelative(72.0f)
                close()
                moveTo(220.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(132.0f, 124.0f)
                lineTo(132.0f, 84.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
