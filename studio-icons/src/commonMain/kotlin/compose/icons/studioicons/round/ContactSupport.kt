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

public val RoundGroup.ContactSupport: ImageVector
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
                moveTo(12.9f, 11.72f)
                curveToRelative(-0.01f, 0.01f, -0.02f, 0.03f, -0.03f, 0.05f)
                curveToRelative(-0.05f, 0.08f, -0.1f, 0.16f, -0.14f, 0.24f)
                curveToRelative(-0.02f, 0.03f, -0.03f, 0.07f, -0.04f, 0.11f)
                curveToRelative(-0.03f, 0.07f, -0.06f, 0.14f, -0.08f, 0.21f)
                curveToRelative(-0.07f, 0.21f, -0.1f, 0.43f, -0.1f, 0.68f)
                lineTo(10.5f, 13.01f)
                curveToRelative(0.0f, -0.51f, 0.08f, -0.94f, 0.2f, -1.3f)
                curveToRelative(0.0f, -0.01f, 0.0f, -0.02f, 0.01f, -0.03f)
                curveToRelative(0.01f, -0.04f, 0.04f, -0.06f, 0.05f, -0.1f)
                curveToRelative(0.06f, -0.16f, 0.13f, -0.3f, 0.22f, -0.44f)
                curveToRelative(0.03f, -0.05f, 0.07f, -0.1f, 0.1f, -0.15f)
                curveToRelative(0.03f, -0.04f, 0.05f, -0.09f, 0.08f, -0.12f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.84f, -1.1f, 2.21f, -1.44f, 2.32f, -2.68f)
                curveToRelative(0.09f, -0.98f, -0.61f, -1.93f, -1.57f, -2.13f)
                curveToRelative(-1.04f, -0.22f, -1.98f, 0.39f, -2.3f, 1.28f)
                curveToRelative(-0.14f, 0.36f, -0.47f, 0.65f, -0.88f, 0.65f)
                horizontalLineToRelative(-0.2f)
                curveToRelative(-0.6f, 0.0f, -1.04f, -0.59f, -0.87f, -1.17f)
                curveToRelative(0.55f, -1.82f, 2.37f, -3.09f, 4.43f, -2.79f)
                curveToRelative(1.69f, 0.25f, 3.04f, 1.64f, 3.33f, 3.33f)
                curveToRelative(0.44f, 2.44f, -1.63f, 3.03f, -2.53f, 4.35f)
                close()
            }
        }
        .build()
        return _contactSupport!!
    }

private var _contactSupport: ImageVector? = null
