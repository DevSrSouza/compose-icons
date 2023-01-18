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

public val RemixIcons.XingFill: ImageVector
    get() {
        if (_xingFill != null) {
            return _xingFill!!
        }
        _xingFill = Builder(name = "XingFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.462f, 3.23f)
                curveToRelative(0.153f, 0.0f, 0.307f, 0.078f, 0.384f, 0.155f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, 0.0f, 0.461f)
                lineToRelative(-6.077f, 10.77f)
                lineToRelative(3.846f, 7.076f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, 0.0f, 0.462f)
                arcToRelative(0.588f, 0.588f, 0.0f, false, true, -0.384f, 0.154f)
                horizontalLineToRelative(-2.77f)
                curveToRelative(-0.384f, 0.0f, -0.615f, -0.308f, -0.769f, -0.539f)
                lineToRelative(-3.923f, -7.154f)
                curveTo(11.0f, 14.308f, 16.923f, 3.77f, 16.923f, 3.77f)
                curveToRelative(0.154f, -0.307f, 0.385f, -0.538f, 0.77f, -0.538f)
                horizontalLineToRelative(2.769f)
                close()
                moveTo(8.923f, 7.0f)
                curveToRelative(0.385f, 0.0f, 0.615f, 0.308f, 0.77f, 0.538f)
                lineToRelative(1.922f, 3.308f)
                curveToRelative(-0.153f, 0.154f, -3.0f, 5.23f, -3.0f, 5.23f)
                curveToRelative(-0.153f, 0.232f, -0.384f, 0.54f, -0.769f, 0.54f)
                horizontalLineTo(5.154f)
                arcToRelative(0.588f, 0.588f, 0.0f, false, true, -0.385f, -0.154f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, 0.0f, -0.462f)
                lineToRelative(2.846f, -5.154f)
                lineToRelative(-1.846f, -3.23f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, 0.0f, -0.462f)
                arcTo(0.588f, 0.588f, 0.0f, false, true, 6.154f, 7.0f)
                horizontalLineToRelative(2.77f)
                close()
            }
        }
        .build()
        return _xingFill!!
    }

private var _xingFill: ImageVector? = null
