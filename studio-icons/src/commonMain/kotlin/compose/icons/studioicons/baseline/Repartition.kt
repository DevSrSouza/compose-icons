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

public val BaselineGroup.Repartition: ImageVector
    get() {
        if (_repartition != null) {
            return _repartition!!
        }
        _repartition = Builder(name = "Repartition", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 21.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(10.33f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.33f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(10.33f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(-3.33f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(5.0f, 17.0f)
                horizontalLineToRelative(3.33f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                lineToRelative(1.42f, -1.42f)
                lineTo(5.83f, 7.0f)
                horizontalLineTo(17.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f)
                horizontalLineTo(5.83f)
                lineToRelative(1.59f, -1.59f)
                lineTo(6.0f, 2.0f)
                lineTo(2.0f, 6.0f)
                lineTo(6.0f, 10.0f)
                close()
            }
        }
        .build()
        return _repartition!!
    }

private var _repartition: ImageVector? = null
