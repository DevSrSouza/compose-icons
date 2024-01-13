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

public val SimpleIcons.Googleslides: ImageVector
    get() {
        if (_googleslides != null) {
            return _googleslides!!
        }
        _googleslides = Builder(name = "Googleslides", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.09f, 15.273f)
                lineTo(7.91f, 15.273f)
                verticalLineToRelative(-4.637f)
                horizontalLineToRelative(8.18f)
                verticalLineToRelative(4.637f)
                close()
                moveTo(17.818f, 6.75f)
                horizontalLineToRelative(2.91f)
                verticalLineToRelative(15.614f)
                curveToRelative(0.0f, 0.904f, -0.733f, 1.636f, -1.637f, 1.636f)
                lineTo(4.909f, 24.0f)
                arcToRelative(1.636f, 1.636f, 0.0f, false, true, -1.636f, -1.636f)
                lineTo(3.273f, 1.636f)
                curveTo(3.273f, 0.732f, 4.005f, 0.0f, 4.909f, 0.0f)
                horizontalLineToRelative(9.068f)
                verticalLineToRelative(6.75f)
                horizontalLineToRelative(3.841f)
                close()
                moveTo(17.455f, 9.273f)
                lineTo(6.545f, 9.273f)
                verticalLineToRelative(7.363f)
                horizontalLineToRelative(10.91f)
                lineTo(17.455f, 9.273f)
                close()
                moveTo(14.727f, 3.294f)
                lineTo(14.727f, 6.0f)
                horizontalLineToRelative(6.001f)
                lineToRelative(-6.0f, -6.0f)
                verticalLineToRelative(3.294f)
                close()
            }
        }
        .build()
        return _googleslides!!
    }

private var _googleslides: ImageVector? = null
