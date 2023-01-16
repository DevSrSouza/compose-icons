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

public val MaterialDesignIcons.LandFields: ImageVector
    get() {
        if (_landFields != null) {
            return _landFields!!
        }
        _landFields = Builder(name = "LandFields", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.1f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 22.0f, 22.0f, 21.1f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                moveTo(15.3f, 4.0f)
                curveTo(14.5f, 5.1f, 14.0f, 6.5f, 14.0f, 8.0f)
                horizontalLineTo(10.0f)
                curveTo(10.0f, 6.4f, 10.8f, 4.9f, 12.0f, 4.0f)
                horizontalLineTo(15.3f)
                moveTo(14.0f, 14.0f)
                horizontalLineTo(10.0f)
                curveTo(10.0f, 12.5f, 9.5f, 11.1f, 8.7f, 10.0f)
                horizontalLineTo(12.0f)
                curveTo(13.2f, 10.9f, 14.0f, 12.4f, 14.0f, 14.0f)
                moveTo(4.0f, 4.0f)
                horizontalLineTo(9.3f)
                curveTo(8.5f, 5.1f, 8.0f, 6.5f, 8.0f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                moveTo(4.0f, 10.0f)
                horizontalLineTo(6.0f)
                curveTo(7.2f, 10.9f, 8.0f, 12.3f, 8.0f, 14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                moveTo(4.0f, 20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.3f)
                curveTo(8.5f, 17.1f, 8.0f, 18.5f, 8.0f, 20.0f)
                horizontalLineTo(4.0f)
                moveTo(10.0f, 20.0f)
                curveTo(10.0f, 18.4f, 10.8f, 16.9f, 12.0f, 16.0f)
                horizontalLineTo(15.3f)
                curveTo(14.5f, 17.1f, 14.0f, 18.5f, 14.0f, 20.0f)
                horizontalLineTo(10.0f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 18.4f, 16.8f, 16.9f, 18.0f, 16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                moveTo(20.0f, 14.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 12.5f, 15.5f, 11.1f, 14.7f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                moveTo(20.0f, 8.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 6.4f, 16.8f, 4.9f, 18.0f, 4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _landFields!!
    }

private var _landFields: ImageVector? = null
