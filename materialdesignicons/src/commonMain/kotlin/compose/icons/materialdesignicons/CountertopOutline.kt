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

public val MaterialDesignIcons.CountertopOutline: ImageVector
    get() {
        if (_countertopOutline != null) {
            return _countertopOutline!!
        }
        _countertopOutline = Builder(name = "CountertopOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                curveTo(18.0f, 5.34f, 16.66f, 4.0f, 15.0f, 4.0f)
                reflectiveCurveTo(12.0f, 5.34f, 12.0f, 7.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 6.45f, 14.45f, 6.0f, 15.0f, 6.0f)
                reflectiveCurveTo(16.0f, 6.45f, 16.0f, 7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                curveTo(9.1f, 10.0f, 10.0f, 9.1f, 10.0f, 8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                curveTo(4.0f, 9.1f, 4.9f, 10.0f, 6.0f, 10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.0f)
                moveTo(6.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                moveTo(6.0f, 18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                moveTo(18.0f, 18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _countertopOutline!!
    }

private var _countertopOutline: ImageVector? = null
