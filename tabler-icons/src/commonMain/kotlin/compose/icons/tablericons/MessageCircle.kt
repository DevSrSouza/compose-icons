package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.MessageCircle: ImageVector
    get() {
        if (_messageCircle != null) {
            return _messageCircle!!
        }
        _messageCircle = Builder(name = "MessageCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 20.0f)
                lineToRelative(1.3f, -3.9f)
                curveToRelative(-2.324f, -3.437f, -1.426f, -7.872f, 2.1f, -10.374f)
                curveToRelative(3.526f, -2.501f, 8.59f, -2.296f, 11.845f, 0.48f)
                curveToRelative(3.255f, 2.777f, 3.695f, 7.266f, 1.029f, 10.501f)
                curveToRelative(-2.666f, 3.235f, -7.615f, 4.215f, -11.574f, 2.293f)
                lineToRelative(-4.7f, 1.0f)
            }
        }
        .build()
        return _messageCircle!!
    }

private var _messageCircle: ImageVector? = null
