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

public val SolidGroup.Sleigh: ImageVector
    get() {
        if (_sleigh != null) {
            return _sleigh!!
        }
        _sleigh = Builder(name = "Sleigh", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(612.7f, 350.7f)
                lineToRelative(-9.3f, -7.4f)
                curveToRelative(-6.9f, -5.5f, -17.0f, -4.4f, -22.5f, 2.5f)
                lineToRelative(-10.0f, 12.5f)
                curveToRelative(-5.5f, 6.9f, -4.4f, 17.0f, 2.5f, 22.5f)
                lineToRelative(9.3f, 7.4f)
                curveToRelative(5.9f, 4.7f, 9.2f, 11.7f, 9.2f, 19.2f)
                curveToRelative(0.0f, 13.6f, -11.0f, 24.6f, -24.6f, 24.6f)
                horizontalLineTo(48.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(516.0f)
                curveToRelative(39.0f, 0.0f, 73.7f, -29.3f, 75.9f, -68.3f)
                curveToRelative(1.4f, -23.8f, -8.7f, -46.3f, -27.2f, -61.0f)
                close()
                moveTo(32.0f, 224.0f)
                curveToRelative(0.0f, 59.6f, 40.9f, 109.2f, 96.0f, 123.5f)
                verticalLineTo(400.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(-48.0f)
                horizontalLineToRelative(192.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-96.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                horizontalLineToRelative(-20.7f)
                curveToRelative(-65.8f, 0.0f, -125.9f, -37.2f, -155.3f, -96.0f)
                curveToRelative(-29.4f, -58.8f, -89.6f, -96.0f, -155.3f, -96.0f)
                horizontalLineTo(32.0f)
                curveTo(14.3f, 32.0f, 0.0f, 46.3f, 0.0f, 64.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                verticalLineToRelative(128.0f)
                close()
            }
        }
        .build()
        return _sleigh!!
    }

private var _sleigh: ImageVector? = null
