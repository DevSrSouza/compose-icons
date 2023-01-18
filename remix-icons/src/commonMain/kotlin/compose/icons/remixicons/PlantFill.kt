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

public val RemixIcons.PlantFill: ImageVector
    get() {
        if (_plantFill != null) {
            return _plantFill!!
        }
        _plantFill = Builder(name = "PlantFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 3.866f, -3.134f, 7.0f, -7.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -3.866f, 3.134f, -7.0f, 7.0f, -7.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(5.5f, 2.0f)
                curveToRelative(2.529f, 0.0f, 4.765f, 1.251f, 6.124f, 3.169f)
                curveTo(10.604f, 6.51f, 10.0f, 8.185f, 10.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.5f)
                curveTo(5.358f, 11.0f, 2.0f, 7.642f, 2.0f, 3.5f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(3.5f)
                close()
            }
        }
        .build()
        return _plantFill!!
    }

private var _plantFill: ImageVector? = null
