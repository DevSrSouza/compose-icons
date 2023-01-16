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

public val MaterialDesignIcons.Desk: ImageVector
    get() {
        if (_desk != null) {
            return _desk!!
        }
        _desk = Builder(name = "Desk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                horizontalLineTo(21.0f)
                curveTo(21.55f, 6.0f, 22.0f, 6.45f, 22.0f, 7.0f)
                curveTo(22.0f, 7.55f, 21.55f, 8.0f, 21.0f, 8.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                curveTo(2.45f, 8.0f, 2.0f, 7.55f, 2.0f, 7.0f)
                curveTo(2.0f, 6.45f, 2.45f, 6.0f, 3.0f, 6.0f)
                moveTo(16.0f, 10.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.5f)
                curveTo(18.0f, 10.22f, 17.78f, 10.0f, 17.5f, 10.0f)
                horizontalLineTo(16.5f)
                curveTo(16.22f, 10.0f, 16.0f, 10.22f, 16.0f, 10.5f)
                moveTo(16.0f, 14.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.5f)
                curveTo(18.0f, 14.22f, 17.78f, 14.0f, 17.5f, 14.0f)
                horizontalLineTo(16.5f)
                curveTo(16.22f, 14.0f, 16.0f, 14.22f, 16.0f, 14.5f)
                close()
            }
        }
        .build()
        return _desk!!
    }

private var _desk: ImageVector? = null
