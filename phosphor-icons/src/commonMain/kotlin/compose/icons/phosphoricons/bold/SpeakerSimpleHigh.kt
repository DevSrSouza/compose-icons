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

public val BoldGroup.SpeakerSimpleHigh: ImageVector
    get() {
        if (_speakerSimpleHigh != null) {
            return _speakerSimpleHigh!!
        }
        _speakerSimpleHigh = Builder(name = "SpeakerSimpleHigh", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(140.0f, 199.5f)
                lineToRelative(-52.6f, -41.0f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 80.0f, 156.0f)
                lineTo(36.0f, 156.0f)
                lineTo(36.0f, 100.0f)
                lineTo(80.0f, 100.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 7.4f, -2.5f)
                lineToRelative(52.6f, -41.0f)
                close()
                moveTo(204.0f, 104.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(180.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(240.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(216.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _speakerSimpleHigh!!
    }

private var _speakerSimpleHigh: ImageVector? = null
