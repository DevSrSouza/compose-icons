package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) {
            return _heartBreak!!
        }
        _heartBreak = Builder(name = "HeartBreak", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 92.0f)
                curveToRelative(0.0f, 30.6f, -17.7f, 62.0f, -52.6f, 93.4f)
                arcTo(314.3f, 314.3f, 0.0f, false, true, 131.9f, 223.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.8f, 0.0f)
                curveTo(119.8f, 220.6f, 20.0f, 163.9f, 20.0f, 92.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 92.3f, -50.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.6f, 6.2f)
                lineToRelative(-18.0f, 18.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.3f)
                lineToRelative(34.4f, 34.3f)
                lineToRelative(-15.0f, 15.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.0f, 11.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.6f, 2.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, -2.3f)
                lineToRelative(20.7f, -20.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.3f)
                lineTo(111.9f, 71.2f)
                lineToRelative(21.7f, -21.6f)
                horizontalLineToRelative(0.0f)
                arcTo(59.3f, 59.3f, 0.0f, false, true, 176.0f, 32.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 236.0f, 92.0f)
                close()
            }
        }
        .build()
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
