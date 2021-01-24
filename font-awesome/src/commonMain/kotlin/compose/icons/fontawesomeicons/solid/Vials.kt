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

public val SolidGroup.Vials: ImageVector
    get() {
        if (_vials != null) {
            return _vials!!
        }
        _vials = Builder(name = "Vials", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 64.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(240.0f)
                curveToRelative(0.0f, 44.1f, 35.9f, 80.0f, 80.0f, 80.0f)
                reflectiveCurveToRelative(80.0f, -35.9f, 80.0f, -80.0f)
                lineTo(256.0f, 64.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, -3.6f, 8.0f, -8.0f)
                lineTo(288.0f, 8.0f)
                curveToRelative(0.0f, -4.4f, -3.6f, -8.0f, -8.0f, -8.0f)
                lineTo(72.0f, 0.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                close()
                moveTo(144.0f, 64.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(-64.0f)
                lineTo(144.0f, 64.0f)
                close()
                moveTo(624.0f, 448.0f)
                lineTo(16.0f, 448.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(608.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(360.0f, 64.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(240.0f)
                curveToRelative(0.0f, 44.1f, 35.9f, 80.0f, 80.0f, 80.0f)
                reflectiveCurveToRelative(80.0f, -35.9f, 80.0f, -80.0f)
                lineTo(544.0f, 64.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, -3.6f, 8.0f, -8.0f)
                lineTo(576.0f, 8.0f)
                curveToRelative(0.0f, -4.4f, -3.6f, -8.0f, -8.0f, -8.0f)
                lineTo(360.0f, 0.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                close()
                moveTo(432.0f, 64.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(-64.0f)
                lineTo(432.0f, 64.0f)
                close()
            }
        }
        .build()
        return _vials!!
    }

private var _vials: ImageVector? = null
