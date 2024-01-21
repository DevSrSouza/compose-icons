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

public val SimpleIcons.Frappe: ImageVector
    get() {
        if (_frappe != null) {
            return _frappe!!
        }
        _frappe = Builder(name = "Frappe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.88f, 0.0f)
                curveTo(1.29f, 0.0f, 0.0f, 1.29f, 0.0f, 2.88f)
                verticalLineToRelative(18.24f)
                curveTo(0.0f, 22.71f, 1.29f, 24.0f, 2.88f, 24.0f)
                horizontalLineToRelative(18.24f)
                curveToRelative(1.59f, 0.0f, 2.88f, -1.29f, 2.88f, -2.88f)
                lineTo(24.0f, 2.88f)
                curveTo(24.0f, 1.29f, 22.71f, 0.0f, 21.12f, 0.0f)
                lineTo(2.88f, 0.0f)
                close()
                moveTo(8.4f, 6.0f)
                horizontalLineToRelative(8.024f)
                verticalLineToRelative(2.111f)
                lineTo(8.4f, 8.111f)
                lineTo(8.4f, 6.0f)
                close()
                moveTo(8.4f, 11.385f)
                horizontalLineToRelative(7.49f)
                verticalLineToRelative(2.113f)
                horizontalLineToRelative(-4.93f)
                lineTo(10.96f, 18.0f)
                lineTo(8.4f, 18.0f)
                verticalLineToRelative(-6.615f)
                close()
            }
        }
        .build()
        return _frappe!!
    }

private var _frappe: ImageVector? = null
