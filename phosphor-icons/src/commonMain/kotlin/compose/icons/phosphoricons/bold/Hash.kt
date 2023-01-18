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

public val BoldGroup.Hash: ImageVector
    get() {
        if (_hash != null) {
            return _hash!!
        }
        _hash = Builder(name = "Hash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(180.2f, 84.0f)
                lineToRelative(7.6f, -41.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -23.6f, -4.3f)
                lineTo(155.8f, 84.0f)
                lineTo(116.2f, 84.0f)
                lineToRelative(7.6f, -41.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -23.6f, -4.3f)
                lineTo(91.8f, 84.0f)
                lineTo(43.6f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, 24.0f)
                lineTo(87.4f, 108.0f)
                lineToRelative(-7.2f, 40.0f)
                lineTo(32.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(75.8f, 172.0f)
                lineToRelative(-7.6f, 41.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 9.7f, 13.9f)
                lineToRelative(2.1f, 0.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.8f, -9.8f)
                lineToRelative(8.4f, -46.2f)
                horizontalLineToRelative(39.6f)
                lineToRelative(-7.6f, 41.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 9.7f, 13.9f)
                lineToRelative(2.1f, 0.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.8f, -9.8f)
                lineToRelative(8.4f, -46.2f)
                horizontalLineToRelative(48.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(168.6f, 148.0f)
                lineToRelative(7.2f, -40.0f)
                close()
                moveTo(144.2f, 148.0f)
                lineTo(104.6f, 148.0f)
                lineToRelative(7.2f, -40.0f)
                horizontalLineToRelative(39.6f)
                close()
            }
        }
        .build()
        return _hash!!
    }

private var _hash: ImageVector? = null
