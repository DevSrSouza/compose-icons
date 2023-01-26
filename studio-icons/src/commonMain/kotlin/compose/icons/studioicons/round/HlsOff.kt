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

public val RoundGroup.HlsOff: ImageVector
    get() {
        if (_hlsOff != null) {
            return _hlsOff!!
        }
        _hlsOff = Builder(name = "HlsOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.83f, 15.0f)
                horizontalLineToRelative(1.67f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(2.04f, 0.0f)
                curveToRelative(0.1f, 0.29f, 0.38f, 0.5f, 0.71f, 0.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(10.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.04f)
                verticalLineToRelative(0.0f)
                curveToRelative(-0.1f, -0.29f, -0.38f, -0.5f, -0.71f, -0.5f)
                curveToRelative(-0.12f, 0.0f, -0.24f, 0.03f, -0.34f, 0.08f)
                lineTo(17.83f, 15.0f)
                close()
                moveTo(19.07f, 21.9f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(3.51f, 3.51f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(4.48f, 4.48f)
                curveTo(6.53f, 9.51f, 6.5f, 9.63f, 6.5f, 9.75f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(9.75f)
                curveTo(4.5f, 9.34f, 4.16f, 9.0f, 3.75f, 9.0f)
                reflectiveCurveTo(3.0f, 9.34f, 3.0f, 9.75f)
                verticalLineToRelative(4.5f)
                curveTo(3.0f, 14.66f, 3.34f, 15.0f, 3.75f, 15.0f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(12.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.75f)
                curveTo(6.5f, 14.66f, 6.84f, 15.0f, 7.25f, 15.0f)
                reflectiveCurveTo(8.0f, 14.66f, 8.0f, 14.25f)
                verticalLineToRelative(-3.42f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(14.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.17f)
                lineTo(19.07f, 21.9f)
                close()
            }
        }
        .build()
        return _hlsOff!!
    }

private var _hlsOff: ImageVector? = null
