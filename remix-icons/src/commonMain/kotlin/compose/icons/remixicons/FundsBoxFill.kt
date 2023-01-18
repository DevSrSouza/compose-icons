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

public val RemixIcons.FundsBoxFill: ImageVector
    get() {
        if (_fundsBoxFill != null) {
            return _fundsBoxFill!!
        }
        _fundsBoxFill = Builder(name = "FundsBoxFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(14.793f, 9.793f)
                lineToRelative(-2.45f, 2.45f)
                lineToRelative(-2.121f, -2.122f)
                lineToRelative(-4.243f, 4.243f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.829f, -2.828f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(3.864f, -3.864f)
                lineTo(18.0f, 13.0f)
                lineTo(18.0f, 8.0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(1.793f, 1.793f)
                close()
            }
        }
        .build()
        return _fundsBoxFill!!
    }

private var _fundsBoxFill: ImageVector? = null
