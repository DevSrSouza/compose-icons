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

public val RoundGroup.Tapas: ImageVector
    get() {
        if (_tapas != null) {
            return _tapas!!
        }
        _tapas = Builder(name = "Tapas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                verticalLineTo(2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.14f)
                curveTo(20.72f, 13.41f, 22.0f, 11.86f, 22.0f, 10.0f)
                close()
                moveTo(20.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(9.86f, 9.0f)
                lineTo(8.0f, 9.0f)
                verticalLineTo(8.0f)
                lineToRelative(1.86f, 0.0f)
                curveToRelative(1.31f, 0.0f, 2.5f, -0.94f, 2.63f, -2.24f)
                curveTo(12.64f, 4.26f, 11.47f, 3.0f, 10.0f, 3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveTo(6.45f, 1.0f, 6.0f, 1.45f, 6.0f, 2.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.14f, 3.0f)
                curveToRelative(-1.31f, 0.0f, -2.5f, 0.94f, -2.63f, 2.24f)
                curveTo(1.36f, 6.74f, 2.53f, 8.0f, 4.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.14f, 9.0f)
                curveToRelative(-1.31f, 0.0f, -2.5f, 0.94f, -2.63f, 2.24f)
                curveTo(1.36f, 12.74f, 2.53f, 14.0f, 4.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.47f, 0.0f, 2.64f, -1.26f, 2.49f, -2.76f)
                curveTo(12.36f, 9.94f, 11.17f, 9.0f, 9.86f, 9.0f)
                close()
            }
        }
        .build()
        return _tapas!!
    }

private var _tapas: ImageVector? = null
