package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.MoreTime: ImageVector
    get() {
        if (_moreTime != null) {
            return _moreTime!!
        }
        _moreTime = Builder(name = "MoreTime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(4.7f, 2.9f)
                lineToRelative(0.8f, -1.2f)
                lineToRelative(-4.0f, -2.4f)
                lineToRelative(0.0f, -5.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.92f, 12.0f)
                curveToRelative(0.05f, 0.33f, 0.08f, 0.66f, 0.08f, 1.0f)
                curveToRelative(0.0f, 3.9f, -3.1f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.1f, -7.0f, -7.0f)
                curveToRelative(0.0f, -3.9f, 3.1f, -7.0f, 7.0f, -7.0f)
                curveToRelative(0.7f, 0.0f, 1.37f, 0.1f, 2.0f, 0.29f)
                verticalLineTo(4.23f)
                curveTo(12.36f, 4.08f, 11.69f, 4.0f, 11.0f, 4.0f)
                curveToRelative(-5.0f, 0.0f, -9.0f, 4.0f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.0f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.0f, 9.0f, -9.0f)
                curveToRelative(0.0f, -0.34f, -0.02f, -0.67f, -0.06f, -1.0f)
                horizontalLineTo(17.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _moreTime!!
    }

private var _moreTime: ImageVector? = null
