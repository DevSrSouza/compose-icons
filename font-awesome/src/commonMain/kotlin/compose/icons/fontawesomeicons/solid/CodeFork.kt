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

public val SolidGroup.CodeFork: ImageVector
    get() {
        if (_codeFork != null) {
            return _codeFork!!
        }
        _codeFork = Builder(name = "CodeFork", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 104.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
                moveTo(160.0f, 80.0f)
                curveToRelative(0.0f, 32.8f, -19.7f, 61.0f, -48.0f, 73.3f)
                lineTo(112.0f, 192.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(304.0f, 224.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(336.0f, 153.3f)
                curveTo(307.7f, 141.0f, 288.0f, 112.8f, 288.0f, 80.0f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                curveToRelative(0.0f, 32.8f, -19.7f, 61.0f, -48.0f, 73.3f)
                lineTo(400.0f, 192.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                lineTo(256.0f, 288.0f)
                verticalLineToRelative(70.7f)
                curveToRelative(28.3f, 12.3f, 48.0f, 40.5f, 48.0f, 73.3f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                reflectiveCurveToRelative(-80.0f, -35.8f, -80.0f, -80.0f)
                curveToRelative(0.0f, -32.8f, 19.7f, -61.0f, 48.0f, -73.3f)
                lineTo(192.0f, 288.0f)
                lineTo(144.0f, 288.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                lineTo(48.0f, 153.3f)
                curveTo(19.7f, 141.0f, 0.0f, 112.8f, 0.0f, 80.0f)
                curveTo(0.0f, 35.8f, 35.8f, 0.0f, 80.0f, 0.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                close()
                moveTo(368.0f, 104.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
                moveTo(248.0f, 432.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _codeFork!!
    }

private var _codeFork: ImageVector? = null
