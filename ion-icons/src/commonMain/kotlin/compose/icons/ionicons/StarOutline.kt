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

public val IonIcons.StarOutline: ImageVector
    get() {
        if (_starOutline != null) {
            return _starOutline!!
        }
        _starOutline = Builder(name = "StarOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(480.0f, 208.0f)
                horizontalLineTo(308.0f)
                lineTo(256.0f, 48.0f)
                lineTo(204.0f, 208.0f)
                horizontalLineTo(32.0f)
                lineToRelative(140.0f, 96.0f)
                lineTo(118.0f, 464.0f)
                lineTo(256.0f, 364.0f)
                lineTo(394.0f, 464.0f)
                lineTo(340.0f, 304.0f)
                close()
            }
        }
        .build()
        return _starOutline!!
    }

private var _starOutline: ImageVector? = null
