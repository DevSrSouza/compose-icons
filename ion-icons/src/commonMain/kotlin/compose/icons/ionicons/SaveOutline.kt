package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.SaveOutline: ImageVector
    get() {
        if (_saveOutline != null) {
            return _saveOutline!!
        }
        _saveOutline = Builder(name = "SaveOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(380.93f, 57.37f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 358.3f, 48.0f)
                lineTo(94.22f, 48.0f)
                arcTo(46.21f, 46.21f, 0.0f, false, false, 48.0f, 94.22f)
                lineTo(48.0f, 417.78f)
                arcTo(46.21f, 46.21f, 0.0f, false, false, 94.22f, 464.0f)
                lineTo(417.78f, 464.0f)
                arcTo(46.36f, 46.36f, 0.0f, false, false, 464.0f, 417.78f)
                lineTo(464.0f, 153.7f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -9.37f, -22.63f)
                close()
                moveTo(256.0f, 416.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, -64.0f)
                arcTo(63.92f, 63.92f, 0.0f, false, true, 256.0f, 416.0f)
                close()
                moveTo(304.0f, 192.0f)
                lineTo(112.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(96.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                lineTo(304.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 304.0f, 192.0f)
                close()
            }
        }
        .build()
        return _saveOutline!!
    }

private var _saveOutline: ImageVector? = null
