package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 76.0f)
                close()
                moveTo(205.7f, 159.5f)
                curveToRelative(-20.4f, 25.9f, -53.2f, 40.1f, -97.5f, 42.1f)
                lineTo(87.4f, 251.1f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 80.0f, 256.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -7.2f, -5.8f)
                lineTo(57.5f, 198.5f)
                lineTo(5.8f, 183.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.9f, -15.1f)
                lineToRelative(49.5f, -20.8f)
                curveToRelative(2.0f, -44.3f, 16.1f, -77.1f, 42.1f, -97.5f)
                curveToRelative(41.1f, -32.4f, 99.4f, -23.0f, 116.3f, -19.3f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 225.0f, 43.2f)
                curveTo(228.7f, 60.1f, 238.1f, 118.4f, 205.7f, 159.5f)
                close()
                moveTo(209.4f, 46.6f)
                curveToRelative(-15.2f, -3.2f, -67.4f, -11.8f, -103.0f, 16.3f)
                arcTo(74.1f, 74.1f, 0.0f, false, false, 96.0f, 72.7f)
                arcTo(40.1f, 40.1f, 0.0f, false, false, 136.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, false, 39.3f, 40.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 9.8f, -10.4f)
                curveTo(221.2f, 114.0f, 212.6f, 61.8f, 209.4f, 46.6f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
