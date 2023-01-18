package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BoatOutline: ImageVector
    get() {
        if (_boatOutline != null) {
            return _boatOutline!!
        }
        _boatOutline = Builder(name = "BoatOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(461.93f, 261.05f)
                curveToRelative(-2.0f, -4.76f, -6.71f, -7.83f, -11.67f, -9.49f)
                lineTo(263.08f, 177.08f)
                arcToRelative(23.78f, 23.78f, 0.0f, false, false, -14.17f, 0.0f)
                lineToRelative(-187.0f, 74.52f)
                curveToRelative(-5.0f, 1.56f, -9.83f, 4.77f, -11.81f, 9.53f)
                reflectiveCurveToRelative(-2.94f, 9.37f, -1.0f, 15.08f)
                lineTo(95.63f, 395.36f)
                arcTo(7.46f, 7.46f, 0.0f, false, false, 103.1f, 400.0f)
                curveToRelative(26.69f, -1.68f, 50.31f, -15.23f, 68.38f, -32.5f)
                arcToRelative(7.66f, 7.66f, 0.0f, false, true, 10.49f, 0.0f)
                curveTo(201.29f, 386.0f, 227.0f, 400.0f, 256.0f, 400.0f)
                reflectiveCurveToRelative(54.56f, -14.0f, 73.88f, -32.54f)
                arcToRelative(7.67f, 7.67f, 0.0f, false, true, 10.5f, 0.0f)
                curveToRelative(18.07f, 17.28f, 41.69f, 30.86f, 68.38f, 32.54f)
                arcToRelative(7.45f, 7.45f, 0.0f, false, false, 7.46f, -4.61f)
                lineToRelative(46.7f, -119.16f)
                curveTo(464.9f, 271.45f, 463.91f, 265.82f, 461.93f, 261.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 473.14f)
                arcToRelative(6.84f, 6.84f, 0.0f, false, false, -3.56f, -6.0f)
                curveToRelative(-27.08f, -14.55f, -51.77f, -36.82f, -62.63f, -48.0f)
                arcToRelative(10.05f, 10.05f, 0.0f, false, false, -12.72f, -1.51f)
                curveToRelative(-50.33f, 32.42f, -111.61f, 32.44f, -161.95f, 0.05f)
                arcToRelative(10.09f, 10.09f, 0.0f, false, false, -12.82f, 1.56f)
                curveToRelative(-10.77f, 11.28f, -35.19f, 33.3f, -62.43f, 47.75f)
                arcTo(7.15f, 7.15f, 0.0f, false, false, 96.0f, 472.72f)
                arcToRelative(6.73f, 6.73f, 0.0f, false, false, 7.92f, 7.15f)
                curveToRelative(20.85f, -4.18f, 41.0f, -13.68f, 60.2f, -23.83f)
                arcToRelative(8.71f, 8.71f, 0.0f, false, true, 8.0f, -0.06f)
                arcTo(185.14f, 185.14f, 0.0f, false, false, 340.0f, 456.0f)
                arcToRelative(8.82f, 8.82f, 0.0f, false, true, 8.09f, 0.06f)
                curveToRelative(19.1f, 10.0f, 39.22f, 19.59f, 60.0f, 23.8f)
                arcToRelative(6.72f, 6.72f, 0.0f, false, false, 7.95f, -6.71f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 96.0f)
                verticalLineTo(72.0f)
                arcToRelative(24.07f, 24.07f, 0.0f, false, false, -24.0f, -24.0f)
                horizontalLineTo(216.0f)
                arcToRelative(24.07f, 24.07f, 0.0f, false, false, -24.0f, 24.0f)
                verticalLineTo(96.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.0f, 233.0f)
                verticalLineTo(144.0f)
                arcToRelative(48.14f, 48.14f, 0.0f, false, false, -48.0f, -48.0f)
                horizontalLineTo(144.0f)
                arcToRelative(48.14f, 48.14f, 0.0f, false, false, -48.0f, 48.0f)
                verticalLineToRelative(92.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 183.6f)
                lineTo(256.0f, 396.45f)
            }
        }
        .build()
        return _boatOutline!!
    }

private var _boatOutline: ImageVector? = null
