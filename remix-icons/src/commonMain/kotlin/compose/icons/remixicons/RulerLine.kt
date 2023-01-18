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

public val RemixIcons.RulerLine: ImageVector
    get() {
        if (_rulerLine != null) {
            return _rulerLine!!
        }
        _rulerLine = Builder(name = "RulerLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.343f, 14.621f)
                lineTo(3.515f, 17.45f)
                lineToRelative(3.535f, 3.535f)
                lineTo(20.485f, 7.55f)
                lineTo(16.95f, 4.015f)
                lineToRelative(-2.122f, 2.121f)
                lineToRelative(1.415f, 1.414f)
                lineToRelative(-1.415f, 1.414f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.121f, 2.122f)
                lineToRelative(2.121f, 2.12f)
                lineTo(12.0f, 13.208f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-2.122f, 2.121f)
                lineToRelative(1.415f, 1.414f)
                lineToRelative(-1.415f, 1.415f)
                lineToRelative(-1.414f, -1.415f)
                close()
                moveTo(17.657f, 1.893f)
                lineToRelative(4.95f, 4.95f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineToRelative(-14.85f, 14.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-4.95f, -4.95f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                lineToRelative(14.85f, -14.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _rulerLine!!
    }

private var _rulerLine: ImageVector? = null
