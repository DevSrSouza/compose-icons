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

public val FilledGroup.PanelLeftFocusRight: ImageVector
    get() {
        if (_panelLeftFocusRight != null) {
            return _panelLeftFocusRight!!
        }
        _panelLeftFocusRight = Builder(name = "PanelLeftFocusRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.25f, 20.0f)
                curveTo(20.7688f, 20.0f, 22.0f, 18.7688f, 22.0f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(22.0f, 5.2312f, 20.7688f, 4.0f, 19.25f, 4.0f)
                lineTo(4.75f, 4.0f)
                curveTo(3.2312f, 4.0f, 2.0f, 5.2312f, 2.0f, 6.75f)
                lineTo(2.0f, 17.25f)
                curveTo(2.0f, 18.7688f, 3.2312f, 20.0f, 4.75f, 20.0f)
                lineTo(19.25f, 20.0f)
                close()
                moveTo(8.0f, 5.5f)
                lineTo(8.0f, 18.5f)
                lineTo(4.75f, 18.5f)
                curveTo(4.0596f, 18.5f, 3.5f, 17.9404f, 3.5f, 17.25f)
                lineTo(3.5f, 6.75f)
                curveTo(3.5f, 6.0596f, 4.0596f, 5.5f, 4.75f, 5.5f)
                lineTo(8.0f, 5.5f)
                close()
            }
        }
        .build()
        return _panelLeftFocusRight!!
    }

private var _panelLeftFocusRight: ImageVector? = null
