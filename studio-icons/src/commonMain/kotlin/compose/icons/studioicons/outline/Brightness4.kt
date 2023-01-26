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

public val OutlineGroup.Brightness4: ImageVector
    get() {
        if (_brightness4 != null) {
            return _brightness4!!
        }
        _brightness4 = Builder(name = "Brightness4", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.69f)
                lineTo(20.0f, 4.0f)
                horizontalLineToRelative(-4.69f)
                lineTo(12.0f, 0.69f)
                lineTo(8.69f, 4.0f)
                lineTo(4.0f, 4.0f)
                verticalLineToRelative(4.69f)
                lineTo(0.69f, 12.0f)
                lineTo(4.0f, 15.31f)
                lineTo(4.0f, 20.0f)
                horizontalLineToRelative(4.69f)
                lineTo(12.0f, 23.31f)
                lineTo(15.31f, 20.0f)
                lineTo(20.0f, 20.0f)
                verticalLineToRelative(-4.69f)
                lineTo(23.31f, 12.0f)
                lineTo(20.0f, 8.69f)
                close()
                moveTo(18.0f, 14.48f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(-3.52f)
                lineTo(12.0f, 20.48f)
                lineTo(9.52f, 18.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(-3.52f)
                lineTo(3.52f, 12.0f)
                lineTo(6.0f, 9.52f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(3.52f)
                lineTo(12.0f, 3.52f)
                lineTo(14.48f, 6.0f)
                lineTo(18.0f, 6.0f)
                verticalLineToRelative(3.52f)
                lineTo(20.48f, 12.0f)
                lineTo(18.0f, 14.48f)
                close()
                moveTo(12.29f, 7.0f)
                curveToRelative(-0.74f, 0.0f, -1.45f, 0.17f, -2.08f, 0.46f)
                curveToRelative(1.72f, 0.79f, 2.92f, 2.53f, 2.92f, 4.54f)
                reflectiveCurveToRelative(-1.2f, 3.75f, -2.92f, 4.54f)
                curveToRelative(0.63f, 0.29f, 1.34f, 0.46f, 2.08f, 0.46f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _brightness4!!
    }

private var _brightness4: ImageVector? = null
