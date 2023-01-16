package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.SealVariant: ImageVector
    get() {
        if (_sealVariant != null) {
            return _sealVariant!!
        }
        _sealVariant = Builder(name = "SealVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.71f, 6.15f)
                curveTo(17.46f, 5.38f, 16.79f, 5.21f, 16.45f, 4.77f)
                curveTo(16.14f, 4.31f, 16.18f, 3.62f, 15.53f, 3.15f)
                reflectiveCurveTo(14.23f, 2.92f, 13.7f, 2.77f)
                reflectiveCurveTo(12.81f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(10.82f, 2.58f, 10.3f, 2.77f)
                reflectiveCurveTo(9.13f, 2.67f, 8.47f, 3.15f)
                reflectiveCurveTo(7.86f, 4.31f, 7.55f, 4.77f)
                curveTo(7.21f, 5.21f, 6.55f, 5.38f, 6.29f, 6.15f)
                reflectiveCurveTo(6.5f, 7.45f, 6.5f, 8.0f)
                reflectiveCurveTo(6.0f, 9.08f, 6.29f, 9.85f)
                reflectiveCurveTo(7.21f, 10.79f, 7.55f, 11.23f)
                curveTo(7.86f, 11.69f, 7.82f, 12.38f, 8.47f, 12.85f)
                reflectiveCurveTo(9.77f, 13.08f, 10.3f, 13.23f)
                reflectiveCurveTo(11.19f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(13.18f, 13.42f, 13.7f, 13.23f)
                reflectiveCurveTo(14.87f, 13.33f, 15.53f, 12.85f)
                reflectiveCurveTo(16.14f, 11.69f, 16.45f, 11.23f)
                curveTo(16.79f, 10.79f, 17.45f, 10.62f, 17.71f, 9.85f)
                reflectiveCurveTo(17.5f, 8.55f, 17.5f, 8.0f)
                reflectiveCurveTo(18.0f, 6.92f, 17.71f, 6.15f)
                moveTo(12.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 16.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 12.0f)
                moveTo(14.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 12.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 8.0f)
                moveTo(13.71f, 15.56f)
                lineTo(13.08f, 19.16f)
                lineTo(12.35f, 23.29f)
                lineTo(9.74f, 20.8f)
                lineTo(6.44f, 22.25f)
                lineTo(7.77f, 14.75f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 9.66f, 15.17f)
                arcTo(4.15f, 4.15f, 0.0f, false, false, 11.0f, 15.85f)
                arcTo(3.32f, 3.32f, 0.0f, false, false, 12.0f, 16.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 13.71f, 15.56f)
                moveTo(17.92f, 18.78f)
                lineTo(15.34f, 17.86f)
                lineTo(15.85f, 14.92f)
                arcTo(3.2f, 3.2f, 0.0f, false, false, 16.7f, 14.47f)
                lineTo(16.82f, 14.37f)
                close()
            }
        }
        .build()
        return _sealVariant!!
    }

private var _sealVariant: ImageVector? = null
