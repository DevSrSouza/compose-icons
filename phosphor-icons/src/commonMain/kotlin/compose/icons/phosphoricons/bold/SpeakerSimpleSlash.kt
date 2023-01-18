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

public val BoldGroup.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) {
            return _speakerSimpleSlash!!
        }
        _speakerSimpleSlash = Builder(name = "SpeakerSimpleSlash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(216.9f, 207.9f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -0.8f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, -0.8f)
                lineTo(164.0f, 185.4f)
                verticalLineTo(224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -6.7f, 10.8f)
                arcTo(12.4f, 12.4f, 0.0f, false, true, 152.0f, 236.0f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, true, -7.4f, -2.5f)
                lineTo(75.9f, 180.0f)
                horizontalLineTo(32.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineTo(96.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 32.0f, 76.0f)
                horizontalLineTo(64.5f)
                lineTo(39.1f, 48.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.9f, 31.9f)
                close()
                moveTo(140.0f, 159.0f)
                lineTo(86.3f, 100.0f)
                horizontalLineTo(36.0f)
                verticalLineToRelative(56.0f)
                horizontalLineTo(80.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 7.4f, 2.5f)
                lineToRelative(52.6f, 41.0f)
                close()
                moveTo(125.9f, 67.5f)
                lineToRelative(14.1f, -11.0f)
                verticalLineTo(94.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.7f, -10.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -12.7f, 1.3f)
                lineTo(111.1f, 48.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 14.8f, 18.9f)
                close()
                moveTo(192.0f, 150.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(34.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 150.9f)
                close()
            }
        }
        .build()
        return _speakerSimpleSlash!!
    }

private var _speakerSimpleSlash: ImageVector? = null
