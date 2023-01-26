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

public val RoundGroup.Cable: ImageVector
    get() {
        if (_cable != null) {
            return _cable!!
        }
        _cable = Builder(name = "Cable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.0f, 6.91f)
                curveToRelative(0.0f, 1.04f, -0.76f, 1.98f, -1.79f, 2.08f)
                curveTo(14.01f, 19.11f, 13.0f, 18.17f, 13.0f, 17.0f)
                lineToRelative(0.0f, -9.86f)
                curveToRelative(0.0f, -2.13f, -1.61f, -3.99f, -3.74f, -4.13f)
                curveTo(6.93f, 2.86f, 5.0f, 4.7f, 5.0f, 7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(7.0f)
                lineToRelative(0.0f, -6.91f)
                curveToRelative(0.0f, -1.04f, 0.76f, -1.98f, 1.79f, -2.08f)
                curveTo(9.99f, 4.89f, 11.0f, 5.83f, 11.0f, 7.0f)
                lineToRelative(0.0f, 9.86f)
                curveToRelative(0.0f, 2.13f, 1.61f, 3.99f, 3.74f, 4.13f)
                curveTo(17.07f, 21.14f, 19.0f, 19.3f, 19.0f, 17.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 5.45f, 20.55f, 5.0f, 20.0f, 5.0f)
                lineTo(20.0f, 5.0f)
                close()
            }
        }
        .build()
        return _cable!!
    }

private var _cable: ImageVector? = null
