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

public val RemixIcons.TrelloFill: ImageVector
    get() {
        if (_trelloFill != null) {
            return _trelloFill!!
        }
        _trelloFill = Builder(name = "TrelloFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 3.0f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 21.0f, 5.25f)
                verticalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 18.75f, 21.0f)
                lineTo(5.25f, 21.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 3.0f, 18.75f)
                lineTo(3.0f, 5.25f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 5.25f, 3.0f)
                close()
                moveTo(13.17f, 6.42f)
                verticalLineToRelative(5.76f)
                curveToRelative(0.0f, 0.596f, 0.484f, 1.08f, 1.08f, 1.08f)
                horizontalLineToRelative(3.33f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, false, 1.08f, -1.08f)
                lineTo(18.66f, 6.42f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, false, -1.08f, -1.08f)
                horizontalLineToRelative(-3.33f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, false, -1.08f, 1.08f)
                close()
                moveTo(5.34f, 6.42f)
                verticalLineToRelative(10.26f)
                curveToRelative(0.0f, 0.596f, 0.484f, 1.08f, 1.08f, 1.08f)
                horizontalLineToRelative(3.33f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, false, 1.08f, -1.08f)
                lineTo(10.83f, 6.42f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, false, -1.08f, -1.08f)
                lineTo(6.42f, 5.34f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, false, -1.08f, 1.08f)
                close()
            }
        }
        .build()
        return _trelloFill!!
    }

private var _trelloFill: ImageVector? = null
