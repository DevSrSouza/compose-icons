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

public val MaterialDesignIcons.LockPercentOpenVariant: ImageVector
    get() {
        if (_lockPercentOpenVariant != null) {
            return _lockPercentOpenVariant!!
        }
        _lockPercentOpenVariant = Builder(name = "LockPercentOpenVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 1.0f)
                curveTo(15.2f, 1.0f, 13.0f, 3.2f, 13.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 8.0f, 2.0f, 8.9f, 2.0f, 10.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.1f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(17.1f, 22.0f, 18.0f, 21.1f, 18.0f, 20.0f)
                verticalLineTo(10.0f)
                curveTo(18.0f, 8.9f, 17.1f, 8.0f, 16.0f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                curveTo(15.0f, 4.3f, 16.3f, 3.0f, 18.0f, 3.0f)
                reflectiveCurveTo(21.0f, 4.3f, 21.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(6.0f)
                curveTo(23.0f, 3.2f, 20.8f, 1.0f, 18.0f, 1.0f)
                moveTo(7.5f, 11.0f)
                curveTo(8.3f, 11.0f, 9.0f, 11.7f, 9.0f, 12.5f)
                reflectiveCurveTo(8.3f, 14.0f, 7.5f, 14.0f)
                reflectiveCurveTo(6.0f, 13.3f, 6.0f, 12.5f)
                reflectiveCurveTo(6.7f, 11.0f, 7.5f, 11.0f)
                moveTo(12.5f, 19.0f)
                curveTo(11.7f, 19.0f, 11.0f, 18.3f, 11.0f, 17.5f)
                reflectiveCurveTo(11.7f, 16.0f, 12.5f, 16.0f)
                reflectiveCurveTo(14.0f, 16.7f, 14.0f, 17.5f)
                reflectiveCurveTo(13.3f, 19.0f, 12.5f, 19.0f)
                moveTo(7.2f, 19.2f)
                lineTo(5.8f, 17.8f)
                lineTo(12.9f, 10.7f)
                lineTo(14.3f, 12.1f)
                lineTo(7.2f, 19.2f)
                close()
            }
        }
        .build()
        return _lockPercentOpenVariant!!
    }

private var _lockPercentOpenVariant: ImageVector? = null
