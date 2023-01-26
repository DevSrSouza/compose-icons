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

public val RoundGroup.ScreenRotationAlt: ImageVector
    get() {
        if (_screenRotationAlt != null) {
            return _screenRotationAlt!!
        }
        _screenRotationAlt = Builder(name = "ScreenRotationAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.53f, 9.29f)
                curveTo(19.16f, 9.92f, 18.71f, 11.0f, 17.82f, 11.0f)
                curveToRelative(-0.27f, 0.0f, -0.52f, -0.11f, -0.71f, -0.29f)
                lineTo(10.4f, 4.0f)
                lineTo(5.41f, 9.0f)
                horizontalLineTo(7.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.59f)
                lineToRelative(5.0f, -5.0f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f)
                lineTo(18.53f, 9.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.47f, 14.71f)
                curveTo(4.84f, 14.08f, 5.29f, 13.0f, 6.18f, 13.0f)
                curveToRelative(0.27f, 0.0f, 0.52f, 0.11f, 0.71f, 0.29f)
                lineTo(13.6f, 20.0f)
                lineToRelative(4.99f, -5.0f)
                horizontalLineTo(17.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-1.59f)
                lineToRelative(-5.0f, 5.0f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f)
                lineTo(5.47f, 14.71f)
                close()
            }
        }
        .build()
        return _screenRotationAlt!!
    }

private var _screenRotationAlt: ImageVector? = null
