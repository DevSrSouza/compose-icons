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

public val SimpleIcons.Commodore: ImageVector
    get() {
        if (_commodore != null) {
            return _commodore!!
        }
        _commodore = Builder(name = "Commodore", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.202f, 0.798f)
                curveTo(5.016f, 0.798f, 0.0f, 5.814f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.016f, 11.202f, 11.202f, 11.202f)
                curveToRelative(1.094f, 0.0f, 2.153f, -0.157f, 3.154f, -0.45f)
                verticalLineToRelative(-5.335f)
                arcToRelative(6.27f, 6.27f, 0.0f, true, true, 0.0f, -10.839f)
                verticalLineToRelative(-5.33f)
                curveToRelative(-1.0f, -0.293f, -2.057f, -0.45f, -3.154f, -0.45f)
                close()
                moveTo(14.577f, 7.141f)
                verticalLineToRelative(4.304f)
                horizontalLineToRelative(5.27f)
                lineTo(24.0f, 7.14f)
                close()
                moveTo(14.54f, 12.518f)
                verticalLineToRelative(4.304f)
                horizontalLineToRelative(9.423f)
                lineToRelative(-4.156f, -4.304f)
                close()
            }
        }
        .build()
        return _commodore!!
    }

private var _commodore: ImageVector? = null
