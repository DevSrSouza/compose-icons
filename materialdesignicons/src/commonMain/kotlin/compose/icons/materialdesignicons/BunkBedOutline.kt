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

public val MaterialDesignIcons.BunkBedOutline: ImageVector
    get() {
        if (_bunkBedOutline != null) {
            return _bunkBedOutline!!
        }
        _bunkBedOutline = Builder(name = "BunkBedOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 2.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                curveTo(21.2f, 3.0f, 23.0f, 4.8f, 23.0f, 7.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(2.0f)
                moveTo(12.0f, 5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 5.9f, 20.1f, 5.0f, 19.0f, 5.0f)
                horizontalLineTo(12.0f)
                moveTo(3.0f, 11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                curveTo(19.7f, 13.0f, 20.4f, 13.2f, 21.0f, 13.6f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                moveTo(6.5f, 13.0f)
                curveTo(7.9f, 13.0f, 9.0f, 14.1f, 9.0f, 15.5f)
                reflectiveCurveTo(7.9f, 18.0f, 6.5f, 18.0f)
                reflectiveCurveTo(4.0f, 16.9f, 4.0f, 15.5f)
                reflectiveCurveTo(5.1f, 13.0f, 6.5f, 13.0f)
                moveTo(6.5f, 14.6f)
                curveTo(6.0f, 14.6f, 5.6f, 15.0f, 5.6f, 15.5f)
                reflectiveCurveTo(6.0f, 16.4f, 6.5f, 16.4f)
                reflectiveCurveTo(7.4f, 16.0f, 7.4f, 15.5f)
                reflectiveCurveTo(7.0f, 14.6f, 6.5f, 14.6f)
                moveTo(12.0f, 15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                curveTo(21.0f, 15.9f, 20.1f, 15.0f, 19.0f, 15.0f)
                horizontalLineTo(12.0f)
                moveTo(6.5f, 3.0f)
                curveTo(7.9f, 3.0f, 9.0f, 4.1f, 9.0f, 5.5f)
                reflectiveCurveTo(7.9f, 8.0f, 6.5f, 8.0f)
                reflectiveCurveTo(4.0f, 6.9f, 4.0f, 5.5f)
                reflectiveCurveTo(5.1f, 3.0f, 6.5f, 3.0f)
                moveTo(6.5f, 4.6f)
                curveTo(6.0f, 4.6f, 5.6f, 5.0f, 5.6f, 5.5f)
                reflectiveCurveTo(6.0f, 6.4f, 6.5f, 6.4f)
                reflectiveCurveTo(7.4f, 6.0f, 7.4f, 5.5f)
                reflectiveCurveTo(7.0f, 4.6f, 6.5f, 4.6f)
                close()
            }
        }
        .build()
        return _bunkBedOutline!!
    }

private var _bunkBedOutline: ImageVector? = null
