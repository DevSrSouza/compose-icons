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

public val RoundGroup.Emergency: ImageVector
    get() {
        if (_emergency != null) {
            return _emergency!!
        }
        _emergency = Builder(name = "Emergency", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.29f, 8.37f)
                lineToRelative(-1.0f, -1.73f)
                curveToRelative(-0.28f, -0.48f, -0.89f, -0.64f, -1.37f, -0.37f)
                lineTo(14.0f, 8.54f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.54f)
                lineTo(6.07f, 6.27f)
                curveTo(5.59f, 5.99f, 4.98f, 6.16f, 4.71f, 6.63f)
                lineToRelative(-1.0f, 1.73f)
                curveTo(3.43f, 8.84f, 3.59f, 9.46f, 4.07f, 9.73f)
                lineTo(8.0f, 12.0f)
                lineToRelative(-3.93f, 2.27f)
                curveToRelative(-0.48f, 0.28f, -0.64f, 0.89f, -0.37f, 1.37f)
                lineToRelative(1.0f, 1.73f)
                curveToRelative(0.28f, 0.48f, 0.89f, 0.64f, 1.37f, 0.37f)
                lineTo(10.0f, 15.46f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-4.54f)
                lineToRelative(3.93f, 2.27f)
                curveToRelative(0.48f, 0.28f, 1.09f, 0.11f, 1.37f, -0.37f)
                lineToRelative(1.0f, -1.73f)
                curveToRelative(0.28f, -0.48f, 0.11f, -1.09f, -0.37f, -1.37f)
                lineTo(16.0f, 12.0f)
                lineToRelative(3.93f, -2.27f)
                curveTo(20.41f, 9.46f, 20.57f, 8.84f, 20.29f, 8.37f)
                close()
            }
        }
        .build()
        return _emergency!!
    }

private var _emergency: ImageVector? = null
