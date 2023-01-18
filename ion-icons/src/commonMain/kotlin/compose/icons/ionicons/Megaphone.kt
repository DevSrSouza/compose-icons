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

public val IonIcons.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 176.0f)
                verticalLineToRelative(0.66f)
                arcToRelative(17.38f, 17.38f, 0.0f, false, true, -4.2f, 11.23f)
                lineToRelative(0.0f, 0.05f)
                curveTo(38.4f, 194.32f, 32.0f, 205.74f, 32.0f, 224.0f)
                curveToRelative(0.0f, 16.55f, 5.3f, 28.23f, 11.68f, 35.91f)
                arcTo(19.0f, 19.0f, 0.0f, false, true, 48.0f, 272.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(80.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 48.0f, 176.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(452.18f, 186.55f)
                lineToRelative(-0.93f, -0.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.25f, -3.93f)
                verticalLineTo(62.0f)
                curveToRelative(0.0f, -12.64f, -8.39f, -24.0f, -20.89f, -28.32f)
                curveToRelative(-11.92f, -4.11f, -24.34f, -0.76f, -31.68f, 8.53f)
                arcTo(431.18f, 431.18f, 0.0f, false, true, 344.12f, 93.9f)
                curveToRelative(-23.63f, 20.0f, -46.24f, 34.25f, -67.0f, 42.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.15f, 7.47f)
                verticalLineTo(299.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.69f, 14.69f)
                curveToRelative(19.34f, 8.29f, 40.24f, 21.83f, 62.0f, 40.28f)
                arcToRelative(433.74f, 433.74f, 0.0f, false, true, 51.68f, 52.16f)
                arcTo(26.22f, 26.22f, 0.0f, false, false, 416.44f, 416.0f)
                arcToRelative(33.07f, 33.07f, 0.0f, false, false, 10.44f, -1.74f)
                curveTo(439.71f, 410.0f, 448.0f, 399.05f, 448.0f, 386.4f)
                verticalLineTo(265.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.33f, -3.94f)
                lineToRelative(0.85f, -0.14f)
                curveTo(461.8f, 258.84f, 480.0f, 247.67f, 480.0f, 224.0f)
                reflectiveCurveTo(461.8f, 189.16f, 452.18f, 186.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 320.0f)
                verticalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(456.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(52.45f)
                arcToRelative(32.66f, 32.66f, 0.0f, false, false, 25.93f, -12.45f)
                arcToRelative(31.65f, 31.65f, 0.0f, false, false, 5.21f, -29.05f)
                curveToRelative(-1.62f, -5.18f, -3.63f, -11.0f, -5.77f, -17.19f)
                curveToRelative(-7.91f, -22.9f, -18.34f, -37.07f, -21.12f, -69.32f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 240.0f, 320.0f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
