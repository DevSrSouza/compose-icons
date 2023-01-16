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

public val MaterialDesignIcons.DeleteClockOutline: ImageVector
    get() {
        if (_deleteClockOutline != null) {
            return _deleteClockOutline!!
        }
        _deleteClockOutline = Builder(name = "DeleteClockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.82f)
                lineTo(18.94f, 17.23f)
                lineTo(18.19f, 18.53f)
                lineTo(15.0f, 16.69f)
                verticalLineTo(13.0f)
                moveTo(23.0f, 16.0f)
                curveTo(23.0f, 19.87f, 19.87f, 23.0f, 16.0f, 23.0f)
                curveTo(14.09f, 23.0f, 12.36f, 22.24f, 11.1f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 21.0f, 6.0f, 20.1f, 6.0f, 19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.29f)
                curveTo(20.89f, 10.15f, 23.0f, 12.83f, 23.0f, 16.0f)
                moveTo(9.0f, 16.0f)
                curveTo(9.0f, 12.13f, 12.13f, 9.0f, 16.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.67f)
                curveTo(9.24f, 18.09f, 9.0f, 17.07f, 9.0f, 16.0f)
                moveTo(16.0f, 11.0f)
                curveTo(13.24f, 11.0f, 11.0f, 13.24f, 11.0f, 16.0f)
                curveTo(11.0f, 18.76f, 13.24f, 21.0f, 16.0f, 21.0f)
                curveTo(18.76f, 21.0f, 21.0f, 18.76f, 21.0f, 16.0f)
                curveTo(21.0f, 13.24f, 18.76f, 11.0f, 16.0f, 11.0f)
                moveTo(15.5f, 4.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.5f)
                lineTo(9.5f, 3.0f)
                horizontalLineTo(14.5f)
                lineTo(15.5f, 4.0f)
                close()
            }
        }
        .build()
        return _deleteClockOutline!!
    }

private var _deleteClockOutline: ImageVector? = null
