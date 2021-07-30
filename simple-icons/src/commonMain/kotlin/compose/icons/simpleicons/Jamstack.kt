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

public val SimpleIcons.Jamstack: ImageVector
    get() {
        if (_jamstack != null) {
            return _jamstack!!
        }
        _jamstack = Builder(name = "Jamstack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.365f, 0.0f, 0.0f, 5.364f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.365f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.364f, 12.0f, -12.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(12.496f, 3.318f)
                horizontalLineToRelative(8.17f)
                verticalLineToRelative(8.17f)
                horizontalLineToRelative(-8.17f)
                close()
                moveTo(3.328f, 12.496f)
                horizontalLineToRelative(8.16f)
                verticalLineToRelative(8.149f)
                curveToRelative(-4.382f, -0.257f, -7.904f, -3.767f, -8.16f, -8.149f)
                close()
                moveTo(12.496f, 12.512f)
                horizontalLineToRelative(8.152f)
                arcToRelative(8.684f, 8.684f, 0.0f, false, true, -8.152f, 8.148f)
                close()
            }
        }
        .build()
        return _jamstack!!
    }

private var _jamstack: ImageVector? = null
