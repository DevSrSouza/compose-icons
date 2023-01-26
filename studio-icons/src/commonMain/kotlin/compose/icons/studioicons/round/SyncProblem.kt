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

public val RoundGroup.SyncProblem: ImageVector
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
                lineToRelative(-1.51f, 1.51f)
                curveToRelative(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f)
                lineTo(8.5f, 20.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-4.29f)
                curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                lineToRelative(-1.39f, 1.39f)
                curveTo(5.68f, 15.15f, 5.0f, 13.66f, 5.0f, 12.0f)
                curveToRelative(0.0f, -2.39f, 1.4f, -4.46f, 3.43f, -5.42f)
                curveToRelative(0.34f, -0.16f, 0.57f, -0.47f, 0.57f, -0.84f)
                verticalLineToRelative(-0.19f)
                curveToRelative(0.0f, -0.68f, -0.71f, -1.11f, -1.32f, -0.82f)
                curveTo(4.92f, 5.99f, 3.0f, 8.77f, 3.0f, 12.0f)
                close()
                moveTo(11.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.79f, 4.0f)
                lineTo(15.5f, 4.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4.29f)
                curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(1.39f, -1.39f)
                curveTo(18.32f, 8.85f, 19.0f, 10.34f, 19.0f, 12.0f)
                curveToRelative(0.0f, 2.39f, -1.4f, 4.46f, -3.43f, 5.42f)
                curveToRelative(-0.34f, 0.16f, -0.57f, 0.47f, -0.57f, 0.84f)
                verticalLineToRelative(0.18f)
                curveToRelative(0.0f, 0.68f, 0.71f, 1.11f, 1.32f, 0.82f)
                curveTo(19.08f, 18.01f, 21.0f, 15.23f, 21.0f, 12.0f)
                curveToRelative(0.0f, -2.21f, -0.91f, -4.2f, -2.36f, -5.64f)
                lineToRelative(1.51f, -1.51f)
                curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(13.0f, 8.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _syncProblem!!
    }

private var _syncProblem: ImageVector? = null
