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

public val RoundGroup.AddTask: ImageVector
    get() {
        if (_addTask != null) {
            return _addTask!!
        }
        _addTask = Builder(name = "AddTask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.29f, 5.89f)
                lineToRelative(-10.0f, 10.0f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(-2.83f, -2.83f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(9.29f, -9.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                verticalLineToRelative(0.0f)
                curveTo(21.68f, 4.87f, 21.68f, 5.5f, 21.29f, 5.89f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.71f, 0.0f, -8.48f, -4.09f, -7.95f, -8.9f)
                curveToRelative(0.39f, -3.52f, 3.12f, -6.41f, 6.61f, -6.99f)
                curveToRelative(1.81f, -0.3f, 3.53f, 0.02f, 4.99f, 0.78f)
                curveToRelative(0.39f, 0.2f, 0.86f, 0.13f, 1.17f, -0.18f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.48f, -0.48f, 0.36f, -1.29f, -0.24f, -1.6f)
                curveTo(15.11f, 2.36f, 13.45f, 1.95f, 11.68f, 2.0f)
                curveToRelative(-5.14f, 0.16f, -9.41f, 4.34f, -9.67f, 9.47f)
                curveTo(1.72f, 17.24f, 6.3f, 22.0f, 12.0f, 22.0f)
                curveToRelative(1.2f, 0.0f, 2.34f, -0.21f, 3.41f, -0.6f)
                curveToRelative(0.68f, -0.25f, 0.87f, -1.13f, 0.35f, -1.65f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.27f, -0.27f, -0.68f, -0.37f, -1.04f, -0.23f)
                curveTo(13.87f, 19.83f, 12.95f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(19.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _addTask!!
    }

private var _addTask: ImageVector? = null
