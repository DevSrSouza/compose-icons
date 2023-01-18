package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.VolumeOffVibrateFill: ImageVector
    get() {
        if (_volumeOffVibrateFill != null) {
            return _volumeOffVibrateFill!!
        }
        _volumeOffVibrateFill = Builder(name = "VolumeOffVibrateFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.39f, 3.161f)
                lineToRelative(1.413f, 1.414f)
                lineToRelative(-2.475f, 2.475f)
                lineToRelative(2.475f, 2.475f)
                lineTo(18.328f, 12.0f)
                lineToRelative(2.475f, 2.476f)
                lineToRelative(-2.475f, 2.475f)
                lineToRelative(2.475f, 2.475f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.889f, -3.89f)
                lineToRelative(2.475f, -2.474f)
                lineTo(15.5f, 12.0f)
                lineToRelative(2.475f, -2.475f)
                lineTo(15.5f, 7.05f)
                lineToRelative(3.89f, -3.889f)
                close()
                moveTo(13.0f, 19.945f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.817f, 0.387f)
                lineTo(6.89f, 15.999f)
                lineTo(3.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineToRelative(2.584f, -0.002f)
                lineToRelative(-3.776f, -3.776f)
                lineToRelative(1.414f, -1.414f)
                lineTo(13.0f, 12.586f)
                verticalLineToRelative(7.359f)
                close()
                moveTo(12.887f, 3.739f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.113f, 0.316f)
                verticalLineToRelative(5.702f)
                lineTo(9.282f, 6.04f)
                lineToRelative(2.901f, -2.372f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.704f, 0.07f)
                close()
            }
        }
        .build()
        return _volumeOffVibrateFill!!
    }

private var _volumeOffVibrateFill: ImageVector? = null
