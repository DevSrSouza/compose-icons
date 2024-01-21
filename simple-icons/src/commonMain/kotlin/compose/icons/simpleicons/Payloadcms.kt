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

public val SimpleIcons.Payloadcms: ImageVector
    get() {
        if (_payloadcms != null) {
            return _payloadcms!!
        }
        _payloadcms = Builder(name = "Payloadcms", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.068f, 0.0f)
                lineTo(22.08f, 6.625f)
                verticalLineToRelative(12.573f)
                lineTo(13.787f, 24.0f)
                verticalLineTo(11.427f)
                lineTo(2.769f, 4.808f)
                lineTo(11.068f, 0.0f)
                close()
                moveTo(1.92f, 18.302f)
                lineToRelative(8.31f, -4.812f)
                verticalLineToRelative(9.812f)
                lineToRelative(-8.31f, -5.0f)
                close()
            }
        }
        .build()
        return _payloadcms!!
    }

private var _payloadcms: ImageVector? = null
