package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Chalkboard: ImageVector
    get() {
        if (_chalkboard != null) {
            return _chalkboard!!
        }
        _chalkboard = Builder(name = "Chalkboard", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 64.0f)
                horizontalLineToRelative(448.0f)
                verticalLineToRelative(352.0f)
                horizontalLineToRelative(64.0f)
                lineTo(608.0f, 40.0f)
                curveToRelative(0.0f, -22.06f, -17.94f, -40.0f, -40.0f, -40.0f)
                lineTo(72.0f, 0.0f)
                curveTo(49.94f, 0.0f, 32.0f, 17.94f, 32.0f, 40.0f)
                verticalLineToRelative(376.0f)
                horizontalLineToRelative(64.0f)
                lineTo(96.0f, 64.0f)
                close()
                moveTo(624.0f, 448.0f)
                lineTo(480.0f, 448.0f)
                verticalLineToRelative(-64.0f)
                lineTo(288.0f, 384.0f)
                verticalLineToRelative(64.0f)
                lineTo(16.0f, 448.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(608.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _chalkboard!!
    }

private var _chalkboard: ImageVector? = null
