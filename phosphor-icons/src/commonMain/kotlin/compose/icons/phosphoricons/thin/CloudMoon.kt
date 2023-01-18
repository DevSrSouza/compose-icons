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

public val ThinGroup.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) {
            return _cloudMoon!!
        }
        _cloudMoon = Builder(name = "CloudMoon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 76.0f)
                arcToRelative(70.1f, 70.1f, 0.0f, false, false, -16.0f, 1.8f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 87.3f, 13.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -3.8f, 1.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -1.0f, 3.7f)
                arcTo(60.7f, 60.7f, 0.0f, false, true, 84.0f, 32.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 24.0f, 92.0f)
                arcToRelative(60.7f, 60.7f, 0.0f, false, true, -13.5f, -1.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.7f, 1.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -1.1f, 3.7f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, 34.5f, 44.8f)
                arcTo(47.9f, 47.9f, 0.0f, false, false, 76.0f, 220.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 0.0f, -144.0f)
                close()
                moveTo(15.2f, 99.4f)
                arcToRelative(65.1f, 65.1f, 0.0f, false, false, 8.8f, 0.6f)
                arcTo(68.1f, 68.1f, 0.0f, false, false, 92.0f, 32.0f)
                arcToRelative(65.1f, 65.1f, 0.0f, false, false, -0.6f, -8.8f)
                arcTo(59.6f, 59.6f, 0.0f, false, true, 132.0f, 80.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(72.4f, 72.4f, 0.0f, false, false, -44.4f, 45.3f)
                arcTo(50.4f, 50.4f, 0.0f, false, false, 76.0f, 124.0f)
                arcToRelative(47.3f, 47.3f, 0.0f, false, false, -29.6f, 10.3f)
                arcTo(60.3f, 60.3f, 0.0f, false, true, 15.2f, 99.4f)
                close()
                moveTo(156.0f, 212.0f)
                horizontalLineTo(76.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, -80.0f)
                arcToRelative(43.3f, 43.3f, 0.0f, false, true, 9.5f, 1.1f)
                arcTo(73.1f, 73.1f, 0.0f, false, false, 84.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
