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

public val MaterialDesignIcons.Toslink: ImageVector
    get() {
        if (_toslink != null) {
            return _toslink!!
        }
        _toslink = Builder(name = "Toslink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                verticalLineTo(7.0f)
                lineTo(17.0f, 4.0f)
                horizontalLineTo(7.0f)
                lineTo(4.0f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(2.9f, 10.0f, 2.0f, 10.9f, 2.0f, 12.0f)
                reflectiveCurveTo(2.9f, 14.0f, 4.0f, 14.0f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 19.1f, 4.9f, 20.0f, 6.0f, 20.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 20.0f, 20.0f, 19.1f, 20.0f, 18.0f)
                verticalLineTo(14.0f)
                curveTo(21.11f, 14.0f, 22.0f, 13.11f, 22.0f, 12.0f)
                reflectiveCurveTo(21.11f, 10.0f, 20.0f, 10.0f)
                moveTo(12.0f, 16.0f)
                curveTo(9.79f, 16.0f, 8.0f, 14.21f, 8.0f, 12.0f)
                reflectiveCurveTo(9.79f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveTo(16.0f, 9.79f, 16.0f, 12.0f)
                reflectiveCurveTo(14.21f, 16.0f, 12.0f, 16.0f)
                moveTo(14.0f, 12.0f)
                curveTo(14.0f, 13.11f, 13.11f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(10.0f, 13.11f, 10.0f, 12.0f)
                reflectiveCurveTo(10.9f, 10.0f, 12.0f, 10.0f)
                reflectiveCurveTo(14.0f, 10.9f, 14.0f, 12.0f)
                close()
            }
        }
        .build()
        return _toslink!!
    }

private var _toslink: ImageVector? = null
