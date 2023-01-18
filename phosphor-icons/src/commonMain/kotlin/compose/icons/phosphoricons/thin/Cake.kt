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

public val ThinGroup.Cake: ImageVector
    get() {
        if (_cake != null) {
            return _cake!!
        }
        _cake = Builder(name = "Cake", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 84.0f)
                lineTo(132.0f, 84.0f)
                lineTo(132.0f, 66.8f)
                curveToRelative(11.7f, -4.6f, 18.5f, -11.4f, 20.1f, -20.1f)
                curveTo(155.9f, 27.1f, 131.7f, 5.9f, 130.6f, 5.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -5.2f, -0.1f)
                curveToRelative(-1.0f, 0.9f, -26.0f, 22.0f, -22.4f, 41.6f)
                curveToRelative(1.7f, 8.8f, 8.8f, 15.7f, 21.0f, 20.3f)
                lineTo(124.0f, 84.0f)
                lineTo(50.0f, 84.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -28.0f, 28.0f)
                verticalLineToRelative(13.3f)
                arcToRelative(39.3f, 39.3f, 0.0f, false, false, 11.7f, 27.8f)
                arcToRelative(22.9f, 22.9f, 0.0f, false, false, 2.3f, 2.1f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 155.2f)
                arcToRelative(22.9f, 22.9f, 0.0f, false, false, 2.3f, -2.1f)
                arcTo(39.3f, 39.3f, 0.0f, false, false, 234.0f, 125.3f)
                lineTo(234.0f, 112.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 206.0f, 84.0f)
                close()
                moveTo(110.9f, 45.0f)
                curveToRelative(-2.1f, -10.9f, 9.9f, -24.8f, 17.1f, -31.6f)
                curveToRelative(6.9f, 6.8f, 18.4f, 20.8f, 16.3f, 31.7f)
                curveToRelative(-1.2f, 6.2f, -6.7f, 11.1f, -16.3f, 14.7f)
                curveTo(117.8f, 56.1f, 112.1f, 51.2f, 110.9f, 45.0f)
                close()
                moveTo(212.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 160.4f)
                arcToRelative(37.8f, 37.8f, 0.0f, false, false, 50.0f, -17.5f)
                arcToRelative(37.9f, 37.9f, 0.0f, false, false, 68.0f, 0.0f)
                arcTo(38.5f, 38.5f, 0.0f, false, false, 195.3f, 164.0f)
                horizontalLineToRelative(0.7f)
                arcToRelative(38.2f, 38.2f, 0.0f, false, false, 16.0f, -3.6f)
                close()
                moveTo(226.0f, 125.3f)
                arcToRelative(31.1f, 31.1f, 0.0f, false, true, -9.3f, 22.1f)
                arcToRelative(29.5f, 29.5f, 0.0f, false, true, -21.3f, 8.6f)
                arcTo(30.2f, 30.2f, 0.0f, false, true, 166.0f, 126.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -60.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                arcToRelative(30.2f, 30.2f, 0.0f, false, true, -29.4f, 30.0f)
                arcToRelative(29.5f, 29.5f, 0.0f, false, true, -21.3f, -8.6f)
                arcTo(31.1f, 31.1f, 0.0f, false, true, 30.0f, 125.3f)
                lineTo(30.0f, 112.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 50.0f, 92.0f)
                lineTo(206.0f, 92.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                close()
            }
        }
        .build()
        return _cake!!
    }

private var _cake: ImageVector? = null
