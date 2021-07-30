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

public val SolidGroup.Venus: ImageVector
    get() {
        if (_venus != null) {
            return _venus!!
        }
        _venus = Builder(name = "Venus", defaultWidth = 288.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 288.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 176.0f)
                curveToRelative(0.0f, -79.5f, -64.5f, -144.0f, -144.0f, -144.0f)
                reflectiveCurveTo(0.0f, 96.5f, 0.0f, 176.0f)
                curveToRelative(0.0f, 68.5f, 47.9f, 125.9f, 112.0f, 140.4f)
                lineTo(112.0f, 368.0f)
                lineTo(76.0f, 368.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, 5.4f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(36.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-36.0f)
                horizontalLineToRelative(36.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-36.0f)
                verticalLineToRelative(-51.6f)
                curveToRelative(64.1f, -14.5f, 112.0f, -71.9f, 112.0f, -140.4f)
                close()
                moveTo(64.0f, 176.0f)
                curveToRelative(0.0f, -44.1f, 35.9f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.9f, 80.0f, 80.0f)
                reflectiveCurveToRelative(-35.9f, 80.0f, -80.0f, 80.0f)
                reflectiveCurveToRelative(-80.0f, -35.9f, -80.0f, -80.0f)
                close()
            }
        }
        .build()
        return _venus!!
    }

private var _venus: ImageVector? = null
