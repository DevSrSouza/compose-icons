package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.Xmpp: ImageVector
    get() {
        if (_xmpp != null) {
            return _xmpp!!
        }
        _xmpp = Builder(name = "Xmpp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.4f)
                curveTo(9.75f, 13.09f, 8.0f, 9.54f, 8.0f, 6.0f)
                curveTo(2.0f, 4.0f, 8.0f, 6.0f, 2.0f, 4.0f)
                curveTo(2.0f, 9.65f, 6.33f, 14.11f, 10.55f, 16.66f)
                curveTo(9.38f, 17.5f, 8.15f, 18.0f, 7.0f, 18.0f)
                curveTo(7.0f, 19.0f, 7.0f, 18.0f, 7.0f, 19.0f)
                curveTo(8.2f, 19.0f, 10.03f, 18.46f, 12.0f, 17.46f)
                curveTo(13.97f, 18.46f, 15.8f, 19.0f, 17.0f, 19.0f)
                curveTo(17.0f, 18.0f, 17.0f, 19.0f, 17.0f, 18.0f)
                curveTo(15.85f, 18.0f, 14.62f, 17.5f, 13.45f, 16.66f)
                curveTo(17.66f, 14.11f, 22.0f, 9.65f, 22.0f, 4.0f)
                curveTo(16.0f, 6.0f, 22.0f, 4.0f, 16.0f, 6.0f)
                curveTo(16.0f, 9.54f, 14.25f, 13.09f, 12.0f, 15.4f)
                close()
            }
        }
        .build()
        return _xmpp!!
    }

private var _xmpp: ImageVector? = null
