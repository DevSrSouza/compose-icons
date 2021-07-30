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

public val SolidGroup.PollH: ImageVector
    get() {
        if (_pollH != null) {
            return _pollH!!
        }
        _pollH = Builder(name = "PollH", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 432.0f)
                lineTo(448.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                close()
                moveTo(112.0f, 192.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, 7.16f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(128.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, 7.16f, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, -7.16f, 16.0f, -16.0f, 16.0f)
                lineTo(112.0f, 192.0f)
                close()
                moveTo(112.0f, 288.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, 7.16f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(224.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, 7.16f, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, -7.16f, 16.0f, -16.0f, 16.0f)
                lineTo(112.0f, 288.0f)
                close()
                moveTo(112.0f, 384.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, 7.16f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, 7.16f, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, -7.16f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-64.0f)
                close()
            }
        }
        .build()
        return _pollH!!
    }

private var _pollH: ImageVector? = null
