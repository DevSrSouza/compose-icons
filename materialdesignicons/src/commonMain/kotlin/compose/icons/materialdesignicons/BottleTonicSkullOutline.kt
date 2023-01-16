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

public val MaterialDesignIcons.BottleTonicSkullOutline: ImageVector
    get() {
        if (_bottleTonicSkullOutline != null) {
            return _bottleTonicSkullOutline!!
        }
        _bottleTonicSkullOutline = Builder(name = "BottleTonicSkullOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                horizontalLineTo(11.0f)
                lineTo(10.0f, 2.0f)
                horizontalLineTo(14.0f)
                lineTo(13.0f, 4.0f)
                moveTo(14.0f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                curveTo(7.24f, 8.0f, 5.0f, 10.24f, 5.0f, 13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                curveTo(19.0f, 10.24f, 16.76f, 8.0f, 14.0f, 8.0f)
                moveTo(17.0f, 20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                curveTo(7.0f, 11.35f, 8.35f, 10.0f, 10.0f, 10.0f)
                horizontalLineTo(14.0f)
                curveTo(15.65f, 10.0f, 17.0f, 11.35f, 17.0f, 13.0f)
                verticalLineTo(20.0f)
                moveTo(12.0f, 11.0f)
                curveTo(9.79f, 11.0f, 8.0f, 12.79f, 8.0f, 15.0f)
                curveTo(8.0f, 16.0f, 8.39f, 16.9f, 9.0f, 17.59f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.25f)
                verticalLineTo(17.5f)
                horizontalLineTo(11.38f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.63f)
                verticalLineTo(17.5f)
                horizontalLineTo(13.75f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.59f)
                curveTo(15.61f, 16.9f, 16.0f, 16.0f, 16.0f, 15.0f)
                curveTo(16.0f, 12.79f, 14.21f, 11.0f, 12.0f, 11.0f)
                moveTo(10.5f, 15.0f)
                curveTo(9.95f, 15.0f, 9.5f, 14.55f, 9.5f, 14.0f)
                reflectiveCurveTo(9.95f, 13.0f, 10.5f, 13.0f)
                reflectiveCurveTo(11.5f, 13.45f, 11.5f, 14.0f)
                reflectiveCurveTo(11.05f, 15.0f, 10.5f, 15.0f)
                moveTo(11.25f, 16.25f)
                lineTo(12.0f, 15.0f)
                lineTo(12.75f, 16.25f)
                horizontalLineTo(11.25f)
                moveTo(13.5f, 15.0f)
                curveTo(12.95f, 15.0f, 12.5f, 14.55f, 12.5f, 14.0f)
                reflectiveCurveTo(12.95f, 13.0f, 13.5f, 13.0f)
                reflectiveCurveTo(14.5f, 13.45f, 14.5f, 14.0f)
                reflectiveCurveTo(14.05f, 15.0f, 13.5f, 15.0f)
                close()
            }
        }
        .build()
        return _bottleTonicSkullOutline!!
    }

private var _bottleTonicSkullOutline: ImageVector? = null
