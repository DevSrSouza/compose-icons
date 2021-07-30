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

public val SimpleIcons.Transportforireland: ImageVector
    get() {
        if (_transportforireland != null) {
            return _transportforireland!!
        }
        _transportforireland = Builder(name = "Transportforireland", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 6.62f, 5.38f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(12.0f)
                lineTo(24.0f, 11.978f)
                horizontalLineToRelative(-0.022f)
                curveToRelative(0.0f, -6.62f, -5.38f, -11.978f, -12.0f, -11.978f)
                close()
                moveTo(3.376f, 8.145f)
                horizontalLineToRelative(6.337f)
                verticalLineToRelative(1.546f)
                horizontalLineToRelative(-2.33f)
                verticalLineToRelative(6.12f)
                lineTo(5.706f, 15.811f)
                verticalLineToRelative(-6.12f)
                horizontalLineToRelative(-2.33f)
                close()
                moveTo(11.39f, 8.145f)
                horizontalLineToRelative(5.837f)
                lineTo(17.227f, 9.67f)
                horizontalLineToRelative(-4.138f)
                verticalLineToRelative(1.633f)
                horizontalLineToRelative(3.659f)
                verticalLineToRelative(1.546f)
                horizontalLineToRelative(-3.659f)
                verticalLineToRelative(2.962f)
                lineTo(11.39f, 15.811f)
                close()
                moveTo(18.925f, 8.145f)
                horizontalLineToRelative(1.678f)
                verticalLineToRelative(7.666f)
                horizontalLineToRelative(-1.678f)
                close()
            }
        }
        .build()
        return _transportforireland!!
    }

private var _transportforireland: ImageVector? = null
