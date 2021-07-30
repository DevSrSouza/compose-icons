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

public val SimpleIcons.Html5: ImageVector
    get() {
        if (_html5 != null) {
            return _html5!!
        }
        _html5 = Builder(name = "Html5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 0.0f)
                horizontalLineToRelative(21.0f)
                lineToRelative(-1.91f, 21.563f)
                lineTo(11.977f, 24.0f)
                lineToRelative(-8.564f, -2.438f)
                lineTo(1.5f, 0.0f)
                close()
                moveTo(8.531f, 9.75f)
                lineToRelative(-0.232f, -2.718f)
                lineToRelative(10.059f, 0.003f)
                lineToRelative(0.23f, -2.622f)
                lineTo(5.412f, 4.41f)
                lineToRelative(0.698f, 8.01f)
                horizontalLineToRelative(9.126f)
                lineToRelative(-0.326f, 3.426f)
                lineToRelative(-2.91f, 0.804f)
                lineToRelative(-2.955f, -0.81f)
                lineToRelative(-0.188f, -2.11f)
                lineTo(6.248f, 13.73f)
                lineToRelative(0.33f, 4.171f)
                lineTo(12.0f, 19.351f)
                lineToRelative(5.379f, -1.443f)
                lineToRelative(0.744f, -8.157f)
                lineTo(8.531f, 9.751f)
                close()
            }
        }
        .build()
        return _html5!!
    }

private var _html5: ImageVector? = null
