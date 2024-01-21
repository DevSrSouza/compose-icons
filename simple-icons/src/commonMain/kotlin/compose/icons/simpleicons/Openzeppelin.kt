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

public val SimpleIcons.Openzeppelin: ImageVector
    get() {
        if (_openzeppelin != null) {
            return _openzeppelin!!
        }
        _openzeppelin = Builder(name = "Openzeppelin", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.783f, 24.0f)
                horizontalLineTo(9.317f)
                lineToRelative(2.196f, -3.69f)
                arcToRelative(5.23f, 5.23f, 0.0f, false, true, 4.494f, -2.558f)
                horizontalLineToRelative(6.775f)
                close()
                moveTo(1.217f, 0.0f)
                horizontalLineToRelative(21.566f)
                lineToRelative(-3.718f, 6.247f)
                horizontalLineTo(1.217f)
                close()
                moveTo(9.76f, 9.763f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, true, 4.92f, -2.795f)
                horizontalLineToRelative(4.01f)
                lineTo(8.498f, 24.0f)
                horizontalLineToRelative(-7.26f)
                close()
            }
        }
        .build()
        return _openzeppelin!!
    }

private var _openzeppelin: ImageVector? = null
