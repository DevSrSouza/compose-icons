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

public val BoldGroup.PianoKeys: ImageVector
    get() {
        if (_pianoKeys != null) {
            return _pianoKeys!!
        }
        _pianoKeys = Builder(name = "PianoKeys", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(116.0f, 132.0f)
                lineTo(92.0f, 132.0f)
                lineTo(92.0f, 52.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(128.0f, 156.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(48.0f)
                lineTo(112.0f, 204.0f)
                lineTo(112.0f, 156.0f)
                close()
                moveTo(164.0f, 132.0f)
                lineTo(140.0f, 132.0f)
                lineTo(140.0f, 52.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(52.0f, 52.0f)
                lineTo(68.0f, 52.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(48.0f)
                lineTo(52.0f, 204.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(168.0f, 204.0f)
                lineTo(168.0f, 156.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(188.0f, 52.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _pianoKeys!!
    }

private var _pianoKeys: ImageVector? = null
