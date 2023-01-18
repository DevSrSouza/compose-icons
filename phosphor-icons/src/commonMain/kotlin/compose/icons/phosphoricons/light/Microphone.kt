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

public val LightGroup.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = Builder(name = "Microphone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 174.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 46.0f, -46.0f)
                lineTo(174.0f, 64.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -92.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 128.0f, 174.0f)
                close()
                moveTo(94.0f, 64.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 68.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -68.0f, 0.0f)
                close()
                moveTo(205.5f, 136.7f)
                arcTo(77.9f, 77.9f, 0.0f, false, true, 134.0f, 205.8f)
                lineTo(134.0f, 232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 205.8f)
                arcToRelative(77.9f, 77.9f, 0.0f, false, true, -71.5f, -69.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.9f, -1.4f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, false, 131.2f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.9f, 1.4f)
                close()
            }
        }
        .build()
        return _microphone!!
    }

private var _microphone: ImageVector? = null
