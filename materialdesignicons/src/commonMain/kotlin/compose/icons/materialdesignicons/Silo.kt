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

public val MaterialDesignIcons.Silo: ImageVector
    get() {
        if (_silo != null) {
            return _silo!!
        }
        _silo = Builder(name = "Silo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 7.8f)
                curveTo(14.6f, 4.5f, 11.8f, 2.0f, 8.5f, 2.0f)
                curveTo(6.8f, 2.0f, 5.1f, 2.7f, 3.9f, 3.9f)
                reflectiveCurveTo(2.0f, 6.8f, 2.0f, 8.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.8f)
                lineTo(18.0f, 11.6f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.8f)
                lineTo(22.0f, 14.0f)
                verticalLineTo(12.0f)
                lineTo(15.0f, 7.8f)
                moveTo(11.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                moveTo(11.0f, 16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                moveTo(11.0f, 12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                moveTo(4.3f, 7.0f)
                curveTo(4.9f, 5.2f, 6.6f, 4.0f, 8.5f, 4.0f)
                reflectiveCurveTo(12.1f, 5.2f, 12.7f, 7.0f)
                horizontalLineTo(4.3f)
                close()
            }
        }
        .build()
        return _silo!!
    }

private var _silo: ImageVector? = null
