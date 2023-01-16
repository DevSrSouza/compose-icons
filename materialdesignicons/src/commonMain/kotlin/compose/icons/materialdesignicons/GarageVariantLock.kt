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

public val MaterialDesignIcons.GarageVariantLock: ImageVector
    get() {
        if (_garageVariantLock != null) {
            return _garageVariantLock!!
        }
        _garageVariantLock = Builder(name = "GarageVariantLock", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8f, 16.0f)
                verticalLineTo(14.5f)
                curveTo(21.8f, 13.1f, 20.4f, 12.0f, 19.0f, 12.0f)
                reflectiveCurveTo(16.2f, 13.1f, 16.2f, 14.5f)
                verticalLineTo(16.0f)
                curveTo(15.6f, 16.0f, 15.0f, 16.6f, 15.0f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(15.0f, 21.4f, 15.6f, 22.0f, 16.2f, 22.0f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 22.0f, 23.0f, 21.4f, 23.0f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(23.0f, 16.6f, 22.4f, 16.0f, 21.8f, 16.0f)
                moveTo(20.5f, 16.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(14.5f)
                curveTo(17.5f, 13.7f, 18.2f, 13.2f, 19.0f, 13.2f)
                reflectiveCurveTo(20.5f, 13.7f, 20.5f, 14.5f)
                verticalLineTo(16.0f)
                moveTo(5.0f, 12.0f)
                horizontalLineTo(15.04f)
                curveTo(14.61f, 12.59f, 14.35f, 13.27f, 14.26f, 14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                moveTo(16.06f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                lineTo(12.0f, 5.0f)
                lineTo(22.0f, 9.0f)
                verticalLineTo(11.04f)
                curveTo(21.17f, 10.4f, 20.13f, 10.0f, 19.0f, 10.0f)
                curveTo(17.9f, 10.0f, 16.88f, 10.39f, 16.06f, 11.0f)
                moveTo(13.0f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                moveTo(5.0f, 15.0f)
                horizontalLineTo(13.95f)
                curveTo(13.42f, 15.54f, 13.08f, 16.24f, 13.0f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _garageVariantLock!!
    }

private var _garageVariantLock: ImageVector? = null
