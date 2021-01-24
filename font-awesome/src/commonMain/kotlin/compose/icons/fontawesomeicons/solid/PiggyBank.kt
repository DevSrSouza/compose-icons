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

public val SolidGroup.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) {
            return _piggyBank!!
        }
        _piggyBank = Builder(name = "PiggyBank", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(560.0f, 224.0f)
                horizontalLineToRelative(-29.5f)
                curveToRelative(-8.8f, -20.0f, -21.6f, -37.7f, -37.4f, -52.5f)
                lineTo(512.0f, 96.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-29.4f, 0.0f, -55.4f, 13.5f, -73.0f, 34.3f)
                curveToRelative(-7.6f, -1.1f, -15.1f, -2.3f, -23.0f, -2.3f)
                lineTo(256.0f, 128.0f)
                curveToRelative(-77.4f, 0.0f, -141.9f, 55.0f, -156.8f, 128.0f)
                lineTo(56.0f, 256.0f)
                curveToRelative(-14.8f, 0.0f, -26.5f, -13.5f, -23.5f, -28.8f)
                curveTo(34.7f, 215.8f, 45.4f, 208.0f, 57.0f, 208.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(3.3f, 0.0f, 6.0f, -2.7f, 6.0f, -6.0f)
                verticalLineToRelative(-20.0f)
                curveToRelative(0.0f, -3.3f, -2.7f, -6.0f, -6.0f, -6.0f)
                curveToRelative(-28.5f, 0.0f, -53.9f, 20.4f, -57.5f, 48.6f)
                curveTo(-3.9f, 258.8f, 22.7f, 288.0f, 56.0f, 288.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(0.0f, 52.2f, 25.4f, 98.1f, 64.0f, 127.3f)
                lineTo(160.0f, 496.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-48.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-80.7f)
                curveToRelative(11.8f, -8.9f, 22.3f, -19.4f, 31.3f, -31.3f)
                lineTo(560.0f, 384.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(576.0f, 240.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(432.0f, 288.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                close()
                moveTo(256.0f, 96.0f)
                horizontalLineToRelative(128.0f)
                curveToRelative(5.4f, 0.0f, 10.7f, 0.4f, 15.9f, 0.8f)
                curveToRelative(0.0f, -0.3f, 0.1f, -0.5f, 0.1f, -0.8f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 43.0f, -96.0f, 96.0f)
                curveToRelative(0.0f, 2.1f, 0.5f, 4.1f, 0.6f, 6.2f)
                curveToRelative(15.2f, -3.9f, 31.0f, -6.2f, 47.4f, -6.2f)
                close()
            }
        }
        .build()
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
