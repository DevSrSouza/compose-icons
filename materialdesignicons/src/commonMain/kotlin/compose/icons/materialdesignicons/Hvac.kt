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

public val MaterialDesignIcons.Hvac: ImageVector
    get() {
        if (_hvac != null) {
            return _hvac!!
        }
        _hvac = Builder(name = "Hvac", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.58f, 14.0f)
                curveTo(8.3f, 13.55f, 8.11f, 13.03f, 8.06f, 12.5f)
                horizontalLineTo(15.94f)
                curveTo(15.89f, 13.03f, 15.7f, 13.55f, 15.47f, 14.0f)
                horizontalLineTo(8.58f)
                moveTo(12.0f, 16.0f)
                curveTo(10.97f, 16.0f, 10.08f, 15.61f, 9.38f, 15.0f)
                horizontalLineTo(14.63f)
                curveTo(13.92f, 15.61f, 13.03f, 16.0f, 12.0f, 16.0f)
                moveTo(12.0f, 8.0f)
                curveTo(13.03f, 8.0f, 13.92f, 8.39f, 14.63f, 9.0f)
                horizontalLineTo(9.38f)
                curveTo(10.08f, 8.39f, 10.97f, 8.0f, 12.0f, 8.0f)
                moveTo(8.58f, 10.0f)
                horizontalLineTo(15.42f)
                curveTo(15.7f, 10.45f, 15.89f, 10.97f, 15.94f, 11.5f)
                horizontalLineTo(8.06f)
                curveTo(8.11f, 10.97f, 8.3f, 10.45f, 8.58f, 10.0f)
                moveTo(3.0f, 3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                moveTo(12.0f, 18.0f)
                curveTo(8.67f, 18.0f, 6.0f, 15.33f, 6.0f, 12.0f)
                reflectiveCurveTo(8.67f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(18.0f, 8.67f, 18.0f, 12.0f)
                reflectiveCurveTo(15.33f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _hvac!!
    }

private var _hvac: ImageVector? = null
