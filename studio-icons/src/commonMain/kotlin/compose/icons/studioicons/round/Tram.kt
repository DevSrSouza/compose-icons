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

public val RoundGroup.Tram: ImageVector
    get() {
        if (_tram != null) {
            return _tram!!
        }
        _tram = Builder(name = "Tram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.0f)
                lineToRelative(0.75f, -1.5f)
                lineTo(17.0f, 3.5f)
                lineTo(17.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(4.75f)
                lineTo(11.0f, 5.0f)
                curveToRelative(-3.13f, 0.09f, -6.0f, 0.73f, -6.0f, 3.5f)
                lineTo(5.0f, 17.0f)
                curveToRelative(0.0f, 1.5f, 1.11f, 2.73f, 2.55f, 2.95f)
                lineToRelative(-1.19f, 1.19f)
                curveToRelative(-0.32f, 0.32f, -0.1f, 0.86f, 0.35f, 0.86f)
                lineTo(7.8f, 22.0f)
                curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f)
                lineTo(10.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(1.85f, 1.85f)
                curveToRelative(0.09f, 0.09f, 0.22f, 0.15f, 0.35f, 0.15f)
                horizontalLineToRelative(1.09f)
                curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f)
                lineToRelative(-1.19f, -1.19f)
                curveTo(17.89f, 19.73f, 19.0f, 18.5f, 19.0f, 17.0f)
                lineTo(19.0f, 8.5f)
                curveToRelative(0.0f, -2.77f, -2.87f, -3.41f, -6.0f, -3.5f)
                close()
                moveTo(12.0f, 18.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                lineTo(7.0f, 9.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _tram!!
    }

private var _tram: ImageVector? = null
