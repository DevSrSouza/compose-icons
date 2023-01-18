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

public val FilledGroup.Prohibited: ImageVector
    get() {
        if (_prohibited != null) {
            return _prohibited!!
        }
        _prohibited = Builder(name = "Prohibited", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(18.1131f, 7.6538f)
                lineTo(7.6538f, 18.1131f)
                curveTo(8.8799f, 18.9864f, 10.38f, 19.5f, 12.0f, 19.5f)
                curveTo(16.1421f, 19.5f, 19.5f, 16.1421f, 19.5f, 12.0f)
                curveTo(19.5f, 10.38f, 18.9864f, 8.8799f, 18.1131f, 7.6538f)
                close()
                moveTo(12.0f, 4.5f)
                curveTo(7.8579f, 4.5f, 4.5f, 7.8579f, 4.5f, 12.0f)
                curveTo(4.5f, 13.62f, 5.0136f, 15.1201f, 5.887f, 16.3462f)
                lineTo(16.3462f, 5.887f)
                curveTo(15.1201f, 5.0136f, 13.62f, 4.5f, 12.0f, 4.5f)
                close()
            }
        }
        .build()
        return _prohibited!!
    }

private var _prohibited: ImageVector? = null
