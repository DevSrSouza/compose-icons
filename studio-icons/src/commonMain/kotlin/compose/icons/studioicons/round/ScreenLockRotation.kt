package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.ScreenLockRotation: ImageVector
    get() {
        if (_screenLockRotation != null) {
            return _screenLockRotation!!
        }
        _screenLockRotation = Builder(name = "ScreenLockRotation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.41f, 11.36f)
                lineToRelative(-0.35f, -0.35f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(19.0f, 12.77f)
                lineToRelative(-4.24f, 4.24f)
                lineTo(6.98f, 9.23f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(0.35f, 0.35f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-0.35f, -0.36f)
                curveToRelative(-0.79f, -0.79f, -2.03f, -0.79f, -2.82f, 0.0f)
                lineTo(5.57f, 7.82f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f)
                lineToRelative(7.78f, 7.78f)
                curveToRelative(0.79f, 0.79f, 2.03f, 0.79f, 2.82f, 0.0f)
                lineToRelative(4.24f, -4.24f)
                curveTo(21.2f, 13.41f, 21.2f, 12.14f, 20.41f, 11.36f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.85f, 17.85f)
                curveTo(10.54f, 17.54f, 10.0f, 17.76f, 10.0f, 18.21f)
                verticalLineToRelative(1.53f)
                curveToRelative(-3.17f, -0.82f, -5.59f, -3.54f, -5.95f, -6.86f)
                curveTo(3.99f, 12.37f, 3.56f, 12.0f, 3.06f, 12.0f)
                curveToRelative(-0.6f, 0.0f, -1.07f, 0.53f, -1.0f, 1.12f)
                curveTo(2.62f, 18.11f, 6.87f, 22.0f, 12.0f, 22.0f)
                curveToRelative(0.59f, 0.0f, 1.17f, -0.06f, 1.73f, -0.16f)
                curveToRelative(0.4f, -0.07f, 0.55f, -0.56f, 0.27f, -0.85f)
                lineTo(10.85f, 17.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                verticalLineTo(3.11f)
                curveToRelative(0.0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f)
                curveTo(17.08f, 0.82f, 16.0f, 1.79f, 16.0f, 3.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveTo(15.0f, 8.55f, 15.45f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(17.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _screenLockRotation!!
    }

private var _screenLockRotation: ImageVector? = null
