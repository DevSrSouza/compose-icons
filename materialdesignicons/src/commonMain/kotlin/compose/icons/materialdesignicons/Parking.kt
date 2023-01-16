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

public val MaterialDesignIcons.Parking: ImageVector
    get() {
        if (_parking != null) {
            return _parking!!
        }
        _parking = Builder(name = "Parking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.2f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.2f, 11.0f)
                moveTo(13.0f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 19.0f, 9.0f)
                curveTo(19.0f, 5.68f, 16.31f, 3.0f, 13.0f, 3.0f)
                close()
            }
        }
        .build()
        return _parking!!
    }

private var _parking: ImageVector? = null
