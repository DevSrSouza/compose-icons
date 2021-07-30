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

public val SimpleIcons.Css3: ImageVector
    get() {
        if (_css3 != null) {
            return _css3!!
        }
        _css3 = Builder(name = "Css3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 0.0f)
                horizontalLineToRelative(21.0f)
                lineToRelative(-1.91f, 21.563f)
                lineTo(11.977f, 24.0f)
                lineToRelative(-8.565f, -2.438f)
                lineTo(1.5f, 0.0f)
                close()
                moveTo(18.59f, 4.413f)
                lineTo(5.41f, 4.41f)
                lineToRelative(0.213f, 2.622f)
                lineToRelative(10.125f, 0.002f)
                lineToRelative(-0.255f, 2.716f)
                horizontalLineToRelative(-6.64f)
                lineToRelative(0.24f, 2.573f)
                horizontalLineToRelative(6.182f)
                lineToRelative(-0.366f, 3.523f)
                lineToRelative(-2.91f, 0.804f)
                lineToRelative(-2.956f, -0.81f)
                lineToRelative(-0.188f, -2.11f)
                horizontalLineToRelative(-2.61f)
                lineToRelative(0.29f, 3.855f)
                lineTo(12.0f, 19.288f)
                lineToRelative(5.373f, -1.53f)
                lineTo(18.59f, 4.414f)
                close()
            }
        }
        .build()
        return _css3!!
    }

private var _css3: ImageVector? = null
