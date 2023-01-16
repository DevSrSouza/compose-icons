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

public val MaterialDesignIcons.RazorSingleEdge: ImageVector
    get() {
        if (_razorSingleEdge != null) {
            return _razorSingleEdge!!
        }
        _razorSingleEdge = Builder(name = "RazorSingleEdge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(22.0f)
                moveTo(22.0f, 13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.5f)
                curveTo(4.33f, 13.0f, 5.0f, 12.33f, 5.0f, 11.5f)
                reflectiveCurveTo(4.33f, 10.0f, 3.5f, 10.0f)
                lineTo(2.0f, 10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.5f)
                curveTo(19.67f, 10.0f, 19.0f, 10.67f, 19.0f, 11.5f)
                reflectiveCurveTo(19.67f, 13.0f, 20.5f, 13.0f)
                horizontalLineTo(22.0f)
                moveTo(13.0f, 11.0f)
                curveTo(13.0f, 10.45f, 12.55f, 10.0f, 12.0f, 10.0f)
                reflectiveCurveTo(11.0f, 10.45f, 11.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(11.0f, 13.55f, 11.45f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(13.0f, 13.55f, 13.0f, 13.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _razorSingleEdge!!
    }

private var _razorSingleEdge: ImageVector? = null
