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

public val MaterialDesignIcons.Iron: ImageVector
    get() {
        if (_iron != null) {
            return _iron!!
        }
        _iron = Builder(name = "Iron", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                curveTo(19.34f, 6.0f, 18.0f, 7.34f, 18.0f, 9.0f)
                verticalLineTo(13.0f)
                curveTo(18.0f, 13.55f, 17.55f, 14.0f, 17.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(17.0f, 8.34f, 15.66f, 7.0f, 14.0f, 7.0f)
                horizontalLineTo(10.0f)
                curveTo(8.34f, 7.0f, 7.0f, 8.34f, 7.0f, 10.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 9.45f, 9.45f, 9.0f, 10.0f, 9.0f)
                horizontalLineTo(14.0f)
                curveTo(14.55f, 9.0f, 15.0f, 9.45f, 15.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                curveTo(3.79f, 11.0f, 2.0f, 12.79f, 2.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                curveTo(18.66f, 16.0f, 20.0f, 14.66f, 20.0f, 13.0f)
                verticalLineTo(9.0f)
                curveTo(20.0f, 8.45f, 20.45f, 8.0f, 21.0f, 8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _iron!!
    }

private var _iron: ImageVector? = null
