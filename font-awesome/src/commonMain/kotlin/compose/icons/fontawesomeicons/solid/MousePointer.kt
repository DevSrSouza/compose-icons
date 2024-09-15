package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
                moveTo(302.19f, 329.13f)
                horizontalLineTo(196.1f)
                lineToRelative(55.83f, 135.99f)
                curveToRelative(3.89f, 9.43f, -0.56f, 20.0f, -9.44f, 24.0f)
                lineToRelative(-49.17f, 21.43f)
                curveToRelative(-9.16f, 4.0f, -19.44f, -0.57f, -23.33f, -9.71f)
                lineToRelative(-53.05f, -129.14f)
                lineToRelative(-86.66f, 89.14f)
                curveTo(18.73f, 472.71f, 0.0f, 463.55f, 0.0f, 447.98f)
                verticalLineTo(18.3f)
                curveTo(0.0f, 1.9f, 19.92f, -6.1f, 30.28f, 5.44f)
                lineToRelative(284.41f, 292.54f)
                curveToRelative(11.47f, 11.18f, 3.01f, 31.14f, -12.5f, 31.14f)
                close()
            }
        }
        .build()
        return _mousePointer!!
    }

private var _mousePointer: ImageVector? = null
