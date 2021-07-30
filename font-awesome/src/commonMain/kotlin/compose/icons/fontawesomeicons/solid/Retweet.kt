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

public val SolidGroup.Retweet: ImageVector
    get() {
        if (_retweet != null) {
            return _retweet!!
        }
        _retweet = Builder(name = "Retweet", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(629.657f, 343.598f)
                lineTo(528.971f, 444.284f)
                curveToRelative(-9.373f, 9.372f, -24.568f, 9.372f, -33.941f, 0.0f)
                lineTo(394.343f, 343.598f)
                curveToRelative(-9.373f, -9.373f, -9.373f, -24.569f, 0.0f, -33.941f)
                lineToRelative(10.823f, -10.823f)
                curveToRelative(9.562f, -9.562f, 25.133f, -9.34f, 34.419f, 0.492f)
                lineTo(480.0f, 342.118f)
                lineTo(480.0f, 160.0f)
                lineTo(292.451f, 160.0f)
                arcToRelative(24.005f, 24.005f, 0.0f, false, true, -16.971f, -7.029f)
                lineToRelative(-16.0f, -16.0f)
                curveTo(244.361f, 121.851f, 255.069f, 96.0f, 276.451f, 96.0f)
                lineTo(520.0f, 96.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, 10.745f, 24.0f, 24.0f)
                verticalLineToRelative(222.118f)
                lineToRelative(40.416f, -42.792f)
                curveToRelative(9.285f, -9.831f, 24.856f, -10.054f, 34.419f, -0.492f)
                lineToRelative(10.823f, 10.823f)
                curveToRelative(9.372f, 9.372f, 9.372f, 24.569f, -0.001f, 33.941f)
                close()
                moveTo(364.519f, 359.029f)
                arcTo(23.999f, 23.999f, 0.0f, false, false, 347.548f, 352.0f)
                lineTo(160.0f, 352.0f)
                lineTo(160.0f, 169.881f)
                lineToRelative(40.416f, 42.792f)
                curveToRelative(9.286f, 9.831f, 24.856f, 10.054f, 34.419f, 0.491f)
                lineToRelative(10.822f, -10.822f)
                curveToRelative(9.373f, -9.373f, 9.373f, -24.569f, 0.0f, -33.941f)
                lineTo(144.971f, 67.716f)
                curveToRelative(-9.373f, -9.373f, -24.569f, -9.373f, -33.941f, 0.0f)
                lineTo(10.343f, 168.402f)
                curveToRelative(-9.373f, 9.373f, -9.373f, 24.569f, 0.0f, 33.941f)
                lineToRelative(10.822f, 10.822f)
                curveToRelative(9.562f, 9.562f, 25.133f, 9.34f, 34.419f, -0.491f)
                lineTo(96.0f, 169.881f)
                lineTo(96.0f, 392.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(243.549f)
                curveToRelative(21.382f, 0.0f, 32.09f, -25.851f, 16.971f, -40.971f)
                lineToRelative(-16.001f, -16.0f)
                close()
            }
        }
        .build()
        return _retweet!!
    }

private var _retweet: ImageVector? = null
