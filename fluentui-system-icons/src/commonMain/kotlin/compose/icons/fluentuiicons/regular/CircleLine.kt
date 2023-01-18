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

public val RegularGroup.CircleLine: ImageVector
    get() {
        if (_circleLine != null) {
            return _circleLine!!
        }
        _circleLine = Builder(name = "CircleLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5326f, 11.25f)
                horizontalLineTo(20.4674f)
                curveTo(20.0877f, 6.9069f, 16.4417f, 3.5f, 12.0f, 3.5f)
                curveTo(7.5583f, 3.5f, 3.9123f, 6.9069f, 3.5326f, 11.25f)
                close()
                moveTo(20.4674f, 12.75f)
                horizontalLineTo(3.5326f)
                curveTo(3.9123f, 17.0931f, 7.5583f, 20.5f, 12.0f, 20.5f)
                curveTo(16.4417f, 20.5f, 20.0877f, 17.0931f, 20.4674f, 12.75f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                close()
            }
        }
        .build()
        return _circleLine!!
    }

private var _circleLine: ImageVector? = null
