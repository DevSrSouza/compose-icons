package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ImageSharp: ImageVector
    get() {
        if (_imageSharp != null) {
            return _imageSharp!!
        }
        _imageSharp = Builder(name = "ImageSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(456.0f, 64.0f)
                lineTo(56.0f, 64.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 32.0f, 88.0f)
                lineTo(32.0f, 424.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                lineTo(456.0f, 448.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(480.0f, 88.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 456.0f, 64.0f)
                close()
                moveTo(331.62f, 128.2f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -43.42f, 43.42f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 331.62f, 128.2f)
                close()
                moveTo(76.0f, 416.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(64.0f, 316.37f)
                lineTo(192.64f, 202.0f)
                lineToRelative(96.95f, 96.75f)
                lineTo(172.37f, 416.0f)
                close()
                moveTo(448.0f, 404.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(217.63f, 416.0f)
                lineTo(367.16f, 266.47f)
                lineTo(448.0f, 333.84f)
                close()
            }
        }
        .build()
        return _imageSharp!!
    }

private var _imageSharp: ImageVector? = null
