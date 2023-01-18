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

public val RemixIcons.SeedlingLine: ImageVector
    get() {
        if (_seedlingLine != null) {
            return _seedlingLine!!
        }
        _seedlingLine = Builder(name = "SeedlingLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveToRelative(3.49f, 0.0f, 6.383f, 2.554f, 6.913f, 5.895f)
                curveTo(14.088f, 7.724f, 15.71f, 7.0f, 17.5f, 7.0f)
                lineTo(22.0f, 7.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                lineTo(13.0f, 16.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                lineTo(9.0f, 13.0f)
                curveToRelative(-3.866f, 0.0f, -7.0f, -3.134f, -7.0f, -7.0f)
                lineTo(2.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(20.0f, 9.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-2.485f, 0.0f, -4.5f, 2.015f, -4.5f, 4.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.485f, 0.0f, 4.5f, -2.015f, 4.5f, -4.5f)
                lineTo(20.0f, 9.0f)
                close()
                moveTo(6.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _seedlingLine!!
    }

private var _seedlingLine: ImageVector? = null
