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

public val ThinGroup.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) {
            return _microphoneSlash!!
        }
        _microphoneSlash = Builder(name = "MicrophoneSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.0f, 213.3f)
                lineToRelative(-53.1f, -58.4f)
                horizontalLineToRelative(0.0f)
                lineTo(51.0f, 37.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.0f, 5.4f)
                lineTo(84.0f, 85.5f)
                verticalLineTo(128.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 70.5f, 35.1f)
                lineToRelative(16.2f, 17.8f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 60.4f, 135.6f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 56.0f, 132.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -3.5f, 4.4f)
                arcTo(75.8f, 75.8f, 0.0f, false, false, 124.0f, 203.9f)
                verticalLineTo(232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(203.9f)
                arcToRelative(75.7f, 75.7f, 0.0f, false, false, 44.1f, -17.1f)
                lineTo(205.0f, 218.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 5.7f, 0.3f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 211.0f, 213.3f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                verticalLineTo(94.3f)
                lineToRelative(57.1f, 62.9f)
                arcTo(36.1f, 36.1f, 0.0f, false, true, 128.0f, 164.0f)
                close()
                moveTo(90.6f, 40.9f)
                arcTo(43.5f, 43.5f, 0.0f, false, true, 128.0f, 20.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 44.0f, 44.0f)
                verticalLineToRelative(60.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(64.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 97.4f, 45.1f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -5.5f, 1.3f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 90.6f, 40.9f)
                close()
                moveTo(191.4f, 152.8f)
                arcToRelative(73.3f, 73.3f, 0.0f, false, false, 4.2f, -17.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 132.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.5f, 4.4f)
                arcToRelative(75.6f, 75.6f, 0.0f, false, true, -4.7f, 19.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.7f, 2.5f)
                lineToRelative(-1.5f, -0.3f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 191.4f, 152.8f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
