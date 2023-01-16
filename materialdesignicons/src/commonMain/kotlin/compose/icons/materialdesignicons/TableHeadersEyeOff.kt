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

public val MaterialDesignIcons.TableHeadersEyeOff: ImageVector
    get() {
        if (_tableHeadersEyeOff != null) {
            return _tableHeadersEyeOff!!
        }
        _tableHeadersEyeOff = Builder(name = "TableHeadersEyeOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.38f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(2.26f, 4.15f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 1.0f, 6.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.11f)
                lineTo(12.72f, 14.61f)
                arcTo(6.21f, 6.21f, 0.0f, false, false, 11.0f, 17.0f)
                arcTo(6.45f, 6.45f, 0.0f, false, false, 17.0f, 21.0f)
                arcTo(6.55f, 6.55f, 0.0f, false, false, 18.84f, 20.73f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.58f, 19.93f)
                moveTo(7.0f, 19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                moveTo(7.0f, 14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                moveTo(7.0f, 9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.11f)
                lineTo(7.0f, 8.89f)
                moveTo(17.0f, 19.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.56f, 16.45f)
                lineTo(17.56f, 19.45f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.0f, 19.5f)
                moveTo(16.24f, 13.0f)
                lineTo(17.85f, 14.61f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.35f, 16.11f)
                lineTo(21.94f, 18.7f)
                arcTo(6.44f, 6.44f, 0.0f, false, false, 23.0f, 17.0f)
                arcTo(6.45f, 6.45f, 0.0f, false, false, 17.0f, 13.0f)
                horizontalLineTo(16.24f)
                moveTo(13.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.2f)
                lineTo(14.2f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 4.0f)
                horizontalLineTo(7.2f)
                lineTo(9.2f, 6.0f)
                moveTo(15.0f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _tableHeadersEyeOff!!
    }

private var _tableHeadersEyeOff: ImageVector? = null
