package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.FlagCircle: ImageVector
    get() {
        if (_flagCircle != null) {
            return _flagCircle!!
        }
        _flagCircle = Builder(name = "FlagCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f)
                reflectiveCurveTo(16.41f, 20.0f, 12.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                lineToRelative(-1.0f, -2.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineTo(12.0f)
                lineToRelative(1.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(16.5f, 13.5f)
                horizontalLineToRelative(-2.57f)
                lineToRelative(-1.0f, -2.0f)
                horizontalLineTo(9.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.57f)
                lineToRelative(1.0f, 2.0f)
                horizontalLineToRelative(2.43f)
                verticalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _flagCircle!!
    }

private var _flagCircle: ImageVector? = null
