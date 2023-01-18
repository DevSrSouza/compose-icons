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

public val BoldGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 12.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, false, 76.0f, 96.0f)
                arcToRelative(82.3f, 82.3f, 0.0f, false, false, 3.4f, 23.7f)
                lineTo(23.5f, 175.5f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 20.0f, 184.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(72.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(84.0f, 212.0f)
                lineTo(96.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(108.0f, 188.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, 8.5f, -3.5f)
                lineToRelative(7.8f, -7.9f)
                arcTo(82.3f, 82.3f, 0.0f, false, false, 160.0f, 180.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 0.0f, -168.0f)
                close()
                moveTo(160.0f, 156.0f)
                arcToRelative(59.5f, 59.5f, 0.0f, false, true, -22.1f, -4.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.2f, 2.5f)
                lineTo(115.0f, 164.0f)
                lineTo(96.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(12.0f)
                lineTo(72.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(12.0f)
                lineTo(44.0f, 212.0f)
                lineTo(44.0f, 189.0f)
                lineToRelative(57.7f, -57.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.5f, -13.2f)
                arcTo(60.0f, 60.0f, 0.0f, true, true, 160.0f, 156.0f)
                close()
                moveTo(196.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 196.0f, 76.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
