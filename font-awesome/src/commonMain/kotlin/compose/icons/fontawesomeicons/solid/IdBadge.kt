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

public val SolidGroup.IdBadge: ImageVector
    get() {
        if (_idBadge != null) {
            return _idBadge!!
        }
        _idBadge = Builder(name = "IdBadge", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 0.0f)
                lineTo(48.0f, 0.0f)
                curveTo(21.5f, 0.0f, 0.0f, 21.5f, 0.0f, 48.0f)
                verticalLineToRelative(416.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(288.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(384.0f, 48.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(144.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-96.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(192.0f, 160.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.7f, 64.0f, -64.0f, 64.0f)
                reflectiveCurveToRelative(-64.0f, -28.7f, -64.0f, -64.0f)
                reflectiveCurveToRelative(28.7f, -64.0f, 64.0f, -64.0f)
                close()
                moveTo(304.0f, 396.8f)
                curveToRelative(0.0f, 10.6f, -10.0f, 19.2f, -22.4f, 19.2f)
                lineTo(102.4f, 416.0f)
                curveTo(90.0f, 416.0f, 80.0f, 407.4f, 80.0f, 396.8f)
                verticalLineToRelative(-19.2f)
                curveToRelative(0.0f, -31.8f, 30.1f, -57.6f, 67.2f, -57.6f)
                horizontalLineToRelative(5.0f)
                curveToRelative(12.3f, 5.1f, 25.7f, 8.0f, 39.8f, 8.0f)
                reflectiveCurveToRelative(27.6f, -2.9f, 39.8f, -8.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(37.1f, 0.0f, 67.2f, 25.8f, 67.2f, 57.6f)
                verticalLineToRelative(19.2f)
                close()
            }
        }
        .build()
        return _idBadge!!
    }

private var _idBadge: ImageVector? = null
