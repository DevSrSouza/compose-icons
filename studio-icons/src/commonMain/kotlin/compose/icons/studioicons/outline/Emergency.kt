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

public val OutlineGroup.Emergency: ImageVector
    get() {
        if (_emergency != null) {
            return _emergency!!
        }
        _emergency = Builder(name = "Emergency", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.29f, 13.9f)
                lineTo(18.0f, 12.0f)
                lineToRelative(3.29f, -1.9f)
                curveToRelative(0.48f, -0.28f, 0.64f, -0.89f, 0.37f, -1.37f)
                lineToRelative(-2.0f, -3.46f)
                curveToRelative(-0.28f, -0.48f, -0.89f, -0.64f, -1.37f, -0.37f)
                lineTo(15.0f, 6.8f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveTo(9.45f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f)
                verticalLineToRelative(3.8f)
                lineTo(5.71f, 4.9f)
                curveTo(5.23f, 4.63f, 4.62f, 4.79f, 4.34f, 5.27f)
                lineToRelative(-2.0f, 3.46f)
                curveTo(2.06f, 9.21f, 2.23f, 9.82f, 2.71f, 10.1f)
                lineTo(6.0f, 12.0f)
                lineToRelative(-3.29f, 1.9f)
                curveToRelative(-0.48f, 0.28f, -0.64f, 0.89f, -0.37f, 1.37f)
                lineToRelative(2.0f, 3.46f)
                curveToRelative(0.28f, 0.48f, 0.89f, 0.64f, 1.37f, 0.37f)
                lineTo(9.0f, 17.2f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.8f)
                lineToRelative(3.29f, 1.9f)
                curveToRelative(0.48f, 0.28f, 1.09f, 0.11f, 1.37f, -0.37f)
                lineToRelative(2.0f, -3.46f)
                curveTo(21.94f, 14.79f, 21.77f, 14.18f, 21.29f, 13.9f)
                close()
                moveTo(18.43f, 16.87f)
                lineToRelative(-4.68f, -2.7f)
                curveTo(13.42f, 13.97f, 13.0f, 14.21f, 13.0f, 14.6f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.4f)
                curveToRelative(0.0f, -0.38f, -0.42f, -0.63f, -0.75f, -0.43f)
                lineToRelative(-4.68f, 2.7f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(4.68f, -2.7f)
                curveToRelative(0.33f, -0.19f, 0.33f, -0.67f, 0.0f, -0.87f)
                lineToRelative(-4.68f, -2.7f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(4.68f, 2.7f)
                curveTo(10.58f, 10.03f, 11.0f, 9.79f, 11.0f, 9.4f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.4f)
                curveToRelative(0.0f, 0.38f, 0.42f, 0.63f, 0.75f, 0.43f)
                lineToRelative(4.68f, -2.7f)
                lineToRelative(1.0f, 1.73f)
                lineToRelative(-4.68f, 2.7f)
                curveToRelative(-0.33f, 0.19f, -0.33f, 0.67f, 0.0f, 0.87f)
                lineToRelative(4.68f, 2.7f)
                lineTo(18.43f, 16.87f)
                close()
            }
        }
        .build()
        return _emergency!!
    }

private var _emergency: ImageVector? = null
