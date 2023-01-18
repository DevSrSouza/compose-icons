package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.VolumeLowSharp: ImageVector
    get() {
        if (_volumeLowSharp != null) {
            return _volumeLowSharp!!
        }
        _volumeLowSharp = Builder(name = "VolumeLowSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(391.12f, 341.48f)
                lineToRelative(-28.6f, -14.36f)
                lineToRelative(7.18f, -14.3f)
                curveToRelative(9.49f, -18.9f, 14.3f, -38.0f, 14.3f, -56.82f)
                curveToRelative(0.0f, -19.36f, -4.66f, -37.92f, -14.25f, -56.73f)
                lineTo(362.48f, 185.0f)
                lineTo(391.0f, 170.48f)
                lineToRelative(7.26f, 14.25f)
                curveTo(410.2f, 208.16f, 416.0f, 231.47f, 416.0f, 256.0f)
                curveToRelative(0.0f, 23.83f, -6.0f, 47.78f, -17.7f, 71.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(189.65f, 176.1f)
                lineToRelative(-93.65f, 0.0f)
                lineToRelative(0.0f, 159.8f)
                lineToRelative(93.65f, 0.0f)
                lineToRelative(130.35f, 104.1f)
                lineToRelative(0.0f, -368.0f)
                lineToRelative(-130.35f, 104.1f)
                close()
            }
        }
        .build()
        return _volumeLowSharp!!
    }

private var _volumeLowSharp: ImageVector? = null
