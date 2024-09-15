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
                moveTo(629.66f, 343.6f)
                lineTo(528.97f, 444.28f)
                curveToRelative(-9.37f, 9.37f, -24.57f, 9.37f, -33.94f, 0.0f)
                lineTo(394.34f, 343.6f)
                curveToRelative(-9.37f, -9.37f, -9.37f, -24.57f, 0.0f, -33.94f)
                lineToRelative(10.82f, -10.82f)
                curveToRelative(9.56f, -9.56f, 25.13f, -9.34f, 34.42f, 0.49f)
                lineTo(480.0f, 342.12f)
                lineTo(480.0f, 160.0f)
                lineTo(292.45f, 160.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -16.97f, -7.03f)
                lineToRelative(-16.0f, -16.0f)
                curveTo(244.36f, 121.85f, 255.07f, 96.0f, 276.45f, 96.0f)
                lineTo(520.0f, 96.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, 10.74f, 24.0f, 24.0f)
                verticalLineToRelative(222.12f)
                lineToRelative(40.42f, -42.79f)
                curveToRelative(9.28f, -9.83f, 24.86f, -10.05f, 34.42f, -0.49f)
                lineToRelative(10.82f, 10.82f)
                curveToRelative(9.37f, 9.37f, 9.37f, 24.57f, -0.0f, 33.94f)
                close()
                moveTo(364.52f, 359.03f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 347.55f, 352.0f)
                lineTo(160.0f, 352.0f)
                lineTo(160.0f, 169.88f)
                lineToRelative(40.42f, 42.79f)
                curveToRelative(9.29f, 9.83f, 24.86f, 10.05f, 34.42f, 0.49f)
                lineToRelative(10.82f, -10.82f)
                curveToRelative(9.37f, -9.37f, 9.37f, -24.57f, 0.0f, -33.94f)
                lineTo(144.97f, 67.72f)
                curveToRelative(-9.37f, -9.37f, -24.57f, -9.37f, -33.94f, 0.0f)
                lineTo(10.34f, 168.4f)
                curveToRelative(-9.37f, 9.37f, -9.37f, 24.57f, 0.0f, 33.94f)
                lineToRelative(10.82f, 10.82f)
                curveToRelative(9.56f, 9.56f, 25.13f, 9.34f, 34.42f, -0.49f)
                lineTo(96.0f, 169.88f)
                lineTo(96.0f, 392.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(243.55f)
                curveToRelative(21.38f, 0.0f, 32.09f, -25.85f, 16.97f, -40.97f)
                lineToRelative(-16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _retweet!!
    }

private var _retweet: ImageVector? = null
