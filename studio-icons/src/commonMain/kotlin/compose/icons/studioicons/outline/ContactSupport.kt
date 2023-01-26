package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.ContactSupport: ImageVector
    get() {
        if (_contactSupport != null) {
            return _contactSupport!!
        }
        _contactSupport = Builder(name = "ContactSupport", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 23.59f)
                verticalLineToRelative(-3.6f)
                curveToRelative(-5.01f, -0.26f, -9.0f, -4.42f, -9.0f, -9.49f)
                curveTo(2.0f, 5.26f, 6.26f, 1.0f, 11.5f, 1.0f)
                reflectiveCurveTo(21.0f, 5.26f, 21.0f, 10.5f)
                curveToRelative(0.0f, 4.95f, -3.44f, 9.93f, -8.57f, 12.4f)
                lineToRelative(-1.43f, 0.69f)
                close()
                moveTo(11.5f, 3.0f)
                curveTo(7.36f, 3.0f, 4.0f, 6.36f, 4.0f, 10.5f)
                reflectiveCurveTo(7.36f, 18.0f, 11.5f, 18.0f)
                lineTo(13.0f, 18.0f)
                verticalLineToRelative(2.3f)
                curveToRelative(3.64f, -2.3f, 6.0f, -6.08f, 6.0f, -9.8f)
                curveTo(19.0f, 6.36f, 15.64f, 3.0f, 11.5f, 3.0f)
                close()
                moveTo(10.5f, 14.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
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
