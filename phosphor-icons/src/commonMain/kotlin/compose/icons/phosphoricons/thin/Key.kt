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

public val ThinGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 20.0f)
                arcTo(76.1f, 76.1f, 0.0f, false, false, 84.0f, 96.0f)
                arcToRelative(74.9f, 74.9f, 0.0f, false, false, 4.5f, 25.8f)
                lineTo(29.2f, 181.2f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 28.0f, 184.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(72.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(76.0f, 204.0f)
                lineTo(96.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(100.0f, 180.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 2.8f, -1.2f)
                lineToRelative(11.4f, -11.3f)
                arcTo(74.9f, 74.9f, 0.0f, false, false, 160.0f, 172.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 0.0f, -152.0f)
                close()
                moveTo(160.0f, 164.0f)
                arcToRelative(67.6f, 67.6f, 0.0f, false, true, -25.2f, -4.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.5f, 0.8f)
                lineToRelative(-12.0f, 12.0f)
                lineTo(96.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(20.0f)
                lineTo(72.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(20.0f)
                lineTo(36.0f, 220.0f)
                lineTo(36.0f, 185.7f)
                lineToRelative(60.0f, -60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.8f, -4.5f)
                arcTo(68.0f, 68.0f, 0.0f, true, true, 160.0f, 164.0f)
                close()
                moveTo(188.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 188.0f, 76.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
