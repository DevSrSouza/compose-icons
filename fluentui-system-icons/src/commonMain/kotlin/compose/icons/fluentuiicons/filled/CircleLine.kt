package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.CircleLine: ImageVector
    get() {
        if (_circleLine != null) {
            return _circleLine!!
        }
        _circleLine = Builder(name = "CircleLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9719f, 12.75f)
                horizontalLineTo(2.0273f)
                curveTo(2.4109f, 17.9225f, 6.7291f, 22.0f, 11.9996f, 22.0f)
                curveTo(17.2702f, 22.0f, 21.5884f, 17.9225f, 21.9719f, 12.75f)
                close()
                moveTo(21.9719f, 11.25f)
                horizontalLineTo(2.0273f)
                curveTo(2.4109f, 6.0774f, 6.7291f, 2.0f, 11.9996f, 2.0f)
                curveTo(17.2702f, 2.0f, 21.5884f, 6.0774f, 21.9719f, 11.25f)
                close()
            }
        }
        .build()
        return _circleLine!!
    }

private var _circleLine: ImageVector? = null
