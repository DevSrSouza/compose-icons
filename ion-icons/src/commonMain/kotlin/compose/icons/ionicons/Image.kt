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

public val IonIcons.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 64.0f)
                lineTo(96.0f, 64.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, -64.0f, 64.0f)
                lineTo(32.0f, 384.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, 64.0f)
                lineTo(416.0f, 448.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(480.0f, 128.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 416.0f, 64.0f)
                close()
                moveTo(336.0f, 128.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -48.0f, 48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 336.0f, 128.0f)
                close()
                moveTo(96.0f, 416.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                lineTo(64.0f, 316.37f)
                lineToRelative(94.84f, -84.3f)
                arcToRelative(48.06f, 48.06f, 0.0f, false, true, 65.8f, 1.9f)
                lineToRelative(64.95f, 64.81f)
                lineTo(172.37f, 416.0f)
                close()
                moveTo(448.0f, 384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                lineTo(217.63f, 416.0f)
                lineTo(339.05f, 294.58f)
                arcToRelative(47.72f, 47.72f, 0.0f, false, true, 61.64f, -0.16f)
                lineTo(448.0f, 333.84f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
