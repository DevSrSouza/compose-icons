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

public val BaselineGroup.AutoDelete: ImageVector
    get() {
        if (_autoDelete != null) {
            return _autoDelete!!
        }
        _autoDelete = Builder(name = "AutoDelete", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                lineToRelative(-3.5f, 0.0f)
                lineToRelative(-1.0f, -1.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(-3.5f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(14.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                curveToRelative(-0.7f, 0.0f, -1.37f, 0.1f, -2.0f, 0.29f)
                verticalLineTo(5.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(5.68f)
                curveToRelative(1.12f, 2.36f, 3.53f, 4.0f, 6.32f, 4.0f)
                curveToRelative(3.87f, 0.0f, 7.0f, -3.13f, 7.0f, -7.0f)
                curveTo(23.0f, 12.13f, 19.87f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(16.0f, 21.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveTo(18.76f, 21.0f, 16.0f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 12.0f)
                lineToRelative(-1.5f, 0.0f)
                lineToRelative(0.0f, 5.0f)
                lineToRelative(3.6f, 2.1f)
                lineToRelative(0.8f, -1.2f)
                lineToRelative(-2.9f, -1.7f)
                close()
            }
        }
        .build()
        return _autoDelete!!
    }

private var _autoDelete: ImageVector? = null
