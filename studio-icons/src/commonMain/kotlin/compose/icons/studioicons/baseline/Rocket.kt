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

public val BaselineGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                curveToRelative(0.0f, 0.0f, 4.5f, 2.04f, 4.5f, 10.5f)
                curveToRelative(0.0f, 2.49f, -1.04f, 5.57f, -1.6f, 7.0f)
                horizontalLineTo(9.1f)
                curveToRelative(-0.56f, -1.43f, -1.6f, -4.51f, -1.6f, -7.0f)
                curveTo(7.5f, 4.54f, 12.0f, 2.5f, 12.0f, 2.5f)
                close()
                moveTo(14.0f, 11.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveTo(14.0f, 12.1f, 14.0f, 11.0f)
                close()
                moveTo(7.69f, 20.52f)
                curveToRelative(-0.48f, -1.23f, -1.52f, -4.17f, -1.67f, -6.87f)
                lineToRelative(-1.13f, 0.75f)
                curveTo(4.33f, 14.78f, 4.0f, 15.4f, 4.0f, 16.07f)
                verticalLineTo(22.0f)
                lineTo(7.69f, 20.52f)
                close()
                moveTo(20.0f, 22.0f)
                verticalLineToRelative(-5.93f)
                curveToRelative(0.0f, -0.67f, -0.33f, -1.29f, -0.89f, -1.66f)
                lineToRelative(-1.13f, -0.75f)
                curveToRelative(-0.15f, 2.69f, -1.2f, 5.64f, -1.67f, 6.87f)
                lineTo(20.0f, 22.0f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
