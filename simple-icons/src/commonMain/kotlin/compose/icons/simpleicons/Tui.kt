package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Tui: ImageVector
    get() {
        if (_tui != null) {
            return _tui!!
        }
        _tui = Builder(name = "Tui", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.5167f)
                arcToRelative(2.117f, 2.117f, 0.0f, false, true, -2.117f, 2.117f)
                arcToRelative(2.117f, 2.117f, 0.0f, false, true, -2.117f, -2.117f)
                arcToRelative(2.117f, 2.117f, 0.0f, false, true, 2.117f, -2.117f)
                arcTo(2.117f, 2.117f, 0.0f, false, true, 24.0f, 4.5168f)
                close()
                moveTo(1.1397f, 7.7475f)
                horizontalLineToRelative(5.7055f)
                curveToRelative(0.5642f, 0.0f, 0.9806f, 0.1772f, 1.1465f, 0.9716f)
                curveToRelative(0.185f, 0.8836f, 0.1129f, 1.4986f, -0.8858f, 1.5686f)
                lineToRelative(-1.7909f, 0.132f)
                curveToRelative(1.318f, 8.3303f, 9.0277f, 11.0453f, 13.2221f, 2.073f)
                curveToRelative(0.6952f, -1.485f, 0.922f, -1.7548f, 1.6826f, -1.5663f)
                curveToRelative(1.0314f, 0.2561f, 1.1724f, 0.7899f, 0.677f, 2.2828f)
                curveToRelative(-3.6234f, 11.0566f, -15.8186f, 12.166f, -18.211f, -2.6044f)
                lineToRelative(-1.4546f, 0.105f)
                curveTo(0.0463f, 10.7942f, 0.0f, 9.7956f, 0.0f, 9.2404f)
                curveToRelative(0.0f, -1.0992f, 0.4074f, -1.493f, 1.1397f, -1.493f)
                close()
            }
        }
        .build()
        return _tui!!
    }

private var _tui: ImageVector? = null
