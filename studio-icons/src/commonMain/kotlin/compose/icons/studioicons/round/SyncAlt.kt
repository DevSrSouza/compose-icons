package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SyncAlt: ImageVector
    get() {
        if (_syncAlt != null) {
            return _syncAlt!!
        }
        _syncAlt = Builder(name = "SyncAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.65f, 7.65f)
                lineToRelative(-2.79f, -2.79f)
                curveTo(18.54f, 4.54f, 18.0f, 4.76f, 18.0f, 5.21f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 7.0f, 3.0f, 7.45f, 3.0f, 8.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(1.79f)
                curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(2.79f, -2.79f)
                curveTo(21.84f, 8.16f, 21.84f, 7.84f, 21.65f, 7.65f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 15.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-1.79f)
                curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                lineToRelative(-2.79f, 2.79f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.7f)
                lineToRelative(2.79f, 2.79f)
                curveTo(5.46f, 19.46f, 6.0f, 19.24f, 6.0f, 18.79f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveTo(20.55f, 15.0f, 20.0f, 15.0f)
                close()
            }
        }
        .build()
        return _syncAlt!!
    }

private var _syncAlt: ImageVector? = null
