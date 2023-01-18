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

public val RemixIcons.Flag2Fill: ImageVector
    get() {
        if (_flag2Fill != null) {
            return _flag2Fill!!
        }
        _flag2Fill = Builder(name = "Flag2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                horizontalLineToRelative(19.138f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.435f, 0.748f)
                lineTo(18.0f, 10.0f)
                lineToRelative(3.573f, 6.252f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.435f, 0.748f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _flag2Fill!!
    }

private var _flag2Fill: ImageVector? = null
