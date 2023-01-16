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

public val MaterialDesignIcons.BookAccount: ImageVector
    get() {
        if (_bookAccount != null) {
            return _bookAccount!!
        }
        _bookAccount = Builder(name = "BookAccount", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.0f)
                lineTo(9.5f, 7.5f)
                lineTo(7.0f, 9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 2.0f)
                moveTo(14.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 12.0f)
                moveTo(18.0f, 20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                curveTo(10.0f, 17.67f, 12.67f, 17.0f, 14.0f, 17.0f)
                reflectiveCurveTo(18.0f, 17.67f, 18.0f, 19.0f)
                close()
            }
        }
        .build()
        return _bookAccount!!
    }

private var _bookAccount: ImageVector? = null
