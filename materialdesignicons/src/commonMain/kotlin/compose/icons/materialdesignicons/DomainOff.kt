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

public val MaterialDesignIcons.DomainOff: ImageVector
    get() {
        if (_domainOff != null) {
            return _domainOff!!
        }
        _domainOff = Builder(name = "DomainOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                horizontalLineTo(16.0f)
                lineTo(14.0f, 17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(19.0f)
                moveTo(10.0f, 15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                moveTo(10.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                moveTo(6.0f, 11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                moveTo(6.0f, 15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                moveTo(6.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                moveTo(1.31f, 1.78f)
                lineTo(22.31f, 22.69f)
                lineTo(21.0f, 24.0f)
                lineTo(18.0f, 21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                lineTo(0.09f, 3.09f)
                lineTo(1.31f, 1.78f)
                moveTo(16.0f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                moveTo(8.0f, 5.0f)
                verticalLineTo(5.91f)
                lineTo(5.11f, 3.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.92f)
                lineTo(20.0f, 17.91f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.89f)
                lineTo(9.09f, 7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _domainOff!!
    }

private var _domainOff: ImageVector? = null
