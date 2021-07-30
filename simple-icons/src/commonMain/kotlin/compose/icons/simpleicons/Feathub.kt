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

public val SimpleIcons.Feathub: ImageVector
    get() {
        if (_feathub != null) {
            return _feathub!!
        }
        _feathub = Builder(name = "Feathub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.571f, 0.0f)
                verticalLineToRelative(6.857f)
                horizontalLineToRelative(6.858f)
                lineTo(15.429f, 0.0f)
                close()
                moveTo(0.0f, 8.571f)
                verticalLineToRelative(6.858f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 8.57f)
                close()
                moveTo(8.571f, 17.143f)
                lineTo(8.571f, 24.0f)
                horizontalLineToRelative(6.858f)
                verticalLineToRelative(-6.857f)
                close()
            }
        }
        .build()
        return _feathub!!
    }

private var _feathub: ImageVector? = null
