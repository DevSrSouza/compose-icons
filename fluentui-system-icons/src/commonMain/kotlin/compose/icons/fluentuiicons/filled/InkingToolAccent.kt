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

public val FilledGroup.InkingToolAccent: ImageVector
    get() {
        if (_inkingToolAccent != null) {
            return _inkingToolAccent!!
        }
        _inkingToolAccent = Builder(name = "InkingToolAccent", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 7.0f)
                horizontalLineTo(20.25f)
                curveTo(20.3683f, 7.0f, 20.4675f, 6.9178f, 20.4934f, 6.8073f)
                lineTo(20.5f, 6.75f)
                verticalLineTo(3.0f)
                lineTo(3.75f, 3.0f)
                verticalLineTo(6.75f)
                curveTo(3.75f, 6.8684f, 3.8322f, 6.9675f, 3.9427f, 6.9934f)
                lineTo(4.0f, 7.0f)
                close()
                moveTo(11.9759f, 13.9457f)
                lineTo(14.6171f, 7.9987f)
                lineTo(15.5f, 7.5f)
                lineTo(16.2584f, 7.9987f)
                lineTo(13.3467f, 14.5546f)
                curveTo(13.2264f, 14.8255f, 12.9578f, 15.0002f, 12.6613f, 15.0002f)
                curveTo(12.1186f, 15.0002f, 11.7556f, 14.4417f, 11.9759f, 13.9457f)
                close()
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 20.1046f, 12.5523f, 21.0f, 12.0f, 21.0f)
                curveTo(11.4477f, 21.0f, 11.0f, 20.1046f, 11.0f, 19.0f)
                curveTo(11.0f, 17.8954f, 11.4477f, 17.0f, 12.0f, 17.0f)
                curveTo(12.5523f, 17.0f, 13.0f, 17.8954f, 13.0f, 19.0f)
                close()
            }
        }
        .build()
        return _inkingToolAccent!!
    }

private var _inkingToolAccent: ImageVector? = null
