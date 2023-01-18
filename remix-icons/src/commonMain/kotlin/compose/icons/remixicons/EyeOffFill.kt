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

public val RemixIcons.EyeOffFill: ImageVector
    get() {
        if (_eyeOffFill != null) {
            return _eyeOffFill!!
        }
        _eyeOffFill = Builder(name = "EyeOffFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.52f, 5.934f)
                lineTo(1.393f, 2.808f)
                lineToRelative(1.415f, -1.415f)
                lineToRelative(19.799f, 19.8f)
                lineToRelative(-1.415f, 1.414f)
                lineToRelative(-3.31f, -3.31f)
                arcTo(10.949f, 10.949f, 0.0f, false, true, 12.0f, 21.0f)
                curveToRelative(-5.392f, 0.0f, -9.878f, -3.88f, -10.819f, -9.0f)
                arcToRelative(10.982f, 10.982f, 0.0f, false, true, 3.34f, -6.066f)
                close()
                moveTo(14.757f, 16.172f)
                lineToRelative(-1.464f, -1.464f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -4.001f, -4.001f)
                lineTo(7.828f, 9.243f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 6.929f, 6.929f)
                close()
                moveTo(7.974f, 3.76f)
                curveTo(9.221f, 3.27f, 10.58f, 3.0f, 12.0f, 3.0f)
                curveToRelative(5.392f, 0.0f, 9.878f, 3.88f, 10.819f, 9.0f)
                arcToRelative(10.947f, 10.947f, 0.0f, false, true, -2.012f, 4.592f)
                lineToRelative(-3.86f, -3.86f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.68f, -5.68f)
                lineTo(7.974f, 3.761f)
                close()
            }
        }
        .build()
        return _eyeOffFill!!
    }

private var _eyeOffFill: ImageVector? = null
