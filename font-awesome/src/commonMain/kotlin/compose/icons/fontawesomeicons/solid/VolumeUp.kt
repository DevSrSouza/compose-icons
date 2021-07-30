package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.VolumeUp: ImageVector
    get() {
        if (_volumeUp != null) {
            return _volumeUp!!
        }
        _volumeUp = Builder(name = "VolumeUp", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.03f, 71.05f)
                lineTo(126.06f, 160.0f)
                lineTo(24.0f, 160.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(144.0f)
                curveToRelative(0.0f, 13.25f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(102.06f)
                lineToRelative(88.97f, 88.95f)
                curveToRelative(15.03f, 15.03f, 40.97f, 4.47f, 40.97f, -16.97f)
                lineTo(256.0f, 88.02f)
                curveToRelative(0.0f, -21.46f, -25.96f, -31.98f, -40.97f, -16.97f)
                close()
                moveTo(448.35f, 19.97f)
                curveToRelative(-11.17f, -7.33f, -26.18f, -4.24f, -33.51f, 6.95f)
                curveToRelative(-7.34f, 11.17f, -4.22f, 26.18f, 6.95f, 33.51f)
                curveToRelative(66.27f, 43.49f, 105.82f, 116.6f, 105.82f, 195.58f)
                curveToRelative(0.0f, 78.98f, -39.55f, 152.09f, -105.82f, 195.58f)
                curveToRelative(-11.17f, 7.32f, -14.29f, 22.34f, -6.95f, 33.5f)
                curveToRelative(7.04f, 10.71f, 21.93f, 14.56f, 33.51f, 6.95f)
                curveTo(528.27f, 439.58f, 576.0f, 351.33f, 576.0f, 256.0f)
                reflectiveCurveTo(528.27f, 72.43f, 448.35f, 19.97f)
                close()
                moveTo(480.0f, 256.0f)
                curveToRelative(0.0f, -63.53f, -32.06f, -121.94f, -85.77f, -156.24f)
                curveToRelative(-11.19f, -7.14f, -26.03f, -3.82f, -33.12f, 7.46f)
                reflectiveCurveToRelative(-3.78f, 26.21f, 7.41f, 33.36f)
                curveTo(408.27f, 165.97f, 432.0f, 209.11f, 432.0f, 256.0f)
                reflectiveCurveToRelative(-23.73f, 90.03f, -63.48f, 115.42f)
                curveToRelative(-11.19f, 7.14f, -14.5f, 22.07f, -7.41f, 33.36f)
                curveToRelative(6.51f, 10.36f, 21.12f, 15.14f, 33.12f, 7.46f)
                curveTo(447.94f, 377.94f, 480.0f, 319.54f, 480.0f, 256.0f)
                close()
                moveTo(338.23f, 179.13f)
                curveToRelative(-11.58f, -6.33f, -26.19f, -2.16f, -32.61f, 9.45f)
                curveToRelative(-6.39f, 11.61f, -2.16f, 26.2f, 9.45f, 32.61f)
                curveTo(327.98f, 228.28f, 336.0f, 241.63f, 336.0f, 256.0f)
                curveToRelative(0.0f, 14.38f, -8.02f, 27.72f, -20.92f, 34.81f)
                curveToRelative(-11.61f, 6.41f, -15.84f, 21.0f, -9.45f, 32.61f)
                curveToRelative(6.43f, 11.66f, 21.05f, 15.8f, 32.61f, 9.45f)
                curveToRelative(28.23f, -15.55f, 45.77f, -45.0f, 45.77f, -76.88f)
                reflectiveCurveToRelative(-17.54f, -61.32f, -45.78f, -76.86f)
                close()
            }
        }
        .build()
        return _volumeUp!!
    }

private var _volumeUp: ImageVector? = null
