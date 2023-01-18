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

public val FillGroup.Cake: ImageVector
    get() {
        if (_cake != null) {
            return _cake!!
        }
        _cake = Builder(name = "Cake", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 80.0f)
                lineTo(136.0f, 80.0f)
                lineTo(136.0f, 69.4f)
                curveToRelative(11.5f, -5.1f, 18.2f, -12.5f, 20.1f, -22.0f)
                curveTo(160.2f, 26.0f, 136.0f, 4.3f, 133.2f, 2.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -10.3f, -0.1f)
                curveTo(120.0f, 4.2f, 95.1f, 25.7f, 99.1f, 47.2f)
                curveToRelative(1.8f, 9.7f, 8.9f, 17.2f, 20.9f, 22.3f)
                lineTo(120.0f, 80.0f)
                lineTo(50.0f, 80.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(13.3f)
                arcTo(43.3f, 43.3f, 0.0f, false, false, 30.9f, 156.0f)
                lineToRelative(1.1f, 1.0f)
                verticalLineToRelative(51.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 157.0f)
                lineToRelative(1.1f, -1.0f)
                arcTo(43.3f, 43.3f, 0.0f, false, false, 238.0f, 125.3f)
                lineTo(238.0f, 112.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 206.0f, 80.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 166.2f)
                arcTo(39.3f, 39.3f, 0.0f, false, false, 60.8f, 168.0f)
                arcTo(42.2f, 42.2f, 0.0f, false, false, 94.0f, 150.6f)
                arcToRelative(41.9f, 41.9f, 0.0f, false, false, 68.0f, 0.0f)
                arcTo(42.2f, 42.2f, 0.0f, false, false, 195.2f, 168.0f)
                horizontalLineToRelative(0.8f)
                arcToRelative(40.6f, 40.6f, 0.0f, false, false, 12.0f, -1.8f)
                close()
            }
        }
        .build()
        return _cake!!
    }

private var _cake: ImageVector? = null
