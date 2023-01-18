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

public val FilledGroup.Comma: ImageVector
    get() {
        if (_comma != null) {
            return _comma!!
        }
        _comma = Builder(name = "Comma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1996f, 12.3415f)
                curveTo(13.5685f, 12.7577f, 12.8125f, 13.0f, 12.0f, 13.0f)
                curveTo(9.7909f, 13.0f, 8.0f, 11.2091f, 8.0f, 9.0f)
                curveTo(8.0f, 6.7909f, 9.7909f, 5.0f, 12.0f, 5.0f)
                curveTo(14.029f, 5.0f, 15.7051f, 6.5107f, 15.965f, 8.4686f)
                curveTo(16.3297f, 10.2611f, 16.4722f, 12.416f, 15.7577f, 14.3665f)
                curveTo(14.9923f, 16.4562f, 13.2939f, 18.1714f, 10.2533f, 18.9674f)
                curveTo(9.719f, 19.1073f, 9.1725f, 18.7875f, 9.0326f, 18.2533f)
                curveTo(8.8927f, 17.719f, 9.2125f, 17.1725f, 9.7467f, 17.0326f)
                curveTo(12.2061f, 16.3887f, 13.3577f, 15.1039f, 13.8798f, 13.6786f)
                curveTo(14.0354f, 13.2536f, 14.1391f, 12.8047f, 14.1996f, 12.3415f)
                close()
            }
        }
        .build()
        return _comma!!
    }

private var _comma: ImageVector? = null
