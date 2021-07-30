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

public val SolidGroup.Bars: ImageVector
    get() {
        if (_bars != null) {
            return _bars!!
        }
        _bars = Builder(name = "Bars", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 132.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(8.837f, 0.0f, 16.0f, -7.163f, 16.0f, -16.0f)
                lineTo(448.0f, 76.0f)
                curveToRelative(0.0f, -8.837f, -7.163f, -16.0f, -16.0f, -16.0f)
                lineTo(16.0f, 60.0f)
                curveTo(7.163f, 60.0f, 0.0f, 67.163f, 0.0f, 76.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 8.837f, 7.163f, 16.0f, 16.0f, 16.0f)
                close()
                moveTo(16.0f, 292.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(8.837f, 0.0f, 16.0f, -7.163f, 16.0f, -16.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -8.837f, -7.163f, -16.0f, -16.0f, -16.0f)
                lineTo(16.0f, 220.0f)
                curveToRelative(-8.837f, 0.0f, -16.0f, 7.163f, -16.0f, 16.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 8.837f, 7.163f, 16.0f, 16.0f, 16.0f)
                close()
                moveTo(16.0f, 452.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(8.837f, 0.0f, 16.0f, -7.163f, 16.0f, -16.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -8.837f, -7.163f, -16.0f, -16.0f, -16.0f)
                lineTo(16.0f, 380.0f)
                curveToRelative(-8.837f, 0.0f, -16.0f, 7.163f, -16.0f, 16.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 8.837f, 7.163f, 16.0f, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _bars!!
    }

private var _bars: ImageVector? = null
