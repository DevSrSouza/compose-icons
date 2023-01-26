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

public val BaselineGroup.SyncProblem: ImageVector
    get() {
        if (_syncProblem != null) {
            return _syncProblem!!
        }
        _syncProblem = Builder(name = "SyncProblem", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                curveToRelative(0.0f, 2.21f, 0.91f, 4.2f, 2.36f, 5.64f)
                lineTo(3.0f, 20.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(-2.24f, 2.24f)
                curveTo(5.68f, 15.15f, 5.0f, 13.66f, 5.0f, 12.0f)
                curveToRelative(0.0f, -2.61f, 1.67f, -4.83f, 4.0f, -5.65f)
                lineTo(9.0f, 4.26f)
                curveTo(5.55f, 5.15f, 3.0f, 8.27f, 3.0f, 12.0f)
                close()
                moveTo(11.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(21.0f, 4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(2.24f, -2.24f)
                curveTo(18.32f, 8.85f, 19.0f, 10.34f, 19.0f, 12.0f)
                curveToRelative(0.0f, 2.61f, -1.67f, 4.83f, -4.0f, 5.65f)
                verticalLineToRelative(2.09f)
                curveToRelative(3.45f, -0.89f, 6.0f, -4.01f, 6.0f, -7.74f)
                curveToRelative(0.0f, -2.21f, -0.91f, -4.2f, -2.36f, -5.64f)
                lineTo(21.0f, 4.0f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _syncProblem!!
    }

private var _syncProblem: ImageVector? = null
