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

public val TwotoneGroup.NearbyError: ImageVector
    get() {
        if (_nearbyError != null) {
            return _nearbyError!!
        }
        _nearbyError = Builder(name = "NearbyError", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.57f)
                lineToRelative(4.42f, 4.42f)
                lineTo(12.0f, 16.41f)
                lineToRelative(-4.42f, -4.42f)
                lineTo(12.0f, 7.57f)
                close()
                moveTo(12.0f, 19.19f)
                lineToRelative(-7.2f, -7.2f)
                lineToRelative(7.2f, -7.2f)
                lineToRelative(6.0f, 6.0f)
                verticalLineTo(7.16f)
                lineToRelative(-4.58f, -4.58f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f)
                lineToRelative(-8.01f, 8.0f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f)
                lineToRelative(8.01f, 8.0f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f)
                lineTo(18.0f, 16.82f)
                verticalLineToRelative(-3.63f)
                lineTo(12.0f, 19.19f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(22.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.0f)
            }
        }
        .build()
        return _nearbyError!!
    }

private var _nearbyError: ImageVector? = null
