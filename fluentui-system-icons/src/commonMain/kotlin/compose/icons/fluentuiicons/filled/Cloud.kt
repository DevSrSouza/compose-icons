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

public val FilledGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0866f, 9.75f)
                curveTo(6.561f, 7.0428f, 8.9246f, 5.0f, 11.75f, 5.0f)
                curveTo(14.5754f, 5.0f, 16.939f, 7.0428f, 17.4134f, 9.75f)
                lineTo(17.5f, 9.75f)
                curveTo(19.7091f, 9.75f, 21.5f, 11.5409f, 21.5f, 13.75f)
                curveTo(21.5f, 15.9591f, 19.7091f, 17.75f, 17.5f, 17.75f)
                horizontalLineTo(6.0f)
                curveTo(3.7909f, 17.75f, 2.0f, 15.9591f, 2.0f, 13.75f)
                curveTo(2.0f, 11.5409f, 3.7909f, 9.75f, 6.0f, 9.75f)
                lineTo(6.0866f, 9.75f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
