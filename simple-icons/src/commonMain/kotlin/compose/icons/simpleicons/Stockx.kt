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

public val SimpleIcons.Stockx: ImageVector
    get() {
        if (_stockx != null) {
            return _stockx!!
        }
        _stockx = Builder(name = "Stockx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.74f, 16.5f)
                lineTo(22.5f, 24.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(-7.0f, -6.0f)
                lineToRelative(7.0f, -6.0f)
                verticalLineTo(0.0f)
                lineTo(10.26f, 10.5f)
                verticalLineToRelative(-3.0f)
                lineTo(1.5f, 0.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(7.0f, 6.0f)
                lineToRelative(-7.0f, 6.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(12.24f, -10.5f)
                close()
            }
        }
        .build()
        return _stockx!!
    }

private var _stockx: ImageVector? = null
