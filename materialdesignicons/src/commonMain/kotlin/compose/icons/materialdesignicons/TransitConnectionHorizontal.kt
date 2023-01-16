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

public val MaterialDesignIcons.TransitConnectionHorizontal: ImageVector
    get() {
        if (_transitConnectionHorizontal != null) {
            return _transitConnectionHorizontal!!
        }
        _transitConnectionHorizontal = Builder(name = "TransitConnectionHorizontal", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                curveTo(10.7f, 9.0f, 9.6f, 9.8f, 9.2f, 11.0f)
                horizontalLineTo(6.8f)
                curveTo(6.4f, 9.8f, 5.3f, 9.0f, 4.0f, 9.0f)
                curveTo(2.3f, 9.0f, 1.0f, 10.3f, 1.0f, 12.0f)
                reflectiveCurveTo(2.3f, 15.0f, 4.0f, 15.0f)
                curveTo(5.3f, 15.0f, 6.4f, 14.2f, 6.8f, 13.0f)
                horizontalLineTo(9.2f)
                curveTo(9.6f, 14.2f, 10.7f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(14.4f, 14.2f, 14.8f, 13.0f)
                horizontalLineTo(17.2f)
                curveTo(17.6f, 14.2f, 18.7f, 15.0f, 20.0f, 15.0f)
                curveTo(21.7f, 15.0f, 23.0f, 13.7f, 23.0f, 12.0f)
                reflectiveCurveTo(21.7f, 9.0f, 20.0f, 9.0f)
                curveTo(18.7f, 9.0f, 17.6f, 9.8f, 17.2f, 11.0f)
                horizontalLineTo(14.8f)
                curveTo(14.4f, 9.8f, 13.3f, 9.0f, 12.0f, 9.0f)
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 11.4f, 3.4f, 11.0f, 4.0f, 11.0f)
                reflectiveCurveTo(5.0f, 11.4f, 5.0f, 12.0f)
                reflectiveCurveTo(4.6f, 13.0f, 4.0f, 13.0f)
                reflectiveCurveTo(3.0f, 12.6f, 3.0f, 12.0f)
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 12.6f, 20.6f, 13.0f, 20.0f, 13.0f)
                reflectiveCurveTo(19.0f, 12.6f, 19.0f, 12.0f)
                reflectiveCurveTo(19.4f, 11.0f, 20.0f, 11.0f)
                reflectiveCurveTo(21.0f, 11.4f, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _transitConnectionHorizontal!!
    }

private var _transitConnectionHorizontal: ImageVector? = null
