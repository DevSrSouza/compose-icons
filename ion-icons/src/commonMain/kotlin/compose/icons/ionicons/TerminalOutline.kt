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

public val IonIcons.TerminalOutline: ImageVector
    get() {
        if (_terminalOutline != null) {
            return _terminalOutline!!
        }
        _terminalOutline = Builder(name = "TerminalOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.0f, 48.0f)
                lineTo(432.0f, 48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 480.0f, 96.0f)
                lineTo(480.0f, 416.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 432.0f, 464.0f)
                lineTo(80.0f, 464.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 32.0f, 416.0f)
                lineTo(32.0f, 96.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 80.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.0f, 112.0f)
                lineToRelative(80.0f, 64.0f)
                lineToRelative(-80.0f, 64.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 240.0f)
                lineTo(256.0f, 240.0f)
            }
        }
        .build()
        return _terminalOutline!!
    }

private var _terminalOutline: ImageVector? = null
