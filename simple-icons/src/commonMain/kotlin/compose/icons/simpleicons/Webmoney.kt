package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Webmoney: ImageVector
    get() {
        if (_webmoney != null) {
            return _webmoney!!
        }
        _webmoney = Builder(name = "Webmoney", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.943f, 0.183f)
                curveToRelative(1.872f, 0.0f, 3.654f, 0.429f, 5.252f, 1.196f)
                curveToRelative(0.251f, 0.113f, 0.503f, 0.249f, 0.753f, 0.384f)
                lineToRelative(-1.096f, 0.971f)
                lineToRelative(-1.643f, -1.693f)
                lineToRelative(-2.832f, 2.483f)
                lineTo(10.71f, 1.74f)
                lineTo(5.503f, 6.368f)
                lineToRelative(3.334f, 3.635f)
                lineToRelative(-1.301f, 1.128f)
                lineToRelative(3.289f, 3.635f)
                lineToRelative(-1.301f, 1.128f)
                lineToRelative(4.705f, 5.17f)
                lineToRelative(2.784f, -2.529f)
                lineToRelative(2.422f, 2.71f)
                curveToRelative(-0.48f, 0.361f, -1.005f, 0.723f, -1.575f, 1.039f)
                arcToRelative(12.042f, 12.042f, 0.0f, false, true, -5.892f, 1.534f)
                curveTo(5.366f, 23.817f, 0.0f, 18.514f, 0.0f, 11.99f)
                curveTo(-0.023f, 5.51f, 5.344f, 0.183f, 11.943f, 0.183f)
                close()
                moveTo(9.75f, 11.267f)
                lineToRelative(2.855f, -2.529f)
                lineToRelative(2.558f, 2.822f)
                lineToRelative(-2.855f, 2.528f)
                close()
                moveTo(11.783f, 16.143f)
                lineToRelative(2.831f, -2.551f)
                lineToRelative(2.581f, 2.822f)
                lineToRelative(-2.855f, 2.529f)
                close()
                moveTo(7.719f, 6.459f)
                lineToRelative(2.854f, -2.529f)
                lineToRelative(2.558f, 2.822f)
                lineToRelative(-2.855f, 2.529f)
                close()
                moveTo(12.947f, 5.104f)
                lineToRelative(2.124f, -1.896f)
                lineTo(16.99f, 5.307f)
                lineToRelative(-2.124f, 1.919f)
                close()
                moveTo(16.739f, 13.795f)
                lineToRelative(2.123f, -1.896f)
                lineToRelative(1.919f, 2.122f)
                lineToRelative(-2.124f, 1.898f)
                close()
                moveTo(18.611f, 18.062f)
                lineToRelative(2.124f, -1.897f)
                lineToRelative(1.917f, 2.099f)
                lineToRelative(-2.123f, 1.918f)
                close()
                moveTo(19.479f, 8.309f)
                lineToRelative(1.416f, -1.264f)
                lineToRelative(1.278f, 1.4f)
                lineToRelative(-1.416f, 1.264f)
                close()
                moveTo(17.652f, 4.133f)
                lineToRelative(1.416f, -1.286f)
                lineToRelative(1.279f, 1.422f)
                lineToRelative(-1.417f, 1.264f)
                close()
                moveTo(21.283f, 12.486f)
                lineToRelative(1.416f, -1.264f)
                lineTo(24.0f, 12.622f)
                lineToRelative(-1.438f, 1.264f)
                close()
                moveTo(14.912f, 9.348f)
                lineToRelative(2.124f, -1.896f)
                lineToRelative(1.918f, 2.099f)
                lineToRelative(-2.123f, 1.897f)
                close()
            }
        }
        .build()
        return _webmoney!!
    }

private var _webmoney: ImageVector? = null
