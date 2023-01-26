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

public val TwotoneGroup.Flare: ImageVector
    get() {
        if (_flare != null) {
            return _flare!!
        }
        _flare = Builder(name = "Flare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.644f, 7.05f)
                lineTo(7.05f, 5.645f)
                lineToRelative(2.123f, 2.122f)
                lineToRelative(-1.408f, 1.407f)
                close()
                moveTo(11.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(16.242f, 14.834f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-1.406f, 1.408f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveTo(14.834f, 7.76f)
                lineToRelative(2.12f, -2.123f)
                lineToRelative(1.41f, 1.407f)
                lineToRelative(-2.123f, 2.122f)
                close()
                moveTo(9.166f, 16.242f)
                lineToRelative(-2.122f, 2.12f)
                lineToRelative(-1.407f, -1.406f)
                lineToRelative(2.122f, -2.122f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(11.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(1.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 13.0f)
                close()
                moveTo(17.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _flare!!
    }

private var _flare: ImageVector? = null
