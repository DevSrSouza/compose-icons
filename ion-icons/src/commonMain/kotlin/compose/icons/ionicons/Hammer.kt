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

public val IonIcons.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(280.16f, 242.79f)
                lineToRelative(-26.11f, -26.12f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.14f, -0.12f)
                lineTo(27.38f, 384.08f)
                curveToRelative(-6.61f, 6.23f, -10.95f, 14.17f, -11.35f, 23.06f)
                arcToRelative(32.11f, 32.11f, 0.0f, false, false, 9.21f, 23.94f)
                lineToRelative(39.0f, 39.43f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, false, 0.07f, 0.07f)
                arcTo(32.29f, 32.29f, 0.0f, false, false, 87.0f, 480.0f)
                lineToRelative(1.18f, 0.0f)
                curveToRelative(8.89f, -0.33f, 16.85f, -4.5f, 23.17f, -11.17f)
                lineToRelative(168.7f, -180.7f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 280.16f, 242.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(490.0f, 190.0f)
                lineToRelative(-0.31f, -0.31f)
                lineToRelative(-34.27f, -33.92f)
                arcToRelative(21.46f, 21.46f, 0.0f, false, false, -15.28f, -6.26f)
                arcToRelative(21.89f, 21.89f, 0.0f, false, false, -12.79f, 4.14f)
                curveToRelative(0.0f, -0.43f, 0.06f, -0.85f, 0.09f, -1.22f)
                curveToRelative(0.45f, -6.5f, 1.15f, -16.32f, -5.2f, -25.22f)
                arcToRelative(258.0f, 258.0f, 0.0f, false, false, -24.8f, -28.74f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.08f, -0.08f)
                curveToRelative(-13.32f, -13.12f, -42.31f, -37.83f, -86.72f, -55.94f)
                arcTo(139.55f, 139.55f, 0.0f, false, false, 257.56f, 32.0f)
                curveTo(226.0f, 32.0f, 202.0f, 46.24f, 192.81f, 54.68f)
                arcTo(119.92f, 119.92f, 0.0f, false, false, 178.63f, 70.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 18.65f, 24.34f)
                arcToRelative(74.45f, 74.45f, 0.0f, false, true, 8.58f, -2.63f)
                arcToRelative(63.46f, 63.46f, 0.0f, false, true, 18.45f, -1.15f)
                curveTo(237.5f, 92.55f, 253.1f, 99.1f, 260.0f, 104.55f)
                curveToRelative(11.7f, 9.41f, 17.33f, 22.09f, 18.26f, 41.09f)
                curveToRelative(0.18f, 3.82f, -7.72f, 18.14f, -20.0f, 34.48f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 1.45f, 21.0f)
                lineToRelative(34.41f, 34.41f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.0f, 0.62f)
                curveToRelative(9.73f, -8.69f, 24.55f, -21.79f, 29.73f, -25.0f)
                curveToRelative(7.69f, -4.73f, 13.19f, -5.64f, 14.7f, -5.8f)
                arcToRelative(19.18f, 19.18f, 0.0f, false, true, 11.29f, 2.38f)
                arcToRelative(1.24f, 1.24f, 0.0f, false, true, -0.31f, 0.95f)
                lineToRelative(-1.82f, 1.73f)
                lineToRelative(-0.3f, 0.28f)
                arcToRelative(21.52f, 21.52f, 0.0f, false, false, 0.05f, 30.54f)
                lineToRelative(34.26f, 33.91f)
                arcTo(21.45f, 21.45f, 0.0f, false, false, 419.0f, 281.39f)
                arcToRelative(21.7f, 21.7f, 0.0f, false, false, 15.22f, -6.2f)
                lineToRelative(55.5f, -54.82f)
                curveToRelative(0.19f, -0.19f, 0.38f, -0.39f, 0.56f, -0.59f)
                arcTo(21.87f, 21.87f, 0.0f, false, false, 490.0f, 190.0f)
                close()
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
