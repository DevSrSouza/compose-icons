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

public val SolidGroup.Timeline: ImageVector
    get() {
        if (_timeline != null) {
            return _timeline!!
        }
        _timeline = Builder(name = "Timeline", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 72.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
                moveTo(160.0f, 169.3f)
                curveToRelative(28.3f, -12.3f, 48.0f, -40.5f, 48.0f, -73.3f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                reflectiveCurveTo(48.0f, 51.8f, 48.0f, 96.0f)
                curveToRelative(0.0f, 32.8f, 19.7f, 61.0f, 48.0f, 73.3f)
                lineTo(96.0f, 224.0f)
                lineTo(32.0f, 224.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(288.0f, 288.0f)
                verticalLineToRelative(54.7f)
                curveToRelative(-28.3f, 12.3f, -48.0f, 40.5f, -48.0f, 73.3f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                reflectiveCurveToRelative(80.0f, -35.8f, 80.0f, -80.0f)
                curveToRelative(0.0f, -32.8f, -19.7f, -61.0f, -48.0f, -73.3f)
                lineTo(352.0f, 288.0f)
                lineTo(608.0f, 288.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(544.0f, 224.0f)
                lineTo(544.0f, 169.3f)
                curveToRelative(28.3f, -12.3f, 48.0f, -40.5f, 48.0f, -73.3f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                reflectiveCurveToRelative(-80.0f, 35.8f, -80.0f, 80.0f)
                curveToRelative(0.0f, 32.8f, 19.7f, 61.0f, 48.0f, 73.3f)
                lineTo(480.0f, 224.0f)
                lineTo(160.0f, 224.0f)
                lineTo(160.0f, 169.3f)
                close()
                moveTo(488.0f, 96.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
                moveTo(320.0f, 392.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _timeline!!
    }

private var _timeline: ImageVector? = null
