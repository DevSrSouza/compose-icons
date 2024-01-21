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

public val SimpleIcons.Graphite: ImageVector
    get() {
        if (_graphite != null) {
            return _graphite!!
        }
        _graphite = Builder(name = "Graphite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.215f, 0.0f)
                lineToRelative(-12.0f, 3.215f)
                lineToRelative(-3.215f, 12.0f)
                lineTo(8.785f, 24.0f)
                lineToRelative(12.0f, -3.215f)
                lineToRelative(3.215f, -12.0f)
                lineTo(15.215f, 0.0f)
                close()
                moveTo(17.173f, 20.966f)
                lineTo(6.827f, 20.966f)
                lineTo(1.655f, 12.0f)
                lineToRelative(5.172f, -8.966f)
                horizontalLineToRelative(10.346f)
                lineTo(22.345f, 12.0f)
                lineToRelative(-5.172f, 8.966f)
                close()
                moveTo(17.853f, 6.143f)
                lineTo(9.86f, 4.0f)
                lineTo(4.006f, 9.858f)
                lineToRelative(2.14f, 8.0f)
                lineToRelative(7.995f, 2.141f)
                lineToRelative(5.853f, -5.857f)
                lineToRelative(-2.14f, -8.0f)
                close()
            }
        }
        .build()
        return _graphite!!
    }

private var _graphite: ImageVector? = null
