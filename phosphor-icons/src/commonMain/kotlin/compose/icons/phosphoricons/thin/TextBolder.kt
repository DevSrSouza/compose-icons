package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.TextBolder: ImageVector
    get() {
        if (_textBolder != null) {
            return _textBolder!!
        }
        _textBolder = Builder(name = "TextBolder", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.3f, 117.2f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 140.0f, 44.0f)
                lineTo(64.0f, 44.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(60.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 10.3f, -86.8f)
                close()
                moveTo(68.0f, 52.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, 64.0f)
                lineTo(68.0f, 116.0f)
                close()
                moveTo(152.0f, 196.0f)
                lineTo(68.0f, 196.0f)
                lineTo(68.0f, 124.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                close()
            }
        }
        .build()
        return _textBolder!!
    }

private var _textBolder: ImageVector? = null
