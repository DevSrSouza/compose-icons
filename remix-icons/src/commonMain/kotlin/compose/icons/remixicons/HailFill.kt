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

public val RemixIcons.HailFill: ImageVector
    get() {
        if (_hailFill != null) {
            return _hailFill!!
        }
        _hailFill = Builder(name = "HailFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.995f, 17.794f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.085f, -3.644f)
                arcTo(4.001f, 4.001f, 0.0f, false, false, 6.0f, 15.0f)
                curveToRelative(0.0f, 1.08f, 0.428f, 2.059f, 1.122f, 2.778f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 9.335f, -10.68f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 2.537f, 10.696f)
                close()
                moveTo(10.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
                moveTo(15.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
                moveTo(10.0f, 23.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _hailFill!!
    }

private var _hailFill: ImageVector? = null
