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

public val RemixIcons.CharacterRecognitionLine: ImageVector
    get() {
        if (_characterRecognitionLine != null) {
            return _characterRecognitionLine!!
        }
        _characterRecognitionLine = Builder(name = "CharacterRecognitionLine", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 15.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(21.0f, 15.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.999f, 6.0f)
                lineToRelative(4.4f, 11.0f)
                horizontalLineToRelative(-2.155f)
                lineToRelative(-1.201f, -3.0f)
                horizontalLineToRelative(-4.09f)
                lineToRelative(-1.199f, 3.0f)
                lineTo(6.6f, 17.0f)
                lineToRelative(4.399f, -11.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(11.999f, 8.885f)
                lineTo(10.752f, 12.0f)
                horizontalLineToRelative(2.492f)
                lineToRelative(-1.245f, -3.115f)
                close()
                moveTo(9.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 9.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(21.0f, 3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(15.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _characterRecognitionLine!!
    }

private var _characterRecognitionLine: ImageVector? = null
