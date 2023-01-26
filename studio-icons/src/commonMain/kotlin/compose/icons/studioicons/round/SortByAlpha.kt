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

public val RoundGroup.SortByAlpha: ImageVector
    get() {
        if (_sortByAlpha != null) {
            return _sortByAlpha!!
        }
        _sortByAlpha = Builder(name = "SortByAlpha", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.93f, 2.65f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f)
                lineToRelative(-2.01f, 2.01f)
                horizontalLineToRelative(4.72f)
                lineToRelative(-2.0f, -2.01f)
                close()
                moveTo(12.23f, 21.35f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f)
                lineToRelative(1.98f, -1.98f)
                horizontalLineToRelative(-4.66f)
                lineToRelative(1.97f, 1.98f)
                close()
                moveTo(10.98f, 17.73f)
                curveToRelative(0.6f, 0.0f, 1.01f, -0.6f, 0.79f, -1.16f)
                lineTo(8.04f, 7.03f)
                curveToRelative(-0.18f, -0.46f, -0.63f, -0.76f, -1.12f, -0.76f)
                curveToRelative(-0.49f, 0.0f, -0.94f, 0.3f, -1.12f, 0.76f)
                lineToRelative(-3.74f, 9.53f)
                curveToRelative(-0.22f, 0.56f, 0.19f, 1.16f, 0.79f, 1.16f)
                curveToRelative(0.35f, 0.0f, 0.67f, -0.22f, 0.8f, -0.55f)
                lineToRelative(0.71f, -1.9f)
                horizontalLineToRelative(5.11f)
                lineToRelative(0.71f, 1.9f)
                curveToRelative(0.13f, 0.34f, 0.45f, 0.56f, 0.8f, 0.56f)
                close()
                moveTo(4.97f, 13.64f)
                lineToRelative(1.94f, -5.18f)
                lineToRelative(1.94f, 5.18f)
                lineTo(4.97f, 13.64f)
                close()
                moveTo(21.05f, 16.14f)
                horizontalLineToRelative(-5.33f)
                lineToRelative(5.72f, -8.29f)
                curveToRelative(0.46f, -0.66f, -0.02f, -1.57f, -0.82f, -1.57f)
                horizontalLineToRelative(-6.48f)
                curveToRelative(-0.44f, 0.0f, -0.79f, 0.36f, -0.79f, 0.8f)
                verticalLineToRelative(0.01f)
                curveToRelative(0.0f, 0.44f, 0.36f, 0.8f, 0.79f, 0.8f)
                horizontalLineToRelative(5.09f)
                lineToRelative(-5.73f, 8.28f)
                curveToRelative(-0.46f, 0.66f, 0.02f, 1.57f, 0.82f, 1.57f)
                horizontalLineToRelative(6.72f)
                curveToRelative(0.44f, 0.0f, 0.79f, -0.36f, 0.79f, -0.79f)
                curveToRelative(0.02f, -0.45f, -0.34f, -0.81f, -0.78f, -0.81f)
                close()
            }
        }
        .build()
        return _sortByAlpha!!
    }

private var _sortByAlpha: ImageVector? = null
