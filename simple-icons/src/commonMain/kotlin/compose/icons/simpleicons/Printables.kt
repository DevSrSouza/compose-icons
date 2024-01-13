package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Printables: ImageVector
    get() {
        if (_printables != null) {
            return _printables!!
        }
        _printables = Builder(name = "Printables", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.678f, 4.8f)
                lineTo(12.0f, 9.6f)
                verticalLineToRelative(9.6f)
                lineToRelative(8.322f, -4.8f)
                verticalLineTo(4.8f)
                lineTo(12.0f, 0.0f)
                close()
                moveTo(12.0f, 19.2f)
                lineToRelative(-8.322f, -4.8f)
                verticalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _printables!!
    }

private var _printables: ImageVector? = null
