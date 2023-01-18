package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.TextBolder: ImageVector
    get() {
        if (_textBolder != null) {
            return _textBolder!!
        }
        _textBolder = Builder(name = "TextBolder", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(177.1f, 114.5f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 140.0f, 36.0f)
                lineTo(64.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 48.0f)
                lineTo(52.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 25.1f, -97.5f)
                close()
                moveTo(76.0f, 60.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f)
                lineTo(76.0f, 108.0f)
                close()
                moveTo(152.0f, 188.0f)
                lineTo(76.0f, 188.0f)
                lineTo(76.0f, 132.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                close()
            }
        }
        .build()
        return _textBolder!!
    }

private var _textBolder: ImageVector? = null
