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

public val SolidGroup.UmbrellaBeach: ImageVector
    get() {
        if (_umbrellaBeach != null) {
            return _umbrellaBeach!!
        }
        _umbrellaBeach = Builder(name = "UmbrellaBeach", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(115.38f, 136.9f)
                lineToRelative(102.11f, 37.18f)
                curveToRelative(35.19f, -81.54f, 86.21f, -144.29f, 139.0f, -173.7f)
                curveToRelative(-95.88f, -4.89f, -188.78f, 36.96f, -248.53f, 111.8f)
                curveToRelative(-6.69f, 8.4f, -2.66f, 21.05f, 7.42f, 24.72f)
                close()
                moveTo(247.63f, 185.06f)
                lineToRelative(238.48f, 86.83f)
                curveToRelative(35.76f, -121.38f, 18.7f, -231.66f, -42.63f, -253.98f)
                curveToRelative(-7.4f, -2.7f, -15.13f, -4.0f, -23.09f, -4.0f)
                curveToRelative(-58.02f, 0.01f, -128.27f, 69.17f, -172.76f, 171.15f)
                close()
                moveTo(521.48f, 60.5f)
                curveToRelative(6.22f, 16.3f, 10.83f, 34.6f, 13.2f, 55.19f)
                curveToRelative(5.74f, 49.89f, -1.42f, 108.23f, -18.95f, 166.98f)
                lineToRelative(102.62f, 37.36f)
                curveToRelative(10.09f, 3.67f, 21.31f, -3.43f, 21.57f, -14.17f)
                curveToRelative(2.32f, -95.69f, -41.91f, -187.44f, -118.44f, -245.36f)
                close()
                moveTo(560.0f, 447.98f)
                lineTo(321.06f, 447.98f)
                lineTo(386.0f, 269.5f)
                lineToRelative(-60.14f, -21.9f)
                lineToRelative(-72.9f, 200.37f)
                lineTo(16.0f, 447.97f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.01f)
                verticalLineToRelative(32.01f)
                curveTo(0.0f, 504.83f, 7.16f, 512.0f, 16.0f, 512.0f)
                horizontalLineToRelative(544.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.17f, 16.0f, -16.01f)
                verticalLineToRelative(-32.01f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _umbrellaBeach!!
    }

private var _umbrellaBeach: ImageVector? = null
