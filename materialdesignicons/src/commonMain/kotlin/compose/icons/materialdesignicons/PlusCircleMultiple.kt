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

public val MaterialDesignIcons.PlusCircleMultiple: ImageVector
    get() {
        if (_plusCircleMultiple != null) {
            return _plusCircleMultiple!!
        }
        _plusCircleMultiple = Builder(name = "PlusCircleMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 9.2f, 3.6f, 6.8f, 6.0f, 5.7f)
                verticalLineTo(3.5f)
                curveTo(2.5f, 4.8f, 0.0f, 8.1f, 0.0f, 12.0f)
                reflectiveCurveTo(2.5f, 19.2f, 6.0f, 20.5f)
                verticalLineTo(18.3f)
                curveTo(3.6f, 17.2f, 2.0f, 14.8f, 2.0f, 12.0f)
                moveTo(15.0f, 3.0f)
                curveTo(10.0f, 3.0f, 6.0f, 7.0f, 6.0f, 12.0f)
                reflectiveCurveTo(10.0f, 21.0f, 15.0f, 21.0f)
                reflectiveCurveTo(24.0f, 17.0f, 24.0f, 12.0f)
                reflectiveCurveTo(20.0f, 3.0f, 15.0f, 3.0f)
                moveTo(20.0f, 13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _plusCircleMultiple!!
    }

private var _plusCircleMultiple: ImageVector? = null
