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

public val ThinGroup.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) {
            return _speakerSimpleSlash!!
        }
        _speakerSimpleSlash = Builder(name = "SpeakerSimpleSlash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 152.0f)
                lineTo(188.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(224.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(228.0f, 88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 84.0f)
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
                lineTo(82.6f, 84.0f)
                lineTo(45.0f, 42.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.0f, -5.4f)
                close()
                moveTo(148.0f, 155.9f)
                lineTo(89.9f, 92.0f)
                lineTo(32.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(80.0f, 164.0f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, 2.5f, 0.8f)
                lineToRelative(65.5f, 51.0f)
                close()
                moveTo(114.6f, 66.1f)
                lineTo(148.0f, 40.2f)
                verticalLineToRelative(66.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 8.0f, 0.0f)
                lineTo(156.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.5f, -3.2f)
                lineToRelative(-39.8f, 31.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.7f, 5.6f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 114.6f, 66.1f)
                close()
            }
        }
        .build()
        return _speakerSimpleSlash!!
    }

private var _speakerSimpleSlash: ImageVector? = null
