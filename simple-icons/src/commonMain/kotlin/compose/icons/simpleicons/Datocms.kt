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

public val SimpleIcons.Datocms: ImageVector
    get() {
        if (_datocms != null) {
            return _datocms!!
        }
        _datocms = Builder(name = "Datocms", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(0.076f, 0.0f)
                verticalLineToRelative(24.0f)
                lineTo(12.0f, 24.0f)
                curveToRelative(5.964f, 0.0f, 11.924f, -5.373f, 11.924f, -11.998f)
                curveTo(23.924f, 5.376f, 17.963f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 17.453f)
                arcToRelative(5.453f, 5.453f, 0.0f, true, true, 5.455f, -5.451f)
                arcTo(5.45f, 5.45f, 0.0f, false, true, 12.0f, 17.452f)
                close()
            }
        }
        .build()
        return _datocms!!
    }

private var _datocms: ImageVector? = null
