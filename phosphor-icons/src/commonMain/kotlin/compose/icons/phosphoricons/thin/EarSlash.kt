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

public val ThinGroup.EarSlash: ImageVector
    get() {
        if (_earSlash != null) {
            return _earSlash!!
        }
        _earSlash = Builder(name = "EarSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(169.8f, 168.1f)
                horizontalLineToRelative(0.0f)
                lineTo(94.4f, 85.0f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-28.0f, -30.8f)
                horizontalLineToRelative(0.0f)
                lineTo(51.0f, 37.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.0f, 5.4f)
                lineTo(58.2f, 57.2f)
                arcTo(83.7f, 83.7f, 0.0f, false, false, 44.0f, 104.0f)
                curveToRelative(0.0f, 31.8f, 11.3f, 42.7f, 21.2f, 52.3f)
                curveToRelative(8.0f, 7.6f, 14.8f, 14.2f, 14.8f, 31.7f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 85.0f, 30.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -0.5f, -5.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 0.6f)
                arcTo(40.1f, 40.1f, 0.0f, false, true, 88.0f, 188.0f)
                curveToRelative(0.0f, -20.9f, -8.7f, -29.3f, -17.2f, -37.5f)
                reflectiveCurveTo(52.0f, 132.4f, 52.0f, 104.0f)
                arcTo(75.7f, 75.7f, 0.0f, false, true, 63.8f, 63.3f)
                lineToRelative(23.0f, 25.3f)
                arcTo(42.4f, 42.4f, 0.0f, false, false, 84.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(39.5f, 39.5f, 0.0f, false, true, 1.0f, -8.5f)
                lineToRelative(44.1f, 48.4f)
                arcTo(26.9f, 26.9f, 0.0f, false, false, 136.0f, 152.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, 24.0f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, false, 5.6f, -0.7f)
                lineTo(205.0f, 218.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 5.7f, 0.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.3f, -5.7f)
                close()
                moveTo(144.0f, 152.0f)
                verticalLineToRelative(-0.4f)
                lineToRelative(14.9f, 16.3f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 144.0f, 152.0f)
                close()
                moveTo(83.5f, 37.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.4f, -5.5f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 212.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcTo(76.1f, 76.1f, 0.0f, false, false, 89.0f, 38.7f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 83.5f, 37.4f)
                close()
                moveTo(159.9f, 116.6f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 164.0f, 104.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -36.0f)
                arcToRelative(38.7f, 38.7f, 0.0f, false, false, -11.7f, 1.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -2.6f, -7.5f)
                arcTo(43.4f, 43.4f, 0.0f, false, true, 128.0f, 60.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 44.0f, 44.0f)
                arcToRelative(28.2f, 28.2f, 0.0f, false, true, -5.7f, 17.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.2f, 1.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.4f, -0.8f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 159.9f, 116.6f)
                close()
            }
        }
        .build()
        return _earSlash!!
    }

private var _earSlash: ImageVector? = null
