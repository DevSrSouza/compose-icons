package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Pexels: ImageVector
    get() {
        if (_pexels != null) {
            return _pexels!!
        }
        _pexels = Builder(name = "Pexels", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 1.5f)
                verticalLineToRelative(21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 24.0f)
                horizontalLineToRelative(21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 0.0f)
                horizontalLineToRelative(-21.0f)
                close()
                moveTo(8.25f, 6.75f)
                horizontalLineToRelative(5.2715f)
                arcToRelative(3.843f, 3.843f, 0.0f, false, true, 0.627f, 7.6348f)
                lineTo(14.1485f, 17.25f)
                lineTo(8.25f, 17.25f)
                lineTo(8.25f, 6.75f)
                close()
                moveTo(9.75f, 8.25f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(2.8984f)
                verticalLineToRelative(-2.8145f)
                horizontalLineToRelative(0.873f)
                arcToRelative(2.343f, 2.343f, 0.0f, true, false, 0.0f, -4.6855f)
                lineTo(9.75f, 8.25f)
                close()
            }
        }
        .build()
        return _pexels!!
    }

private var _pexels: ImageVector? = null
