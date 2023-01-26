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

public val RoundGroup.Token: ImageVector
    get() {
        if (_token != null) {
            return _token!!
        }
        _token = Builder(name = "Token", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.97f, 2.54f)
                curveToRelative(-0.6f, -0.34f, -1.34f, -0.34f, -1.94f, 0.0f)
                lineToRelative(-7.0f, 3.89f)
                lineTo(9.1f, 9.24f)
                curveTo(9.83f, 8.48f, 10.86f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveToRelative(2.17f, 0.48f, 2.9f, 1.24f)
                lineToRelative(5.07f, -2.82f)
                lineTo(12.97f, 2.54f)
                close()
                moveTo(10.0f, 12.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(10.0f, 13.1f, 10.0f, 12.0f)
                close()
                moveTo(3.0f, 8.14f)
                lineToRelative(5.13f, 2.85f)
                curveTo(8.04f, 11.31f, 8.0f, 11.65f, 8.0f, 12.0f)
                curveToRelative(0.0f, 1.86f, 1.27f, 3.43f, 3.0f, 3.87f)
                verticalLineToRelative(5.57f)
                lineToRelative(-6.97f, -3.87f)
                curveTo(3.39f, 17.22f, 3.0f, 16.55f, 3.0f, 15.82f)
                verticalLineTo(8.14f)
                close()
                moveTo(13.0f, 21.44f)
                verticalLineToRelative(-5.57f)
                curveToRelative(1.73f, -0.44f, 3.0f, -2.01f, 3.0f, -3.87f)
                curveToRelative(0.0f, -0.35f, -0.04f, -0.69f, -0.13f, -1.01f)
                lineTo(21.0f, 8.14f)
                lineToRelative(0.0f, 7.68f)
                curveToRelative(0.0f, 0.73f, -0.39f, 1.4f, -1.03f, 1.75f)
                lineTo(13.0f, 21.44f)
                close()
            }
        }
        .build()
        return _token!!
    }

private var _token: ImageVector? = null
