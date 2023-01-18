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

public val RemixIcons.Number3: ImageVector
    get() {
        if (_number3 != null) {
            return _number3!!
        }
        _number3 = Builder(name = "Number3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                verticalLineToRelative(1.362f)
                lineTo(12.809f, 9.55f)
                arcToRelative(6.501f, 6.501f, 0.0f, true, true, -7.116f, 8.028f)
                lineToRelative(1.94f, -0.486f)
                arcTo(4.502f, 4.502f, 0.0f, false, false, 16.5f, 16.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -6.505f, -4.03f)
                lineToRelative(-0.228f, 0.122f)
                lineToRelative(-0.69f, -1.207f)
                lineTo(14.855f, 4.0f)
                lineTo(6.5f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _number3!!
    }

private var _number3: ImageVector? = null
