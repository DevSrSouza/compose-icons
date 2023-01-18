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

public val LightGroup.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) {
            return _cloudSlash!!
        }
        _cloudSlash = Builder(name = "CloudSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.3f, 196.4f)
                horizontalLineToRelative(0.0f)
                lineTo(95.5f, 83.4f)
                horizontalLineToRelative(0.0f)
                lineTo(52.4f, 36.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.8f, 8.0f)
                lineTo(83.7f, 88.2f)
                lineToRelative(-1.3f, 2.7f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 72.0f, 90.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, 0.0f, 124.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(85.4f, 85.4f, 0.0f, false, false, 32.4f, -6.3f)
                lineTo(203.6f, 220.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.4f, 2.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 4.0f, -1.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.4f, -8.4f)
                close()
                moveTo(160.0f, 202.0f)
                lineTo(72.0f, 202.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 0.0f, -100.0f)
                arcToRelative(38.1f, 38.1f, 0.0f, false, true, 5.9f, 0.4f)
                arcTo(85.0f, 85.0f, 0.0f, false, false, 74.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(74.1f, 74.1f, 0.0f, false, true, 6.4f, -30.2f)
                lineToRelative(91.3f, 100.3f)
                arcTo(72.7f, 72.7f, 0.0f, false, true, 160.0f, 202.0f)
                close()
                moveTo(246.0f, 128.0f)
                arcToRelative(86.3f, 86.3f, 0.0f, false, true, -21.8f, 57.3f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -4.5f, 2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.5f, -10.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, -99.0f, -108.9f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -8.4f, -1.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.3f, -8.4f)
                arcTo(85.3f, 85.3f, 0.0f, false, true, 160.0f, 42.0f)
                arcTo(86.1f, 86.1f, 0.0f, false, true, 246.0f, 128.0f)
                close()
            }
        }
        .build()
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
