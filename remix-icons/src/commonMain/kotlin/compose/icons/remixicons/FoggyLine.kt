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

public val RemixIcons.FoggyLine: ImageVector
    get() {
        if (_foggyLine != null) {
            return _foggyLine!!
        }
        _foggyLine = Builder(name = "FoggyLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.584f, 13.007f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.873f, -5.908f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 6.52f, 5.908f)
                horizontalLineToRelative(-2.013f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 15.0f, 10.05f)
                lineTo(15.0f, 10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.193f, 3.007f)
                lineTo(1.584f, 13.007f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 15.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _foggyLine!!
    }

private var _foggyLine: ImageVector? = null
