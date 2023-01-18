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

public val IonIcons.LogoPython: ImageVector
    get() {
        if (_logoPython != null) {
            return _logoPython!!
        }
        _logoPython = Builder(name = "LogoPython", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(314.0f, 36.38f)
                curveToRelative(-18.59f, -3.06f, -45.8f, -4.47f, -64.27f, -4.38f)
                arcToRelative(311.09f, 311.09f, 0.0f, false, false, -51.66f, 4.38f)
                curveToRelative(-45.74f, 8.0f, -54.07f, 24.7f, -54.07f, 55.54f)
                verticalLineTo(128.0f)
                horizontalLineTo(256.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(107.62f)
                curveTo(66.06f, 144.0f, 32.33f, 193.67f, 32.0f, 255.12f)
                curveToRelative(0.0f, 0.29f, 0.0f, 0.58f, 0.0f, 0.88f)
                arcToRelative(162.91f, 162.91f, 0.0f, false, false, 3.13f, 32.0f)
                curveToRelative(9.29f, 46.28f, 38.23f, 80.0f, 72.49f, 80.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(314.0f)
                curveToRelative(0.0f, -31.3f, 20.84f, -59.95f, 55.0f, -66.1f)
                lineToRelative(9.87f, -1.23f)
                horizontalLineTo(314.0f)
                arcToRelative(56.05f, 56.05f, 0.0f, false, false, 15.06f, -2.0f)
                arcTo(52.48f, 52.48f, 0.0f, false, false, 368.0f, 193.68f)
                verticalLineTo(91.92f)
                curveTo(368.0f, 63.0f, 343.32f, 41.19f, 314.0f, 36.38f)
                close()
                moveTo(194.93f, 105.5f)
                arcToRelative(20.37f, 20.37f, 0.0f, true, true, 20.3f, -20.3f)
                arcTo(20.29f, 20.29f, 0.0f, false, true, 194.93f, 105.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(475.28f, 217.0f)
                curveToRelative(-10.7f, -42.61f, -38.41f, -73.0f, -70.9f, -73.0f)
                horizontalLineTo(386.67f)
                verticalLineToRelative(47.45f)
                curveToRelative(0.0f, 39.57f, -26.0f, 68.22f, -57.74f, 73.13f)
                arcToRelative(63.54f, 63.54f, 0.0f, false, true, -9.69f, 0.75f)
                horizontalLineTo(198.08f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -15.23f, 1.95f)
                curveTo(160.54f, 273.14f, 144.0f, 291.7f, 144.0f, 315.77f)
                verticalLineTo(417.54f)
                curveToRelative(0.0f, 29.0f, 29.14f, 46.0f, 57.73f, 54.31f)
                curveToRelative(34.21f, 9.95f, 71.48f, 11.75f, 112.42f, 0.0f)
                curveToRelative(27.19f, -7.77f, 53.85f, -23.48f, 53.85f, -54.31f)
                verticalLineTo(384.0f)
                horizontalLineTo(256.0f)
                verticalLineTo(368.0f)
                horizontalLineTo(404.38f)
                curveToRelative(29.44f, 0.0f, 54.95f, -24.93f, 67.45f, -61.31f)
                arcTo(156.83f, 156.83f, 0.0f, false, false, 480.0f, 256.0f)
                arcTo(160.64f, 160.64f, 0.0f, false, false, 475.28f, 217.0f)
                close()
                moveTo(316.51f, 404.0f)
                arcToRelative(20.37f, 20.37f, 0.0f, true, true, -20.3f, 20.3f)
                arcTo(20.29f, 20.29f, 0.0f, false, true, 316.51f, 404.0f)
                close()
            }
        }
        .build()
        return _logoPython!!
    }

private var _logoPython: ImageVector? = null
