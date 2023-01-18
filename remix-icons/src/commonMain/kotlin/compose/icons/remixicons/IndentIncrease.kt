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

public val RemixIcons.IndentIncrease: ImageVector
    get() {
        if (_indentIncrease != null) {
            return _indentIncrease!!
        }
        _indentIncrease = Builder(name = "IndentIncrease", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 6.0f)
                lineTo(3.0f, 4.0f)
                close()
                moveTo(3.0f, 19.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(11.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 9.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(11.0f, 11.0f)
                lineTo(11.0f, 9.0f)
                close()
                moveTo(7.0f, 12.5f)
                lineTo(3.0f, 16.0f)
                lineTo(3.0f, 9.0f)
                lineToRelative(4.0f, 3.5f)
                close()
            }
        }
        .build()
        return _indentIncrease!!
    }

private var _indentIncrease: ImageVector? = null
