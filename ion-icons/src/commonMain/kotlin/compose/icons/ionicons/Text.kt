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

public val IonIcons.Text: ImageVector
    get() {
        if (_text != null) {
            return _text!!
        }
        _text = Builder(name = "Text", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(292.6f, 407.78f)
                lineToRelative(-120.0f, -320.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -41.2f, 0.0f)
                lineToRelative(-120.0f, 320.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 41.2f, 15.44f)
                lineTo(88.76f, 326.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.87f, -1.3f)
                lineTo(213.37f, 325.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.87f, 1.3f)
                lineToRelative(36.16f, 96.42f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 41.2f, -15.44f)
                close()
                moveTo(106.76f, 278.78f)
                lineTo(150.13f, 163.13f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.74f, 0.0f)
                lineTo(197.24f, 278.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.87f, 2.7f)
                lineTo(108.63f, 281.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 106.76f, 278.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.77f, 169.5f)
                curveToRelative(-41.72f, -0.3f, -79.08f, 23.87f, -95.0f, 61.4f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 40.5f, 17.2f)
                curveToRelative(8.88f, -20.89f, 29.77f, -34.44f, 53.32f, -34.6f)
                curveTo(431.91f, 213.28f, 458.0f, 240.0f, 458.0f, 272.35f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.45f, 1.5f)
                curveToRelative(-21.92f, 0.61f, -47.92f, 2.07f, -71.12f, 4.8f)
                curveTo(330.68f, 285.09f, 298.0f, 314.94f, 298.0f, 358.5f)
                curveToRelative(0.0f, 23.19f, 8.76f, 44.0f, 24.67f, 58.68f)
                curveTo(337.6f, 430.93f, 358.0f, 438.5f, 380.0f, 438.5f)
                curveToRelative(31.0f, 0.0f, 57.69f, -8.0f, 77.94f, -23.22f)
                curveToRelative(0.0f, 0.0f, 0.06f, 0.0f, 0.06f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, 44.0f, 0.19f)
                verticalLineToRelative(-143.0f)
                curveTo(502.0f, 216.29f, 457.0f, 169.91f, 400.77f, 169.5f)
                close()
                moveTo(380.0f, 394.5f)
                curveToRelative(-17.53f, 0.0f, -38.0f, -9.43f, -38.0f, -36.0f)
                curveToRelative(0.0f, -10.67f, 3.83f, -18.14f, 12.43f, -24.23f)
                curveToRelative(8.37f, -5.93f, 21.2f, -10.16f, 36.14f, -11.92f)
                curveToRelative(21.12f, -2.49f, 44.82f, -3.86f, 65.14f, -4.47f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.1f)
                curveTo(455.0f, 370.1f, 429.46f, 394.5f, 380.0f, 394.5f)
                close()
            }
        }
        .build()
        return _text!!
    }

private var _text: ImageVector? = null
