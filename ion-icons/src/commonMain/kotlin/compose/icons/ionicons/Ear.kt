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

public val IonIcons.Ear: ImageVector
    get() {
        if (_ear != null) {
            return _ear!!
        }
        _ear = Builder(name = "Ear", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 16.0f)
                curveTo(159.0f, 16.0f, 80.0f, 95.0f, 80.0f, 192.0f)
                lineTo(80.0f, 398.57f)
                arcToRelative(97.59f, 97.59f, 0.0f, false, false, 28.0f, 68.49f)
                arcTo(94.51f, 94.51f, 0.0f, false, false, 176.0f, 496.0f)
                curveToRelative(36.86f, 0.0f, 67.18f, -15.62f, 90.12f, -46.42f)
                curveToRelative(4.48f, -6.0f, 9.55f, -14.74f, 15.42f, -24.85f)
                curveToRelative(15.32f, -26.37f, 36.29f, -62.47f, 63.17f, -80.74f)
                curveToRelative(25.77f, -17.51f, 47.23f, -39.54f, 62.0f, -63.72f)
                curveTo(423.51f, 252.94f, 432.0f, 223.24f, 432.0f, 192.0f)
                curveTo(432.0f, 95.0f, 353.05f, 16.0f, 256.0f, 16.0f)
                close()
                moveTo(352.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                curveToRelative(0.0f, -39.7f, -35.89f, -72.0f, -80.0f, -72.0f)
                reflectiveCurveToRelative(-80.0f, 32.3f, -80.0f, 72.0f)
                verticalLineToRelative(30.42f)
                curveToRelative(27.19f, -7.84f, 58.4f, -6.72f, 64.28f, -6.42f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 38.6f, 75.9f)
                curveToRelative(-0.3f, 0.41f, -0.61f, 0.81f, -0.95f, 1.2f)
                curveToRelative(-16.55f, 19.0f, -36.0f, 45.48f, -38.46f, 55.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -30.94f, -8.14f)
                curveToRelative(5.51f, -20.94f, 36.93f, -58.2f, 44.66f, -67.15f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 239.82f, 240.0f)
                lineToRelative(-0.88f, 0.0f)
                curveToRelative(-16.6f, -0.89f, -45.89f, 0.8f, -62.94f, 8.31f)
                lineTo(176.0f, 304.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(144.0f, 184.0f)
                curveToRelative(0.0f, -57.35f, 50.24f, -104.0f, 112.0f, -104.0f)
                reflectiveCurveToRelative(112.0f, 46.65f, 112.0f, 104.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 352.0f, 200.0f)
                close()
            }
        }
        .build()
        return _ear!!
    }

private var _ear: ImageVector? = null
