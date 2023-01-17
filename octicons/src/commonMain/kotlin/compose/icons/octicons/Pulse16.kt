package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Pulse16: ImageVector
    get() {
        if (_pulse16 != null) {
            return _pulse16!!
        }
        _pulse16 = Builder(name = "Pulse16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                curveToRelative(0.306f, 0.0f, 0.582f, 0.187f, 0.696f, 0.471f)
                lineTo(10.0f, 10.731f)
                lineToRelative(1.304f, -3.26f)
                arcTo(0.751f, 0.751f, 0.0f, false, true, 12.0f, 7.0f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.742f)
                lineToRelative(-1.812f, 4.528f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.392f, 0.0f)
                lineTo(6.0f, 4.77f)
                lineTo(4.696f, 8.03f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.0f, 8.5f)
                horizontalLineTo(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(2.742f)
                lineToRelative(1.812f, -4.529f)
                arcTo(0.751f, 0.751f, 0.0f, false, true, 6.0f, 2.0f)
                close()
            }
        }
        .build()
        return _pulse16!!
    }

private var _pulse16: ImageVector? = null
