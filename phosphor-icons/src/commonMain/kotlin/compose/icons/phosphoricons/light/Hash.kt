package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Hash: ImageVector
    get() {
        if (_hash != null) {
            return _hash!!
        }
        _hash = Builder(name = "Hash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 90.0f)
                lineTo(173.0f, 90.0f)
                lineToRelative(8.9f, -48.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.8f, -2.2f)
                lineTo(160.8f, 90.0f)
                lineTo(109.0f, 90.0f)
                lineToRelative(8.9f, -48.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.8f, -2.2f)
                lineTo(96.8f, 90.0f)
                lineTo(43.6f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, 12.0f)
                horizontalLineToRelative(51.0f)
                lineToRelative(-9.4f, 52.0f)
                lineTo(32.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(83.0f, 166.0f)
                lineToRelative(-8.9f, 48.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.8f, 7.0f)
                lineTo(80.0f, 221.9f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 5.9f, -4.9f)
                lineTo(95.2f, 166.0f)
                lineTo(147.0f, 166.0f)
                lineToRelative(-8.9f, 48.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.8f, 7.0f)
                lineTo(144.0f, 221.9f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 5.9f, -4.9f)
                lineToRelative(9.3f, -51.1f)
                horizontalLineToRelative(53.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineToRelative(-51.0f)
                lineToRelative(9.4f, -52.0f)
                lineTo(224.0f, 101.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(149.2f, 154.0f)
                lineTo(97.4f, 154.0f)
                lineToRelative(9.4f, -52.0f)
                horizontalLineToRelative(51.8f)
                close()
            }
        }
        .build()
        return _hash!!
    }

private var _hash: ImageVector? = null
