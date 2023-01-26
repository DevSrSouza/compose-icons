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

public val OutlineGroup.Dining: ImageVector
    get() {
        if (_dining != null) {
            return _dining!!
        }
        _dining = Builder(name = "Dining", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.75f, 6.0f)
                curveToRelative(-1.37f, 0.0f, -2.5f, 1.52f, -2.5f, 3.4f)
                curveToRelative(0.0f, 1.48f, 0.7f, 2.71f, 1.67f, 3.18f)
                lineTo(14.0f, 12.62f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-6.38f)
                lineToRelative(0.08f, -0.03f)
                curveToRelative(0.97f, -0.47f, 1.67f, -1.7f, 1.67f, -3.18f)
                curveTo(17.25f, 7.53f, 16.13f, 6.0f, 14.75f, 6.0f)
                moveTo(6.5f, 9.96f)
                moveTo(10.5f, 6.0f)
                curveTo(10.23f, 6.0f, 10.0f, 6.22f, 10.0f, 6.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.25f)
                verticalLineTo(6.5f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(6.5f)
                curveTo(7.5f, 6.22f, 7.28f, 6.0f, 7.0f, 6.0f)
                reflectiveCurveTo(6.5f, 6.22f, 6.5f, 6.5f)
                verticalLineToRelative(3.8f)
                curveToRelative(0.0f, 0.93f, 0.64f, 1.71f, 1.5f, 1.93f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-6.77f)
                curveToRelative(0.86f, -0.22f, 1.5f, -1.0f, 1.5f, -1.93f)
                verticalLineTo(6.5f)
                curveTo(11.0f, 6.22f, 10.78f, 6.0f, 10.5f, 6.0f)
                close()
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(4.0f)
                moveTo(20.0f, 2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _dining!!
    }

private var _dining: ImageVector? = null
