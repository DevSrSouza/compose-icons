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

public val IonIcons.LogoDribbble: ImageVector
    get() {
        if (_logoDribbble != null) {
            return _logoDribbble!!
        }
        _logoDribbble = Builder(name = "LogoDribbble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveTo(132.33f, 32.0f, 32.0f, 132.33f, 32.0f, 256.0f)
                reflectiveCurveTo(132.33f, 480.0f, 256.0f, 480.0f)
                reflectiveCurveTo(480.0f, 379.78f, 480.0f, 256.0f)
                reflectiveCurveTo(379.67f, 32.0f, 256.0f, 32.0f)
                close()
                moveTo(398.22f, 135.25f)
                arcToRelative(186.36f, 186.36f, 0.0f, false, true, 44.0f, 108.38f)
                curveToRelative(-40.37f, -2.1f, -88.67f, -2.1f, -127.4f, 1.52f)
                curveToRelative(-4.9f, -12.37f, -9.92f, -24.5f, -15.4f, -36.17f)
                curveTo(344.08f, 189.62f, 378.5f, 164.18f, 398.22f, 135.25f)
                close()
                moveTo(256.0f, 69.33f)
                arcToRelative(185.81f, 185.81f, 0.0f, false, true, 119.12f, 42.94f)
                curveToRelative(-20.3f, 25.66f, -52.15f, 48.0f, -91.82f, 64.86f)
                curveTo(261.6f, 137.0f, 236.63f, 102.47f, 210.0f, 75.28f)
                arcTo(187.51f, 187.51f, 0.0f, false, true, 256.0f, 69.33f)
                close()
                moveTo(171.53f, 89.75f)
                curveToRelative(26.95f, 26.83f, 52.27f, 61.0f, 74.44f, 101.0f)
                curveTo(203.85f, 203.62f, 155.55f, 211.0f, 104.0f, 211.0f)
                curveToRelative(-9.8f, 0.0f, -19.36f, -0.35f, -28.81f, -0.94f)
                arcTo(186.78f, 186.78f, 0.0f, false, true, 171.53f, 89.75f)
                close()
                moveTo(69.68f, 247.13f)
                curveToRelative(10.62f, 0.47f, 21.35f, 0.7f, 32.2f, 0.59f)
                curveToRelative(58.8f, -0.7f, 113.52f, -9.92f, 160.54f, -25.0f)
                quadToRelative(6.65f, 13.83f, 12.6f, 28.35f)
                arcToRelative(115.43f, 115.43f, 0.0f, false, false, -16.69f, 5.0f)
                curveTo(194.05f, 283.07f, 143.42f, 326.58f, 116.0f, 379.2f)
                arcTo(186.0f, 186.0f, 0.0f, false, true, 69.33f, 256.0f)
                curveTo(69.33f, 253.0f, 69.45f, 250.05f, 69.68f, 247.13f)
                close()
                moveTo(256.0f, 442.67f)
                arcToRelative(185.57f, 185.57f, 0.0f, false, true, -114.45f, -39.32f)
                curveToRelative(24.85f, -49.23f, 69.18f, -90.0f, 125.07f, -115.27f)
                curveToRelative(5.25f, -2.45f, 12.25f, -4.43f, 20.3f, -6.18f)
                quadToRelative(10.0f, 27.64f, 17.85f, 57.4f)
                arcTo(678.0f, 678.0f, 0.0f, false, true, 322.0f, 430.42f)
                arcTo(185.06f, 185.06f, 0.0f, false, true, 256.0f, 442.67f)
                close()
                moveTo(356.92f, 412.92f)
                arcToRelative(672.61f, 672.61f, 0.0f, false, false, -17.39f, -92.05f)
                curveToRelative(-4.0f, -15.17f, -8.51f, -29.87f, -13.41f, -44.22f)
                curveToRelative(36.63f, -3.0f, 80.5f, -2.57f, 115.38f, 0.0f)
                arcTo(186.5f, 186.5f, 0.0f, false, true, 356.92f, 412.92f)
                close()
            }
        }
        .build()
        return _logoDribbble!!
    }

private var _logoDribbble: ImageVector? = null
