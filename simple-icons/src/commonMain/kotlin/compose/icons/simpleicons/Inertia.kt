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

public val SimpleIcons.Inertia: ImageVector
    get() {
        if (_inertia != null) {
            return _inertia!!
        }
        _inertia = Builder(name = "Inertia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.901f, 5.331f)
                lineTo(0.0f, 5.331f)
                lineTo(6.669f, 12.0f)
                lineTo(0.0f, 18.669f)
                horizontalLineToRelative(6.901f)
                lineTo(13.571f, 12.0f)
                lineTo(6.9f, 5.331f)
                close()
                moveTo(17.331f, 5.331f)
                lineTo(10.43f, 5.331f)
                lineTo(17.099f, 12.0f)
                lineToRelative(-6.67f, 6.669f)
                horizontalLineToRelative(6.902f)
                lineTo(24.0f, 12.0f)
                lineToRelative(-6.669f, -6.669f)
                close()
            }
        }
        .build()
        return _inertia!!
    }

private var _inertia: ImageVector? = null
