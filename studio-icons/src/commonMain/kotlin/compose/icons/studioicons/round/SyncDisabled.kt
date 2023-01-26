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

public val RoundGroup.SyncDisabled: ImageVector
    get() {
        if (_syncDisabled != null) {
            return _syncDisabled!!
        }
        _syncDisabled = Builder(name = "SyncDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 5.74f)
                verticalLineToRelative(-0.19f)
                curveToRelative(0.0f, -0.68f, -0.71f, -1.11f, -1.32f, -0.82f)
                curveToRelative(-0.19f, 0.09f, -0.36f, 0.2f, -0.54f, 0.3f)
                lineTo(9.6f, 6.49f)
                curveToRelative(0.24f, -0.18f, 0.4f, -0.45f, 0.4f, -0.75f)
                close()
                moveTo(20.0f, 12.0f)
                curveToRelative(0.0f, -2.21f, -0.91f, -4.2f, -2.36f, -5.64f)
                lineToRelative(1.51f, -1.51f)
                curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(4.79f)
                curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(1.39f, -1.39f)
                curveTo(17.32f, 8.85f, 18.0f, 10.34f, 18.0f, 12.0f)
                curveToRelative(0.0f, 0.85f, -0.18f, 1.66f, -0.5f, 2.39f)
                lineToRelative(1.48f, 1.48f)
                curveTo(19.62f, 14.72f, 20.0f, 13.41f, 20.0f, 12.0f)
                close()
                moveTo(3.57f, 4.7f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(1.65f, 1.65f)
                curveTo(4.45f, 9.0f, 4.0f, 10.44f, 4.0f, 12.0f)
                curveToRelative(0.0f, 2.21f, 0.91f, 4.2f, 2.36f, 5.64f)
                lineToRelative(-1.51f, 1.51f)
                curveToRelative(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f)
                horizontalLineTo(9.5f)
                curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-4.29f)
                curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                lineToRelative(-1.39f, 1.39f)
                curveTo(6.68f, 15.15f, 6.0f, 13.66f, 6.0f, 12.0f)
                curveToRelative(0.0f, -1.0f, 0.26f, -1.93f, 0.69f, -2.76f)
                lineToRelative(8.07f, 8.07f)
                curveToRelative(-0.01f, 0.02f, -0.01f, 0.02f, -0.01f, 0.04f)
                curveToRelative(-0.43f, 0.12f, -0.75f, 0.48f, -0.75f, 0.91f)
                verticalLineToRelative(0.18f)
                curveToRelative(0.0f, 0.68f, 0.71f, 1.11f, 1.32f, 0.82f)
                curveToRelative(0.31f, -0.14f, 0.61f, -0.31f, 0.9f, -0.49f)
                lineToRelative(1.87f, 1.87f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(4.98f, 4.7f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                close()
            }
        }
        .build()
        return _syncDisabled!!
    }

private var _syncDisabled: ImageVector? = null
