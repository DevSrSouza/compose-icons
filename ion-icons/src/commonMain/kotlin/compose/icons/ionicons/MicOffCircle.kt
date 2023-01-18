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

public val IonIcons.MicOffCircle: ImageVector
    get() {
        if (_micOffCircle != null) {
            return _micOffCircle!!
        }
        _micOffCircle = Builder(name = "MicOffCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(256.0f, 128.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(48.14f, 48.14f, 0.0f, false, true, 48.0f, 48.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(47.84f, 47.84f, 0.0f, false, true, -0.63f, 7.71f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.46f, 1.0f)
                lineToRelative(-84.42f, -92.86f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.47f, -4.77f)
                arcTo(48.08f, 48.08f, 0.0f, false, true, 256.0f, 128.0f)
                close()
                moveTo(288.0f, 384.0f)
                lineTo(224.45f, 384.0f)
                curveToRelative(-8.61f, 0.0f, -16.0f, -6.62f, -16.43f, -15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 352.0f)
                horizontalLineToRelative(16.0f)
                lineTo(240.0f, 334.26f)
                arcToRelative(103.71f, 103.71f, 0.0f, false, true, -49.21f, -23.38f)
                curveTo(170.94f, 293.83f, 160.0f, 271.58f, 160.0f, 248.22f)
                lineTo(160.0f, 224.0f)
                arcToRelative(15.91f, 15.91f, 0.0f, false, true, 16.39f, -16.0f)
                arcTo(16.26f, 16.26f, 0.0f, false, true, 192.0f, 224.4f)
                verticalLineToRelative(23.82f)
                curveToRelative(0.0f, 25.66f, 28.0f, 55.48f, 64.0f, 55.48f)
                curveToRelative(1.67f, 0.0f, 3.37f, -0.09f, 5.06f, -0.24f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 3.29f, 1.29f)
                lineToRelative(21.07f, 23.19f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.89f, 3.26f)
                arcTo(100.33f, 100.33f, 0.0f, false, true, 272.0f, 334.26f)
                lineTo(272.0f, 352.0f)
                horizontalLineToRelative(15.55f)
                curveToRelative(8.61f, 0.0f, 16.0f, 6.62f, 16.43f, 15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 288.0f, 384.0f)
                close()
                moveTo(210.11f, 245.09f)
                lineToRelative(36.46f, 40.11f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.95f, 1.66f)
                arcToRelative(48.26f, 48.26f, 0.0f, false, true, -37.25f, -41.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 210.11f, 245.09f)
                close()
                moveTo(362.76f, 364.84f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.6f, -1.08f)
                lineToRelative(-192.0f, -210.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 23.68f, -21.52f)
                lineToRelative(192.0f, 210.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 362.76f, 364.84f)
                close()
                moveTo(352.0f, 248.22f)
                arcToRelative(77.12f, 77.12f, 0.0f, false, true, -11.93f, 40.87f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.19f, 0.3f)
                lineToRelative(-19.19f, -21.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.76f, -4.16f)
                arcTo(43.35f, 43.35f, 0.0f, false, false, 320.0f, 248.22f)
                verticalLineToRelative(-23.8f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, true, 13.64f, -16.24f)
                curveToRelative(9.88f, -1.48f, 18.36f, 6.51f, 18.36f, 16.12f)
                close()
            }
        }
        .build()
        return _micOffCircle!!
    }

private var _micOffCircle: ImageVector? = null
