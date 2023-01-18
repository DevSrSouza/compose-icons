package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 172.0f, 76.0f)
                close()
                moveTo(208.9f, 162.0f)
                curveToRelative(-20.9f, 26.4f, -53.9f, 41.0f, -98.2f, 43.5f)
                lineTo(90.9f, 249.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 80.0f, 256.0f)
                horizontalLineToRelative(-0.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -10.7f, -8.5f)
                lineTo(54.4f, 201.6f)
                lineTo(8.5f, 187.4f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 0.0f, 176.7f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 7.0f, 165.0f)
                lineToRelative(43.5f, -19.7f)
                curveTo(52.9f, 101.0f, 67.6f, 68.0f, 94.0f, 47.1f)
                curveToRelative(42.5f, -33.4f, 102.3f, -23.8f, 119.6f, -20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 15.3f, 15.3f)
                curveTo(232.7f, 59.7f, 242.3f, 119.5f, 208.9f, 162.0f)
                close()
                moveTo(154.9f, 172.4f)
                arcTo(59.8f, 59.8f, 0.0f, false, true, 125.0f, 131.0f)
                arcToRelative(59.8f, 59.8f, 0.0f, false, true, -41.4f, -29.9f)
                quadToRelative(-8.7f, 21.9f, -9.4f, 52.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.1f, 10.6f)
                lineToRelative(-21.3f, 9.7f)
                lineToRelative(21.7f, 6.7f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, 8.0f, 8.0f)
                lineToRelative(6.7f, 21.7f)
                lineToRelative(9.7f, -21.4f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 10.6f, -7.0f)
                quadTo(133.0f, 181.1f, 154.9f, 172.4f)
                close()
                moveTo(206.0f, 50.0f)
                curveToRelative(-17.3f, -3.4f, -64.6f, -9.6f, -97.1f, 16.0f)
                arcToRelative(68.4f, 68.4f, 0.0f, false, false, -8.8f, 8.2f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 136.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 33.8f, 35.9f)
                arcToRelative(68.4f, 68.4f, 0.0f, false, false, 8.2f, -8.8f)
                curveTo(215.6f, 114.6f, 209.4f, 67.4f, 206.0f, 50.0f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
