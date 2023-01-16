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

public val MaterialDesignIcons.BedDoubleOutline: ImageVector
    get() {
        if (_bedDoubleOutline != null) {
            return _bedDoubleOutline!!
        }
        _bedDoubleOutline = Builder(name = "BedDoubleOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                curveTo(7.5f, 5.0f, 7.0f, 5.21f, 6.61f, 5.6f)
                reflectiveCurveTo(6.0f, 6.45f, 6.0f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(5.47f, 10.0f, 5.0f, 10.19f, 4.59f, 10.59f)
                reflectiveCurveTo(4.0f, 11.47f, 4.0f, 12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.34f)
                lineTo(6.0f, 19.0f)
                horizontalLineTo(7.0f)
                lineTo(7.69f, 17.0f)
                horizontalLineTo(16.36f)
                lineTo(17.0f, 19.0f)
                horizontalLineTo(18.0f)
                lineTo(18.66f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                curveTo(20.0f, 11.47f, 19.81f, 11.0f, 19.41f, 10.59f)
                reflectiveCurveTo(18.53f, 10.0f, 18.0f, 10.0f)
                verticalLineTo(7.0f)
                curveTo(18.0f, 6.45f, 17.8f, 6.0f, 17.39f, 5.6f)
                reflectiveCurveTo(16.5f, 5.0f, 16.0f, 5.0f)
                moveTo(8.0f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                moveTo(13.0f, 7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                moveTo(6.0f, 12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _bedDoubleOutline!!
    }

private var _bedDoubleOutline: ImageVector? = null
