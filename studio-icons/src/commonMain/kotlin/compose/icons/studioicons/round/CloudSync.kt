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

public val RoundGroup.CloudSync: ImageVector
    get() {
        if (_cloudSync != null) {
            return _cloudSync!!
        }
        _cloudSync = Builder(name = "CloudSync", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 17.48f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(15.0f, 20.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.6f, 1.26f, -2.9f, 2.84f, -2.98f)
                curveTo(15.4f, 12.83f, 16.6f, 12.0f, 18.0f, 12.0f)
                curveToRelative(1.76f, 0.0f, 3.2f, 1.3f, 3.45f, 2.99f)
                curveToRelative(0.02f, 0.0f, 0.03f, -0.01f, 0.05f, -0.01f)
                curveTo(22.88f, 14.98f, 24.0f, 16.1f, 24.0f, 17.48f)
                close()
                moveTo(10.0f, 15.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.44f)
                curveToRelative(-1.22f, -1.1f, -2.0f, -2.67f, -2.0f, -4.44f)
                curveToRelative(0.0f, -2.38f, 1.39f, -4.43f, 3.4f, -5.4f)
                curveTo(9.77f, 6.42f, 10.0f, 6.04f, 10.0f, 5.63f)
                curveToRelative(0.0f, -0.71f, -0.73f, -1.18f, -1.37f, -0.88f)
                curveTo(5.89f, 6.03f, 4.0f, 8.79f, 4.0f, 12.0f)
                curveToRelative(0.0f, 2.4f, 1.06f, 4.54f, 2.73f, 6.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(19.0f, 6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(7.56f)
                curveToRelative(0.98f, 0.89f, 1.68f, 2.08f, 1.92f, 3.44f)
                lineToRelative(2.02f, 0.0f)
                curveToRelative(-0.25f, -1.99f, -1.23f, -3.74f, -2.66f, -5.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _cloudSync!!
    }

private var _cloudSync: ImageVector? = null
