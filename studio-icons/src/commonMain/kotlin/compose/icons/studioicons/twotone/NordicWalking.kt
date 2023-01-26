package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.NordicWalking: ImageVector
    get() {
        if (_nordicWalking != null) {
            return _nordicWalking!!
        }
        _nordicWalking = Builder(name = "NordicWalking", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 23.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(23.0f)
                close()
                moveTo(7.53f, 14.0f)
                horizontalLineTo(6.0f)
                lineToRelative(-2.0f, 9.0f)
                horizontalLineToRelative(1.53f)
                lineTo(7.53f, 14.0f)
                close()
                moveTo(13.5f, 5.5f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveTo(12.4f, 5.5f, 13.5f, 5.5f)
                close()
                moveTo(9.8f, 8.9f)
                lineTo(7.0f, 23.0f)
                horizontalLineToRelative(2.1f)
                lineToRelative(1.8f, -8.0f)
                lineToRelative(2.1f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.5f)
                lineToRelative(-2.1f, -2.0f)
                lineToRelative(0.6f, -3.0f)
                curveTo(14.8f, 12.0f, 16.8f, 13.0f, 19.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.9f, 0.0f, -3.5f, -1.0f, -4.3f, -2.4f)
                lineToRelative(-1.0f, -1.6f)
                curveToRelative(-0.56f, -0.89f, -1.68f, -1.25f, -2.65f, -0.84f)
                lineTo(6.0f, 8.3f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(9.6f)
                lineTo(9.8f, 8.9f)
                close()
            }
        }
        .build()
        return _nordicWalking!!
    }

private var _nordicWalking: ImageVector? = null
