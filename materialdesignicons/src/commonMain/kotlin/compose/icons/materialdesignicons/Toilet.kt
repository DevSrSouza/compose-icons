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

public val MaterialDesignIcons.Toilet: ImageVector
    get() {
        if (_toilet != null) {
            return _toilet!!
        }
        _toilet = Builder(name = "Toilet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.5f)
                curveTo(19.41f, 17.87f, 21.0f, 15.12f, 21.0f, 12.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(13.89f, 2.0f, 13.0f, 2.9f, 13.0f, 4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 15.09f, 5.0f, 18.0f, 9.0f, 19.5f)
                verticalLineTo(22.0f)
                moveTo(5.29f, 14.0f)
                horizontalLineTo(18.71f)
                curveTo(18.14f, 15.91f, 16.77f, 17.5f, 15.0f, 18.33f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.33f)
                curveTo(9.0f, 18.0f, 5.86f, 15.91f, 5.29f, 14.0f)
                moveTo(15.0f, 4.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                moveTo(16.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _toilet!!
    }

private var _toilet: ImageVector? = null
