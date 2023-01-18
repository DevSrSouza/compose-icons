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

public val IonIcons.SendOutline: ImageVector
    get() {
        if (_sendOutline != null) {
            return _sendOutline!!
        }
        _sendOutline = Builder(name = "SendOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(470.3f, 271.15f)
                lineTo(43.16f, 447.31f)
                arcToRelative(7.83f, 7.83f, 0.0f, false, true, -11.16f, -7.0f)
                verticalLineTo(327.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.51f, -7.86f)
                lineToRelative(247.62f, -47.0f)
                curveToRelative(17.36f, -3.29f, 17.36f, -28.15f, 0.0f, -31.44f)
                lineToRelative(-247.63f, -47.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.5f, -7.85f)
                verticalLineTo(72.59f)
                curveToRelative(0.0f, -5.74f, 5.88f, -10.26f, 11.16f, -8.0f)
                lineTo(470.3f, 241.76f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 470.3f, 271.15f)
                close()
            }
        }
        .build()
        return _sendOutline!!
    }

private var _sendOutline: ImageVector? = null
