package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.CharacterRecognitionFill: ImageVector
    get() {
        if (_characterRecognitionFill != null) {
            return _characterRecognitionFill!!
        }
        _characterRecognitionFill = Builder(name = "CharacterRecognitionFill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                verticalLineToRelative(18.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(12.999f, 6.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.6f, 17.0f)
                horizontalLineToRelative(2.154f)
                lineToRelative(1.199f, -3.0f)
                horizontalLineToRelative(4.09f)
                lineToRelative(1.201f, 3.0f)
                horizontalLineToRelative(2.155f)
                lineToRelative(-4.4f, -11.0f)
                close()
                moveTo(11.999f, 8.885f)
                lineTo(13.244f, 12.0f)
                horizontalLineToRelative(-2.492f)
                lineToRelative(1.247f, -3.115f)
                close()
            }
        }
        .build()
        return _characterRecognitionFill!!
    }

private var _characterRecognitionFill: ImageVector? = null
