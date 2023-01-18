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

public val LightGroup.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) {
            return _rewindCircle!!
        }
        _rewindCircle = Builder(name = "RewindCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(174.8f, 90.7f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -6.1f, 0.3f)
                lineTo(122.0f, 122.1f)
                lineTo(122.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.3f, -5.0f)
                lineToRelative(-48.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 10.0f)
                lineToRelative(48.0f, 32.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 6.1f, 0.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 122.0f, 160.0f)
                lineTo(122.0f, 133.9f)
                lineTo(168.7f, 165.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 6.1f, 0.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 178.0f, 160.0f)
                lineTo(178.0f, 96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 174.8f, 90.7f)
                close()
                moveTo(110.0f, 148.8f)
                lineTo(78.8f, 128.0f)
                lineTo(110.0f, 107.2f)
                close()
                moveTo(166.0f, 148.8f)
                lineTo(134.8f, 128.0f)
                lineTo(166.0f, 107.2f)
                close()
            }
        }
        .build()
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
