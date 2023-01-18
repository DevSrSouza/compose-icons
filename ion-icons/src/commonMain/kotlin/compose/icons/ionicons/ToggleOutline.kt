package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ToggleOutline: ImageVector
    get() {
        if (_toggleOutline != null) {
            return _toggleOutline!!
        }
        _toggleOutline = Builder(name = "ToggleOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(368.0f, 256.0f)
                moveToRelative(-128.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, 256.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, -256.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(144.0f, 128.0f)
                lineTo(368.0f, 128.0f)
                arcTo(128.0f, 128.0f, 0.0f, false, true, 496.0f, 256.0f)
                lineTo(496.0f, 256.0f)
                arcTo(128.0f, 128.0f, 0.0f, false, true, 368.0f, 384.0f)
                lineTo(144.0f, 384.0f)
                arcTo(128.0f, 128.0f, 0.0f, false, true, 16.0f, 256.0f)
                lineTo(16.0f, 256.0f)
                arcTo(128.0f, 128.0f, 0.0f, false, true, 144.0f, 128.0f)
                close()
            }
        }
        .build()
        return _toggleOutline!!
    }

private var _toggleOutline: ImageVector? = null
