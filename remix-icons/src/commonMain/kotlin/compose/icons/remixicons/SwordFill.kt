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

public val RemixIcons.SwordFill: ImageVector
    get() {
        if (_swordFill != null) {
            return _swordFill!!
        }
        _swordFill = Builder(name = "SwordFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.05f, 13.406f)
                lineToRelative(3.534f, 3.536f)
                lineToRelative(-1.413f, 1.414f)
                lineToRelative(1.415f, 1.415f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.475f, -2.475f)
                lineToRelative(-2.829f, 2.829f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.829f, -2.83f)
                lineToRelative(-2.475f, -2.474f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.414f, 1.413f)
                lineToRelative(1.413f, -1.414f)
                close()
                moveTo(3.0f, 3.0f)
                lineToRelative(3.546f, 0.003f)
                lineToRelative(11.817f, 11.818f)
                lineToRelative(1.415f, -1.414f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.474f, 2.475f)
                lineToRelative(2.828f, 2.829f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.829f, -2.829f)
                lineToRelative(-2.475f, 2.475f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.414f, -1.415f)
                lineTo(3.003f, 6.531f)
                lineTo(3.0f, 3.0f)
                close()
                moveTo(17.457f, 3.0f)
                lineTo(21.0f, 3.003f)
                lineToRelative(0.002f, 3.523f)
                lineToRelative(-4.053f, 4.052f)
                lineToRelative(-3.536f, -3.535f)
                lineTo(17.457f, 3.0f)
                close()
            }
        }
        .build()
        return _swordFill!!
    }

private var _swordFill: ImageVector? = null
