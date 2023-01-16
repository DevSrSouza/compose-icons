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

public val MaterialDesignIcons.SelectionMarker: ImageVector
    get() {
        if (_selectionMarker != null) {
            return _selectionMarker!!
        }
        _selectionMarker = Builder(name = "SelectionMarker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                curveTo(2.0f, 2.89f, 2.9f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                moveTo(22.0f, 4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 2.0f, 22.0f, 2.89f, 22.0f, 4.0f)
                moveTo(2.0f, 20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.11f, 2.0f, 20.0f)
                moveTo(10.0f, 2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(2.0f)
                moveTo(10.0f, 20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                moveTo(2.0f, 10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.0f)
                moveTo(18.5f, 13.0f)
                curveTo(20.4f, 13.0f, 22.0f, 14.6f, 22.0f, 16.5f)
                curveTo(22.0f, 19.1f, 18.5f, 23.0f, 18.5f, 23.0f)
                curveTo(18.5f, 23.0f, 15.0f, 19.1f, 15.0f, 16.5f)
                curveTo(15.0f, 14.6f, 16.6f, 13.0f, 18.5f, 13.0f)
                moveTo(18.5f, 17.8f)
                curveTo(19.2f, 17.8f, 19.8f, 17.2f, 19.7f, 16.6f)
                curveTo(19.7f, 16.0f, 19.1f, 15.4f, 18.5f, 15.4f)
                curveTo(17.9f, 15.4f, 17.3f, 15.9f, 17.3f, 16.6f)
                curveTo(17.3f, 17.2f, 17.8f, 17.8f, 18.5f, 17.8f)
                moveTo(20.0f, 10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.34f)
                curveTo(21.42f, 11.84f, 20.74f, 11.45f, 20.0f, 11.23f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _selectionMarker!!
    }

private var _selectionMarker: ImageVector? = null
