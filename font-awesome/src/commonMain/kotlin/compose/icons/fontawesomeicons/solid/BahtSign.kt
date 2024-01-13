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

public val SolidGroup.BahtSign: ImageVector
    get() {
        if (_bahtSign != null) {
            return _bahtSign!!
        }
        _bahtSign = Builder(name = "BahtSign", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineTo(112.0f, 64.0f)
                lineTo(37.6f, 64.0f)
                curveTo(16.8f, 64.0f, 0.0f, 80.8f, 0.0f, 101.6f)
                lineTo(0.0f, 224.0f)
                verticalLineToRelative(41.7f)
                lineTo(0.0f, 288.0f)
                lineTo(0.0f, 406.3f)
                curveToRelative(0.0f, 23.0f, 18.7f, 41.7f, 41.7f, 41.7f)
                lineTo(112.0f, 448.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(176.0f, 448.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, -50.1f, 112.0f, -112.0f)
                curveToRelative(0.0f, -40.1f, -21.1f, -75.3f, -52.7f, -95.1f)
                curveTo(280.3f, 222.6f, 288.0f, 200.2f, 288.0f, 176.0f)
                curveToRelative(0.0f, -61.9f, -50.1f, -112.0f, -112.0f, -112.0f)
                lineTo(176.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(112.0f, 128.0f)
                verticalLineToRelative(96.0f)
                lineTo(64.0f, 224.0f)
                lineTo(64.0f, 128.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(176.0f, 224.0f)
                lineTo(176.0f, 128.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(112.0f, 288.0f)
                verticalLineToRelative(96.0f)
                lineTo(64.0f, 384.0f)
                lineTo(64.0f, 288.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(176.0f, 384.0f)
                lineTo(176.0f, 288.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(176.0f, 384.0f)
                close()
            }
        }
        .build()
        return _bahtSign!!
    }

private var _bahtSign: ImageVector? = null
