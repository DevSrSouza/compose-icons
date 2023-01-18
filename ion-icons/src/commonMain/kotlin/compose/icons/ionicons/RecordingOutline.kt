package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.RecordingOutline: ImageVector
    get() {
        if (_recordingOutline != null) {
            return _recordingOutline!!
        }
        _recordingOutline = Builder(name = "RecordingOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 256.0f)
                moveToRelative(-96.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 192.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, -192.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(384.0f, 256.0f)
                moveToRelative(-96.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 192.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, -192.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 352.0f)
                lineTo(384.0f, 352.0f)
            }
        }
        .build()
        return _recordingOutline!!
    }

private var _recordingOutline: ImageVector? = null
