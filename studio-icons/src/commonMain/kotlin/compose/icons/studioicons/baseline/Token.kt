package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Token: ImageVector
    get() {
        if (_token != null) {
            return _token!!
        }
        _token = Builder(name = "Token", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.97f, 6.43f)
                lineTo(12.0f, 2.0f)
                lineTo(4.03f, 6.43f)
                lineTo(9.1f, 9.24f)
                curveTo(9.83f, 8.48f, 10.86f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveToRelative(2.17f, 0.48f, 2.9f, 1.24f)
                lineTo(19.97f, 6.43f)
                close()
                moveTo(10.0f, 12.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(10.0f, 13.1f, 10.0f, 12.0f)
                close()
                moveTo(11.0f, 21.44f)
                lineTo(3.0f, 17.0f)
                verticalLineTo(8.14f)
                lineToRelative(5.13f, 2.85f)
                curveTo(8.04f, 11.31f, 8.0f, 11.65f, 8.0f, 12.0f)
                curveToRelative(0.0f, 1.86f, 1.27f, 3.43f, 3.0f, 3.87f)
                verticalLineTo(21.44f)
                close()
                moveTo(13.0f, 21.44f)
                verticalLineToRelative(-5.57f)
                curveToRelative(1.73f, -0.44f, 3.0f, -2.01f, 3.0f, -3.87f)
                curveToRelative(0.0f, -0.35f, -0.04f, -0.69f, -0.13f, -1.01f)
                lineTo(21.0f, 8.14f)
                lineTo(21.0f, 17.0f)
                lineTo(13.0f, 21.44f)
                close()
            }
        }
        .build()
        return _token!!
    }

private var _token: ImageVector? = null
