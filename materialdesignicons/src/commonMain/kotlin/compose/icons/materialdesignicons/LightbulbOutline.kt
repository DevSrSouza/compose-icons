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

public val MaterialDesignIcons.LightbulbOutline: ImageVector
    get() {
        if (_lightbulbOutline != null) {
            return _lightbulbOutline!!
        }
        _lightbulbOutline = Builder(name = "LightbulbOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 19.0f, 9.0f)
                curveTo(19.0f, 11.38f, 17.81f, 13.47f, 16.0f, 14.74f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 18.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 17.0f)
                verticalLineTo(14.74f)
                curveTo(6.19f, 13.47f, 5.0f, 11.38f, 5.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(9.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 21.0f)
                moveTo(12.0f, 4.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 9.0f)
                curveTo(7.0f, 11.05f, 8.23f, 12.81f, 10.0f, 13.58f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.58f)
                curveTo(15.77f, 12.81f, 17.0f, 11.05f, 17.0f, 9.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _lightbulbOutline!!
    }

private var _lightbulbOutline: ImageVector? = null
