package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.MousePointer: ImageVector
    get() {
        if (_mousePointer != null) {
            return _mousePointer!!
        }
        _mousePointer = Builder(name = "MousePointer", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(302.189f, 329.126f)
                horizontalLineTo(196.105f)
                lineToRelative(55.831f, 135.993f)
                curveToRelative(3.889f, 9.428f, -0.555f, 19.999f, -9.444f, 23.999f)
                lineToRelative(-49.165f, 21.427f)
                curveToRelative(-9.165f, 4.0f, -19.443f, -0.571f, -23.332f, -9.714f)
                lineToRelative(-53.053f, -129.136f)
                lineToRelative(-86.664f, 89.138f)
                curveTo(18.729f, 472.71f, 0.0f, 463.554f, 0.0f, 447.977f)
                verticalLineTo(18.299f)
                curveTo(0.0f, 1.899f, 19.921f, -6.096f, 30.277f, 5.443f)
                lineToRelative(284.412f, 292.542f)
                curveToRelative(11.472f, 11.179f, 3.007f, 31.141f, -12.5f, 31.141f)
                close()
            }
        }
        .build()
        return _mousePointer!!
    }

private var _mousePointer: ImageVector? = null
