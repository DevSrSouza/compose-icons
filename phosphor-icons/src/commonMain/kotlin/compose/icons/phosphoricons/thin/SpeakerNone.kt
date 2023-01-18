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

public val ThinGroup.SpeakerNone: ImageVector
    get() {
        if (_speakerNone != null) {
            return _speakerNone!!
        }
        _speakerNone = Builder(name = "SpeakerNone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(153.8f, 28.4f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -4.3f, 0.4f)
                lineTo(78.6f, 84.0f)
                lineTo(32.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(78.6f, 172.0f)
                lineToRelative(70.9f, 55.2f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 2.5f, 0.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.8f, -0.4f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 156.0f, 224.0f)
                lineTo(156.0f, 32.0f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 153.8f, 28.4f)
                close()
                moveTo(28.0f, 160.0f)
                lineTo(28.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(76.0f, 92.0f)
                verticalLineToRelative(72.0f)
                lineTo(32.0f, 164.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 160.0f)
                close()
                moveTo(148.0f, 215.8f)
                lineTo(84.0f, 166.0f)
                lineTo(84.0f, 90.0f)
                lineToRelative(64.0f, -49.8f)
                close()
            }
        }
        .build()
        return _speakerNone!!
    }

private var _speakerNone: ImageVector? = null
