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

public val LightGroup.RepeatOnce: ImageVector
    get() {
        if (_repeatOnce != null) {
            return _repeatOnce!!
        }
        _repeatOnce = Builder(name = "RepeatOnce", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.0f, 128.0f)
                arcTo(70.1f, 70.1f, 0.0f, false, true, 96.0f, 58.0f)
                lineTo(209.5f, 58.0f)
                lineTo(195.8f, 44.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, 8.4f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineTo(209.5f, 70.0f)
                lineTo(96.0f, 70.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, -58.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(224.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, -58.0f, 58.0f)
                lineTo(46.5f, 186.0f)
                lineToRelative(13.7f, -13.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, -8.4f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.0f, 8.4f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.4f, -8.4f)
                lineTo(46.5f, 198.0f)
                lineTo(160.0f, 198.0f)
                arcToRelative(70.1f, 70.1f, 0.0f, false, false, 70.0f, -70.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 122.0f)
                close()
                moveTo(132.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(138.0f, 104.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -2.8f, -5.1f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -5.9f, -0.3f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.4f, 10.8f)
                lineToRelative(7.3f, -3.7f)
                lineTo(126.0f, 152.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 132.0f, 158.0f)
                close()
            }
        }
        .build()
        return _repeatOnce!!
    }

private var _repeatOnce: ImageVector? = null
