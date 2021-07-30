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

public val SimpleIcons.Devpost: ImageVector
    get() {
        if (_devpost != null) {
            return _devpost!!
        }
        _devpost = Builder(name = "Devpost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.002f, 1.61f)
                lineTo(0.0f, 12.004f)
                lineTo(6.002f, 22.39f)
                horizontalLineToRelative(11.996f)
                lineTo(24.0f, 12.004f)
                lineTo(17.998f, 1.61f)
                close()
                moveTo(7.595f, 5.694f)
                horizontalLineToRelative(3.947f)
                curveToRelative(3.605f, 0.0f, 6.276f, 1.695f, 6.276f, 6.31f)
                curveToRelative(0.0f, 4.436f, -3.21f, 6.302f, -6.456f, 6.302f)
                lineTo(7.595f, 18.306f)
                close()
                moveTo(10.112f, 8.143f)
                verticalLineToRelative(7.714f)
                horizontalLineToRelative(1.241f)
                curveToRelative(2.646f, 0.0f, 3.862f, -1.55f, 3.862f, -3.861f)
                curveToRelative(0.009f, -2.569f, -1.096f, -3.853f, -3.767f, -3.853f)
                close()
            }
        }
        .build()
        return _devpost!!
    }

private var _devpost: ImageVector? = null
