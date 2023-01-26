package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.ContactPhone: ImageVector
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
                horizontalLineToRelative(1.39f)
                curveToRelative(0.16f, 0.0f, 0.3f, 0.07f, 0.4f, 0.2f)
                lineToRelative(1.1f, 1.45f)
                curveToRelative(0.15f, 0.2f, 0.13f, 0.48f, -0.05f, 0.65f)
                lineToRelative(-1.36f, 1.36f)
                curveToRelative(-0.18f, 0.18f, -0.48f, 0.2f, -0.67f, 0.04f)
                curveToRelative(-1.13f, -0.96f, -1.97f, -2.25f, -2.38f, -3.71f)
                curveToRelative(-0.18f, -0.63f, -0.28f, -1.3f, -0.28f, -1.99f)
                reflectiveCurveToRelative(0.1f, -1.36f, 0.28f, -2.0f)
                curveToRelative(0.41f, -1.47f, 1.25f, -2.75f, 2.38f, -3.71f)
                curveToRelative(0.2f, -0.17f, 0.49f, -0.14f, 0.67f, 0.04f)
                lineToRelative(1.36f, 1.36f)
                curveToRelative(0.18f, 0.18f, 0.2f, 0.46f, 0.05f, 0.65f)
                lineToRelative(-1.1f, 1.45f)
                curveToRelative(-0.09f, 0.13f, -0.24f, 0.2f, -0.4f, 0.2f)
                horizontalLineToRelative(-1.39f)
                curveToRelative(-0.22f, 0.63f, -0.35f, 1.3f, -0.35f, 2.0f)
                reflectiveCurveToRelative(0.13f, 1.38f, 0.35f, 2.01f)
                close()
            }
        }
        .build()
        return _contactPhone!!
    }

private var _contactPhone: ImageVector? = null
