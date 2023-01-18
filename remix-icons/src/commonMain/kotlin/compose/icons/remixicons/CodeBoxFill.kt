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

public val RemixIcons.CodeBoxFill: ImageVector
    get() {
        if (_codeBoxFill != null) {
            return _codeBoxFill!!
        }
        _codeBoxFill = Builder(name = "CodeBoxFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(16.464f, 15.536f)
                lineTo(20.0f, 12.0f)
                lineToRelative(-3.536f, -3.536f)
                lineTo(15.05f, 9.88f)
                lineTo(17.172f, 12.0f)
                lineToRelative(-2.122f, 2.121f)
                lineToRelative(1.414f, 1.415f)
                close()
                moveTo(6.828f, 12.0f)
                lineTo(8.95f, 9.879f)
                lineTo(7.536f, 8.464f)
                lineTo(4.0f, 12.0f)
                lineToRelative(3.536f, 3.536f)
                lineTo(8.95f, 14.12f)
                lineTo(6.828f, 12.0f)
                close()
                moveTo(11.244f, 17.0f)
                lineToRelative(3.64f, -10.0f)
                horizontalLineToRelative(-2.128f)
                lineToRelative(-3.64f, 10.0f)
                horizontalLineToRelative(2.128f)
                close()
            }
        }
        .build()
        return _codeBoxFill!!
    }

private var _codeBoxFill: ImageVector? = null
