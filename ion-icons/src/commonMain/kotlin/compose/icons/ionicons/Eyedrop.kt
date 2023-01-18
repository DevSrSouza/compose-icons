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

public val IonIcons.Eyedrop: ImageVector
    get() {
        if (_eyedrop != null) {
            return _eyedrop!!
        }
        _eyedrop = Builder(name = "Eyedrop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(461.05f, 51.0f)
                arcToRelative(65.0f, 65.0f, 0.0f, false, false, -45.71f, -19.0f)
                horizontalLineToRelative(-0.76f)
                arcToRelative(61.81f, 61.81f, 0.0f, false, false, -44.36f, 19.25f)
                arcToRelative(12.81f, 12.81f, 0.0f, false, false, -1.07f, 1.25f)
                lineToRelative(-54.0f, 69.76f)
                curveToRelative(-5.62f, 7.1f, -12.74f, 8.68f, -16.78f, 4.64f)
                lineTo(296.47f, 125.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -67.92f, 67.92f)
                lineToRelative(9.91f, 9.91f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.83f)
                lineTo(58.7f, 385.38f)
                curveTo(54.0f, 390.05f, 46.9f, 399.85f, 38.85f, 431.0f)
                curveToRelative(-4.06f, 15.71f, -6.51f, 29.66f, -6.61f, 30.24f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 480.0f)
                arcToRelative(15.68f, 15.68f, 0.0f, false, false, 2.64f, -0.22f)
                curveToRelative(0.58f, -0.1f, 14.44f, -2.43f, 30.13f, -6.44f)
                curveToRelative(31.07f, -7.94f, 41.05f, -15.24f, 45.85f, -20.0f)
                lineTo(306.39f, 273.55f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.82f, 0.0f)
                lineToRelative(9.92f, 9.92f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 67.92f, -67.93f)
                lineTo(385.46f, 214.0f)
                curveToRelative(-5.0f, -5.0f, -2.52f, -12.11f, 4.32f, -17.14f)
                lineToRelative(69.75f, -53.94f)
                arcTo(17.82f, 17.82f, 0.0f, false, false, 461.0f, 141.6f)
                arcToRelative(63.2f, 63.2f, 0.0f, false, false, 19.0f, -45.0f)
                arcTo(63.88f, 63.88f, 0.0f, false, false, 461.05f, 51.0f)
                close()
                moveTo(250.78f, 283.9f)
                curveToRelative(-2.92f, 2.92f, -16.18f, 7.92f, -23.39f, 0.71f)
                reflectiveCurveToRelative(-2.24f, -20.42f, 0.69f, -23.35f)
                lineToRelative(33.0f, -33.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                lineToRelative(19.84f, 19.83f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.83f)
                close()
            }
        }
        .build()
        return _eyedrop!!
    }

private var _eyedrop: ImageVector? = null
