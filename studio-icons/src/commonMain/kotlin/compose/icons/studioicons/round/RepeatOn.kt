package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.RepeatOn: ImageVector
    get() {
        if (_repeatOn != null) {
            return _repeatOn!!
        }
        _repeatOn = Builder(name = "RepeatOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 1.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 1.0f, 1.0f, 1.9f, 1.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(3.0f)
                curveTo(23.0f, 1.9f, 22.1f, 1.0f, 21.0f, 1.0f)
                close()
                moveTo(19.0f, 18.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(1.79f)
                curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.36f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f)
                lineToRelative(2.79f, -2.79f)
                curveTo(6.46f, 14.54f, 7.0f, 14.76f, 7.0f, 15.21f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(20.64f, 6.35f)
                lineToRelative(-2.79f, 2.79f)
                curveTo(17.54f, 9.46f, 17.0f, 9.24f, 17.0f, 8.79f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(11.0f)
                verticalLineTo(3.21f)
                curveToRelative(0.0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.36f)
                lineToRelative(2.79f, 2.79f)
                curveTo(20.84f, 5.84f, 20.84f, 6.15f, 20.64f, 6.35f)
                close()
            }
        }
        .build()
        return _repeatOn!!
    }

private var _repeatOn: ImageVector? = null
