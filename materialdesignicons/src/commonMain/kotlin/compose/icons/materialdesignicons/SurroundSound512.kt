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

public val MaterialDesignIcons.SurroundSound512: ImageVector
    get() {
        if (_surroundSound512 != null) {
            return _surroundSound512!!
        }
        _surroundSound512 = Builder(name = "SurroundSound512", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                curveTo(18.9f, 11.0f, 18.0f, 11.9f, 18.0f, 13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                curveTo(23.1f, 13.0f, 24.0f, 12.1f, 24.0f, 11.0f)
                verticalLineTo(9.0f)
                curveTo(24.0f, 7.9f, 23.1f, 7.0f, 22.0f, 7.0f)
                horizontalLineTo(18.0f)
                moveTo(9.0f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                moveTo(9.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                moveTo(0.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                curveTo(5.1f, 17.0f, 6.0f, 16.1f, 6.0f, 15.0f)
                verticalLineTo(13.0f)
                curveTo(6.0f, 11.9f, 5.1f, 11.0f, 4.0f, 11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(0.0f)
                moveTo(17.0f, 17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
            }
        }
        .build()
        return _surroundSound512!!
    }

private var _surroundSound512: ImageVector? = null
