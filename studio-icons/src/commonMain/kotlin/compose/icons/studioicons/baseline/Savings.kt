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

public val BaselineGroup.Savings: ImageVector
    get() {
        if (_savings != null) {
            return _savings!!
        }
        _savings = Builder(name = "Savings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.83f, 7.5f)
                lineToRelative(-2.27f, -2.27f)
                curveToRelative(0.07f, -0.42f, 0.18f, -0.81f, 0.32f, -1.15f)
                curveTo(17.96f, 3.9f, 18.0f, 3.71f, 18.0f, 3.5f)
                curveTo(18.0f, 2.67f, 17.33f, 2.0f, 16.5f, 2.0f)
                curveToRelative(-1.64f, 0.0f, -3.09f, 0.79f, -4.0f, 2.0f)
                lineToRelative(-5.0f, 0.0f)
                curveTo(4.46f, 4.0f, 2.0f, 6.46f, 2.0f, 9.5f)
                reflectiveCurveTo(4.5f, 21.0f, 4.5f, 21.0f)
                lineToRelative(5.5f, 0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(5.5f, 0.0f)
                lineToRelative(1.68f, -5.59f)
                lineTo(22.0f, 14.47f)
                verticalLineTo(7.5f)
                horizontalLineTo(19.83f)
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                curveTo(17.0f, 10.55f, 16.55f, 11.0f, 16.0f, 11.0f)
                close()
            }
        }
        .build()
        return _savings!!
    }

private var _savings: ImageVector? = null
