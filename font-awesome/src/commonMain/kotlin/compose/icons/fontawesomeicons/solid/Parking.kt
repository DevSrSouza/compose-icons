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

public val SolidGroup.Parking: ImageVector
    get() {
        if (_parking != null) {
            return _parking!!
        }
        _parking = Builder(name = "Parking", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(448.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(240.0f, 320.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(128.0f, 144.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(52.9f, 0.0f, 96.0f, 43.1f, 96.0f, 96.0f)
                reflectiveCurveToRelative(-43.1f, 96.0f, -96.0f, 96.0f)
                close()
                moveTo(240.0f, 192.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(17.6f, 0.0f, 32.0f, -14.4f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.4f, -32.0f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _parking!!
    }

private var _parking: ImageVector? = null
