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

public val RemixIcons.LayoutGridFill: ImageVector
    get() {
        if (_layoutGridFill != null) {
            return _layoutGridFill!!
        }
        _layoutGridFill = Builder(name = "LayoutGridFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.999f)
                lineTo(22.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-8.001f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(11.0f, 12.999f)
                lineTo(11.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-7.001f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(11.0f, 3.0f)
                verticalLineToRelative(7.999f)
                lineTo(2.0f, 10.999f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(21.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(6.999f)
                horizontalLineToRelative(-9.0f)
                lineTo(13.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _layoutGridFill!!
    }

private var _layoutGridFill: ImageVector? = null
