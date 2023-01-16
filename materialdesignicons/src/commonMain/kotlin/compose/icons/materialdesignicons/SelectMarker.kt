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

public val MaterialDesignIcons.SelectMarker: ImageVector
    get() {
        if (_selectMarker != null) {
            return _selectMarker!!
        }
        _selectMarker = Builder(name = "SelectMarker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.45f, 3.45f, 3.0f, 4.0f, 3.0f)
                moveTo(20.0f, 3.0f)
                curveTo(20.55f, 3.0f, 21.0f, 3.45f, 21.0f, 4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                moveTo(15.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                moveTo(11.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                moveTo(7.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                moveTo(11.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                moveTo(7.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                moveTo(4.0f, 21.0f)
                curveTo(3.45f, 21.0f, 3.0f, 20.55f, 3.0f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                moveTo(3.0f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                moveTo(3.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                moveTo(3.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                moveTo(21.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                moveTo(19.5f, 13.0f)
                curveTo(21.4f, 13.0f, 23.0f, 14.6f, 23.0f, 16.5f)
                curveTo(23.0f, 19.1f, 19.5f, 23.0f, 19.5f, 23.0f)
                curveTo(19.5f, 23.0f, 16.0f, 19.1f, 16.0f, 16.5f)
                curveTo(16.0f, 14.6f, 17.6f, 13.0f, 19.5f, 13.0f)
                moveTo(19.5f, 17.8f)
                curveTo(20.2f, 17.8f, 20.8f, 17.2f, 20.7f, 16.6f)
                curveTo(20.7f, 16.0f, 20.1f, 15.4f, 19.5f, 15.4f)
                curveTo(18.9f, 15.4f, 18.3f, 15.9f, 18.3f, 16.6f)
                curveTo(18.3f, 17.2f, 18.8f, 17.8f, 19.5f, 17.8f)
                close()
            }
        }
        .build()
        return _selectMarker!!
    }

private var _selectMarker: ImageVector? = null
