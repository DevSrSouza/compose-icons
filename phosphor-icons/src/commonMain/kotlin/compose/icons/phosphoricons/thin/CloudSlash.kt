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

public val ThinGroup.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) {
            return _cloudSlash!!
        }
        _cloudSlash = Builder(name = "CloudSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.0f, 5.4f)
                lineTo(86.2f, 87.9f)
                curveToRelative(-1.0f, 1.7f, -1.8f, 3.5f, -2.6f, 5.2f)
                arcTo(64.2f, 64.2f, 0.0f, false, false, 72.0f, 92.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 0.0f, 120.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, false, 32.9f, -6.7f)
                lineTo(205.0f, 218.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 5.7f, 0.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.3f, -5.7f)
                close()
                moveTo(160.0f, 204.0f)
                lineTo(72.0f, 204.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 0.0f, -104.0f)
                arcToRelative(59.7f, 59.7f, 0.0f, false, true, 8.5f, 0.7f)
                arcTo(87.3f, 87.3f, 0.0f, false, false, 76.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(75.9f, 75.9f, 0.0f, false, true, 7.9f, -33.8f)
                lineTo(187.1f, 199.0f)
                arcTo(75.3f, 75.3f, 0.0f, false, true, 160.0f, 204.0f)
                close()
                moveTo(244.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, -21.3f, 55.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.0f, 1.4f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -2.7f, -1.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -0.3f, -5.7f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 115.0f, 66.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, -0.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.9f, -5.6f)
                arcTo(83.1f, 83.1f, 0.0f, false, true, 160.0f, 44.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 244.0f, 128.0f)
                close()
            }
        }
        .build()
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
