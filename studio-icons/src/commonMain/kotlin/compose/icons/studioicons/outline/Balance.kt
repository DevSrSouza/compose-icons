package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Balance: ImageVector
    get() {
        if (_balance != null) {
            return _balance!!
        }
        _balance = Builder(name = "Balance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.83f)
                curveToRelative(0.85f, -0.3f, 1.53f, -0.98f, 1.83f, -1.83f)
                horizontalLineTo(18.0f)
                lineToRelative(-3.0f, 7.0f)
                curveToRelative(0.0f, 1.66f, 1.57f, 3.0f, 3.5f, 3.0f)
                reflectiveCurveToRelative(3.5f, -1.34f, 3.5f, -3.0f)
                lineToRelative(-3.0f, -7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-6.17f)
                curveTo(14.42f, 2.83f, 13.31f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(9.58f, 2.83f, 9.17f, 4.0f)
                lineTo(3.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-3.0f, 7.0f)
                curveToRelative(0.0f, 1.66f, 1.57f, 3.0f, 3.5f, 3.0f)
                reflectiveCurveTo(9.0f, 14.66f, 9.0f, 13.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(3.17f)
                curveToRelative(0.3f, 0.85f, 0.98f, 1.53f, 1.83f, 1.83f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineTo(7.83f)
                close()
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
