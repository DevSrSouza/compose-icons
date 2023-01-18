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

public val RemixIcons.CloudyFill: ImageVector
    get() {
        if (_cloudyFill != null) {
            return _cloudyFill!!
        }
        _cloudyFill = Builder(name = "CloudyFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 20.986f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 7.715f, -12.983f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 17.0f, 20.981f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-0.014f)
                close()
            }
        }
        .build()
        return _cloudyFill!!
    }

private var _cloudyFill: ImageVector? = null
