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

public val RoundGroup.Tonality: ImageVector
    get() {
        if (_tonality != null) {
            return _tonality!!
        }
        _tonality = Builder(name = "Tonality", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(11.0f, 19.93f)
                curveToRelative(-3.94f, -0.49f, -7.0f, -3.85f, -7.0f, -7.93f)
                reflectiveCurveToRelative(3.05f, -7.44f, 7.0f, -7.93f)
                verticalLineToRelative(15.86f)
                close()
                moveTo(13.0f, 4.07f)
                curveToRelative(1.03f, 0.13f, 2.0f, 0.45f, 2.87f, 0.93f)
                lineTo(13.0f, 5.0f)
                verticalLineToRelative(-0.93f)
                close()
                moveTo(13.0f, 7.0f)
                horizontalLineToRelative(5.24f)
                curveToRelative(0.25f, 0.31f, 0.48f, 0.65f, 0.68f, 1.0f)
                lineTo(13.0f, 8.0f)
                lineTo(13.0f, 7.0f)
                close()
                moveTo(13.0f, 10.0f)
                horizontalLineToRelative(6.74f)
                curveToRelative(0.08f, 0.33f, 0.15f, 0.66f, 0.19f, 1.0f)
                lineTo(13.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(13.0f, 19.93f)
                lineTo(13.0f, 19.0f)
                horizontalLineToRelative(2.87f)
                curveToRelative(-0.87f, 0.48f, -1.84f, 0.8f, -2.87f, 0.93f)
                close()
                moveTo(18.24f, 17.0f)
                lineTo(13.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.92f)
                curveToRelative(-0.2f, 0.35f, -0.43f, 0.69f, -0.68f, 1.0f)
                close()
                moveTo(19.74f, 14.0f)
                lineTo(13.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.93f)
                curveToRelative(-0.04f, 0.34f, -0.11f, 0.67f, -0.19f, 1.0f)
                close()
            }
        }
        .build()
        return _tonality!!
    }

private var _tonality: ImageVector? = null
