package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) {
            return _fireSimple!!
        }
        _fireSimple = Builder(name = "FireSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 140.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -184.0f, 0.0f)
                curveToRelative(0.0f, -23.1f, 9.9f, -49.7f, 29.4f, -79.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.1f, -3.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 6.0f, 1.2f)
                lineToRelative(32.2f, 21.5f)
                lineToRelative(30.9f, -64.8f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 5.9f, -4.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.0f, 2.2f)
                curveToRelative(14.7f, 14.7f, 31.6f, 32.6f, 44.6f, 53.4f)
                curveTo(212.5f, 91.1f, 220.0f, 115.1f, 220.0f, 140.0f)
                close()
            }
        }
        .build()
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
