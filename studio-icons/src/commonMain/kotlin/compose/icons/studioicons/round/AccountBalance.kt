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

public val RoundGroup.AccountBalance: ImageVector
    get() {
        if (_accountBalance != null) {
            return _accountBalance!!
        }
        _accountBalance = Builder(name = "AccountBalance", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 11.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveTo(7.0f, 16.33f, 7.0f, 15.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveTo(4.0f, 10.67f, 4.0f, 11.5f)
                close()
                moveTo(10.0f, 11.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(3.5f, 22.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveTo(2.67f, 22.0f, 3.5f, 22.0f)
                close()
                moveTo(16.0f, 11.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(10.57f, 1.49f)
                lineToRelative(-7.9f, 4.16f)
                curveToRelative(-0.41f, 0.21f, -0.67f, 0.64f, -0.67f, 1.1f)
                curveTo(2.0f, 7.44f, 2.56f, 8.0f, 3.25f, 8.0f)
                horizontalLineToRelative(16.51f)
                curveTo(20.44f, 8.0f, 21.0f, 7.44f, 21.0f, 6.75f)
                curveToRelative(0.0f, -0.46f, -0.26f, -0.89f, -0.67f, -1.1f)
                lineToRelative(-7.9f, -4.16f)
                curveToRelative(-0.58f, -0.31f, -1.28f, -0.31f, -1.86f, 0.0f)
                close()
            }
        }
        .build()
        return _accountBalance!!
    }

private var _accountBalance: ImageVector? = null
