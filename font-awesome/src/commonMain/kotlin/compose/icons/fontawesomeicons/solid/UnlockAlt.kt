package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.UnlockAlt: ImageVector
    get() {
        if (_unlockAlt != null) {
            return _unlockAlt!!
        }
        _unlockAlt = Builder(name = "UnlockAlt", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 256.0f)
                horizontalLineTo(152.0f)
                verticalLineTo(152.9f)
                curveToRelative(0.0f, -39.6f, 31.7f, -72.5f, 71.3f, -72.9f)
                curveToRelative(40.0f, -0.4f, 72.7f, 32.1f, 72.7f, 72.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineToRelative(-16.0f)
                curveTo(376.0f, 68.0f, 307.5f, -0.3f, 223.5f, 0.0f)
                curveTo(139.5f, 0.3f, 72.0f, 69.5f, 72.0f, 153.5f)
                verticalLineTo(256.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                verticalLineToRelative(160.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineTo(304.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(264.0f, 408.0f)
                curveToRelative(0.0f, 22.1f, -17.9f, 40.0f, -40.0f, 40.0f)
                reflectiveCurveToRelative(-40.0f, -17.9f, -40.0f, -40.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.9f, 40.0f, 40.0f)
                verticalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return _unlockAlt!!
    }

private var _unlockAlt: ImageVector? = null
