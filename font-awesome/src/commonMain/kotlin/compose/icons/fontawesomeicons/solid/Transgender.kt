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

public val SolidGroup.Transgender: ImageVector
    get() {
        if (_transgender != null) {
            return _transgender!!
        }
        _transgender = Builder(name = "Transgender", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(372.0f, 0.0f)
                horizontalLineToRelative(-79.0f)
                curveToRelative(-10.7f, 0.0f, -16.0f, 12.9f, -8.5f, 20.5f)
                lineToRelative(16.9f, 16.9f)
                lineToRelative(-80.7f, 80.7f)
                curveTo(198.5f, 104.1f, 172.2f, 96.0f, 144.0f, 96.0f)
                curveTo(64.5f, 96.0f, 0.0f, 160.5f, 0.0f, 240.0f)
                curveToRelative(0.0f, 68.5f, 47.9f, 125.9f, 112.0f, 140.4f)
                verticalLineTo(408.0f)
                horizontalLineTo(76.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, 5.4f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(28.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-28.0f)
                horizontalLineToRelative(36.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-36.0f)
                verticalLineToRelative(-27.6f)
                curveToRelative(64.1f, -14.6f, 112.0f, -71.9f, 112.0f, -140.4f)
                curveToRelative(0.0f, -28.2f, -8.1f, -54.5f, -22.1f, -76.7f)
                lineToRelative(80.7f, -80.7f)
                lineToRelative(16.9f, 16.9f)
                curveToRelative(7.6f, 7.6f, 20.5f, 2.2f, 20.5f, -8.5f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(144.0f, 320.0f)
                curveToRelative(-44.1f, 0.0f, -80.0f, -35.9f, -80.0f, -80.0f)
                reflectiveCurveToRelative(35.9f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.9f, 80.0f, 80.0f)
                reflectiveCurveToRelative(-35.9f, 80.0f, -80.0f, 80.0f)
                close()
            }
        }
        .build()
        return _transgender!!
    }

private var _transgender: ImageVector? = null
