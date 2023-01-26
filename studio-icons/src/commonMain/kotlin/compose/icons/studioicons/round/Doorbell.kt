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

public val RoundGroup.Doorbell: ImageVector
    get() {
        if (_doorbell != null) {
            return _doorbell!!
        }
        _doorbell = Builder(name = "Doorbell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8f, 3.9f)
                lineToRelative(-6.0f, 4.5f)
                curveTo(4.3f, 8.78f, 4.0f, 9.37f, 4.0f, 10.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -0.63f, -0.3f, -1.22f, -0.8f, -1.6f)
                lineToRelative(-6.0f, -4.5f)
                curveTo(12.49f, 3.37f, 11.51f, 3.37f, 10.8f, 3.9f)
                close()
                moveTo(12.0f, 17.5f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveTo(13.0f, 17.05f, 12.55f, 17.5f, 12.0f, 17.5f)
                close()
                moveTo(15.5f, 16.0f)
                horizontalLineToRelative(-7.0f)
                curveTo(8.22f, 16.0f, 8.0f, 15.78f, 8.0f, 15.5f)
                verticalLineToRelative(0.0f)
                curveTo(8.0f, 15.22f, 8.22f, 15.0f, 8.5f, 15.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-2.34f)
                curveToRelative(0.0f, -1.54f, 0.82f, -2.82f, 2.25f, -3.16f)
                verticalLineTo(9.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(9.5f)
                curveTo(14.19f, 9.84f, 15.0f, 11.12f, 15.0f, 12.66f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(0.0f)
                curveTo(16.0f, 15.78f, 15.78f, 16.0f, 15.5f, 16.0f)
                close()
            }
        }
        .build()
        return _doorbell!!
    }

private var _doorbell: ImageVector? = null
