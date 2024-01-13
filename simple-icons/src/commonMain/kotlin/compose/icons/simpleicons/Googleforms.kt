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

public val SimpleIcons.Googleforms: ImageVector
    get() {
        if (_googleforms != null) {
            return _googleforms!!
        }
        _googleforms = Builder(name = "Googleforms", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.727f, 6.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(-6.0f, -6.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(14.727f, 6.727f)
                lineTo(14.0f, 6.727f)
                lineTo(14.0f, 0.0f)
                lineTo(4.91f, 0.0f)
                curveToRelative(-0.905f, 0.0f, -1.637f, 0.732f, -1.637f, 1.636f)
                verticalLineToRelative(20.728f)
                curveToRelative(0.0f, 0.904f, 0.732f, 1.636f, 1.636f, 1.636f)
                horizontalLineToRelative(14.182f)
                curveToRelative(0.904f, 0.0f, 1.636f, -0.732f, 1.636f, -1.636f)
                lineTo(20.727f, 6.727f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(7.91f, 17.318f)
                arcToRelative(0.819f, 0.819f, 0.0f, true, true, 0.001f, -1.638f)
                arcToRelative(0.819f, 0.819f, 0.0f, false, true, 0.0f, 1.638f)
                close()
                moveTo(7.91f, 14.045f)
                arcToRelative(0.819f, 0.819f, 0.0f, true, true, 0.001f, -1.637f)
                arcToRelative(0.819f, 0.819f, 0.0f, false, true, 0.0f, 1.637f)
                close()
                moveTo(7.91f, 10.773f)
                arcToRelative(0.819f, 0.819f, 0.0f, true, true, 0.001f, -1.638f)
                arcToRelative(0.819f, 0.819f, 0.0f, false, true, 0.0f, 1.638f)
                close()
                moveTo(16.91f, 17.182f)
                horizontalLineToRelative(-6.818f)
                verticalLineToRelative(-1.364f)
                horizontalLineToRelative(6.818f)
                verticalLineToRelative(1.364f)
                close()
                moveTo(16.91f, 13.909f)
                horizontalLineToRelative(-6.818f)
                verticalLineToRelative(-1.364f)
                horizontalLineToRelative(6.818f)
                verticalLineToRelative(1.364f)
                close()
                moveTo(16.91f, 10.636f)
                horizontalLineToRelative(-6.818f)
                lineTo(10.092f, 9.273f)
                horizontalLineToRelative(6.818f)
                verticalLineToRelative(1.363f)
                close()
            }
        }
        .build()
        return _googleforms!!
    }

private var _googleforms: ImageVector? = null
