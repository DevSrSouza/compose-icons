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

public val FilledGroup.DocumentCopy: ImageVector
    get() {
        if (_documentCopy != null) {
            return _documentCopy!!
        }
        _documentCopy = Builder(name = "DocumentCopy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.75f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.75f)
                curveTo(7.5074f, 2.0f, 6.5f, 3.0074f, 6.5f, 4.25f)
                verticalLineTo(17.25f)
                curveTo(6.5f, 18.4926f, 7.5074f, 19.5f, 8.75f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.9926f, 19.5f, 20.0f, 18.4926f, 20.0f, 17.25f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.25f)
                curveTo(14.0074f, 9.0f, 13.0f, 7.9926f, 13.0f, 6.75f)
                close()
                moveTo(14.5f, 6.75f)
                verticalLineTo(2.5f)
                lineTo(19.5f, 7.5f)
                horizontalLineTo(15.25f)
                curveTo(14.8358f, 7.5f, 14.5f, 7.1642f, 14.5f, 6.75f)
                close()
                moveTo(5.5028f, 4.627f)
                curveTo(4.6274f, 4.9351f, 4.0f, 5.7693f, 4.0f, 6.75f)
                verticalLineTo(17.2542f)
                curveTo(4.0f, 19.8775f, 6.1266f, 22.0042f, 8.75f, 22.0042f)
                horizontalLineTo(15.2444f)
                curveTo(16.224f, 22.0042f, 17.0573f, 21.3782f, 17.3663f, 20.5044f)
                lineTo(8.75f, 20.5042f)
                curveTo(6.9551f, 20.5042f, 5.5f, 19.0491f, 5.5f, 17.2542f)
                lineTo(5.5028f, 4.627f)
                close()
            }
        }
        .build()
        return _documentCopy!!
    }

private var _documentCopy: ImageVector? = null
