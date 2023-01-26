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

public val OutlineGroup.ContactPhone: ImageVector
    get() {
        if (_contactPhone != null) {
            return _contactPhone!!
        }
        _contactPhone = Builder(name = "ContactPhone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                curveTo(0.9f, 3.0f, 0.0f, 3.9f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(22.0f, 19.0f)
                lineTo(2.0f, 19.0f)
                lineTo(2.0f, 5.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(19.01f, 17.99f)
                lineTo(21.0f, 16.0f)
                lineToRelative(-1.51f, -2.0f)
                horizontalLineToRelative(-1.64f)
                curveToRelative(-0.22f, -0.63f, -0.35f, -1.3f, -0.35f, -2.0f)
                reflectiveCurveToRelative(0.13f, -1.37f, 0.35f, -2.0f)
                horizontalLineToRelative(1.64f)
                lineTo(21.0f, 8.0f)
                lineToRelative(-1.99f, -1.99f)
                curveToRelative(-1.31f, 0.98f, -2.28f, 2.37f, -2.73f, 3.99f)
                curveToRelative(-0.18f, 0.64f, -0.28f, 1.31f, -0.28f, 2.0f)
                reflectiveCurveToRelative(0.1f, 1.36f, 0.28f, 2.0f)
                curveToRelative(0.45f, 1.61f, 1.42f, 3.01f, 2.73f, 3.99f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.35f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(9.0f, 8.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(15.0f, 16.59f)
                curveToRelative(0.0f, -2.5f, -3.97f, -3.58f, -6.0f, -3.58f)
                reflectiveCurveToRelative(-6.0f, 1.08f, -6.0f, 3.58f)
                lineTo(3.0f, 18.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.41f)
                close()
                moveTo(5.48f, 16.0f)
                curveToRelative(0.74f, -0.5f, 2.22f, -1.0f, 3.52f, -1.0f)
                reflectiveCurveToRelative(2.77f, 0.49f, 3.52f, 1.0f)
                lineTo(5.48f, 16.0f)
                close()
            }
        }
        .build()
        return _contactPhone!!
    }

private var _contactPhone: ImageVector? = null
