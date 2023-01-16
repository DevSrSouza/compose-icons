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

public val MaterialDesignIcons.Patreon: ImageVector
    get() {
        if (_patreon != null) {
            return _patreon!!
        }
        _patreon = Builder(name = "Patreon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.82f, 2.41f)
                curveTo(18.78f, 2.41f, 22.0f, 5.65f, 22.0f, 9.62f)
                curveTo(22.0f, 13.58f, 18.78f, 16.8f, 14.82f, 16.8f)
                curveTo(10.85f, 16.8f, 7.61f, 13.58f, 7.61f, 9.62f)
                curveTo(7.61f, 5.65f, 10.85f, 2.41f, 14.82f, 2.41f)
                moveTo(2.0f, 21.6f)
                horizontalLineTo(5.5f)
                verticalLineTo(2.41f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.6f)
                close()
            }
        }
        .build()
        return _patreon!!
    }

private var _patreon: ImageVector? = null
