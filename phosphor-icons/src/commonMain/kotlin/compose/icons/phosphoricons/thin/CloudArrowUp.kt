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

public val ThinGroup.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) {
            return _cloudArrowUp!!
        }
        _cloudArrowUp = Builder(name = "CloudArrowUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 128.0f)
                arcToRelative(83.2f, 83.2f, 0.0f, false, true, -16.8f, 50.4f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 224.0f, 180.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -2.4f, -0.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.8f, -5.6f)
                arcTo(76.0f, 76.0f, 0.0f, true, false, 84.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcToRelative(82.8f, 82.8f, 0.0f, false, true, 4.6f, -27.3f)
                arcTo(62.3f, 62.3f, 0.0f, false, false, 72.0f, 100.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, 104.0f)
                lineTo(96.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(72.0f, 212.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 72.0f, 92.0f)
                arcToRelative(64.2f, 64.2f, 0.0f, false, true, 11.6f, 1.1f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 244.0f, 128.0f)
                close()
                moveTo(154.8f, 125.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -5.6f, 0.0f)
                lineToRelative(-34.0f, 33.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.7f, 5.7f)
                lineTo(148.0f, 137.7f)
                lineTo(148.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(156.0f, 137.7f)
                lineToRelative(27.1f, 27.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.8f, 1.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.9f, -1.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.0f, -5.7f)
                close()
            }
        }
        .build()
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
