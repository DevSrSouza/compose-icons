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

public val SolidGroup.Bible: ImageVector
    get() {
        if (_bible != null) {
            return _bible!!
        }
        _bible = Builder(name = "Bible", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 358.4f)
                lineTo(448.0f, 25.6f)
                curveToRelative(0.0f, -16.0f, -9.6f, -25.6f, -25.6f, -25.6f)
                lineTo(96.0f, 0.0f)
                curveTo(41.6f, 0.0f, 0.0f, 41.6f, 0.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 54.4f, 41.6f, 96.0f, 96.0f, 96.0f)
                horizontalLineToRelative(326.4f)
                curveToRelative(12.8f, 0.0f, 25.6f, -9.6f, 25.6f, -25.6f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -6.4f, -3.2f, -12.8f, -9.6f, -19.2f)
                curveToRelative(-3.2f, -16.0f, -3.2f, -60.8f, 0.0f, -73.6f)
                curveToRelative(6.4f, -3.2f, 9.6f, -9.6f, 9.6f, -19.2f)
                close()
                moveTo(144.0f, 144.0f)
                curveToRelative(0.0f, -8.84f, 7.16f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                lineTo(208.0f, 80.0f)
                curveToRelative(0.0f, -8.84f, 7.16f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, 7.16f, 16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, 7.16f, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, -7.16f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 8.84f, -7.16f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                lineTo(208.0f, 192.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                close()
                moveTo(380.8f, 448.0f)
                lineTo(96.0f, 448.0f)
                curveToRelative(-19.2f, 0.0f, -32.0f, -12.8f, -32.0f, -32.0f)
                reflectiveCurveToRelative(16.0f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(284.8f)
                verticalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _bible!!
    }

private var _bible: ImageVector? = null
