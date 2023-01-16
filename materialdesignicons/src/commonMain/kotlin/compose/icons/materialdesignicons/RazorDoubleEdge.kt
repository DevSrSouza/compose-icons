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

public val MaterialDesignIcons.RazorDoubleEdge: ImageVector
    get() {
        if (_razorDoubleEdge != null) {
            return _razorDoubleEdge!!
        }
        _razorDoubleEdge = Builder(name = "RazorDoubleEdge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                curveTo(19.45f, 8.0f, 19.0f, 7.55f, 19.0f, 7.0f)
                curveTo(19.0f, 6.45f, 19.45f, 6.0f, 20.0f, 6.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                curveTo(4.55f, 6.0f, 5.0f, 6.45f, 5.0f, 7.0f)
                curveTo(5.0f, 7.55f, 4.55f, 8.0f, 4.0f, 8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                curveTo(4.55f, 15.0f, 5.0f, 15.45f, 5.0f, 16.0f)
                curveTo(5.0f, 16.55f, 4.55f, 17.0f, 4.0f, 17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                curveTo(19.45f, 17.0f, 19.0f, 16.55f, 19.0f, 16.0f)
                curveTo(19.0f, 15.45f, 19.45f, 15.0f, 20.0f, 15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.41f)
                curveTo(13.2f, 12.58f, 12.65f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(10.8f, 12.58f, 10.59f, 12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.59f)
                curveTo(10.8f, 10.42f, 11.35f, 10.0f, 12.0f, 10.0f)
                reflectiveCurveTo(13.2f, 10.42f, 13.41f, 11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _razorDoubleEdge!!
    }

private var _razorDoubleEdge: ImageVector? = null
