package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Git: ImageVector
    get() {
        if (_git != null) {
            return _git!!
        }
        _git = Builder(name = "Git", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.29f, 158.39f)
                lineTo(137.0f, 158.39f)
                curveTo(97.0f, 147.9f, 6.51f, 150.63f, 6.51f, 233.18f)
                curveToRelative(0.0f, 30.09f, 15.0f, 51.23f, 35.0f, 61.0f)
                curveToRelative(-25.1f, 23.0f, -37.0f, 33.85f, -37.0f, 49.21f)
                curveToRelative(0.0f, 11.0f, 4.47f, 21.14f, 17.89f, 26.81f)
                curveTo(8.13f, 383.61f, 0.0f, 393.35f, 0.0f, 411.65f)
                curveToRelative(0.0f, 32.11f, 28.05f, 50.82f, 101.63f, 50.82f)
                curveToRelative(70.75f, 0.0f, 111.79f, -26.42f, 111.79f, -73.18f)
                curveToRelative(0.0f, -58.66f, -45.16f, -56.5f, -151.63f, -63.0f)
                lineToRelative(13.43f, -21.55f)
                curveToRelative(27.27f, 7.58f, 118.7f, 10.0f, 118.7f, -67.89f)
                curveToRelative(0.0f, -18.7f, -7.73f, -31.71f, -15.0f, -41.07f)
                lineToRelative(37.41f, -2.84f)
                close()
                moveTo(152.87f, 400.29f)
                curveToRelative(0.0f, 32.06f, -104.89f, 32.1f, -104.89f, 2.43f)
                curveToRelative(0.0f, -8.14f, 5.27f, -15.0f, 10.57f, -21.54f)
                curveToRelative(77.71f, 5.3f, 94.32f, 3.37f, 94.32f, 19.11f)
                close()
                moveTo(102.06f, 265.71f)
                curveToRelative(-52.8f, 0.0f, -50.46f, -71.16f, 1.2f, -71.16f)
                curveToRelative(49.54f, 0.0f, 50.82f, 71.16f, -1.2f, 71.16f)
                close()
                moveTo(235.36f, 366.22f)
                verticalLineToRelative(-32.1f)
                curveToRelative(26.75f, -3.66f, 27.24f, -2.0f, 27.24f, -11.0f)
                lineTo(262.6f, 203.61f)
                curveToRelative(0.0f, -8.5f, -2.05f, -7.38f, -27.24f, -16.26f)
                lineToRelative(4.47f, -32.92f)
                lineTo(324.0f, 154.43f)
                verticalLineToRelative(168.71f)
                curveToRelative(0.0f, 6.51f, 0.4f, 7.32f, 6.51f, 8.14f)
                lineToRelative(20.73f, 2.84f)
                verticalLineToRelative(32.1f)
                close()
                moveTo(287.81f, 121.91f)
                curveToRelative(-23.17f, 0.0f, -36.59f, -13.43f, -36.59f, -36.61f)
                reflectiveCurveToRelative(13.42f, -35.77f, 36.59f, -35.77f)
                curveToRelative(23.58f, 0.0f, 37.0f, 12.62f, 37.0f, 35.77f)
                reflectiveCurveToRelative(-13.42f, 36.61f, -37.0f, 36.61f)
                close()
                moveTo(512.0f, 350.46f)
                curveToRelative(-17.49f, 8.53f, -43.1f, 16.26f, -66.28f, 16.26f)
                curveToRelative(-48.38f, 0.0f, -66.67f, -19.5f, -66.67f, -65.46f)
                lineTo(379.05f, 194.75f)
                curveToRelative(0.0f, -5.42f, 1.05f, -4.06f, -31.71f, -4.06f)
                lineTo(347.34f, 154.5f)
                curveToRelative(35.78f, -4.07f, 50.0f, -22.0f, 54.47f, -66.27f)
                horizontalLineToRelative(38.63f)
                curveToRelative(0.0f, 65.83f, -1.34f, 61.81f, 3.26f, 61.81f)
                lineTo(501.0f, 150.04f)
                verticalLineToRelative(40.65f)
                horizontalLineToRelative(-60.56f)
                verticalLineToRelative(97.15f)
                curveToRelative(0.0f, 6.92f, -4.92f, 51.41f, 60.57f, 26.84f)
                close()
            }
        }
        .build()
        return _git!!
    }

private var _git: ImageVector? = null
