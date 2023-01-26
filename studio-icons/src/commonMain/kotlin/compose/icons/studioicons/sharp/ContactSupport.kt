package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.ContactSupport: ImageVector
    get() {
        if (_contactSupport != null) {
            return _contactSupport!!
        }
        _contactSupport = Builder(name = "ContactSupport", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 2.0f)
                curveTo(6.81f, 2.0f, 3.0f, 5.81f, 3.0f, 10.5f)
                reflectiveCurveTo(6.81f, 19.0f, 11.5f, 19.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(4.86f, -2.34f, 8.0f, -7.0f, 8.0f, -11.5f)
                curveTo(20.0f, 5.81f, 16.19f, 2.0f, 11.5f, 2.0f)
                close()
                moveTo(12.5f, 16.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.5f, 13.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.25f, 3.0f, -3.0f, 3.0f, -5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                curveToRelative(0.0f, 2.5f, -3.0f, 2.75f, -3.0f, 5.0f)
                close()
            }
        }
        .build()
        return _contactSupport!!
    }

private var _contactSupport: ImageVector? = null
