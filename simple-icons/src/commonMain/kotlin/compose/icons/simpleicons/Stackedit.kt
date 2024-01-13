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

public val SimpleIcons.Stackedit: ImageVector
    get() {
        if (_stackedit != null) {
            return _stackedit!!
        }
        _stackedit = Builder(name = "Stackedit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 0.0f)
                curveTo(2.689f, 0.0f, 0.0f, 2.689f, 0.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 3.311f, 2.689f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(3.311f, 0.0f, 6.0f, -2.689f, 6.0f, -6.0f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -3.311f, -2.689f, -6.0f, -6.0f, -6.0f)
                lineTo(6.0f, 0.0f)
                close()
                moveTo(6.227f, 1.871f)
                horizontalLineToRelative(11.546f)
                arcTo(3.98f, 3.98f, 0.0f, false, true, 21.75f, 5.85f)
                verticalLineToRelative(11.545f)
                arcToRelative(3.978f, 3.978f, 0.0f, false, true, -3.977f, 3.976f)
                lineTo(6.227f, 21.371f)
                arcToRelative(3.978f, 3.978f, 0.0f, false, true, -3.977f, -3.976f)
                lineTo(2.25f, 5.85f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, true, 3.977f, -3.98f)
                close()
                moveTo(6.004f, 4.181f)
                lineTo(6.004f, 6.01f)
                lineTo(4.633f, 6.01f)
                lineTo(4.633f, 7.7f)
                horizontalLineToRelative(1.37f)
                verticalLineToRelative(1.903f)
                horizontalLineToRelative(-1.37f)
                verticalLineToRelative(1.689f)
                horizontalLineToRelative(1.37f)
                verticalLineToRelative(1.828f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(-1.828f)
                horizontalLineToRelative(1.695f)
                verticalLineToRelative(1.828f)
                horizontalLineToRelative(1.398f)
                verticalLineToRelative(-1.828f)
                horizontalLineToRelative(1.371f)
                verticalLineToRelative(-1.69f)
                horizontalLineToRelative(-1.37f)
                verticalLineToRelative(-1.9f)
                horizontalLineToRelative(1.37f)
                lineTo(11.867f, 6.01f)
                horizontalLineToRelative(-1.37f)
                lineTo(10.497f, 4.182f)
                horizontalLineToRelative(-1.4f)
                lineTo(9.097f, 6.01f)
                lineTo(7.403f, 6.01f)
                lineTo(7.403f, 4.182f)
                lineTo(6.004f, 4.182f)
                close()
                moveTo(7.402f, 7.701f)
                horizontalLineToRelative(1.696f)
                verticalLineToRelative(1.903f)
                lineTo(7.402f, 9.604f)
                lineTo(7.402f, 7.7f)
                close()
            }
        }
        .build()
        return _stackedit!!
    }

private var _stackedit: ImageVector? = null
