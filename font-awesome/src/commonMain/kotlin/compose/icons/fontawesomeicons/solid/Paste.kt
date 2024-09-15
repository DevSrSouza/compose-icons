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

public val SolidGroup.Paste: ImageVector
    get() {
        if (_paste != null) {
            return _paste!!
        }
        _paste = Builder(name = "Paste", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 184.0f)
                curveToRelative(0.0f, -30.88f, 25.12f, -56.0f, 56.0f, -56.0f)
                horizontalLineToRelative(136.0f)
                lineTo(320.0f, 56.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                horizontalLineToRelative(-80.61f)
                curveTo(204.31f, 12.89f, 183.64f, 0.0f, 160.0f, 0.0f)
                reflectiveCurveToRelative(-44.31f, 12.89f, -55.39f, 32.0f)
                lineTo(24.0f, 32.0f)
                curveTo(10.74f, 32.0f, 0.0f, 42.74f, 0.0f, 56.0f)
                verticalLineToRelative(336.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(104.0f)
                lineTo(128.0f, 184.0f)
                close()
                moveTo(160.0f, 40.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, 10.74f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.74f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.74f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.74f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(344.0f, 288.0f)
                horizontalLineToRelative(104.0f)
                verticalLineToRelative(200.0f)
                curveToRelative(0.0f, 13.26f, -10.74f, 24.0f, -24.0f, 24.0f)
                lineTo(184.0f, 512.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, -10.74f, -24.0f, -24.0f)
                lineTo(160.0f, 184.0f)
                curveToRelative(0.0f, -13.26f, 10.74f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(136.0f)
                verticalLineToRelative(104.0f)
                curveToRelative(0.0f, 13.2f, 10.8f, 24.0f, 24.0f, 24.0f)
                close()
                moveTo(448.0f, 249.94f)
                lineTo(448.0f, 256.0f)
                horizontalLineToRelative(-96.0f)
                verticalLineToRelative(-96.0f)
                horizontalLineToRelative(6.06f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 16.97f, 7.03f)
                lineToRelative(65.94f, 65.94f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 7.03f, 16.97f)
                close()
            }
        }
        .build()
        return _paste!!
    }

private var _paste: ImageVector? = null
