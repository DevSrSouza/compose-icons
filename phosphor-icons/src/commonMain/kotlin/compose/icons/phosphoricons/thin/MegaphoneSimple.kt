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

public val ThinGroup.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) {
            return _megaphoneSimple!!
        }
        _megaphoneSimple = Builder(name = "MegaphoneSimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.4f, 90.5f)
                lineTo(43.4f, 39.1f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 28.0f, 50.7f)
                lineTo(28.0f, 189.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 4.8f, 9.6f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 7.2f, 2.4f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 3.4f, -0.4f)
                lineTo(132.0f, 175.0f)
                verticalLineToRelative(17.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(188.0f, 158.7f)
                lineToRelative(31.4f, -9.2f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 228.0f, 138.0f)
                lineTo(228.0f, 102.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 219.4f, 90.5f)
                close()
                moveTo(41.1f, 193.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.5f, -0.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -1.6f, -3.2f)
                lineTo(36.0f, 50.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 1.6f, -3.2f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 2.4f, -0.8f)
                horizontalLineToRelative(1.1f)
                lineTo(132.0f, 73.3f)
                verticalLineToRelative(93.4f)
                close()
                moveTo(180.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(144.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(140.0f, 172.7f)
                lineTo(180.0f, 161.0f)
                close()
                moveTo(220.0f, 138.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.9f, 3.8f)
                lineTo(140.0f, 164.3f)
                lineTo(140.0f, 75.7f)
                lineToRelative(77.1f, 22.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 102.0f)
                close()
            }
        }
        .build()
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null
