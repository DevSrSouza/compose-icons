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

public val SimpleIcons.Phonepe: ImageVector
    get() {
        if (_phonepe != null) {
            return _phonepe!!
        }
        _phonepe = Builder(name = "Phonepe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.206f, 9.941f)
                horizontalLineToRelative(2.949f)
                verticalLineToRelative(4.692f)
                curveToRelative(-0.402f, 0.201f, -0.938f, 0.268f, -1.34f, 0.268f)
                curveToRelative(-1.072f, 0.0f, -1.609f, -0.536f, -1.609f, -1.743f)
                lineTo(10.206f, 9.941f)
                close()
                moveTo(23.676f, 14.757f)
                curveToRelative(-1.523f, 6.449f, -7.985f, 10.442f, -14.433f, 8.919f)
                curveTo(2.794f, 22.154f, -1.199f, 15.691f, 0.324f, 9.243f)
                curveTo(1.847f, 2.794f, 8.309f, -1.199f, 14.757f, 0.324f)
                curveToRelative(6.449f, 1.523f, 10.442f, 7.985f, 8.919f, 14.433f)
                close()
                moveTo(17.445f, 8.869f)
                arcToRelative(0.887f, 0.887f, 0.0f, false, false, -0.871f, -0.871f)
                horizontalLineToRelative(-1.609f)
                lineToRelative(-3.686f, -4.222f)
                curveToRelative(-0.335f, -0.402f, -0.871f, -0.536f, -1.407f, -0.402f)
                lineToRelative(-1.274f, 0.401f)
                curveToRelative(-0.201f, 0.067f, -0.268f, 0.335f, -0.134f, 0.469f)
                lineToRelative(4.021f, 3.82f)
                lineTo(6.386f, 8.064f)
                curveToRelative(-0.201f, 0.0f, -0.335f, 0.134f, -0.335f, 0.335f)
                verticalLineToRelative(0.67f)
                curveToRelative(0.0f, 0.469f, 0.402f, 0.871f, 0.871f, 0.871f)
                horizontalLineToRelative(0.938f)
                verticalLineToRelative(3.217f)
                curveToRelative(0.0f, 2.413f, 1.273f, 3.82f, 3.418f, 3.82f)
                curveToRelative(0.67f, 0.0f, 1.206f, -0.067f, 1.877f, -0.335f)
                verticalLineToRelative(2.145f)
                curveToRelative(0.0f, 0.603f, 0.469f, 1.072f, 1.072f, 1.072f)
                horizontalLineToRelative(0.938f)
                arcToRelative(0.432f, 0.432f, 0.0f, false, false, 0.402f, -0.402f)
                lineTo(15.567f, 9.874f)
                horizontalLineToRelative(1.542f)
                curveToRelative(0.201f, 0.0f, 0.335f, -0.134f, 0.335f, -0.335f)
                verticalLineToRelative(-0.67f)
                close()
            }
        }
        .build()
        return _phonepe!!
    }

private var _phonepe: ImageVector? = null
