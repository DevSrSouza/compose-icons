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

public val SolidGroup.RankingStar: ImageVector
    get() {
        if (_rankingStar != null) {
            return _rankingStar!!
        }
        _rankingStar = Builder(name = "RankingStar", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(353.8f, 54.1f)
                lineTo(330.2f, 6.3f)
                curveToRelative(-3.9f, -8.3f, -16.1f, -8.6f, -20.4f, 0.0f)
                lineTo(286.2f, 54.1f)
                lineToRelative(-52.3f, 7.5f)
                curveToRelative(-9.3f, 1.4f, -13.3f, 12.9f, -6.4f, 19.8f)
                lineToRelative(38.0f, 37.0f)
                lineToRelative(-9.0f, 52.1f)
                curveToRelative(-1.4f, 9.3f, 8.2f, 16.5f, 16.8f, 12.2f)
                lineToRelative(46.9f, -24.8f)
                lineToRelative(46.6f, 24.4f)
                curveToRelative(8.6f, 4.3f, 18.3f, -2.9f, 16.8f, -12.2f)
                lineToRelative(-9.0f, -52.1f)
                lineToRelative(38.0f, -36.6f)
                curveToRelative(6.8f, -6.8f, 2.9f, -18.3f, -6.4f, -19.8f)
                lineToRelative(-52.3f, -7.5f)
                close()
                moveTo(256.0f, 256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineTo(224.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(384.0f, 512.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(416.0f, 288.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(256.0f, 256.0f)
                close()
                moveTo(32.0f, 320.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineTo(0.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(160.0f, 512.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(192.0f, 352.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(32.0f, 320.0f)
                close()
                moveTo(448.0f, 416.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(608.0f, 512.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(640.0f, 416.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(480.0f, 384.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _rankingStar!!
    }

private var _rankingStar: ImageVector? = null
