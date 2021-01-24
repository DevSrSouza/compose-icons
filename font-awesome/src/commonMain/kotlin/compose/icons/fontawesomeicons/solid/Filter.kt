package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(487.976f, 0.0f)
                horizontalLineTo(24.028f)
                curveTo(2.71f, 0.0f, -8.047f, 25.866f, 7.058f, 40.971f)
                lineTo(192.0f, 225.941f)
                verticalLineTo(432.0f)
                curveToRelative(0.0f, 7.831f, 3.821f, 15.17f, 10.237f, 19.662f)
                lineToRelative(80.0f, 55.98f)
                curveTo(298.02f, 518.69f, 320.0f, 507.493f, 320.0f, 487.98f)
                verticalLineTo(225.941f)
                lineToRelative(184.947f, -184.97f)
                curveTo(520.021f, 25.896f, 509.338f, 0.0f, 487.976f, 0.0f)
                close()
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
