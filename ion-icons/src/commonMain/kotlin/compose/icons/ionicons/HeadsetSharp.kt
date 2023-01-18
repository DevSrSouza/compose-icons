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

public val IonIcons.HeadsetSharp: ImageVector
    get() {
        if (_headsetSharp != null) {
            return _headsetSharp!!
        }
        _headsetSharp = Builder(name = "HeadsetSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(411.16f, 97.45f)
                curveTo(368.43f, 55.85f, 311.88f, 32.0f, 256.0f, 32.0f)
                reflectiveCurveTo(143.57f, 55.85f, 100.84f, 97.45f)
                curveTo(56.45f, 140.67f, 32.0f, 196.0f, 32.0f, 256.0f)
                reflectiveCurveTo(58.84f, 374.49f, 77.42f, 408.25f)
                reflectiveCurveTo(121.0f, 480.0f, 144.0f, 480.0f)
                curveToRelative(32.0f, 0.0f, 96.0f, -32.0f, 96.0f, -32.0f)
                lineTo(128.0f, 240.0f)
                lineTo(73.58f, 271.73f)
                arcToRelative(176.07f, 176.07f, 0.0f, false, true, -1.0f, -18.84f)
                curveToRelative(0.0f, -48.57f, 19.32f, -94.1f, 56.15f, -130.0f)
                curveTo(164.24f, 88.34f, 210.0f, 70.0f, 256.0f, 70.0f)
                reflectiveCurveToRelative(91.73f, 18.34f, 127.27f, 52.93f)
                curveToRelative(36.83f, 35.86f, 56.14f, 81.39f, 56.14f, 130.0f)
                arcToRelative(175.56f, 175.56f, 0.0f, false, true, -1.0f, 18.82f)
                lineTo(384.0f, 240.0f)
                lineTo(272.0f, 448.0f)
                reflectiveCurveToRelative(64.0f, 32.0f, 96.0f, 32.0f)
                curveToRelative(23.0f, 0.0f, 48.0f, -38.0f, 66.58f, -71.75f)
                reflectiveCurveTo(480.0f, 316.0f, 480.0f, 256.0f)
                reflectiveCurveTo(455.55f, 140.67f, 411.16f, 97.45f)
                close()
            }
        }
        .build()
        return _headsetSharp!!
    }

private var _headsetSharp: ImageVector? = null
