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

public val RoundGroup.Brightness4: ImageVector
    get() {
        if (_brightness4 != null) {
            return _brightness4!!
        }
        _brightness4 = Builder(name = "Brightness4", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.6f, 11.29f)
                lineTo(20.0f, 8.69f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.69f)
                lineToRelative(-2.6f, -2.6f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineTo(8.69f, 4.0f)
                horizontalLineTo(5.0f)
                curveTo(4.45f, 4.0f, 4.0f, 4.45f, 4.0f, 5.0f)
                verticalLineToRelative(3.69f)
                lineToRelative(-2.6f, 2.6f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(4.0f, 15.3f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.69f)
                lineToRelative(2.6f, 2.6f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(2.6f, -2.6f)
                horizontalLineTo(19.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.69f)
                lineToRelative(2.6f, -2.6f)
                curveTo(22.99f, 12.32f, 22.99f, 11.68f, 22.6f, 11.29f)
                close()
                moveTo(17.92f, 12.98f)
                curveToRelative(-0.34f, 2.12f, -1.85f, 3.94f, -3.88f, 4.66f)
                curveToRelative(-1.21f, 0.43f, -2.41f, 0.45f, -3.5f, 0.18f)
                curveToRelative(-0.41f, -0.1f, -0.48f, -0.65f, -0.13f, -0.9f)
                curveTo(11.98f, 15.84f, 13.0f, 14.04f, 13.0f, 12.0f)
                reflectiveCurveToRelative(-1.02f, -3.84f, -2.58f, -4.92f)
                curveToRelative(-0.35f, -0.24f, -0.29f, -0.79f, 0.13f, -0.9f)
                curveToRelative(1.09f, -0.27f, 2.29f, -0.25f, 3.5f, 0.18f)
                curveToRelative(2.02f, 0.72f, 3.54f, 2.54f, 3.88f, 4.66f)
                curveTo(17.98f, 11.35f, 18.0f, 11.68f, 18.0f, 12.0f)
                curveTo(17.99f, 12.32f, 17.97f, 12.65f, 17.92f, 12.98f)
                close()
            }
        }
        .build()
        return _brightness4!!
    }

private var _brightness4: ImageVector? = null
