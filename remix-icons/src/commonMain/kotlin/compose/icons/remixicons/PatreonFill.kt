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

public val RemixIcons.PatreonFill: ImageVector
    get() {
        if (_patreonFill != null) {
            return _patreonFill!!
        }
        _patreonFill = Builder(name = "PatreonFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 17.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, 0.0f, -15.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 0.0f, 15.0f)
                close()
                moveTo(2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _patreonFill!!
    }

private var _patreonFill: ImageVector? = null
