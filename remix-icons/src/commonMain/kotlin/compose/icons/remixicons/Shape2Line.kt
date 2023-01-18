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

public val RemixIcons.Shape2Line: ImageVector
    get() {
        if (_shape2Line != null) {
            return _shape2Line!!
        }
        _shape2Line = Builder(name = "Shape2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                lineTo(8.0f, 20.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(4.0f, 8.0f)
                lineTo(2.0f, 8.0f)
                lineTo(2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(18.0f, 16.0f)
                lineTo(18.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(6.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                close()
                moveTo(4.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 18.0f)
                close()
                moveTo(18.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _shape2Line!!
    }

private var _shape2Line: ImageVector? = null
