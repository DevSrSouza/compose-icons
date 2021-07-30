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

public val SimpleIcons.Googlescholar: ImageVector
    get() {
        if (_googlescholar != null) {
            return _googlescholar!!
        }
        _googlescholar = Builder(name = "Googlescholar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.242f, 13.769f)
                lineTo(0.0f, 9.5f)
                lineTo(12.0f, 0.0f)
                lineToRelative(12.0f, 9.5f)
                lineToRelative(-5.242f, 4.269f)
                curveTo(17.548f, 11.249f, 14.978f, 9.5f, 12.0f, 9.5f)
                curveToRelative(-2.977f, 0.0f, -5.548f, 1.748f, -6.758f, 4.269f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 0.0f, 14.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.0f, -14.0f)
                close()
            }
        }
        .build()
        return _googlescholar!!
    }

private var _googlescholar: ImageVector? = null
