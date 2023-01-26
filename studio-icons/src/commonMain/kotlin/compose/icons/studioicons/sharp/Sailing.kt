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

public val SharpGroup.Sailing: ImageVector
    get() {
        if (_sailing != null) {
            return _sailing!!
        }
        _sailing = Builder(name = "Sailing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.5f)
                verticalLineTo(2.0f)
                lineTo(3.0f, 13.5f)
                horizontalLineTo(11.0f)
                close()
                moveTo(21.0f, 13.5f)
                curveTo(21.0f, 6.5f, 14.5f, 1.0f, 12.5f, 1.0f)
                curveToRelative(0.0f, 0.0f, 1.0f, 3.0f, 1.0f, 6.5f)
                reflectiveCurveToRelative(-1.0f, 6.0f, -1.0f, 6.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(22.0f, 15.0f)
                horizontalLineTo(2.0f)
                curveToRelative(0.31f, 1.53f, 1.16f, 2.84f, 2.33f, 3.73f)
                curveTo(4.98f, 18.46f, 5.55f, 18.01f, 6.0f, 17.5f)
                curveTo(6.73f, 18.34f, 7.8f, 19.0f, 9.0f, 19.0f)
                reflectiveCurveToRelative(2.27f, -0.66f, 3.0f, -1.5f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.5f, 3.0f, 1.5f)
                reflectiveCurveToRelative(2.26f, -0.66f, 3.0f, -1.5f)
                curveToRelative(0.45f, 0.51f, 1.02f, 0.96f, 1.67f, 1.23f)
                curveTo(20.84f, 17.84f, 21.69f, 16.53f, 22.0f, 15.0f)
                close()
                moveTo(22.0f, 23.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.04f, 0.0f, -2.08f, -0.35f, -3.0f, -1.0f)
                curveToRelative(-1.83f, 1.3f, -4.17f, 1.3f, -6.0f, 0.0f)
                curveToRelative(-1.83f, 1.3f, -4.17f, 1.3f, -6.0f, 0.0f)
                curveToRelative(-0.91f, 0.65f, -1.96f, 1.0f, -3.0f, 1.0f)
                horizontalLineTo(2.0f)
                lineToRelative(0.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.03f, 0.0f, 2.05f, -0.25f, 3.0f, -0.75f)
                curveToRelative(1.89f, 1.0f, 4.11f, 1.0f, 6.0f, 0.0f)
                curveToRelative(1.89f, 1.0f, 4.11f, 1.0f, 6.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.95f, 0.5f, 1.97f, 0.75f, 3.0f, 0.75f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _sailing!!
    }

private var _sailing: ImageVector? = null
