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

public val RoundGroup.FindReplace: ImageVector
    get() {
        if (_findReplace != null) {
            return _findReplace!!
        }
        _findReplace = Builder(name = "FindReplace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                curveToRelative(1.38f, 0.0f, 2.63f, 0.56f, 3.54f, 1.46f)
                lineToRelative(-1.69f, 1.69f)
                curveToRelative(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f)
                horizontalLineToRelative(4.29f)
                curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(18.0f, 5.21f)
                curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                lineToRelative(-1.2f, 1.2f)
                curveTo(14.68f, 4.78f, 12.93f, 4.0f, 11.0f, 4.0f)
                curveTo(7.96f, 4.0f, 5.38f, 5.94f, 4.42f, 8.64f)
                curveToRelative(-0.24f, 0.66f, 0.23f, 1.36f, 0.93f, 1.36f)
                curveToRelative(0.42f, 0.0f, 0.79f, -0.26f, 0.93f, -0.66f)
                curveTo(6.96f, 7.4f, 8.82f, 6.0f, 11.0f, 6.0f)
                close()
                moveTo(16.64f, 15.14f)
                curveToRelative(0.4f, -0.54f, 0.72f, -1.15f, 0.95f, -1.8f)
                curveToRelative(0.23f, -0.65f, -0.25f, -1.34f, -0.94f, -1.34f)
                curveToRelative(-0.42f, 0.0f, -0.79f, 0.26f, -0.93f, 0.66f)
                curveTo(15.04f, 14.6f, 13.18f, 16.0f, 11.0f, 16.0f)
                curveToRelative(-1.38f, 0.0f, -2.63f, -0.56f, -3.54f, -1.46f)
                lineToRelative(1.69f, -1.69f)
                curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f)
                lineTo(4.5f, 12.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4.29f)
                curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(1.2f, -1.2f)
                curveTo(7.32f, 17.22f, 9.07f, 18.0f, 11.0f, 18.0f)
                curveToRelative(1.55f, 0.0f, 2.98f, -0.51f, 4.14f, -1.36f)
                lineToRelative(4.11f, 4.11f)
                curveToRelative(0.41f, 0.41f, 1.08f, 0.41f, 1.49f, 0.0f)
                curveToRelative(0.41f, -0.41f, 0.41f, -1.08f, 0.0f, -1.49f)
                lineToRelative(-4.1f, -4.12f)
                close()
            }
        }
        .build()
        return _findReplace!!
    }

private var _findReplace: ImageVector? = null
