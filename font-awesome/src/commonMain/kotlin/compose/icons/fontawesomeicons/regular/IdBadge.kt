package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.IdBadge: ImageVector
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
                moveTo(336.0f, 464.0f)
                lineTo(48.0f, 464.0f)
                lineTo(48.0f, 48.0f)
                horizontalLineToRelative(288.0f)
                verticalLineToRelative(416.0f)
                close()
                moveTo(144.0f, 112.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-96.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                close()
                moveTo(192.0f, 288.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.7f, -64.0f, -64.0f, -64.0f)
                reflectiveCurveToRelative(-64.0f, 28.7f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.7f, 64.0f, 64.0f, 64.0f)
                close()
                moveTo(102.4f, 416.0f)
                horizontalLineToRelative(179.2f)
                curveToRelative(12.4f, 0.0f, 22.4f, -8.6f, 22.4f, -19.2f)
                verticalLineToRelative(-19.2f)
                curveToRelative(0.0f, -31.8f, -30.1f, -57.6f, -67.2f, -57.6f)
                curveToRelative(-10.8f, 0.0f, -18.7f, 8.0f, -44.8f, 8.0f)
                curveToRelative(-26.9f, 0.0f, -33.4f, -8.0f, -44.8f, -8.0f)
                curveToRelative(-37.1f, 0.0f, -67.2f, 25.8f, -67.2f, 57.6f)
                verticalLineToRelative(19.2f)
                curveToRelative(0.0f, 10.6f, 10.0f, 19.2f, 22.4f, 19.2f)
                close()
            }
        }
        .build()
        return _idBadge!!
    }

private var _idBadge: ImageVector? = null
