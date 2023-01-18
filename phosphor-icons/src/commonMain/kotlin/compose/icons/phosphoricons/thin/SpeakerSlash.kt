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

public val ThinGroup.SpeakerSlash: ImageVector
    get() {
        if (_speakerSlash != null) {
            return _speakerSlash!!
        }
        _speakerSlash = Builder(name = "SpeakerSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 128.0f)
                arcToRelative(75.2f, 75.2f, 0.0f, false, true, -22.3f, 53.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, 1.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.8f, -1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, 0.0f, -96.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.6f, -5.6f)
                arcTo(75.2f, 75.2f, 0.0f, false, true, 244.0f, 128.0f)
                close()
                moveTo(187.8f, 153.5f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.8f, 1.1f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.8f, -1.1f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, false, 0.0f, -50.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 5.6f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 39.6f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 187.8f, 153.5f)
                close()
                moveTo(211.0f, 213.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -0.3f, 5.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -5.7f, -0.3f)
                lineToRelative(-49.0f, -54.0f)
                lineTo(156.0f, 224.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -2.2f, 3.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -1.8f, 0.4f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, -2.5f, -0.8f)
                lineTo(78.6f, 172.0f)
                lineTo(32.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(20.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 32.0f, 84.0f)
                lineTo(78.6f, 84.0f)
                lineTo(81.0f, 82.2f)
                lineTo(45.0f, 42.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.0f, -5.4f)
                close()
                moveTo(32.0f, 164.0f)
                lineTo(76.0f, 164.0f)
                lineTo(76.0f, 92.0f)
                lineTo(32.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 164.0f)
                close()
                moveTo(148.0f, 155.9f)
                lineTo(86.4f, 88.1f)
                lineTo(84.0f, 90.0f)
                verticalLineToRelative(76.0f)
                lineToRelative(64.0f, 49.8f)
                close()
                moveTo(114.6f, 66.2f)
                lineToRelative(33.4f, -26.0f)
                verticalLineToRelative(66.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 8.0f, 0.0f)
                lineTo(156.0f, 32.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -2.2f, -3.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.3f, 0.5f)
                lineTo(109.7f, 59.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.9f, 6.4f)
                close()
            }
        }
        .build()
        return _speakerSlash!!
    }

private var _speakerSlash: ImageVector? = null
