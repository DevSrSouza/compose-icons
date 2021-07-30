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

public val SimpleIcons.Xsplit: ImageVector
    get() {
        if (_xsplit != null) {
            return _xsplit!!
        }
        _xsplit = Builder(name = "Xsplit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.5f)
                curveToRelative(-0.7f, -0.1f, -2.5f, -0.3f, -2.7f, -0.3f)
                curveToRelative(-0.1f, 0.0f, -2.8f, 2.3f, -4.0f, 3.399f)
                lineToRelative(-0.1f, 0.101f)
                curveToRelative(0.1f, -1.3f, 0.3f, -2.601f, 0.399f, -3.9f)
                curveTo(11.7f, 18.1f, 5.9f, 17.4f, 0.0f, 16.7f)
                lineTo(0.0f, 1.5f)
                verticalLineToRelative(-0.2f)
                lineTo(0.3f, 1.3f)
                curveTo(0.9f, 1.4f, 22.9f, 3.9f, 24.0f, 4.0f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(21.4f, 16.9f)
                lineTo(21.4f, 6.2f)
                curveTo(15.1f, 5.5f, 8.7f, 4.7f, 2.4f, 4.0f)
                verticalLineToRelative(10.6f)
                curveToRelative(6.3f, 0.8f, 12.7f, 1.5f, 19.0f, 2.3f)
                close()
            }
        }
        .build()
        return _xsplit!!
    }

private var _xsplit: ImageVector? = null
