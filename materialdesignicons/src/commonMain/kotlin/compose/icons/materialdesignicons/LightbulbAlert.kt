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

public val MaterialDesignIcons.LightbulbAlert: ImageVector
    get() {
        if (_lightbulbAlert != null) {
            return _lightbulbAlert!!
        }
        _lightbulbAlert = Builder(name = "LightbulbAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                curveTo(6.1f, 2.0f, 3.0f, 5.1f, 3.0f, 9.0f)
                curveTo(3.0f, 11.4f, 4.2f, 13.5f, 6.0f, 14.7f)
                verticalLineTo(17.0f)
                curveTo(6.0f, 17.6f, 6.4f, 18.0f, 7.0f, 18.0f)
                horizontalLineTo(13.0f)
                curveTo(13.6f, 18.0f, 14.0f, 17.6f, 14.0f, 17.0f)
                verticalLineTo(14.7f)
                curveTo(15.8f, 13.4f, 17.0f, 11.3f, 17.0f, 9.0f)
                curveTo(17.0f, 5.1f, 13.9f, 2.0f, 10.0f, 2.0f)
                moveTo(7.0f, 21.0f)
                curveTo(7.0f, 21.6f, 7.4f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(12.0f)
                curveTo(12.6f, 22.0f, 13.0f, 21.6f, 13.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                moveTo(19.0f, 12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _lightbulbAlert!!
    }

private var _lightbulbAlert: ImageVector? = null
