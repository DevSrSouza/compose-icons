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

public val SimpleIcons.Googleclassroom: ImageVector
    get() {
        if (_googleclassroom != null) {
            return _googleclassroom!!
        }
        _googleclassroom = Builder(name = "Googleclassroom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.637f, 1.637f)
                curveTo(0.732f, 1.637f, 0.0f, 2.369f, 0.0f, 3.273f)
                verticalLineToRelative(17.453f)
                curveToRelative(0.0f, 0.905f, 0.732f, 1.637f, 1.637f, 1.637f)
                horizontalLineToRelative(20.727f)
                curveToRelative(0.905f, 0.0f, 1.637f, -0.732f, 1.637f, -1.637f)
                lineTo(24.0f, 3.273f)
                curveToRelative(0.0f, -0.905f, -0.732f, -1.637f, -1.637f, -1.637f)
                lineTo(1.637f, 1.637f)
                close()
                moveTo(2.182f, 3.818f)
                horizontalLineToRelative(19.637f)
                verticalLineToRelative(16.363f)
                horizontalLineToRelative(-2.727f)
                verticalLineToRelative(-1.09f)
                horizontalLineToRelative(-4.91f)
                verticalLineToRelative(1.09f)
                horizontalLineToRelative(-12.0f)
                lineTo(2.182f, 3.818f)
                close()
                moveTo(12.0f, 8.182f)
                curveToRelative(-0.905f, 0.0f, -1.637f, 0.732f, -1.637f, 1.637f)
                curveToRelative(0.0f, 0.905f, 0.732f, 1.637f, 1.637f, 1.637f)
                curveToRelative(0.905f, 0.0f, 1.637f, -0.732f, 1.637f, -1.637f)
                curveToRelative(0.0f, -0.905f, -0.732f, -1.637f, -1.637f, -1.637f)
                close()
                moveTo(7.637f, 10.092f)
                curveToRelative(-0.677f, 0.0f, -1.229f, 0.549f, -1.229f, 1.227f)
                curveToRelative(0.0f, 0.677f, 0.551f, 1.227f, 1.229f, 1.227f)
                curveToRelative(0.677f, 0.0f, 1.227f, -0.549f, 1.227f, -1.227f)
                curveToRelative(0.0f, -0.677f, -0.549f, -1.227f, -1.227f, -1.227f)
                close()
                moveTo(16.363f, 10.092f)
                curveToRelative(-0.677f, 0.0f, -1.227f, 0.549f, -1.227f, 1.227f)
                curveToRelative(0.0f, 0.677f, 0.549f, 1.227f, 1.227f, 1.227f)
                curveToRelative(0.677f, 0.0f, 1.229f, -0.549f, 1.229f, -1.227f)
                curveToRelative(0.0f, -0.677f, -0.551f, -1.227f, -1.229f, -1.227f)
                close()
                moveTo(12.0f, 12.545f)
                curveToRelative(-1.179f, 0.0f, -2.413f, 0.401f, -3.148f, 1.006f)
                curveToRelative(-0.384f, -0.12f, -0.804f, -0.188f, -1.215f, -0.188f)
                curveToRelative(-1.314f, 0.0f, -2.728f, 0.695f, -2.728f, 1.559f)
                verticalLineToRelative(0.896f)
                horizontalLineToRelative(14.184f)
                verticalLineToRelative(-0.896f)
                curveToRelative(0.0f, -0.864f, -1.415f, -1.559f, -2.728f, -1.559f)
                curveToRelative(-0.411f, 0.0f, -0.831f, 0.068f, -1.215f, 0.188f)
                curveToRelative(-0.736f, -0.605f, -1.969f, -1.006f, -3.148f, -1.006f)
                close()
            }
        }
        .build()
        return _googleclassroom!!
    }

private var _googleclassroom: ImageVector? = null
