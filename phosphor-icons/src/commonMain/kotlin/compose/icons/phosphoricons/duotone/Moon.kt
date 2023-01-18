package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.7f, 152.6f)
                arcTo(91.9f, 91.9f, 0.0f, false, true, 103.4f, 39.3f)
                horizontalLineToRelative(0.0f)
                arcTo(92.0f, 92.0f, 0.0f, true, false, 216.7f, 152.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.3f, 150.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -7.8f, -5.7f)
                lineToRelative(-2.2f, 0.4f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 111.0f, 41.6f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 0.3f, -1.8f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 101.0f, 31.7f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 224.3f, 154.9f)
                arcTo(7.2f, 7.2f, 0.0f, false, false, 224.3f, 150.3f)
                close()
                moveTo(128.0f, 212.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 92.8f, 51.7f)
                arcTo(99.9f, 99.9f, 0.0f, false, false, 204.3f, 163.2f)
                arcTo(84.4f, 84.4f, 0.0f, false, true, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
