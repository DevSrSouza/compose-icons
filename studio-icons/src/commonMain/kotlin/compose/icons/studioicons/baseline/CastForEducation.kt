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

public val BaselineGroup.CastForEducation: ImageVector
    get() {
        if (_castForEducation != null) {
            return _castForEducation!!
        }
        _castForEducation = Builder(name = "CastForEducation", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 3.0f, 1.0f, 3.9f, 1.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 3.9f, 22.1f, 3.0f, 21.0f, 3.0f)
                close()
                moveTo(1.0f, 18.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                curveTo(4.0f, 19.34f, 2.66f, 18.0f, 1.0f, 18.0f)
                close()
                moveTo(1.0f, 14.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveTo(8.0f, 17.13f, 4.87f, 14.0f, 1.0f, 14.0f)
                close()
                moveTo(1.0f, 10.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(4.97f, 0.0f, 9.0f, 4.03f, 9.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                curveTo(12.0f, 14.92f, 7.07f, 10.0f, 1.0f, 10.0f)
                close()
                moveTo(11.0f, 11.09f)
                verticalLineToRelative(2.0f)
                lineTo(14.5f, 15.0f)
                lineToRelative(3.5f, -1.91f)
                verticalLineToRelative(-2.0f)
                lineTo(14.5f, 13.0f)
                lineTo(11.0f, 11.09f)
                close()
                moveTo(14.5f, 6.0f)
                lineTo(9.0f, 9.0f)
                lineToRelative(5.5f, 3.0f)
                lineTo(20.0f, 9.0f)
                lineTo(14.5f, 6.0f)
                close()
            }
        }
        .build()
        return _castForEducation!!
    }

private var _castForEducation: ImageVector? = null
