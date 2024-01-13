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

public val SimpleIcons.Nzxt: ImageVector
    get() {
        if (_nzxt != null) {
            return _nzxt!!
        }
        _nzxt = Builder(name = "Nzxt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.763f, 8.936f)
                lineToRelative(2.101f, 3.04f)
                lineToRelative(-0.002f, -3.04f)
                horizontalLineToRelative(1.773f)
                verticalLineToRelative(6.128f)
                lineTo(3.99f, 15.064f)
                lineToRelative(-2.218f, -3.227f)
                verticalLineToRelative(3.227f)
                lineTo(0.0f, 15.064f)
                lineTo(0.0f, 8.936f)
                close()
                moveTo(24.0f, 8.936f)
                verticalLineToRelative(1.614f)
                horizontalLineToRelative(-1.612f)
                verticalLineToRelative(4.514f)
                horizontalLineToRelative(-1.883f)
                lineTo(20.505f, 10.55f)
                horizontalLineToRelative(-1.611f)
                lineTo(18.894f, 8.936f)
                lineTo(24.0f, 8.936f)
                close()
                moveTo(14.402f, 8.936f)
                lineToRelative(0.996f, 1.573f)
                lineToRelative(1.061f, -1.573f)
                horizontalLineToRelative(1.947f)
                lineToRelative(-1.98f, 3.034f)
                lineToRelative(2.013f, 3.094f)
                horizontalLineToRelative(-2.063f)
                lineToRelative(-1.005f, -1.558f)
                lineToRelative(-0.99f, 1.558f)
                horizontalLineToRelative(-2.015f)
                lineToRelative(1.975f, -3.038f)
                lineToRelative(-2.004f, -3.09f)
                horizontalLineToRelative(2.065f)
                close()
                moveTo(11.75f, 8.936f)
                lineTo(9.327f, 13.51f)
                horizontalLineToRelative(2.372f)
                verticalLineToRelative(1.554f)
                lineTo(6.573f, 15.064f)
                lineToRelative(2.379f, -4.584f)
                lineTo(6.704f, 10.48f)
                lineTo(6.704f, 8.936f)
                horizontalLineToRelative(5.046f)
                close()
            }
        }
        .build()
        return _nzxt!!
    }

private var _nzxt: ImageVector? = null
