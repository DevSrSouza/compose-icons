package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.StopOutline: ImageVector
    get() {
        if (_stopOutline != null) {
            return _stopOutline!!
        }
        _stopOutline = Builder(name = "StopOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(120.0f, 96.0f)
                lineTo(392.0f, 96.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 416.0f, 120.0f)
                lineTo(416.0f, 392.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 392.0f, 416.0f)
                lineTo(120.0f, 416.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 96.0f, 392.0f)
                lineTo(96.0f, 120.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 120.0f, 96.0f)
                close()
            }
        }
        .build()
        return _stopOutline!!
    }

private var _stopOutline: ImageVector? = null
