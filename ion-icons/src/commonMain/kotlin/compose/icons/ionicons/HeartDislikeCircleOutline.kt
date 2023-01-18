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

public val IonIcons.HeartDislikeCircleOutline: ImageVector
    get() {
        if (_heartDislikeCircleOutline != null) {
            return _heartDislikeCircleOutline!!
        }
        _heartDislikeCircleOutline = Builder(name = "HeartDislikeCircleOutline", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 256.0f)
                curveToRelative(0.0f, -106.0f, -86.0f, -192.0f, -192.0f, -192.0f)
                reflectiveCurveTo(64.0f, 150.0f, 64.0f, 256.0f)
                reflectiveCurveToRelative(86.0f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveTo(448.0f, 362.0f, 448.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(333.2f, 297.69f)
                curveToRelative(18.28f, -23.39f, 27.06f, -47.43f, 26.79f, -73.37f)
                curveToRelative(-0.31f, -31.06f, -25.22f, -56.33f, -55.53f, -56.33f)
                curveToRelative(-20.4f, 0.0f, -35.0f, 10.64f, -44.11f, 20.42f)
                arcToRelative(5.93f, 5.93f, 0.0f, false, true, -8.7f, 0.0f)
                curveToRelative(-9.11f, -9.78f, -23.71f, -20.42f, -44.11f, -20.42f)
                lineTo(206.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.75f, 6.84f)
                lineToRelative(124.0f, 123.21f)
                arcTo(3.92f, 3.92f, 0.0f, false, false, 333.2f, 297.69f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(158.84f, 221.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.82f, 2.72f)
                curveToRelative(0.0f, 0.21f, 0.0f, 0.43f, 0.0f, 0.64f)
                curveToRelative(-0.28f, 27.1f, 9.31f, 52.13f, 29.3f, 76.5f)
                curveToRelative(9.38f, 11.44f, 26.4f, 29.73f, 65.7f, 56.41f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, 18.0f, 0.0f)
                curveToRelative(5.15f, -3.49f, 9.9f, -6.84f, 14.31f, -10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.46f, -6.07f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 368.0f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, true, -11.31f, -4.69f)
                lineToRelative(-176.0f, -176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.62f, -22.62f)
                lineToRelative(176.0f, 176.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 336.0f, 368.0f)
                close()
            }
        }
        .build()
        return _heartDislikeCircleOutline!!
    }

private var _heartDislikeCircleOutline: ImageVector? = null
