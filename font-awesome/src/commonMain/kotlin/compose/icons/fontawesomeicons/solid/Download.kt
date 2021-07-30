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

public val SolidGroup.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(name = "Download", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 0.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineToRelative(168.0f)
                horizontalLineToRelative(87.7f)
                curveToRelative(17.8f, 0.0f, 26.7f, 21.5f, 14.1f, 34.1f)
                lineTo(269.7f, 378.3f)
                curveToRelative(-7.5f, 7.5f, -19.8f, 7.5f, -27.3f, 0.0f)
                lineTo(90.1f, 226.1f)
                curveToRelative(-12.6f, -12.6f, -3.7f, -34.1f, 14.1f, -34.1f)
                lineTo(192.0f, 192.0f)
                lineTo(192.0f, 24.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(512.0f, 376.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(24.0f, 512.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(0.0f, 376.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(146.7f)
                lineToRelative(49.0f, 49.0f)
                curveToRelative(20.1f, 20.1f, 52.5f, 20.1f, 72.6f, 0.0f)
                lineToRelative(49.0f, -49.0f)
                lineTo(488.0f, 352.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                close()
                moveTo(388.0f, 464.0f)
                curveToRelative(0.0f, -11.0f, -9.0f, -20.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(-20.0f, 9.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(9.0f, 20.0f, 20.0f, 20.0f)
                reflectiveCurveToRelative(20.0f, -9.0f, 20.0f, -20.0f)
                close()
                moveTo(452.0f, 464.0f)
                curveToRelative(0.0f, -11.0f, -9.0f, -20.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(-20.0f, 9.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(9.0f, 20.0f, 20.0f, 20.0f)
                reflectiveCurveToRelative(20.0f, -9.0f, 20.0f, -20.0f)
                close()
            }
        }
        .build()
        return _download!!
    }

private var _download: ImageVector? = null
