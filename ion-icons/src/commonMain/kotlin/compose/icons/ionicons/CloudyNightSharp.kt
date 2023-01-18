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

public val IonIcons.CloudyNightSharp: ImageVector
    get() {
        if (_cloudyNightSharp != null) {
            return _cloudyNightSharp!!
        }
        _cloudyNightSharp = Builder(name = "CloudyNightSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(340.0f, 480.0f)
                horizontalLineTo(106.0f)
                curveToRelative(-29.5f, 0.0f, -54.92f, -7.83f, -73.53f, -22.64f)
                curveTo(11.23f, 440.44f, 0.0f, 415.35f, 0.0f, 384.8f)
                curveToRelative(0.0f, -29.44f, 12.09f, -54.25f, 35.0f, -71.74f)
                curveToRelative(14.55f, -11.13f, 33.41f, -18.87f, 53.2f, -22.0f)
                curveToRelative(6.06f, -36.92f, 21.92f, -68.53f, 46.29f, -92.0f)
                arcTo(139.82f, 139.82f, 0.0f, false, true, 232.0f, 160.0f)
                curveToRelative(32.33f, 0.0f, 62.15f, 10.65f, 86.24f, 30.79f)
                arcToRelative(142.41f, 142.41f, 0.0f, false, true, 40.83f, 57.05f)
                curveToRelative(27.18f, 4.48f, 51.59f, 15.68f, 69.56f, 32.08f)
                curveTo(451.77f, 301.0f, 464.0f, 329.82f, 464.0f, 363.2f)
                curveToRelative(0.0f, 32.85f, -13.13f, 62.87f, -37.0f, 84.52f)
                curveTo(404.11f, 468.54f, 373.2f, 480.0f, 340.0f, 480.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(381.55f, 219.93f)
                curveToRelative(26.5f, 6.93f, 50.0f, 19.32f, 68.65f, 36.34f)
                quadToRelative(3.89f, 3.56f, 7.47f, 7.34f)
                curveToRelative(25.41f, -18.4f, 45.47f, -44.92f, 54.33f, -71.38f)
                curveToRelative(-16.24f, 7.07f, -35.31f, 9.85f, -54.15f, 9.85f)
                curveToRelative(-73.42f, 0.0f, -115.93f, -42.51f, -115.93f, -115.93f)
                curveToRelative(0.0f, -18.84f, 2.78f, -37.91f, 9.85f, -54.15f)
                curveToRelative(-40.41f, 13.53f, -81.0f, 53.19f, -92.52f, 98.13f)
                arcToRelative(162.61f, 162.61f, 0.0f, false, true, 79.52f, 36.12f)
                arcTo(173.0f, 173.0f, 0.0f, false, true, 381.55f, 219.93f)
                close()
            }
        }
        .build()
        return _cloudyNightSharp!!
    }

private var _cloudyNightSharp: ImageVector? = null
