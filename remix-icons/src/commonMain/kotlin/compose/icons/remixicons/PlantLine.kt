package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.PlantLine: ImageVector
    get() {
        if (_plantLine != null) {
            return _plantLine!!
        }
        _plantLine = Builder(name = "PlantLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                curveToRelative(2.69f, 0.0f, 5.024f, 1.517f, 6.197f, 3.741f)
                curveTo(13.374f, 4.083f, 15.31f, 3.0f, 17.5f, 3.0f)
                lineTo(21.0f, 3.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                lineTo(13.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                lineTo(8.0f, 22.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(9.0f, 11.0f)
                curveToRelative(-3.866f, 0.0f, -7.0f, -3.134f, -7.0f, -7.0f)
                lineTo(2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(16.0f, 15.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(-1.5f)
                curveTo(15.015f, 5.0f, 13.0f, 7.015f, 13.0f, 9.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(2.485f, 0.0f, 4.5f, -2.015f, 4.5f, -4.5f)
                lineTo(19.0f, 5.0f)
                close()
                moveTo(6.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _plantLine!!
    }

private var _plantLine: ImageVector? = null
