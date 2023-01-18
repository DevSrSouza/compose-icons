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

public val ThinGroup.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 164.0f, 76.0f)
                close()
                moveTo(202.6f, 157.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -13.8f, 14.1f)
                horizontalLineToRelative(-0.1f)
                curveToRelative(-20.1f, 16.4f, -47.9f, 25.3f, -83.2f, 26.5f)
                lineTo(83.7f, 249.6f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 80.0f, 252.0f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.6f, -2.9f)
                lineTo(60.8f, 195.2f)
                lineTo(6.9f, 179.8f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 4.0f, 176.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.4f, -3.9f)
                lineToRelative(51.9f, -21.8f)
                curveToRelative(1.2f, -35.3f, 10.1f, -63.1f, 26.5f, -83.2f)
                lineTo(85.0f, 67.3f)
                arcTo(91.4f, 91.4f, 0.0f, false, true, 99.0f, 53.4f)
                curveToRelative(39.7f, -31.2f, 96.5f, -22.1f, 112.9f, -18.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.2f, 9.2f)
                curveTo(224.7f, 60.5f, 233.8f, 117.3f, 202.6f, 157.0f)
                close()
                moveTo(175.0f, 171.2f)
                arcToRelative(52.2f, 52.2f, 0.0f, false, true, -42.9f, -47.3f)
                arcTo(52.2f, 52.2f, 0.0f, false, true, 84.8f, 81.0f)
                quadToRelative(-17.5f, 27.6f, -18.6f, 72.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -2.5f, 3.6f)
                lineTo(20.0f, 175.2f)
                lineToRelative(45.1f, 13.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, 2.7f, 2.7f)
                lineTo(80.7f, 236.0f)
                lineToRelative(18.4f, -43.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.6f, -2.4f)
                curveTo(132.4f, 189.1f, 156.6f, 182.9f, 175.0f, 171.2f)
                close()
                moveTo(213.3f, 45.8f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -3.1f, -3.1f)
                curveToRelative(-15.6f, -3.3f, -69.3f, -12.1f, -106.3f, 17.0f)
                arcTo(86.2f, 86.2f, 0.0f, false, false, 92.0f, 71.2f)
                lineTo(92.0f, 72.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 44.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 44.0f, 44.0f)
                horizontalLineToRelative(0.8f)
                arcToRelative(86.2f, 86.2f, 0.0f, false, false, 11.5f, -11.9f)
                curveTo(225.4f, 115.1f, 216.6f, 61.4f, 213.3f, 45.8f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
