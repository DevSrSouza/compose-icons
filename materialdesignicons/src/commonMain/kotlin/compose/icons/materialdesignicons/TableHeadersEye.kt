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

public val MaterialDesignIcons.TableHeadersEye: ImageVector
    get() {
        if (_tableHeadersEye != null) {
            return _tableHeadersEye!!
        }
        _tableHeadersEye = Builder(name = "TableHeadersEye", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 6.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 4.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 1.0f, 6.0f)
                moveTo(3.0f, 6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                moveTo(7.0f, 19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                moveTo(7.0f, 14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                moveTo(9.0f, 9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                moveTo(19.0f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.0f)
                moveTo(17.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 16.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 16.0f)
                moveTo(17.0f, 13.0f)
                arcTo(6.45f, 6.45f, 0.0f, false, true, 23.0f, 17.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 11.0f, 17.0f)
                arcTo(6.45f, 6.45f, 0.0f, false, true, 17.0f, 13.0f)
                moveTo(17.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 19.5f, 17.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.0f, 14.5f)
            }
        }
        .build()
        return _tableHeadersEye!!
    }

private var _tableHeadersEye: ImageVector? = null
