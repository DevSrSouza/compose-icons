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

public val ThinGroup.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) {
            return _cloudArrowDown!!
        }
        _cloudArrowDown = Builder(name = "CloudArrowDown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.8f, 171.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.0f, 5.7f)
                lineToRelative(-34.0f, 33.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineToRelative(-34.0f, -33.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.7f, -5.7f)
                lineTo(148.0f, 198.3f)
                verticalLineTo(128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(70.3f)
                lineToRelative(27.1f, -27.1f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 188.8f, 171.2f)
                close()
                moveTo(160.0f, 44.0f)
                arcTo(84.2f, 84.2f, 0.0f, false, false, 83.6f, 93.1f)
                arcTo(64.2f, 64.2f, 0.0f, false, false, 72.0f, 92.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 0.0f, 120.0f)
                horizontalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(72.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 0.0f, -104.0f)
                arcToRelative(62.3f, 62.3f, 0.0f, false, true, 8.6f, 0.7f)
                arcTo(82.8f, 82.8f, 0.0f, false, false, 76.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 136.8f, 45.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.8f, 5.6f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.4f, 0.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.2f, -1.6f)
                arcTo(83.2f, 83.2f, 0.0f, false, false, 244.0f, 128.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, false, 160.0f, 44.0f)
                close()
            }
        }
        .build()
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
