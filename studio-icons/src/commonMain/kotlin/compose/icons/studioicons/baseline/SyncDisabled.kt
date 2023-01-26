package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SyncDisabled: ImageVector
    get() {
        if (_syncDisabled != null) {
            return _syncDisabled!!
        }
        _syncDisabled = Builder(name = "SyncDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.35f)
                lineTo(10.0f, 4.26f)
                curveToRelative(-0.8f, 0.21f, -1.55f, 0.54f, -2.23f, 0.96f)
                lineToRelative(1.46f, 1.46f)
                curveToRelative(0.25f, -0.12f, 0.5f, -0.24f, 0.77f, -0.33f)
                close()
                moveTo(2.86f, 5.41f)
                lineToRelative(2.36f, 2.36f)
                curveTo(4.45f, 8.99f, 4.0f, 10.44f, 4.0f, 12.0f)
                curveToRelative(0.0f, 2.21f, 0.91f, 4.2f, 2.36f, 5.64f)
                lineTo(4.0f, 20.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(-2.24f, 2.24f)
                curveTo(6.68f, 15.15f, 6.0f, 13.66f, 6.0f, 12.0f)
                curveToRelative(0.0f, -1.0f, 0.25f, -1.94f, 0.68f, -2.77f)
                lineToRelative(8.08f, 8.08f)
                curveToRelative(-0.25f, 0.13f, -0.5f, 0.25f, -0.77f, 0.34f)
                verticalLineToRelative(2.09f)
                curveToRelative(0.8f, -0.21f, 1.55f, -0.54f, 2.23f, -0.96f)
                lineToRelative(2.36f, 2.36f)
                lineToRelative(1.27f, -1.27f)
                lineTo(4.14f, 4.14f)
                lineTo(2.86f, 5.41f)
                close()
                moveTo(20.0f, 4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(2.24f, -2.24f)
                curveTo(17.32f, 8.85f, 18.0f, 10.34f, 18.0f, 12.0f)
                curveToRelative(0.0f, 1.0f, -0.25f, 1.94f, -0.68f, 2.77f)
                lineToRelative(1.46f, 1.46f)
                curveTo(19.55f, 15.01f, 20.0f, 13.56f, 20.0f, 12.0f)
                curveToRelative(0.0f, -2.21f, -0.91f, -4.2f, -2.36f, -5.64f)
                lineTo(20.0f, 4.0f)
                close()
            }
        }
        .build()
        return _syncDisabled!!
    }

private var _syncDisabled: ImageVector? = null
