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

public val MaterialDesignIcons.DotsSquare: ImageVector
    get() {
        if (_dotsSquare != null) {
            return _dotsSquare!!
        }
        _dotsSquare = Builder(name = "DotsSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                curveTo(13.1f, 16.0f, 14.0f, 16.9f, 14.0f, 18.0f)
                reflectiveCurveTo(13.1f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveTo(10.0f, 19.1f, 10.0f, 18.0f)
                reflectiveCurveTo(10.9f, 16.0f, 12.0f, 16.0f)
                moveTo(12.0f, 4.0f)
                curveTo(13.1f, 4.0f, 14.0f, 4.9f, 14.0f, 6.0f)
                reflectiveCurveTo(13.1f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveTo(10.0f, 7.1f, 10.0f, 6.0f)
                reflectiveCurveTo(10.9f, 4.0f, 12.0f, 4.0f)
                moveTo(6.0f, 16.0f)
                curveTo(7.1f, 16.0f, 8.0f, 16.9f, 8.0f, 18.0f)
                reflectiveCurveTo(7.1f, 20.0f, 6.0f, 20.0f)
                reflectiveCurveTo(4.0f, 19.1f, 4.0f, 18.0f)
                reflectiveCurveTo(4.9f, 16.0f, 6.0f, 16.0f)
                moveTo(6.0f, 10.0f)
                curveTo(7.1f, 10.0f, 8.0f, 10.9f, 8.0f, 12.0f)
                reflectiveCurveTo(7.1f, 14.0f, 6.0f, 14.0f)
                reflectiveCurveTo(4.0f, 13.1f, 4.0f, 12.0f)
                reflectiveCurveTo(4.9f, 10.0f, 6.0f, 10.0f)
                moveTo(6.0f, 4.0f)
                curveTo(7.1f, 4.0f, 8.0f, 4.9f, 8.0f, 6.0f)
                reflectiveCurveTo(7.1f, 8.0f, 6.0f, 8.0f)
                reflectiveCurveTo(4.0f, 7.1f, 4.0f, 6.0f)
                reflectiveCurveTo(4.9f, 4.0f, 6.0f, 4.0f)
                moveTo(18.0f, 16.0f)
                curveTo(19.1f, 16.0f, 20.0f, 16.9f, 20.0f, 18.0f)
                reflectiveCurveTo(19.1f, 20.0f, 18.0f, 20.0f)
                reflectiveCurveTo(16.0f, 19.1f, 16.0f, 18.0f)
                reflectiveCurveTo(16.9f, 16.0f, 18.0f, 16.0f)
                moveTo(18.0f, 10.0f)
                curveTo(19.1f, 10.0f, 20.0f, 10.9f, 20.0f, 12.0f)
                reflectiveCurveTo(19.1f, 14.0f, 18.0f, 14.0f)
                reflectiveCurveTo(16.0f, 13.1f, 16.0f, 12.0f)
                reflectiveCurveTo(16.9f, 10.0f, 18.0f, 10.0f)
                moveTo(18.0f, 4.0f)
                curveTo(19.1f, 4.0f, 20.0f, 4.9f, 20.0f, 6.0f)
                reflectiveCurveTo(19.1f, 8.0f, 18.0f, 8.0f)
                reflectiveCurveTo(16.0f, 7.1f, 16.0f, 6.0f)
                reflectiveCurveTo(16.9f, 4.0f, 18.0f, 4.0f)
                close()
            }
        }
        .build()
        return _dotsSquare!!
    }

private var _dotsSquare: ImageVector? = null
