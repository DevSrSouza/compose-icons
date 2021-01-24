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

public val SolidGroup.Stamp: ImageVector
    get() {
        if (_stamp != null) {
            return _stamp!!
        }
        _stamp = Builder(name = "Stamp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 512.0f)
                horizontalLineToRelative(448.0f)
                verticalLineToRelative(-64.0f)
                lineTo(32.0f, 448.0f)
                verticalLineToRelative(64.0f)
                close()
                moveTo(416.0f, 256.0f)
                horizontalLineToRelative(-66.56f)
                curveToRelative(-16.26f, 0.0f, -29.44f, -13.18f, -29.44f, -29.44f)
                verticalLineToRelative(-9.46f)
                curveToRelative(0.0f, -27.37f, 8.88f, -53.41f, 21.46f, -77.72f)
                curveToRelative(9.11f, -17.61f, 12.9f, -38.39f, 9.05f, -60.42f)
                curveToRelative(-6.77f, -38.78f, -38.47f, -70.7f, -77.26f, -77.45f)
                curveTo(212.62f, -9.04f, 160.0f, 37.33f, 160.0f, 96.0f)
                curveToRelative(0.0f, 14.16f, 3.12f, 27.54f, 8.69f, 39.58f)
                curveTo(182.02f, 164.43f, 192.0f, 194.7f, 192.0f, 226.49f)
                verticalLineToRelative(0.07f)
                curveToRelative(0.0f, 16.26f, -13.18f, 29.44f, -29.44f, 29.44f)
                lineTo(96.0f, 256.0f)
                curveToRelative(-53.02f, 0.0f, -96.0f, 42.98f, -96.0f, 96.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(448.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -53.02f, -42.98f, -96.0f, -96.0f, -96.0f)
                close()
            }
        }
        .build()
        return _stamp!!
    }

private var _stamp: ImageVector? = null
