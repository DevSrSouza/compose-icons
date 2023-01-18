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

public val RemixIcons.Number2: ImageVector
    get() {
        if (_number2 != null) {
            return _number2!!
        }
        _number2 = Builder(name = "Number2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -8.0f, 0.0f)
                horizontalLineTo(6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 10.663f, 3.776f)
                lineToRelative(-7.32f, 8.723f)
                lineTo(18.0f, 20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-1.127f)
                lineToRelative(9.064f, -10.802f)
                arcTo(3.982f, 3.982f, 0.0f, false, false, 16.0f, 7.5f)
                close()
            }
        }
        .build()
        return _number2!!
    }

private var _number2: ImageVector? = null
