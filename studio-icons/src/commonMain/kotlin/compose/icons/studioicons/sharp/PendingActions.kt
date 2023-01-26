package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PendingActions: ImageVector
    get() {
        if (_pendingActions != null) {
            return _pendingActions!!
        }
        _pendingActions = Builder(name = "PendingActions", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(19.76f, 12.0f, 17.0f, 12.0f)
                close()
                moveTo(18.65f, 19.35f)
                lineToRelative(-2.15f, -2.15f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.79f)
                lineToRelative(1.85f, 1.85f)
                lineTo(18.65f, 19.35f)
                close()
                moveTo(20.0f, 3.0f)
                horizontalLineToRelative(-5.18f)
                curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(8.11f)
                curveToRelative(-0.59f, -0.57f, -1.07f, -1.25f, -1.42f, -2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.08f)
                curveToRelative(0.71f, 0.1f, 1.38f, 0.31f, 2.0f, 0.6f)
                verticalLineTo(3.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                curveTo(13.0f, 4.55f, 12.55f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _pendingActions!!
    }

private var _pendingActions: ImageVector? = null
