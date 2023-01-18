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

public val IonIcons.FileTray: ImageVector
    get() {
        if (_fileTray != null) {
            return _fileTray!!
        }
        _fileTray = Builder(name = "FileTray", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(479.66f, 268.7f)
                lineToRelative(-32.0f, -151.81f)
                curveTo(441.48f, 83.77f, 417.68f, 64.0f, 384.0f, 64.0f)
                lineTo(128.0f, 64.0f)
                curveToRelative(-16.8f, 0.0f, -31.0f, 4.69f, -42.1f, 13.94f)
                reflectiveCurveToRelative(-18.37f, 22.31f, -21.58f, 38.89f)
                lineToRelative(-32.0f, 151.87f)
                arcTo(16.65f, 16.65f, 0.0f, false, false, 32.0f, 272.0f)
                lineTo(32.0f, 384.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                lineTo(416.0f, 448.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(480.0f, 272.0f)
                arcTo(16.65f, 16.65f, 0.0f, false, false, 479.66f, 268.7f)
                close()
                moveTo(95.66f, 123.3f)
                curveToRelative(0.0f, -0.1f, 0.0f, -0.19f, 0.0f, -0.28f)
                curveToRelative(3.55f, -18.43f, 13.81f, -27.0f, 32.29f, -27.0f)
                lineTo(384.0f, 96.02f)
                curveToRelative(18.61f, 0.0f, 28.87f, 8.55f, 32.27f, 26.91f)
                curveToRelative(0.0f, 0.13f, 0.05f, 0.26f, 0.07f, 0.39f)
                lineToRelative(26.93f, 127.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.92f, 4.82f)
                lineTo(320.0f, 256.02f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, false, -16.0f, 15.82f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                arcTo(15.92f, 15.92f, 0.0f, false, false, 192.0f, 256.0f)
                lineTo(72.65f, 256.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.92f, -4.82f)
                close()
            }
        }
        .build()
        return _fileTray!!
    }

private var _fileTray: ImageVector? = null
