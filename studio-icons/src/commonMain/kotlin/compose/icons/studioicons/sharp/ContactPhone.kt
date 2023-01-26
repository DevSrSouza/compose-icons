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

public val SharpGroup.ContactPhone: ImageVector
    get() {
        if (_contactPhone != null) {
            return _contactPhone!!
        }
        _contactPhone = Builder(name = "ContactPhone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.99f, 3.0f)
                lineTo(0.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(24.0f)
                lineToRelative(-0.01f, -18.0f)
                close()
                moveTo(8.0f, 6.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(14.0f, 18.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.0f, 4.0f, -3.1f, 6.0f, -3.1f)
                reflectiveCurveToRelative(6.0f, 1.1f, 6.0f, 3.1f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(17.85f, 14.0f)
                horizontalLineToRelative(1.64f)
                lineTo(21.0f, 16.0f)
                lineToRelative(-1.99f, 1.99f)
                curveToRelative(-1.31f, -0.98f, -2.28f, -2.38f, -2.73f, -3.99f)
                curveToRelative(-0.18f, -0.64f, -0.28f, -1.31f, -0.28f, -2.0f)
                reflectiveCurveToRelative(0.1f, -1.36f, 0.28f, -2.0f)
                curveToRelative(0.45f, -1.62f, 1.42f, -3.01f, 2.73f, -3.99f)
                lineTo(21.0f, 8.0f)
                lineToRelative(-1.51f, 2.0f)
                horizontalLineToRelative(-1.64f)
                curveToRelative(-0.22f, 0.63f, -0.35f, 1.3f, -0.35f, 2.0f)
                reflectiveCurveToRelative(0.13f, 1.37f, 0.35f, 2.0f)
                close()
            }
        }
        .build()
        return _contactPhone!!
    }

private var _contactPhone: ImageVector? = null
