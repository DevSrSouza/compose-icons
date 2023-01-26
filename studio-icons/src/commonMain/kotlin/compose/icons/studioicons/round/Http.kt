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

public val RoundGroup.Http: ImageVector
    get() {
        if (_http != null) {
            return _http!!
        }
        _http = Builder(name = "Http", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 11.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(2.5f, 9.75f)
                curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                reflectiveCurveTo(1.0f, 9.34f, 1.0f, 9.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(2.5f, 12.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-4.5f)
                curveTo(6.0f, 9.34f, 5.66f, 9.0f, 5.25f, 9.0f)
                reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f)
                lineTo(4.5f, 11.0f)
                close()
                moveTo(7.75f, 10.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(3.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(10.0f, 10.5f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveTo(11.16f, 9.0f, 10.75f, 9.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f)
                reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                close()
                moveTo(13.25f, 10.5f)
                lineTo(14.0f, 10.5f)
                verticalLineToRelative(3.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(15.5f, 10.5f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveTo(16.66f, 9.0f, 16.25f, 9.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f)
                reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                close()
                moveTo(21.5f, 9.0f)
                lineTo(19.0f, 9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.25f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(19.5f, 13.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.68f, 1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.82f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(21.5f, 11.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _http!!
    }

private var _http: ImageVector? = null
