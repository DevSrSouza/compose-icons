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

public val BaselineGroup.SyncLock: ImageVector
    get() {
        if (_syncLock != null) {
            return _syncLock!!
        }
        _syncLock = Builder(name = "SyncLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.26f)
                verticalLineToRelative(2.09f)
                curveTo(7.67f, 7.18f, 6.0f, 9.39f, 6.0f, 12.0f)
                curveToRelative(0.0f, 1.77f, 0.78f, 3.34f, 2.0f, 4.44f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.73f)
                curveTo(5.06f, 16.54f, 4.0f, 14.4f, 4.0f, 12.0f)
                curveTo(4.0f, 8.27f, 6.55f, 5.15f, 10.0f, 4.26f)
                close()
                moveTo(20.0f, 4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.56f)
                curveToRelative(1.22f, 1.1f, 2.0f, 2.67f, 2.0f, 4.44f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.4f, -1.06f, -4.54f, -2.73f, -6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(20.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveTo(21.0f, 17.45f, 20.55f, 17.0f, 20.0f, 17.0f)
                close()
                moveTo(19.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _syncLock!!
    }

private var _syncLock: ImageVector? = null
