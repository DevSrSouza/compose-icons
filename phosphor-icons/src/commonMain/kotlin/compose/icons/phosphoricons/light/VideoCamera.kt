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

public val LightGroup.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) {
            return _videoCamera!!
        }
        _videoCamera = Builder(name = "VideoCamera", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.0f, 74.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -6.0f, 0.0f)
                lineToRelative(-47.0f, 26.9f)
                lineTo(190.0f, 92.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, -38.0f)
                lineTo(24.0f, 54.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 10.0f, 68.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f)
                lineTo(176.0f, 202.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(190.0f, 154.3f)
                lineToRelative(47.0f, 26.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, -5.2f)
                lineTo(246.0f, 80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 243.0f, 74.8f)
                close()
                moveTo(178.0f, 188.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 190.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, -26.0f, -26.0f)
                lineTo(22.0f, 68.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(152.0f, 66.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, 26.0f, 26.0f)
                close()
                moveTo(234.0f, 165.7f)
                lineTo(190.0f, 140.5f)
                verticalLineToRelative(-25.0f)
                lineToRelative(44.0f, -25.2f)
                close()
            }
        }
        .build()
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
