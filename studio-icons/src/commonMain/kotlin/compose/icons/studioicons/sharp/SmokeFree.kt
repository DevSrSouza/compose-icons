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

public val SharpGroup.SmokeFree: ImageVector
    get() {
        if (_smokeFree != null) {
            return _smokeFree!!
        }
        _smokeFree = Builder(name = "SmokeFree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 13.0f)
                lineTo(22.0f, 13.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(14.5f, 8.65f)
                horizontalLineToRelative(1.53f)
                curveToRelative(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f)
                lineTo(18.0f, 12.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.64f)
                curveToRelative(0.0f, -1.81f, -1.6f, -3.16f, -3.47f, -3.16f)
                lineTo(14.5f, 7.2f)
                curveToRelative(-1.02f, 0.0f, -1.85f, -0.98f, -1.85f, -2.0f)
                reflectiveCurveToRelative(0.83f, -1.75f, 1.85f, -1.75f)
                verticalLineToRelative(-1.5f)
                curveToRelative(-1.85f, 0.0f, -3.35f, 1.5f, -3.35f, 3.35f)
                reflectiveCurveToRelative(1.5f, 3.35f, 3.35f, 3.35f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(-2.34f)
                lineTo(17.0f, 15.34f)
                close()
                moveTo(18.85f, 4.73f)
                curveToRelative(0.62f, -0.61f, 1.0f, -1.45f, 1.0f, -2.38f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(0.0f, 1.02f, -0.83f, 1.85f, -1.85f, 1.85f)
                verticalLineToRelative(1.5f)
                curveToRelative(2.24f, 0.0f, 4.0f, 1.83f, 4.0f, 4.07f)
                lineTo(20.5f, 12.0f)
                lineTo(22.0f, 12.0f)
                lineTo(22.0f, 9.76f)
                curveToRelative(0.0f, -2.22f, -1.28f, -4.14f, -3.15f, -5.03f)
                close()
                moveTo(18.0f, 13.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.0f)
                lineTo(18.0f, 16.0f)
                close()
                moveTo(3.41f, 4.59f)
                lineTo(2.0f, 6.0f)
                lineToRelative(7.0f, 7.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                lineToRelative(7.0f, 7.0f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }
        .build()
        return _smokeFree!!
    }

private var _smokeFree: ImageVector? = null
