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

public val SimpleIcons.Torbrowser: ImageVector
    get() {
        if (_torbrowser != null) {
            return _torbrowser!!
        }
        _torbrowser = Builder(name = "Torbrowser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.82f)
                verticalLineToRelative(-1.46f)
                arcTo(8.36f, 8.36f, 0.0f, false, false, 20.36f, 12.0f)
                arcTo(8.36f, 8.36f, 0.0f, false, false, 12.0f, 3.64f)
                lineTo(12.0f, 2.18f)
                arcTo(9.83f, 9.83f, 0.0f, false, true, 21.82f, 12.0f)
                arcTo(9.83f, 9.83f, 0.0f, false, true, 12.0f, 21.82f)
                close()
                moveTo(12.0f, 16.73f)
                arcTo(4.74f, 4.74f, 0.0f, false, false, 16.73f, 12.0f)
                arcTo(4.74f, 4.74f, 0.0f, false, false, 12.0f, 7.27f)
                lineTo(12.0f, 5.82f)
                arcTo(6.17f, 6.17f, 0.0f, false, true, 18.18f, 12.0f)
                arcTo(6.17f, 6.17f, 0.0f, false, true, 12.0f, 18.18f)
                close()
                moveTo(12.0f, 9.46f)
                arcTo(2.54f, 2.54f, 0.0f, false, true, 14.55f, 12.0f)
                arcTo(2.54f, 2.54f, 0.0f, false, true, 12.0f, 14.54f)
                close()
                moveTo(0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
            }
        }
        .build()
        return _torbrowser!!
    }

private var _torbrowser: ImageVector? = null
