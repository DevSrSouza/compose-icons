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

public val SolidGroup.Igloo: ImageVector
    get() {
        if (_igloo != null) {
            return _igloo!!
        }
        _igloo = Builder(name = "Igloo", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 33.9f)
                curveToRelative(-10.5f, -1.2f, -21.2f, -1.9f, -32.0f, -1.9f)
                curveToRelative(-99.8f, 0.0f, -187.8f, 50.8f, -239.4f, 128.0f)
                lineTo(320.0f, 160.0f)
                lineTo(320.0f, 33.9f)
                close()
                moveTo(96.0f, 192.0f)
                lineTo(30.3f, 192.0f)
                curveTo(11.1f, 230.6f, 0.0f, 274.0f, 0.0f, 320.0f)
                horizontalLineToRelative(96.0f)
                lineTo(96.0f, 192.0f)
                close()
                moveTo(352.0f, 39.4f)
                lineTo(352.0f, 160.0f)
                horizontalLineToRelative(175.4f)
                curveTo(487.2f, 99.9f, 424.8f, 55.9f, 352.0f, 39.4f)
                close()
                moveTo(480.0f, 320.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(0.0f, -46.0f, -11.1f, -89.4f, -30.3f, -128.0f)
                lineTo(480.0f, 192.0f)
                verticalLineToRelative(128.0f)
                close()
                moveTo(416.0f, 384.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(128.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineToRelative(-96.0f)
                lineTo(411.5f, 352.0f)
                curveToRelative(2.6f, 10.3f, 4.5f, 20.9f, 4.5f, 32.0f)
                close()
                moveTo(448.0f, 192.0f)
                lineTo(128.0f, 192.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(49.8f)
                curveToRelative(22.2f, -38.1f, 63.0f, -64.0f, 110.2f, -64.0f)
                reflectiveCurveToRelative(88.0f, 25.9f, 110.2f, 64.0f)
                lineTo(448.0f, 320.0f)
                lineTo(448.0f, 192.0f)
                close()
                moveTo(0.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(0.0f, -11.1f, 1.9f, -21.7f, 4.5f, -32.0f)
                lineTo(0.0f, 352.0f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(288.0f, 288.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(192.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                close()
            }
        }
        .build()
        return _igloo!!
    }

private var _igloo: ImageVector? = null
