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

public val SolidGroup.Bone: ImageVector
    get() {
        if (_bone != null) {
            return _bone!!
        }
        _bone = Builder(name = "Bone", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(598.88f, 244.56f)
                curveToRelative(25.2f, -12.6f, 41.12f, -38.36f, 41.12f, -66.53f)
                verticalLineToRelative(-7.64f)
                curveTo(640.0f, 129.3f, 606.7f, 96.0f, 565.61f, 96.0f)
                curveToRelative(-32.02f, 0.0f, -60.44f, 20.49f, -70.57f, 50.86f)
                curveToRelative(-7.68f, 23.03f, -11.6f, 45.14f, -38.11f, 45.14f)
                horizontalLineTo(183.06f)
                curveToRelative(-27.38f, 0.0f, -31.58f, -25.54f, -38.11f, -45.14f)
                curveTo(134.83f, 116.49f, 106.4f, 96.0f, 74.39f, 96.0f)
                curveTo(33.3f, 96.0f, 0.0f, 129.3f, 0.0f, 170.39f)
                verticalLineToRelative(7.64f)
                curveToRelative(0.0f, 28.17f, 15.92f, 53.93f, 41.12f, 66.53f)
                curveToRelative(9.43f, 4.71f, 9.43f, 18.17f, 0.0f, 22.88f)
                curveTo(15.92f, 280.04f, 0.0f, 305.8f, 0.0f, 333.97f)
                verticalLineToRelative(7.64f)
                curveTo(0.0f, 382.7f, 33.3f, 416.0f, 74.38f, 416.0f)
                curveToRelative(32.02f, 0.0f, 60.44f, -20.49f, 70.57f, -50.86f)
                curveToRelative(7.68f, -23.03f, 11.6f, -45.14f, 38.11f, -45.14f)
                horizontalLineToRelative(273.87f)
                curveToRelative(27.38f, 0.0f, 31.58f, 25.54f, 38.11f, 45.14f)
                curveTo(505.17f, 395.51f, 533.6f, 416.0f, 565.61f, 416.0f)
                curveToRelative(41.08f, 0.0f, 74.38f, -33.3f, 74.38f, -74.39f)
                verticalLineToRelative(-7.64f)
                curveToRelative(0.0f, -28.18f, -15.92f, -53.93f, -41.12f, -66.53f)
                curveToRelative(-9.42f, -4.71f, -9.42f, -18.17f, 0.01f, -22.88f)
                close()
            }
        }
        .build()
        return _bone!!
    }

private var _bone: ImageVector? = null
