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

public val SimpleIcons.Gumroad: ImageVector
    get() {
        if (_gumroad != null) {
            return _gumroad!!
        }
        _gumroad = Builder(name = "Gumroad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(11.993f, 5.12f)
                curveToRelative(4.48f, 0.0f, 5.995f, 3.025f, 6.064f, 4.744f)
                horizontalLineToRelative(-3.239f)
                curveToRelative(-0.069f, -0.962f, -0.897f, -2.406f, -2.896f, -2.406f)
                curveToRelative(-2.136f, 0.0f, -3.514f, 1.857f, -3.514f, 4.126f)
                curveToRelative(0.0f, 2.27f, 1.378f, 4.125f, 3.514f, 4.125f)
                curveToRelative(1.93f, 0.0f, 2.758f, -1.512f, 3.103f, -3.025f)
                horizontalLineToRelative(-3.103f)
                verticalLineToRelative(-1.238f)
                horizontalLineToRelative(6.509f)
                verticalLineToRelative(6.327f)
                horizontalLineToRelative(-2.855f)
                verticalLineToRelative(-3.989f)
                curveToRelative(-0.207f, 1.444f, -1.102f, 4.264f, -4.617f, 4.264f)
                curveToRelative(-3.516f, 0.0f, -5.584f, -2.82f, -5.584f, -6.326f)
                curveToRelative(0.0f, -3.645f, 2.276f, -6.602f, 6.618f, -6.602f)
                close()
            }
        }
        .build()
        return _gumroad!!
    }

private var _gumroad: ImageVector? = null
