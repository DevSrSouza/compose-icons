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

public val ThinGroup.RepeatOnce: ImageVector
    get() {
        if (_repeatOnce != null) {
            return _repeatOnce!!
        }
        _repeatOnce = Builder(name = "RepeatOnce", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 128.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 96.0f, 60.0f)
                lineTo(214.3f, 60.0f)
                lineTo(197.2f, 42.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineTo(214.3f, 68.0f)
                lineTo(96.0f, 68.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -60.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(224.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -60.0f, 60.0f)
                lineTo(41.7f, 188.0f)
                lineToRelative(17.1f, -17.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, -5.6f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                lineTo(41.7f, 196.0f)
                lineTo(160.0f, 196.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, 68.0f, -68.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 124.0f)
                close()
                moveTo(132.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(136.0f, 104.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -1.9f, -3.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -3.9f, -0.2f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.6f, 7.2f)
                lineToRelative(10.2f, -5.1f)
                lineTo(128.0f, 152.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 132.0f, 156.0f)
                close()
            }
        }
        .build()
        return _repeatOnce!!
    }

private var _repeatOnce: ImageVector? = null
