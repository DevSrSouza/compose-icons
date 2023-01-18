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

public val LightGroup.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.0f, 76.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 166.0f, 76.0f)
                close()
                moveTo(204.1f, 158.3f)
                curveToRelative(-20.2f, 25.7f, -52.9f, 39.6f, -97.3f, 41.4f)
                lineTo(85.5f, 250.3f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 80.0f, 254.0f)
                horizontalLineToRelative(-0.4f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -5.4f, -4.4f)
                lineTo(59.1f, 196.9f)
                lineTo(6.3f, 181.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 2.0f, 176.3f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 3.7f, -5.9f)
                lineToRelative(50.6f, -21.3f)
                curveToRelative(1.8f, -44.3f, 15.7f, -77.0f, 41.4f, -97.2f)
                curveTo(138.2f, 20.0f, 195.7f, 29.3f, 212.3f, 33.0f)
                arcTo(13.7f, 13.7f, 0.0f, false, true, 223.0f, 43.7f)
                curveTo(226.7f, 60.3f, 236.0f, 117.8f, 204.1f, 158.3f)
                close()
                moveTo(169.6f, 172.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, true, -39.3f, -46.3f)
                arcTo(54.2f, 54.2f, 0.0f, false, true, 83.9f, 86.3f)
                curveToRelative(-9.8f, 17.5f, -15.1f, 39.9f, -15.7f, 67.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.7f, 5.4f)
                lineTo(26.0f, 174.9f)
                lineToRelative(39.7f, 11.3f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, 4.1f, 4.2f)
                lineTo(81.1f, 230.0f)
                lineToRelative(16.2f, -38.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.4f, -3.7f)
                curveTo(129.8f, 187.2f, 152.2f, 181.9f, 169.6f, 172.0f)
                close()
                moveTo(211.3f, 46.2f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -1.5f, -1.5f)
                curveToRelative(-15.4f, -3.3f, -68.3f, -12.0f, -104.6f, 16.6f)
                arcTo(75.5f, 75.5f, 0.0f, false, false, 94.0f, 72.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 42.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 42.0f, 42.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(81.0f, 81.0f, 0.0f, false, false, 10.7f, -11.2f)
                curveTo(223.3f, 114.5f, 214.6f, 61.6f, 211.3f, 46.2f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
