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

public val OutlineGroup.TempleBuddhist: ImageVector
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
                horizontalLineTo(18.0f)
                verticalLineTo(8.86f)
                curveToRelative(1.72f, -0.44f, 3.0f, -1.99f, 3.0f, -3.84f)
                verticalLineTo(5.0f)
                lineToRelative(-2.0f, 0.02f)
                curveTo(19.0f, 6.11f, 18.11f, 7.0f, 17.02f, 7.0f)
                horizontalLineTo(16.5f)
                lineTo(12.0f, 1.0f)
                lineTo(7.5f, 7.0f)
                horizontalLineTo(6.98f)
                curveTo(5.89f, 7.0f, 5.0f, 6.11f, 5.0f, 5.02f)
                horizontalLineTo(3.0f)
                curveToRelative(0.0f, 1.86f, 1.28f, 3.4f, 3.0f, 3.84f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.98f)
                curveTo(3.89f, 11.0f, 3.0f, 10.11f, 3.0f, 9.02f)
                horizontalLineTo(1.0f)
                curveToRelative(0.0f, 1.86f, 1.28f, 3.4f, 3.0f, 3.84f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-9.14f)
                curveToRelative(1.72f, -0.44f, 3.0f, -1.99f, 3.0f, -3.84f)
                verticalLineTo(9.0f)
                lineTo(21.0f, 9.02f)
                close()
                moveTo(12.0f, 4.33f)
                lineTo(14.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(12.0f, 4.33f)
                close()
                moveTo(8.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(18.0f, 20.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _templeBuddhist!!
    }

private var _templeBuddhist: ImageVector? = null
