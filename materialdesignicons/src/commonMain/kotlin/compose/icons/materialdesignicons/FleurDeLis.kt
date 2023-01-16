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

public val MaterialDesignIcons.FleurDeLis: ImageVector
    get() {
        if (_fleurDeLis != null) {
            return _fleurDeLis!!
        }
        _fleurDeLis = Builder(name = "FleurDeLis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                reflectiveCurveTo(9.0f, 4.0f, 9.0f, 7.0f)
                reflectiveCurveTo(11.0f, 12.0f, 11.0f, 16.0f)
                horizontalLineTo(10.0f)
                reflectiveCurveTo(10.0f, 14.0f, 9.0f, 12.0f)
                curveTo(7.0f, 8.0f, 3.0f, 10.0f, 3.0f, 13.0f)
                reflectiveCurveTo(5.0f, 16.0f, 5.0f, 16.0f)
                curveTo(5.0f, 13.0f, 8.5f, 13.0f, 8.5f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.5f)
                lineTo(9.0f, 20.0f)
                reflectiveCurveTo(10.0f, 21.0f, 11.0f, 20.0f)
                lineTo(12.0f, 22.0f)
                lineTo(13.0f, 20.0f)
                curveTo(14.0f, 21.0f, 15.0f, 20.0f, 15.0f, 20.0f)
                lineTo(13.5f, 18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.5f)
                curveTo(15.5f, 13.0f, 19.0f, 13.0f, 19.0f, 16.0f)
                curveTo(19.0f, 16.0f, 21.0f, 16.0f, 21.0f, 13.0f)
                reflectiveCurveTo(17.0f, 8.0f, 15.0f, 12.0f)
                curveTo(14.0f, 14.0f, 14.0f, 16.0f, 14.0f, 16.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 12.0f, 15.0f, 10.0f, 15.0f, 7.0f)
                reflectiveCurveTo(12.0f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _fleurDeLis!!
    }

private var _fleurDeLis: ImageVector? = null
