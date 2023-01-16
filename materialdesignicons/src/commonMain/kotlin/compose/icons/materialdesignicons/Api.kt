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

public val MaterialDesignIcons.Api: ImageVector
    get() {
        if (_api != null) {
            return _api!!
        }
        _api = Builder(name = "Api", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 7.0f)
                moveTo(7.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                moveTo(14.0f, 7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 11.0f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 7.0f)
                moveTo(14.0f, 11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                moveTo(20.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _api!!
    }

private var _api: ImageVector? = null