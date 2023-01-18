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

public val BoldGroup.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) {
            return _cloudMoon!!
        }
        _cloudMoon = Builder(name = "CloudMoon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 68.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(75.8f, 75.8f, 0.0f, false, false, 97.1f, 5.9f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 85.9f, 9.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -3.2f, 11.2f)
                arcTo(50.6f, 50.6f, 0.0f, false, true, 84.0f, 32.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 32.0f, 84.0f)
                arcToRelative(50.6f, 50.6f, 0.0f, false, true, -11.7f, -1.3f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 9.1f, 85.9f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 5.9f, 97.1f)
                arcToRelative(75.5f, 75.5f, 0.0f, false, false, 25.4f, 41.2f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 76.0f, 228.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, -160.0f)
                close()
                moveTo(107.9f, 36.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 23.5f, 35.9f)
                arcToRelative(80.4f, 80.4f, 0.0f, false, false, -48.9f, 44.5f)
                arcTo(46.3f, 46.3f, 0.0f, false, false, 76.0f, 116.0f)
                arcToRelative(55.3f, 55.3f, 0.0f, false, false, -26.0f, 6.4f)
                arcToRelative(50.5f, 50.5f, 0.0f, false, true, -13.9f, -14.5f)
                arcTo(76.1f, 76.1f, 0.0f, false, false, 107.9f, 36.0f)
                close()
                moveTo(156.0f, 204.0f)
                horizontalLineTo(76.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, -64.0f)
                horizontalLineToRelative(0.4f)
                arcToRelative(70.3f, 70.3f, 0.0f, false, false, -0.4f, 8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, 56.0f)
                close()
            }
        }
        .build()
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
