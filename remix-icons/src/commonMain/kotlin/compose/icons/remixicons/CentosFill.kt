package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.CentosFill: ImageVector
    get() {
        if (_centosFill != null) {
            return _centosFill!!
        }
        _centosFill = Builder(name = "CentosFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.06f)
                lineToRelative(4.47f, 4.471f)
                lineTo(12.0f, 22.0f)
                lineToRelative(-4.47f, -4.47f)
                lineTo(12.0f, 13.06f)
                close()
                moveTo(4.0f, 16.12f)
                lineTo(7.879f, 20.0f)
                lineTo(4.0f, 20.0f)
                verticalLineToRelative(-3.88f)
                close()
                moveTo(20.0f, 16.12f)
                lineTo(20.0f, 20.0f)
                horizontalLineToRelative(-3.88f)
                lineTo(20.0f, 16.12f)
                close()
                moveTo(17.53f, 7.53f)
                lineTo(22.0f, 12.0f)
                lineToRelative(-4.469f, 4.47f)
                lineToRelative(-4.47f, -4.47f)
                lineToRelative(4.469f, -4.47f)
                close()
                moveTo(6.47f, 7.53f)
                lineTo(10.94f, 12.0f)
                lineToRelative(-4.471f, 4.469f)
                lineTo(2.0f, 12.0f)
                lineToRelative(4.47f, -4.47f)
                close()
                moveTo(12.0f, 2.0f)
                lineToRelative(4.469f, 4.469f)
                lineTo(12.0f, 10.939f)
                lineTo(7.53f, 6.47f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(7.879f, 4.0f)
                lineToRelative(-3.88f, 3.879f)
                lineTo(4.0f, 4.0f)
                horizontalLineToRelative(3.879f)
                close()
                moveTo(20.0f, 4.0f)
                verticalLineToRelative(3.879f)
                lineToRelative(-3.88f, -3.88f)
                lineTo(20.0f, 4.0f)
                close()
            }
        }
        .build()
        return _centosFill!!
    }

private var _centosFill: ImageVector? = null
