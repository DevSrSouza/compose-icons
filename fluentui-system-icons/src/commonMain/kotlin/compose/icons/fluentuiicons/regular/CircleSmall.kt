package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.CircleSmall: ImageVector
    get() {
        if (_circleSmall != null) {
            return _circleSmall!!
        }
        _circleSmall = Builder(name = "CircleSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.5f)
                curveTo(10.6193f, 9.5f, 9.5f, 10.6193f, 9.5f, 12.0f)
                curveTo(9.5f, 13.3807f, 10.6193f, 14.5f, 12.0f, 14.5f)
                curveTo(13.3807f, 14.5f, 14.5f, 13.3807f, 14.5f, 12.0f)
                curveTo(14.5f, 10.6193f, 13.3807f, 9.5f, 12.0f, 9.5f)
                close()
                moveTo(8.0f, 12.0f)
                curveTo(8.0f, 9.7909f, 9.7909f, 8.0f, 12.0f, 8.0f)
                curveTo(14.2091f, 8.0f, 16.0f, 9.7909f, 16.0f, 12.0f)
                curveTo(16.0f, 14.2091f, 14.2091f, 16.0f, 12.0f, 16.0f)
                curveTo(9.7909f, 16.0f, 8.0f, 14.2091f, 8.0f, 12.0f)
                close()
            }
        }
        .build()
        return _circleSmall!!
    }

private var _circleSmall: ImageVector? = null
