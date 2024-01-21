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

public val SimpleIcons.Erpnext: ImageVector
    get() {
        if (_erpnext != null) {
            return _erpnext!!
        }
        _erpnext = Builder(name = "Erpnext", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                close()
                moveTo(7.92f, 5.76f)
                horizontalLineToRelative(8.254f)
                verticalLineToRelative(2.146f)
                lineTo(7.92f, 7.906f)
                close()
                moveTo(7.92f, 10.793f)
                horizontalLineToRelative(7.85f)
                verticalLineToRelative(2.146f)
                horizontalLineToRelative(-5.233f)
                verticalLineToRelative(2.954f)
                horizontalLineToRelative(5.703f)
                verticalLineToRelative(2.146f)
                lineTo(7.92f, 18.039f)
                close()
            }
        }
        .build()
        return _erpnext!!
    }

private var _erpnext: ImageVector? = null
