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

public val MaterialDesignIcons.StoreClock: ImageVector
    get() {
        if (_storeClock != null) {
            return _storeClock!!
        }
        _storeClock = Builder(name = "StoreClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                moveTo(17.5f, 13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                lineTo(19.61f, 20.16f)
                lineTo(20.36f, 18.94f)
                lineTo(17.5f, 17.25f)
                verticalLineTo(13.0f)
                moveTo(24.0f, 17.0f)
                curveTo(24.0f, 20.87f, 20.87f, 24.0f, 17.0f, 24.0f)
                curveTo(13.47f, 24.0f, 10.57f, 21.39f, 10.08f, 18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(10.0f)
                lineTo(2.0f, 5.0f)
                horizontalLineTo(18.0f)
                lineTo(19.0f, 10.0f)
                verticalLineTo(10.29f)
                curveTo(21.89f, 11.16f, 24.0f, 13.83f, 24.0f, 17.0f)
                moveTo(4.0f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                moveTo(22.0f, 17.0f)
                curveTo(22.0f, 14.24f, 19.76f, 12.0f, 17.0f, 12.0f)
                reflectiveCurveTo(12.0f, 14.24f, 12.0f, 17.0f)
                reflectiveCurveTo(14.24f, 22.0f, 17.0f, 22.0f)
                reflectiveCurveTo(22.0f, 19.76f, 22.0f, 17.0f)
                close()
            }
        }
        .build()
        return _storeClock!!
    }

private var _storeClock: ImageVector? = null
