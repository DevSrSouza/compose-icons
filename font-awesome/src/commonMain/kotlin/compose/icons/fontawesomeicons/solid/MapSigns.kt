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

public val SolidGroup.MapSigns: ImageVector
    get() {
        if (_mapSigns != null) {
            return _mapSigns!!
        }
        _mapSigns = Builder(name = "MapSigns", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(507.31f, 84.69f)
                lineTo(464.0f, 41.37f)
                curveToRelative(-6.0f, -6.0f, -14.14f, -9.37f, -22.63f, -9.37f)
                lineTo(288.0f, 32.0f)
                lineTo(288.0f, 16.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                lineTo(56.0f, 32.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, 10.75f, -24.0f, 24.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(385.37f)
                curveToRelative(8.49f, 0.0f, 16.62f, -3.37f, 22.63f, -9.37f)
                lineToRelative(43.31f, -43.31f)
                curveToRelative(6.25f, -6.26f, 6.25f, -16.38f, 0.0f, -22.63f)
                close()
                moveTo(224.0f, 496.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(288.0f, 384.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(112.0f)
                close()
                moveTo(456.0f, 224.0f)
                lineTo(288.0f, 224.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(32.0f)
                lineTo(70.63f, 224.0f)
                curveToRelative(-8.49f, 0.0f, -16.62f, 3.37f, -22.63f, 9.37f)
                lineTo(4.69f, 276.69f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0.0f, 22.63f)
                lineTo(48.0f, 342.63f)
                curveToRelative(6.0f, 6.0f, 14.14f, 9.37f, 22.63f, 9.37f)
                lineTo(456.0f, 352.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                verticalLineToRelative(-80.0f)
                curveToRelative(0.0f, -13.25f, -10.75f, -24.0f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _mapSigns!!
    }

private var _mapSigns: ImageVector? = null
