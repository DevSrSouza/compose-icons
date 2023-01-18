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

public val BoldGroup.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) {
            return _cloudArrowDown!!
        }
        _cloudArrowDown = Builder(name = "CloudArrowDown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(194.4f, 165.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 0.0f, 16.9f)
                lineToRelative(-33.9f, 34.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-33.9f, -34.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.9f, -16.9f)
                lineTo(140.0f, 179.0f)
                verticalLineTo(128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(51.0f)
                lineToRelative(13.5f, -13.4f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 194.4f, 165.6f)
                close()
                moveTo(160.0f, 36.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, false, 79.0f, 84.4f)
                arcToRelative(53.7f, 53.7f, 0.0f, false, false, -7.0f, -0.4f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 0.0f, 136.0f)
                horizontalLineTo(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(72.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -1.8f, -88.0f)
                arcTo(94.3f, 94.3f, 0.0f, false, false, 68.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 136.0f, 0.0f)
                arcToRelative(67.2f, 67.2f, 0.0f, false, true, -13.6f, 40.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.4f, 16.8f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 224.0f, 188.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 9.6f, -4.8f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 160.0f, 36.0f)
                close()
            }
        }
        .build()
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
