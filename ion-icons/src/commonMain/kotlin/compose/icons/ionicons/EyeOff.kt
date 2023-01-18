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

public val IonIcons.EyeOff: ImageVector
    get() {
        if (_eyeOff != null) {
            return _eyeOff!!
        }
        _eyeOff = Builder(name = "EyeOff", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 448.0f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, true, -11.31f, -4.69f)
                lineToRelative(-352.0f, -352.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 91.31f, 68.69f)
                lineToRelative(352.0f, 352.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 432.0f, 448.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 315.85f)
                lineToRelative(-51.79f, -51.79f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.39f, 1.69f)
                arcToRelative(64.11f, 64.11f, 0.0f, false, false, 53.49f, 53.49f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 248.0f, 315.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(264.0f, 196.15f)
                lineTo(315.87f, 248.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.4f, -1.69f)
                arcToRelative(64.13f, 64.13f, 0.0f, false, false, -53.55f, -53.55f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 264.0f, 196.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(491.0f, 273.36f)
                arcToRelative(32.2f, 32.2f, 0.0f, false, false, -0.1f, -34.76f)
                curveToRelative(-26.46f, -40.92f, -60.79f, -75.68f, -99.27f, -100.53f)
                curveTo(349.0f, 110.55f, 302.0f, 96.0f, 255.68f, 96.0f)
                arcToRelative(226.54f, 226.54f, 0.0f, false, false, -71.82f, 11.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.56f, 6.63f)
                lineToRelative(47.24f, 47.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.82f, 1.05f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 116.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.05f, 3.81f)
                lineToRelative(67.95f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.4f, 0.24f)
                arcTo(343.81f, 343.81f, 0.0f, false, false, 491.0f, 273.36f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 352.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, -93.3f, -118.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.05f, -3.81f)
                lineTo(94.81f, 162.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.41f, -0.23f)
                curveToRelative(-24.39f, 20.81f, -47.0f, 46.13f, -67.67f, 75.72f)
                arcToRelative(31.92f, 31.92f, 0.0f, false, false, -0.64f, 35.54f)
                curveToRelative(26.41f, 41.33f, 60.39f, 76.14f, 98.28f, 100.65f)
                curveTo(162.06f, 402.0f, 207.92f, 416.0f, 255.68f, 416.0f)
                arcToRelative(238.22f, 238.22f, 0.0f, false, false, 72.64f, -11.55f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.61f, -6.64f)
                lineToRelative(-47.47f, -47.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.81f, -1.05f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 256.0f, 352.0f)
                close()
            }
        }
        .build()
        return _eyeOff!!
    }

private var _eyeOff: ImageVector? = null
