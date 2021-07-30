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

public val SolidGroup.VoteYea: ImageVector
    get() {
        if (_voteYea != null) {
            return _voteYea!!
        }
        _voteYea = Builder(name = "VoteYea", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(608.0f, 320.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(22.4f)
                curveToRelative(5.3f, 0.0f, 9.6f, 3.6f, 9.6f, 8.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 4.4f, -4.3f, 8.0f, -9.6f, 8.0f)
                lineTo(73.6f, 416.0f)
                curveToRelative(-5.3f, 0.0f, -9.6f, -3.6f, -9.6f, -8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -4.4f, 4.3f, -8.0f, 9.6f, -8.0f)
                lineTo(96.0f, 384.0f)
                verticalLineToRelative(-64.0f)
                lineTo(32.0f, 320.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(576.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(512.0f, 384.0f)
                lineTo(512.0f, 64.3f)
                curveToRelative(0.0f, -17.9f, -14.5f, -32.3f, -32.3f, -32.3f)
                lineTo(160.4f, 32.0f)
                curveTo(142.5f, 32.0f, 128.0f, 46.5f, 128.0f, 64.3f)
                lineTo(128.0f, 384.0f)
                horizontalLineToRelative(384.0f)
                close()
                moveTo(211.2f, 202.0f)
                lineToRelative(25.5f, -25.3f)
                curveToRelative(4.2f, -4.2f, 11.0f, -4.2f, 15.2f, 0.1f)
                lineToRelative(41.3f, 41.6f)
                lineToRelative(95.2f, -94.4f)
                curveToRelative(4.2f, -4.2f, 11.0f, -4.2f, 15.2f, 0.1f)
                lineToRelative(25.3f, 25.5f)
                curveToRelative(4.2f, 4.2f, 4.2f, 11.0f, -0.1f, 15.2f)
                lineTo(300.5f, 292.0f)
                curveToRelative(-4.2f, 4.2f, -11.0f, 4.2f, -15.2f, -0.1f)
                lineToRelative(-74.1f, -74.7f)
                curveToRelative(-4.3f, -4.2f, -4.2f, -11.0f, 0.0f, -15.2f)
                close()
            }
        }
        .build()
        return _voteYea!!
    }

private var _voteYea: ImageVector? = null
