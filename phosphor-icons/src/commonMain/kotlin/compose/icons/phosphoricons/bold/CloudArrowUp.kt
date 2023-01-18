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

public val BoldGroup.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) {
            return _cloudArrowUp!!
        }
        _cloudArrowUp = Builder(name = "CloudArrowUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 128.0f)
                arcToRelative(91.4f, 91.4f, 0.0f, false, true, -18.4f, 55.2f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 224.0f, 188.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -7.2f, -2.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.4f, -16.8f)
                arcTo(67.2f, 67.2f, 0.0f, false, false, 228.0f, 128.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -136.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcToRelative(94.3f, 94.3f, 0.0f, false, true, 2.2f, -20.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 72.0f, 196.0f)
                lineTo(96.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(72.0f, 220.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 72.0f, 84.0f)
                arcToRelative(53.7f, 53.7f, 0.0f, false, true, 7.0f, 0.4f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 252.0f, 128.0f)
                close()
                moveTo(160.5f, 119.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-33.9f, 34.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.9f, 16.9f)
                lineTo(140.0f, 157.0f)
                verticalLineToRelative(51.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(164.0f, 157.0f)
                lineToRelative(13.5f, 13.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.9f, 0.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 0.0f, -16.9f)
                close()
            }
        }
        .build()
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
