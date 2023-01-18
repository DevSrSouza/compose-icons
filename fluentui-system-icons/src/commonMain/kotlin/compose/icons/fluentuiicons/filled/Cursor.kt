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

public val FilledGroup.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.921f, 2.2993f)
                curveTo(6.9357f, 1.5329f, 5.5f, 2.235f, 5.5f, 3.4832f)
                verticalLineTo(20.492f)
                curveTo(5.5f, 21.9142f, 7.2945f, 22.538f, 8.1766f, 21.4224f)
                lineTo(12.3676f, 16.1222f)
                curveTo(12.6806f, 15.7264f, 13.1574f, 15.4956f, 13.6619f, 15.4956f)
                horizontalLineTo(20.5143f)
                curveTo(21.9425f, 15.4956f, 22.5626f, 13.6885f, 21.4353f, 12.8116f)
                lineTo(7.921f, 2.2993f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
