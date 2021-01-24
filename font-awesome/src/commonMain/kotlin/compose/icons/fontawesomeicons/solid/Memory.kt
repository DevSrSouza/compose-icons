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

public val SolidGroup.Memory: ImageVector
    get() {
        if (_memory != null) {
            return _memory!!
        }
        _memory = Builder(name = "Memory", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(640.0f, 130.94f)
                lineTo(640.0f, 96.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                lineTo(32.0f, 64.0f)
                curveTo(14.33f, 64.0f, 0.0f, 78.33f, 0.0f, 96.0f)
                verticalLineToRelative(34.94f)
                curveToRelative(18.6f, 6.61f, 32.0f, 24.19f, 32.0f, 45.06f)
                reflectiveCurveToRelative(-13.4f, 38.45f, -32.0f, 45.06f)
                lineTo(0.0f, 320.0f)
                horizontalLineToRelative(640.0f)
                verticalLineToRelative(-98.94f)
                curveToRelative(-18.6f, -6.61f, -32.0f, -24.19f, -32.0f, -45.06f)
                reflectiveCurveToRelative(13.4f, -38.45f, 32.0f, -45.06f)
                close()
                moveTo(224.0f, 256.0f)
                horizontalLineToRelative(-64.0f)
                lineTo(160.0f, 128.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(128.0f)
                close()
                moveTo(352.0f, 256.0f)
                horizontalLineToRelative(-64.0f)
                lineTo(288.0f, 128.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(128.0f)
                close()
                moveTo(480.0f, 256.0f)
                horizontalLineToRelative(-64.0f)
                lineTo(416.0f, 128.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(128.0f)
                close()
                moveTo(0.0f, 448.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(-26.67f)
                curveToRelative(0.0f, -8.84f, 7.16f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.16f, 16.0f, 16.0f)
                lineTo(96.0f, 448.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-26.67f)
                curveToRelative(0.0f, -8.84f, 7.16f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.16f, 16.0f, 16.0f)
                lineTo(256.0f, 448.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-26.67f)
                curveToRelative(0.0f, -8.84f, 7.16f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.16f, 16.0f, 16.0f)
                lineTo(416.0f, 448.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-26.67f)
                curveToRelative(0.0f, -8.84f, 7.16f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.16f, 16.0f, 16.0f)
                lineTo(576.0f, 448.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(-96.0f)
                lineTo(0.0f, 352.0f)
                verticalLineToRelative(96.0f)
                close()
            }
        }
        .build()
        return _memory!!
    }

private var _memory: ImageVector? = null
