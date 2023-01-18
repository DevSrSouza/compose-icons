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

public val RemixIcons.LayoutMasonryLine: ImageVector
    get() {
        if (_layoutMasonryLine != null) {
            return _layoutMasonryLine!!
        }
        _layoutMasonryLine = Builder(name = "LayoutMasonryLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(11.0f, 15.0f)
                lineTo(4.0f, 15.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(20.0f, 11.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(11.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(7.0f)
                lineTo(11.0f, 5.0f)
                close()
                moveTo(20.0f, 5.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(7.0f)
                lineTo(20.0f, 5.0f)
                close()
            }
        }
        .build()
        return _layoutMasonryLine!!
    }

private var _layoutMasonryLine: ImageVector? = null
