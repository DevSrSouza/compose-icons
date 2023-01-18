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

public val ThinGroup.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) {
            return _cloudLightning!!
        }
        _cloudLightning = Builder(name = "CloudLightning", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 164.0f)
                arcTo(72.0f, 72.0f, 0.0f, true, false, 87.6f, 69.4f)
                arcTo(50.4f, 50.4f, 0.0f, false, false, 76.0f, 68.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, 96.0f)
                horizontalLineToRelative(46.8f)
                lineToRelative(-22.1f, 33.8f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -0.2f, 4.1f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 104.0f, 204.0f)
                horizontalLineToRelative(42.8f)
                lineToRelative(-22.1f, 33.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.1f, 5.5f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 2.2f, 0.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 3.3f, -1.8f)
                lineToRelative(26.3f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.2f, -4.1f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -3.6f, -2.1f)
                horizontalLineTo(111.4f)
                lineToRelative(21.0f, -32.0f)
                close()
                moveTo(36.0f, 116.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 76.0f, 76.0f)
                arcToRelative(43.3f, 43.3f, 0.0f, false, true, 9.5f, 1.1f)
                arcTo(73.1f, 73.1f, 0.0f, false, false, 84.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, 64.0f)
                horizontalLineTo(76.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 36.0f, 116.0f)
                close()
            }
        }
        .build()
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
