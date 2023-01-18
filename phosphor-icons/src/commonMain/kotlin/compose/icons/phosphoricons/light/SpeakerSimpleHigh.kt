package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.SpeakerSimpleHigh: ImageVector
    get() {
        if (_speakerSimpleHigh != null) {
            return _speakerSimpleHigh!!
        }
        _speakerSimpleHigh = Builder(name = "SpeakerSimpleHigh", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(154.6f, 26.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.3f, 0.7f)
                lineTo(77.9f, 82.0f)
                lineTo(32.0f, 82.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(77.9f, 174.0f)
                lineToRelative(70.4f, 54.7f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 152.0f, 230.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 2.6f, -0.6f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 158.0f, 224.0f)
                lineTo(158.0f, 32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 154.6f, 26.6f)
                close()
                moveTo(146.0f, 211.7f)
                lineTo(83.7f, 163.3f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 80.0f, 162.0f)
                lineTo(32.0f, 162.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(30.0f, 96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(80.0f, 94.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 3.7f, -1.3f)
                lineTo(146.0f, 44.3f)
                close()
                moveTo(198.0f, 104.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(186.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(230.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(218.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _speakerSimpleHigh!!
    }

private var _speakerSimpleHigh: ImageVector? = null
