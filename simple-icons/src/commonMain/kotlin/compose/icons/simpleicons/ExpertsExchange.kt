package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.ExpertsExchange: ImageVector
    get() {
        if (_expertsExchange != null) {
            return _expertsExchange!!
        }
        _expertsExchange = Builder(name = "ExpertsExchange", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.28f, 0.9f)
                horizontalLineTo(0.0f)
                lineTo(8.36f, 12.0f)
                lineTo(0.0f, 23.1f)
                horizontalLineToRelative(7.28f)
                lineTo(15.64f, 12.0f)
                close()
                moveTo(24.0f, 0.9f)
                horizontalLineToRelative(-7.28f)
                lineToRelative(-2.3f, 3.06f)
                lineToRelative(3.64f, 4.82f)
                close()
                moveTo(14.42f, 20.05f)
                lineToRelative(2.3f, 3.05f)
                horizontalLineTo(24.0f)
                lineToRelative(-5.94f, -7.88f)
                close()
            }
        }
        .build()
        return _expertsExchange!!
    }

private var _expertsExchange: ImageVector? = null
