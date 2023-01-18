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

public val FilledGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.748f)
                curveTo(3.0f, 3.3338f, 3.3358f, 2.998f, 3.75f, 2.998f)
                horizontalLineTo(20.2541f)
                curveTo(20.8722f, 2.998f, 21.225f, 3.7037f, 20.8541f, 4.1981f)
                lineTo(16.6898f, 9.7493f)
                lineTo(20.8541f, 15.3004f)
                curveTo(21.225f, 15.7948f, 20.8722f, 16.5005f, 20.2541f, 16.5005f)
                lineTo(4.5f, 16.5f)
                verticalLineTo(21.2499f)
                curveTo(4.5f, 21.6296f, 4.2179f, 21.9434f, 3.8518f, 21.993f)
                lineTo(3.75f, 21.9999f)
                curveTo(3.3703f, 21.9999f, 3.0565f, 21.7177f, 3.0069f, 21.3517f)
                lineTo(3.0f, 21.2499f)
                verticalLineTo(3.748f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
