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

public val IonIcons.Storefront: ImageVector
    get() {
        if (_storefront != null) {
            return _storefront!!
        }
        _storefront = Builder(name = "Storefront", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 448.0f)
                horizontalLineTo(468.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(273.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.24f, -3.86f)
                arcToRelative(104.92f, 104.92f, 0.0f, false, true, -28.32f, 4.78f)
                curveToRelative(-1.18f, 0.0f, -2.3f, 0.05f, -3.4f, 0.05f)
                arcToRelative(108.22f, 108.22f, 0.0f, false, true, -52.85f, -13.64f)
                arcToRelative(8.23f, 8.23f, 0.0f, false, false, -8.0f, 0.0f)
                arcToRelative(108.18f, 108.18f, 0.0f, false, true, -52.84f, 13.64f)
                arcToRelative(106.11f, 106.11f, 0.0f, false, true, -52.46f, -13.79f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, false, -8.09f, 0.0f)
                arcToRelative(108.14f, 108.14f, 0.0f, false, true, -53.16f, 13.8f)
                arcToRelative(106.19f, 106.19f, 0.0f, false, true, -52.77f, -14.0f)
                arcToRelative(8.25f, 8.25f, 0.0f, false, false, -8.16f, 0.0f)
                arcToRelative(106.19f, 106.19f, 0.0f, false, true, -52.77f, 14.0f)
                curveToRelative(-1.09f, 0.0f, -2.19f, 0.0f, -3.37f, -0.05f)
                horizontalLineToRelative(-0.06f)
                arcToRelative(104.91f, 104.91f, 0.0f, false, true, -29.28f, -5.09f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 48.0f, 273.15f)
                verticalLineTo(444.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(32.5f)
                curveToRelative(-8.64f, 0.0f, -16.1f, 6.64f, -16.48f, 15.28f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 480.0f)
                horizontalLineTo(479.5f)
                curveToRelative(8.64f, 0.0f, 16.1f, -6.64f, 16.48f, -15.28f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 480.0f, 448.0f)
                close()
                moveTo(224.0f, 380.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(316.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                close()
                moveTo(380.0f, 448.0f)
                horizontalLineTo(308.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(316.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineTo(444.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 380.0f, 448.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(492.57f, 170.28f)
                lineTo(449.65f, 71.79f)
                curveTo(438.41f, 47.62f, 412.74f, 32.0f, 384.25f, 32.0f)
                horizontalLineTo(127.7f)
                curveTo(99.21f, 32.0f, 73.54f, 47.62f, 62.3f, 71.79f)
                lineTo(19.38f, 170.28f)
                curveToRelative(-9.0f, 19.41f, 2.89f, 39.34f, 2.9f, 39.35f)
                lineToRelative(0.28f, 0.45f)
                curveToRelative(0.49f, 0.78f, 1.36f, 2.0f, 1.89f, 2.78f)
                curveToRelative(0.05f, 0.06f, 0.09f, 0.13f, 0.14f, 0.2f)
                lineToRelative(5.0f, 6.05f)
                arcToRelative(7.45f, 7.45f, 0.0f, false, false, 0.6f, 0.65f)
                lineToRelative(5.0f, 4.83f)
                lineToRelative(0.42f, 0.36f)
                arcTo(69.65f, 69.65f, 0.0f, false, false, 45.0f, 231.73f)
                verticalLineToRelative(0.05f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, 36.0f, 10.67f)
                curveToRelative(0.82f, 0.0f, 1.64f, 0.0f, 2.47f, 0.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, false, 51.89f, -20.31f)
                lineToRelative(0.33f, -0.31f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 10.89f, 0.0f)
                lineToRelative(0.33f, 0.31f)
                arcToRelative(77.3f, 77.3f, 0.0f, false, false, 104.46f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.87f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(77.31f, 77.31f, 0.0f, false, false, 104.21f, 0.23f)
                arcToRelative(7.88f, 7.88f, 0.0f, false, true, 10.71f, 0.0f)
                arcToRelative(76.81f, 76.81f, 0.0f, false, false, 52.31f, 20.08f)
                lineToRelative(2.49f, 0.0f)
                arcToRelative(71.35f, 71.35f, 0.0f, false, false, 35.0f, -10.7f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.95f, -0.57f, 1.86f, -1.17f, 2.78f, -1.77f)
                arcTo(71.33f, 71.33f, 0.0f, false, false, 488.0f, 212.17f)
                lineToRelative(1.74f, -2.63f)
                quadToRelative(0.26f, -0.4f, 0.48f, -0.84f)
                curveTo(491.88f, 205.32f, 500.78f, 187.94f, 492.57f, 170.28f)
                close()
            }
        }
        .build()
        return _storefront!!
    }

private var _storefront: ImageVector? = null
