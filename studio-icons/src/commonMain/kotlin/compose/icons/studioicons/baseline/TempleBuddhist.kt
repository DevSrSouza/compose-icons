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

public val BaselineGroup.TempleBuddhist: ImageVector
    get() {
        if (_templeBuddhist != null) {
            return _templeBuddhist!!
        }
        _templeBuddhist = Builder(name = "TempleBuddhist", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.02f)
                curveToRelative(0.0f, 1.09f, -0.89f, 1.98f, -1.98f, 1.98f)
                horizontalLineTo(4.98f)
                curveTo(3.89f, 11.0f, 3.0f, 10.11f, 3.0f, 9.02f)
                horizontalLineTo(1.0f)
                curveToRelative(0.0f, 1.86f, 1.28f, 3.4f, 3.0f, 3.84f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-9.14f)
                curveToRelative(0.55f, -0.14f, 3.0f, -1.04f, 3.0f, -3.86f)
                lineTo(21.0f, 9.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 8.86f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(8.86f)
                curveToRelative(0.55f, -0.14f, 3.0f, -1.04f, 3.0f, -3.86f)
                lineToRelative(-2.0f, 0.02f)
                curveTo(19.0f, 6.11f, 18.11f, 7.0f, 17.02f, 7.0f)
                horizontalLineTo(6.98f)
                curveTo(5.89f, 7.0f, 5.0f, 6.11f, 5.0f, 5.02f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 6.87f, 4.28f, 8.42f, 6.0f, 8.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineToRelative(-3.75f, 5.0f)
                lineToRelative(7.5f, 0.0f)
                close()
            }
        }
        .build()
        return _templeBuddhist!!
    }

private var _templeBuddhist: ImageVector? = null
