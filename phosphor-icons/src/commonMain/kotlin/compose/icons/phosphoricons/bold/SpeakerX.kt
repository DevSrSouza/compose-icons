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

public val BoldGroup.SpeakerX: ImageVector
    get() {
        if (_speakerX != null) {
            return _speakerX!!
        }
        _speakerX = Builder(name = "SpeakerX", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(157.3f, 21.2f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -12.7f, 1.3f)
                lineTo(75.9f, 76.0f)
                lineTo(32.0f, 76.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 12.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(75.9f, 180.0f)
                lineToRelative(68.7f, 53.5f)
                arcTo(12.7f, 12.7f, 0.0f, false, false, 152.0f, 236.0f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, 5.3f, -1.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 224.0f)
                lineTo(164.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 157.3f, 21.2f)
                close()
                moveTo(36.0f, 100.0f)
                lineTo(68.0f, 100.0f)
                verticalLineToRelative(56.0f)
                lineTo(36.0f, 156.0f)
                close()
                moveTo(140.0f, 199.5f)
                lineTo(92.0f, 162.1f)
                lineTo(92.0f, 93.9f)
                lineToRelative(48.0f, -37.4f)
                close()
                moveTo(248.5f, 143.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(216.0f, 145.0f)
                lineToRelative(-15.5f, 15.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineTo(199.0f, 128.0f)
                lineToRelative(-15.5f, -15.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(216.0f, 111.0f)
                lineToRelative(15.5f, -15.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(233.0f, 128.0f)
                close()
            }
        }
        .build()
        return _speakerX!!
    }

private var _speakerX: ImageVector? = null
