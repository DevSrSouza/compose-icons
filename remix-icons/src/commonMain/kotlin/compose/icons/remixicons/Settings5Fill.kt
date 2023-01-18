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

public val RemixIcons.Settings5Fill: ImageVector
    get() {
        if (_settings5Fill != null) {
            return _settings5Fill!!
        }
        _settings5Fill = Builder(name = "Settings5Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.132f, 13.63f)
                arcToRelative(9.942f, 9.942f, 0.0f, false, true, 0.0f, -3.26f)
                curveToRelative(1.102f, 0.026f, 2.092f, -0.502f, 2.477f, -1.431f)
                curveToRelative(0.385f, -0.93f, 0.058f, -2.004f, -0.74f, -2.763f)
                arcToRelative(9.942f, 9.942f, 0.0f, false, true, 2.306f, -2.307f)
                curveToRelative(0.76f, 0.798f, 1.834f, 1.125f, 2.764f, 0.74f)
                curveToRelative(0.93f, -0.385f, 1.457f, -1.376f, 1.43f, -2.477f)
                arcToRelative(9.942f, 9.942f, 0.0f, false, true, 3.262f, 0.0f)
                curveToRelative(-0.027f, 1.102f, 0.501f, 2.092f, 1.43f, 2.477f)
                curveToRelative(0.93f, 0.385f, 2.004f, 0.058f, 2.763f, -0.74f)
                arcToRelative(9.942f, 9.942f, 0.0f, false, true, 2.307f, 2.306f)
                curveToRelative(-0.798f, 0.76f, -1.125f, 1.834f, -0.74f, 2.764f)
                curveToRelative(0.385f, 0.93f, 1.376f, 1.457f, 2.477f, 1.43f)
                arcToRelative(9.942f, 9.942f, 0.0f, false, true, 0.0f, 3.262f)
                curveToRelative(-1.102f, -0.027f, -2.092f, 0.501f, -2.477f, 1.43f)
                curveToRelative(-0.385f, 0.93f, -0.058f, 2.004f, 0.74f, 2.763f)
                arcToRelative(9.942f, 9.942f, 0.0f, false, true, -2.306f, 2.307f)
                curveToRelative(-0.76f, -0.798f, -1.834f, -1.125f, -2.764f, -0.74f)
                curveToRelative(-0.93f, 0.385f, -1.457f, 1.376f, -1.43f, 2.477f)
                arcToRelative(9.942f, 9.942f, 0.0f, false, true, -3.262f, 0.0f)
                curveToRelative(0.027f, -1.102f, -0.501f, -2.092f, -1.43f, -2.477f)
                curveToRelative(-0.93f, -0.385f, -2.004f, -0.058f, -2.763f, 0.74f)
                arcToRelative(9.942f, 9.942f, 0.0f, false, true, -2.307f, -2.306f)
                curveToRelative(0.798f, -0.76f, 1.125f, -1.834f, 0.74f, -2.764f)
                curveToRelative(-0.385f, -0.93f, -1.376f, -1.457f, -2.477f, -1.43f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _settings5Fill!!
    }

private var _settings5Fill: ImageVector? = null
