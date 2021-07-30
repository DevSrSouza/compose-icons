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

public val SimpleIcons.Fortinet: ImageVector
    get() {
        if (_fortinet != null) {
            return _fortinet!!
        }
        _fortinet = Builder(name = "Fortinet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 9.785f)
                horizontalLineToRelative(6.788f)
                verticalLineToRelative(4.454f)
                lineTo(0.0f, 14.239f)
                close()
                moveTo(8.666f, 3.455f)
                horizontalLineToRelative(6.668f)
                verticalLineToRelative(4.453f)
                lineTo(8.666f, 7.908f)
                close()
                moveTo(8.666f, 16.092f)
                horizontalLineToRelative(6.668f)
                verticalLineToRelative(4.454f)
                lineTo(8.666f, 20.546f)
                close()
                moveTo(17.188f, 9.785f)
                lineTo(24.0f, 9.785f)
                verticalLineToRelative(4.454f)
                horizontalLineToRelative(-6.812f)
                close()
                moveTo(2.792f, 3.455f)
                curveTo(1.372f, 3.814f, 0.265f, 5.404f, 0.0f, 7.425f)
                verticalLineToRelative(0.506f)
                horizontalLineToRelative(6.788f)
                lineTo(6.788f, 3.454f)
                close()
                moveTo(0.0f, 16.091f)
                verticalLineToRelative(0.554f)
                curveToRelative(0.24f, 1.926f, 1.276f, 3.466f, 2.624f, 3.9f)
                horizontalLineToRelative(4.188f)
                verticalLineToRelative(-4.454f)
                close()
                moveTo(24.0f, 7.907f)
                verticalLineToRelative(-0.506f)
                curveToRelative(-0.265f, -1.998f, -1.372f, -3.587f, -2.792f, -3.972f)
                horizontalLineToRelative(-4.02f)
                verticalLineToRelative(4.454f)
                lineTo(24.0f, 7.883f)
                close()
                moveTo(21.376f, 20.57f)
                curveToRelative(1.324f, -0.458f, 2.36f, -1.974f, 2.624f, -3.9f)
                verticalLineToRelative(-0.554f)
                horizontalLineToRelative(-6.812f)
                verticalLineToRelative(4.454f)
                close()
            }
        }
        .build()
        return _fortinet!!
    }

private var _fortinet: ImageVector? = null
