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

public val RemixIcons.SwordLine: ImageVector
    get() {
        if (_swordLine != null) {
            return _swordLine!!
        }
        _swordLine = Builder(name = "SwordLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.457f, 3.0f)
                lineTo(21.0f, 3.003f)
                lineToRelative(0.002f, 3.523f)
                lineToRelative(-5.467f, 5.466f)
                lineToRelative(2.828f, 2.829f)
                lineToRelative(1.415f, -1.414f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.474f, 2.475f)
                lineToRelative(2.828f, 2.829f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.829f, -2.829f)
                lineToRelative(-2.475f, 2.475f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.414f, -1.415f)
                lineToRelative(-2.829f, -2.828f)
                lineToRelative(-2.828f, 2.828f)
                lineToRelative(1.415f, 1.415f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.475f, -2.475f)
                lineToRelative(-2.829f, 2.829f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.829f, -2.83f)
                lineToRelative(-2.475f, -2.474f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.414f, 1.413f)
                lineToRelative(2.827f, -2.828f)
                lineToRelative(-5.46f, -5.46f)
                lineTo(3.0f, 3.0f)
                lineToRelative(3.546f, 0.003f)
                lineToRelative(5.453f, 5.454f)
                lineTo(17.457f, 3.0f)
                close()
                moveTo(9.877f, 13.406f)
                lineTo(7.05f, 16.234f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(2.827f, -2.828f)
                lineToRelative(-0.707f, -0.707f)
                close()
                moveTo(19.001f, 5.001f)
                horizontalLineToRelative(-0.717f)
                lineToRelative(-4.87f, 4.869f)
                lineToRelative(0.706f, 0.707f)
                lineToRelative(4.881f, -4.879f)
                verticalLineToRelative(-0.697f)
                close()
                moveTo(5.001f, 5.001f)
                verticalLineToRelative(0.7f)
                lineToRelative(11.241f, 11.241f)
                lineToRelative(0.707f, -0.707f)
                lineTo(5.716f, 5.002f)
                lineToRelative(-0.715f, -0.001f)
                close()
            }
        }
        .build()
        return _swordLine!!
    }

private var _swordLine: ImageVector? = null
