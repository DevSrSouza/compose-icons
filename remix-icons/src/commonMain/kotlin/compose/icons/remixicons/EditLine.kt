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

public val RemixIcons.EditLine: ImageVector
    get() {
        if (_editLine != null) {
            return _editLine!!
        }
        _editLine = Builder(name = "EditLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.414f, 16.0f)
                lineTo(16.556f, 5.858f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(5.0f, 14.586f)
                lineTo(5.0f, 16.0f)
                horizontalLineToRelative(1.414f)
                close()
                moveTo(7.243f, 18.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-4.243f)
                lineTo(14.435f, 2.322f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(2.829f, 2.829f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineTo(7.243f, 18.0f)
                close()
                moveTo(3.0f, 20.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _editLine!!
    }

private var _editLine: ImageVector? = null
