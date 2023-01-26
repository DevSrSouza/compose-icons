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

public val RoundGroup.LinearScale: ImageVector
    get() {
        if (_linearScale != null) {
            return _linearScale!!
        }
        _linearScale = Builder(name = "LinearScale", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 7.0f)
                curveToRelative(-2.41f, 0.0f, -4.43f, 1.72f, -4.9f, 4.0f)
                horizontalLineTo(6.79f)
                curveTo(6.4f, 10.12f, 5.52f, 9.5f, 4.5f, 9.5f)
                curveTo(3.12f, 9.5f, 2.0f, 10.62f, 2.0f, 12.0f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                curveToRelative(1.02f, 0.0f, 1.9f, -0.62f, 2.29f, -1.5f)
                horizontalLineToRelative(5.31f)
                curveToRelative(0.46f, 2.28f, 2.48f, 4.0f, 4.9f, 4.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(19.76f, 7.0f, 17.0f, 7.0f)
                close()
                moveTo(17.0f, 15.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f)
                reflectiveCurveTo(18.65f, 15.0f, 17.0f, 15.0f)
                close()
            }
        }
        .build()
        return _linearScale!!
    }

private var _linearScale: ImageVector? = null
