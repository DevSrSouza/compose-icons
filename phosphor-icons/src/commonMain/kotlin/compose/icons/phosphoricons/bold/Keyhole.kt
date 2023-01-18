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

public val BoldGroup.Keyhole: ImageVector
    get() {
        if (_keyhole != null) {
            return _keyhole!!
        }
        _keyhole = Builder(name = "Keyhole", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(159.9f, 132.1f)
                arcToRelative(39.7f, 39.7f, 0.0f, false, false, 8.0f, -27.4f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -71.8f, 27.4f)
                lineToRelative(-8.7f, 30.4f)
                arcTo(19.6f, 19.6f, 0.0f, false, false, 90.6f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.0f, 8.0f)
                horizontalLineToRelative(42.8f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.0f, -8.0f)
                arcToRelative(19.6f, 19.6f, 0.0f, false, false, 3.2f, -17.5f)
                close()
                moveTo(111.9f, 164.0f)
                lineTo(121.0f, 132.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.6f, -12.3f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, -5.4f, -12.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 17.1f, -16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 14.8f, 14.7f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, -5.3f, 13.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.6f, 12.3f)
                lineToRelative(9.1f, 31.7f)
                close()
            }
        }
        .build()
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
