package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.RecordingSharp: ImageVector
    get() {
        if (_recordingSharp != null) {
            return _recordingSharp!!
        }
        _recordingSharp = Builder(name = "RecordingSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 138.0f)
                arcToRelative(117.93f, 117.93f, 0.0f, false, false, -91.84f, 192.0f)
                lineTo(219.84f, 330.0f)
                arcTo(118.0f, 118.0f, 0.0f, true, false, 128.0f, 374.0f)
                lineTo(384.0f, 374.0f)
                arcToRelative(118.0f, 118.0f, 0.0f, false, false, 0.0f, -236.0f)
                close()
                moveTo(54.0f, 256.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, true, true, 74.0f, 74.0f)
                arcTo(74.09f, 74.09f, 0.0f, false, true, 54.0f, 256.0f)
                close()
                moveTo(384.0f, 330.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, true, true, 74.0f, -74.0f)
                arcTo(74.09f, 74.09f, 0.0f, false, true, 384.0f, 330.0f)
                close()
            }
        }
        .build()
        return _recordingSharp!!
    }

private var _recordingSharp: ImageVector? = null
