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

public val SimpleIcons.Lit: ImageVector
    get() {
        if (_lit != null) {
            return _lit!!
        }
        _lit = Builder(name = "Lit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.4f, 9.6f)
                lineToRelative(4.8f, 4.8f)
                lineTo(7.2f, 24.0f)
                lineToRelative(-4.8f, -4.8f)
                lineTo(2.4f, 9.6f)
                close()
                moveTo(7.2f, 4.8f)
                verticalLineToRelative(9.6f)
                lineTo(12.0f, 9.6f)
                lineTo(12.0f, 0.0f)
                lineTo(7.2f, 4.8f)
                close()
                moveTo(12.0f, 9.6f)
                verticalLineToRelative(9.6f)
                lineToRelative(4.8f, -4.8f)
                lineTo(16.8f, 4.8f)
                lineTo(12.0f, 9.6f)
                close()
                moveTo(16.8f, 14.4f)
                lineTo(16.8f, 24.0f)
                lineToRelative(4.8f, -4.8f)
                lineTo(21.6f, 9.6f)
                lineToRelative(-4.8f, 4.8f)
                close()
            }
        }
        .build()
        return _lit!!
    }

private var _lit: ImageVector? = null
