package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Icq: ImageVector
    get() {
        if (_icq != null) {
            return _icq!!
        }
        _icq = Builder(name = "Icq", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.189f, 0.0f)
                arcToRelative(3.784f, 3.784f, 0.0f, false, false, -3.055f, 5.93f)
                lineToRelative(1.741f, 2.562f)
                arcToRelative(1.855f, 1.855f, 0.0f, false, false, 3.334f, -0.13f)
                lineToRelative(1.454f, -2.929f)
                horizontalLineToRelative(-0.006f)
                arcTo(3.784f, 3.784f, 0.0f, false, false, 10.189f, 0.0f)
                close()
                moveTo(19.362f, 4.496f)
                arcToRelative(4.235f, 4.235f, 0.0f, false, false, -1.662f, 0.306f)
                arcToRelative(4.23f, 4.23f, 0.0f, false, false, -1.817f, 1.396f)
                lineToRelative(-2.214f, 2.837f)
                curveToRelative(-0.025f, 0.032f, -0.05f, 0.063f, -0.074f, 0.096f)
                lineToRelative(-0.01f, 0.012f)
                arcToRelative(2.088f, 2.088f, 0.0f, false, false, 1.509f, 3.306f)
                lineToRelative(3.614f, 0.536f)
                lineToRelative(-0.003f, -0.007f)
                arcToRelative(4.259f, 4.259f, 0.0f, false, false, 4.532f, -5.807f)
                arcToRelative(4.264f, 4.264f, 0.0f, false, false, -3.875f, -2.675f)
                close()
                moveTo(3.586f, 7.242f)
                arcTo(3.154f, 3.154f, 0.0f, false, false, 0.55f, 9.628f)
                arcToRelative(3.151f, 3.151f, 0.0f, false, false, 3.903f, 3.804f)
                lineToRelative(2.539f, -0.737f)
                arcToRelative(1.545f, 1.545f, 0.0f, false, false, 0.742f, -2.673f)
                lineTo(5.79f, 8.118f)
                verticalLineToRelative(0.005f)
                arcToRelative(3.13f, 3.13f, 0.0f, false, false, -2.204f, -0.881f)
                close()
                moveTo(13.9f, 13.959f)
                arcToRelative(1.886f, 1.886f, 0.0f, false, false, -1.858f, 2.233f)
                lineToRelative(0.387f, 3.263f)
                lineToRelative(0.005f, -0.003f)
                arcToRelative(3.846f, 3.846f, 0.0f, false, false, 6.134f, 2.574f)
                arcToRelative(3.846f, 3.846f, 0.0f, false, false, -0.9f, -6.645f)
                lineToRelative(-2.877f, -1.197f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, -0.89f, -0.225f)
                close()
                moveTo(8.35f, 14.039f)
                curveToRelative(-0.377f, 0.0f, -0.75f, 0.104f, -1.076f, 0.3f)
                lineTo(4.06f, 16.018f)
                lineToRelative(0.006f, 0.003f)
                arcToRelative(4.21f, 4.21f, 0.0f, false, false, -1.593f, 1.485f)
                arcToRelative(4.24f, 4.24f, 0.0f, false, false, 1.342f, 5.843f)
                arcToRelative(4.239f, 4.239f, 0.0f, false, false, 5.845f, -1.332f)
                arcToRelative(4.21f, 4.21f, 0.0f, false, false, 0.647f, -2.172f)
                lineToRelative(0.108f, -3.45f)
                arcToRelative(2.079f, 2.079f, 0.0f, false, false, -2.062f, -2.356f)
                close()
            }
        }
        .build()
        return _icq!!
    }

private var _icq: ImageVector? = null
