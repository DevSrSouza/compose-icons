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

public val MaterialDesignIcons.LightbulbCfl: ImageVector
    get() {
        if (_lightbulbCfl != null) {
            return _lightbulbCfl!!
        }
        _lightbulbCfl = Builder(name = "LightbulbCfl", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 2.0f)
                curveTo(11.88f, 2.0f, 13.0f, 3.12f, 13.0f, 4.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.47f)
                curveTo(14.0f, 3.56f, 13.63f, 2.7f, 13.0f, 2.05f)
                curveTo(13.17f, 2.0f, 13.33f, 2.0f, 13.5f, 2.0f)
                curveTo(14.88f, 2.0f, 16.0f, 3.12f, 16.0f, 4.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                curveTo(17.0f, 17.55f, 16.55f, 18.0f, 16.0f, 18.0f)
                horizontalLineTo(8.0f)
                curveTo(7.45f, 18.0f, 7.0f, 17.55f, 7.0f, 17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.5f)
                curveTo(8.0f, 3.12f, 9.12f, 2.0f, 10.5f, 2.0f)
                moveTo(10.5f, 4.0f)
                curveTo(10.22f, 4.0f, 10.0f, 4.22f, 10.0f, 4.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.5f)
                curveTo(11.0f, 4.22f, 10.78f, 4.0f, 10.5f, 4.0f)
                moveTo(9.0f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                curveTo(15.0f, 21.55f, 14.55f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(9.45f, 22.0f, 9.0f, 21.55f, 9.0f, 21.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _lightbulbCfl!!
    }

private var _lightbulbCfl: ImageVector? = null
