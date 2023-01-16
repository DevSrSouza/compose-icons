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

public val MaterialDesignIcons.BookAccountOutline: ImageVector
    get() {
        if (_bookAccountOutline != null) {
            return _bookAccountOutline!!
        }
        _bookAccountOutline = Builder(name = "BookAccountOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 2.0f)
                horizontalLineTo(18.0f)
                moveTo(18.0f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                lineTo(10.5f, 6.7f)
                lineTo(8.0f, 9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                moveTo(13.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 11.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 11.0f)
                moveTo(17.0f, 19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                curveTo(9.0f, 16.67f, 11.67f, 16.0f, 13.0f, 16.0f)
                reflectiveCurveTo(17.0f, 16.67f, 17.0f, 18.0f)
                verticalLineTo(19.0f)
            }
        }
        .build()
        return _bookAccountOutline!!
    }

private var _bookAccountOutline: ImageVector? = null
