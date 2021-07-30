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

public val SolidGroup.Archway: ImageVector
    get() {
        if (_archway != null) {
            return _archway!!
        }
        _archway = Builder(name = "Archway", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(560.0f, 448.0f)
                horizontalLineToRelative(-16.0f)
                lineTo(544.0f, 96.0f)
                lineTo(32.0f, 96.0f)
                verticalLineToRelative(352.0f)
                lineTo(16.02f, 448.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                lineTo(176.0f, 512.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(192.0f, 320.0f)
                curveToRelative(0.0f, -53.02f, 42.98f, -96.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(96.0f, 42.98f, 96.0f, 96.0f)
                lineToRelative(0.02f, 160.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                lineTo(560.0f, 512.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(560.0f, 0.0f)
                lineTo(16.0f, 0.0f)
                curveTo(7.16f, 0.0f, 0.0f, 7.16f, 0.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(544.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(576.0f, 16.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _archway!!
    }

private var _archway: ImageVector? = null
