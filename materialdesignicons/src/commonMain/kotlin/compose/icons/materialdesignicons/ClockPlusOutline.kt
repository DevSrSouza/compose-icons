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

public val MaterialDesignIcons.ClockPlusOutline: ImageVector
    get() {
        if (_clockPlusOutline != null) {
            return _clockPlusOutline!!
        }
        _clockPlusOutline = Builder(name = "ClockPlusOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.47f, 15.08f)
                lineTo(11.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(12.25f)
                lineTo(15.58f, 14.08f)
                curveTo(15.17f, 14.36f, 14.79f, 14.7f, 14.47f, 15.08f)
                moveTo(13.08f, 19.92f)
                curveTo(12.72f, 19.97f, 12.37f, 20.0f, 12.0f, 20.0f)
                curveTo(7.58f, 20.0f, 4.0f, 16.42f, 4.0f, 12.0f)
                reflectiveCurveTo(7.58f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(20.0f, 7.58f, 20.0f, 12.0f)
                curveTo(20.0f, 12.37f, 19.97f, 12.72f, 19.92f, 13.08f)
                curveTo(20.61f, 13.18f, 21.25f, 13.4f, 21.84f, 13.72f)
                curveTo(21.94f, 13.16f, 22.0f, 12.59f, 22.0f, 12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(2.0f, 6.5f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5f, 6.47f, 22.0f, 12.0f, 22.0f)
                curveTo(12.59f, 22.0f, 13.16f, 21.94f, 13.72f, 21.84f)
                curveTo(13.4f, 21.25f, 13.18f, 20.61f, 13.08f, 19.92f)
                moveTo(18.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _clockPlusOutline!!
    }

private var _clockPlusOutline: ImageVector? = null
