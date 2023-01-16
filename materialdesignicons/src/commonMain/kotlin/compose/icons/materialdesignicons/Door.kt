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

public val MaterialDesignIcons.Door: ImageVector
    get() {
        if (_door != null) {
            return _door!!
        }
        _door = Builder(name = "Door", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                curveTo(6.89f, 3.0f, 6.0f, 3.89f, 6.0f, 5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(5.0f)
                curveTo(18.0f, 3.89f, 17.11f, 3.0f, 16.0f, 3.0f)
                horizontalLineTo(8.0f)
                moveTo(8.0f, 5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                moveTo(13.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _door!!
    }

private var _door: ImageVector? = null
