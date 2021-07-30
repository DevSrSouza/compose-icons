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

public val SimpleIcons.Pleroma: ImageVector
    get() {
        if (_pleroma != null) {
            return _pleroma!!
        }
        _pleroma = Builder(name = "Pleroma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.36f, 0.0f)
                arcTo(1.868f, 1.868f, 0.0f, false, false, 4.49f, 1.868f)
                lineTo(4.49f, 24.0f)
                horizontalLineToRelative(5.964f)
                lineTo(10.454f, 0.0f)
                close()
                moveTo(13.473f, 0.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(4.168f)
                arcToRelative(1.868f, 1.868f, 0.0f, false, false, 1.868f, -1.868f)
                lineTo(19.509f, 0.0f)
                close()
                moveTo(13.473f, 18.036f)
                lineTo(13.473f, 24.0f)
                horizontalLineToRelative(4.168f)
                arcToRelative(1.868f, 1.868f, 0.0f, false, false, 1.868f, -1.868f)
                verticalLineToRelative(-4.096f)
                close()
            }
        }
        .build()
        return _pleroma!!
    }

private var _pleroma: ImageVector? = null
