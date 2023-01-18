package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = Builder(name = "Microphone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 128.0f)
                lineTo(80.0f, 64.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 96.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -96.0f, 0.0f)
                close()
                moveTo(200.4f, 128.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.8f, 7.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -127.2f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.8f, -7.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -7.1f, 8.8f)
                arcTo(79.7f, 79.7f, 0.0f, false, false, 120.0f, 207.3f)
                lineTo(120.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 207.3f)
                arcToRelative(79.7f, 79.7f, 0.0f, false, false, 71.5f, -70.4f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 200.4f, 128.1f)
                close()
            }
        }
        .build()
        return _microphone!!
    }

private var _microphone: ImageVector? = null
