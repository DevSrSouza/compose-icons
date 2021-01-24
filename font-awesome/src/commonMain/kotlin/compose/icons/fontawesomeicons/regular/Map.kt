package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(560.02f, 32.0f)
                curveToRelative(-1.96f, 0.0f, -3.98f, 0.37f, -5.96f, 1.16f)
                lineTo(384.01f, 96.0f)
                lineTo(384.0f, 96.0f)
                lineTo(212.0f, 35.28f)
                arcTo(64.252f, 64.252f, 0.0f, false, false, 191.76f, 32.0f)
                curveToRelative(-6.69f, 0.0f, -13.37f, 1.05f, -19.81f, 3.14f)
                lineTo(20.12f, 87.95f)
                arcTo(32.006f, 32.006f, 0.0f, false, false, 0.0f, 117.66f)
                verticalLineToRelative(346.32f)
                curveTo(0.0f, 473.17f, 7.53f, 480.0f, 15.99f, 480.0f)
                curveToRelative(1.96f, 0.0f, 3.97f, -0.37f, 5.96f, -1.16f)
                lineTo(192.0f, 416.0f)
                lineToRelative(172.0f, 60.71f)
                arcToRelative(63.98f, 63.98f, 0.0f, false, false, 40.05f, 0.15f)
                lineToRelative(151.83f, -52.81f)
                arcTo(31.996f, 31.996f, 0.0f, false, false, 576.0f, 394.34f)
                lineTo(576.0f, 48.02f)
                curveToRelative(0.0f, -9.19f, -7.53f, -16.02f, -15.98f, -16.02f)
                close()
                moveTo(224.0f, 90.42f)
                lineToRelative(128.0f, 45.19f)
                verticalLineToRelative(285.97f)
                lineToRelative(-128.0f, -45.19f)
                lineTo(224.0f, 90.42f)
                close()
                moveTo(48.0f, 418.05f)
                lineTo(48.0f, 129.07f)
                lineToRelative(128.0f, -44.53f)
                verticalLineToRelative(286.2f)
                lineToRelative(-0.64f, 0.23f)
                lineTo(48.0f, 418.05f)
                close()
                moveTo(528.0f, 382.92f)
                lineToRelative(-128.0f, 44.53f)
                lineTo(400.0f, 141.26f)
                lineToRelative(0.64f, -0.24f)
                lineTo(528.0f, 93.95f)
                verticalLineToRelative(288.97f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
