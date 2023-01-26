package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.LocalCarWash: ImageVector
    get() {
        if (_localCarWash != null) {
            return _localCarWash!!
        }
        _localCarWash = Builder(name = "LocalCarWash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.58f, 7.0f)
                lineTo(5.43f, 7.0f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-9.0f)
                lineToRelative(-2.42f, -7.0f)
                close()
                moveTo(6.5f, 18.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(5.67f, 15.0f, 6.5f, 15.0f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(7.33f, 18.0f, 6.5f, 18.0f)
                close()
                moveTo(17.5f, 18.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(5.0f, 13.0f)
                lineToRelative(1.5f, -4.5f)
                horizontalLineToRelative(11.0f)
                lineTo(19.0f, 13.0f)
                lineTo(5.0f, 13.0f)
                close()
                moveTo(17.0f, 5.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0.0f, -1.0f, -1.5f, -2.7f, -1.5f, -2.7f)
                reflectiveCurveToRelative(-1.5f, 1.7f, -1.5f, 2.7f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0.0f, -1.0f, -1.5f, -2.7f, -1.5f, -2.7f)
                reflectiveCurveToRelative(-1.5f, 1.7f, -1.5f, 2.7f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(7.0f, 5.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveTo(8.5f, 2.5f, 7.0f, 0.8f, 7.0f, 0.8f)
                reflectiveCurveTo(5.5f, 2.5f, 5.5f, 3.5f)
                curveTo(5.5f, 4.33f, 6.17f, 5.0f, 7.0f, 5.0f)
                close()
            }
        }
        .build()
        return _localCarWash!!
    }

private var _localCarWash: ImageVector? = null
