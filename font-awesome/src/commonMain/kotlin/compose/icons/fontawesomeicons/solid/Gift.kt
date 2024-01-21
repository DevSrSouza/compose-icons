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

public val SolidGroup.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.5f, 68.8f)
                lineTo(225.3f, 128.0f)
                lineTo(224.0f, 128.0f)
                lineTo(152.0f, 128.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, -17.9f, -40.0f, -40.0f)
                reflectiveCurveToRelative(17.9f, -40.0f, 40.0f, -40.0f)
                horizontalLineToRelative(2.2f)
                curveToRelative(14.9f, 0.0f, 28.8f, 7.9f, 36.3f, 20.8f)
                close()
                moveTo(64.0f, 88.0f)
                curveToRelative(0.0f, 14.4f, 3.5f, 28.0f, 9.6f, 40.0f)
                lineTo(32.0f, 128.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(480.0f, 256.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(512.0f, 160.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(438.4f, 128.0f)
                curveToRelative(6.1f, -12.0f, 9.6f, -25.6f, 9.6f, -40.0f)
                curveToRelative(0.0f, -48.6f, -39.4f, -88.0f, -88.0f, -88.0f)
                horizontalLineToRelative(-2.2f)
                curveToRelative(-31.9f, 0.0f, -61.5f, 16.9f, -77.7f, 44.4f)
                lineTo(256.0f, 85.5f)
                lineToRelative(-24.1f, -41.0f)
                curveTo(215.7f, 16.9f, 186.1f, 0.0f, 154.2f, 0.0f)
                lineTo(152.0f, 0.0f)
                curveTo(103.4f, 0.0f, 64.0f, 39.4f, 64.0f, 88.0f)
                close()
                moveTo(400.0f, 88.0f)
                curveToRelative(0.0f, 22.1f, -17.9f, 40.0f, -40.0f, 40.0f)
                lineTo(288.0f, 128.0f)
                horizontalLineToRelative(-1.3f)
                lineToRelative(34.8f, -59.2f)
                curveTo(329.1f, 55.9f, 342.9f, 48.0f, 357.8f, 48.0f)
                lineTo(360.0f, 48.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, 17.9f, 40.0f, 40.0f)
                close()
                moveTo(32.0f, 288.0f)
                lineTo(32.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineTo(224.0f, 512.0f)
                lineTo(224.0f, 288.0f)
                lineTo(32.0f, 288.0f)
                close()
                moveTo(288.0f, 512.0f)
                lineTo(432.0f, 512.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(480.0f, 288.0f)
                lineTo(288.0f, 288.0f)
                lineTo(288.0f, 512.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
