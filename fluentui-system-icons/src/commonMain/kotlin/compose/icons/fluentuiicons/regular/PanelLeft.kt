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

public val RegularGroup.PanelLeft: ImageVector
    get() {
        if (_panelLeft != null) {
            return _panelLeft!!
        }
        _panelLeft = Builder(name = "PanelLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 4.0f)
                curveTo(3.2312f, 4.0f, 2.0f, 5.2312f, 2.0f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(2.0f, 18.7688f, 3.2312f, 20.0f, 4.75f, 20.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 20.0f, 22.0f, 18.7688f, 22.0f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(22.0f, 5.2312f, 20.7688f, 4.0f, 19.25f, 4.0f)
                horizontalLineTo(4.75f)
                close()
                moveTo(3.5f, 6.75f)
                curveTo(3.5f, 6.0596f, 4.0596f, 5.5f, 4.75f, 5.5f)
                horizontalLineTo(8.0043f)
                verticalLineTo(18.5f)
                horizontalLineTo(4.75f)
                curveTo(4.0596f, 18.5f, 3.5f, 17.9404f, 3.5f, 17.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(9.5043f, 18.5f)
                verticalLineTo(5.5f)
                horizontalLineTo(19.25f)
                curveTo(19.9404f, 5.5f, 20.5f, 6.0596f, 20.5f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(20.5f, 17.9404f, 19.9404f, 18.5f, 19.25f, 18.5f)
                horizontalLineTo(9.5043f)
                close()
            }
        }
        .build()
        return _panelLeft!!
    }

private var _panelLeft: ImageVector? = null
