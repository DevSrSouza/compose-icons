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

public val RemixIcons.MoonFoggyFill: ImageVector
    get() {
        if (_moonFoggyFill != null) {
            return _moonFoggyFill!!
        }
        _moonFoggyFill = Builder(name = "MoonFoggyFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 20.334f)
                lineTo(16.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                lineTo(3.332f, 14.0f)
                arcTo(9.511f, 9.511f, 0.0f, false, true, 3.0f, 11.5f)
                curveToRelative(0.0f, -4.56f, 3.213f, -8.37f, 7.5f, -9.289f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.49f, 9.724f)
                arcToRelative(9.505f, 9.505f, 0.0f, false, true, -5.99f, 8.4f)
                close()
                moveTo(7.0f, 20.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _moonFoggyFill!!
    }

private var _moonFoggyFill: ImageVector? = null
