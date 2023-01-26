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

public val RoundGroup.Balance: ImageVector
    get() {
        if (_balance != null) {
            return _balance!!
        }
        _balance = Builder(name = "Balance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                verticalLineTo(7.83f)
                curveToRelative(0.85f, -0.3f, 1.53f, -0.98f, 1.83f, -1.83f)
                horizontalLineTo(18.0f)
                lineToRelative(-2.78f, 6.49f)
                curveToRelative(-0.17f, 0.39f, -0.23f, 0.84f, -0.11f, 1.25f)
                curveToRelative(0.39f, 1.3f, 1.76f, 2.26f, 3.39f, 2.26f)
                reflectiveCurveToRelative(3.01f, -0.96f, 3.39f, -2.26f)
                curveToRelative(0.12f, -0.41f, 0.06f, -0.86f, -0.11f, -1.25f)
                lineTo(19.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-5.17f)
                curveTo(14.42f, 2.83f, 13.31f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(9.58f, 2.83f, 9.17f, 4.0f)
                lineTo(4.0f, 4.0f)
                curveTo(3.45f, 4.0f, 3.0f, 4.45f, 3.0f, 5.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(-2.78f, 6.49f)
                curveToRelative(-0.17f, 0.39f, -0.23f, 0.84f, -0.11f, 1.25f)
                curveTo(2.49f, 15.04f, 3.87f, 16.0f, 5.5f, 16.0f)
                reflectiveCurveToRelative(3.01f, -0.96f, 3.39f, -2.26f)
                curveToRelative(0.12f, -0.41f, 0.06f, -0.86f, -0.11f, -1.25f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(3.17f)
                curveToRelative(0.3f, 0.85f, 0.98f, 1.53f, 1.83f, 1.83f)
                verticalLineTo(19.0f)
                moveTo(11.0f, 19.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-8.0f)
                moveTo(20.37f, 13.0f)
                horizontalLineToRelative(-3.74f)
                lineToRelative(1.87f, -4.36f)
                lineTo(20.37f, 13.0f)
                close()
                moveTo(7.37f, 13.0f)
                horizontalLineTo(3.63f)
                lineTo(5.5f, 8.64f)
                lineTo(7.37f, 13.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                curveTo(13.0f, 5.55f, 12.55f, 6.0f, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _balance!!
    }

private var _balance: ImageVector? = null
