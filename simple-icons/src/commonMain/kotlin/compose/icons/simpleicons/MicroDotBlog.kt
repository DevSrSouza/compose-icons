package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Microdotblog: ImageVector
    get() {
        if (_microdotblog != null) {
            return _microdotblog!!
        }
        _microdotblog = Builder(name = "Microdotblog", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.4f, 0.0f, 0.0f, 4.9f, 0.0f, 10.95f)
                curveTo(0.0f, 17.0f, 5.4f, 21.9f, 12.0f, 21.9f)
                curveToRelative(1.4f, 0.0f, 2.85f, -0.25f, 4.2f, -0.7f)
                curveToRelative(0.15f, -0.05f, 0.35f, 0.0f, 0.45f, 0.1f)
                curveToRelative(1.0f, 1.35f, 2.55f, 2.3f, 4.25f, 2.7f)
                lineToRelative(0.25f, -0.1f)
                verticalLineToRelative(-0.3f)
                arcToRelative(4.65f, 4.65f, 0.0f, false, true, 0.2f, -5.9f)
                curveTo(22.9f, 15.85f, 24.0f, 13.5f, 24.0f, 10.95f)
                curveTo(24.0f, 4.9f, 18.55f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.95f, 5.2f)
                curveToRelative(0.15f, 0.0f, 0.3f, 0.1f, 0.35f, 0.25f)
                lineTo(13.55f, 9.0f)
                lineToRelative(3.85f, 0.1f)
                curveToRelative(0.15f, 0.0f, 0.3f, 0.1f, 0.35f, 0.2f)
                curveToRelative(0.05f, 0.15f, 0.0f, 0.3f, -0.15f, 0.4f)
                lineTo(14.55f, 12.0f)
                lineToRelative(1.1f, 3.6f)
                curveToRelative(0.05f, 0.15f, 0.0f, 0.3f, -0.15f, 0.4f)
                horizontalLineToRelative(-0.4f)
                lineToRelative(-3.15f, -2.15f)
                lineTo(8.8f, 16.0f)
                horizontalLineToRelative(-0.4f)
                curveToRelative(-0.15f, -0.1f, -0.2f, -0.25f, -0.15f, -0.4f)
                lineToRelative(1.1f, -3.6f)
                lineTo(6.3f, 9.7f)
                curveToRelative(-0.15f, -0.1f, -0.2f, -0.25f, -0.15f, -0.4f)
                curveToRelative(0.05f, -0.1f, 0.2f, -0.2f, 0.35f, -0.2f)
                lineToRelative(3.85f, -0.1f)
                lineToRelative(1.25f, -3.55f)
                curveToRelative(0.05f, -0.15f, 0.2f, -0.25f, 0.35f, -0.25f)
                close()
            }
        }
        .build()
        return _microdotblog!!
    }

private var _microdotblog: ImageVector? = null
