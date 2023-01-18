package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.MicOffLine: ImageVector
    get() {
        if (_micOffLine != null) {
            return _micOffLine!!
        }
        _micOffLine = Builder(name = "MicOffLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.425f, 17.839f)
                arcTo(8.941f, 8.941f, 0.0f, false, true, 13.0f, 18.945f)
                lineTo(13.0f, 23.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.055f)
                arcTo(9.004f, 9.004f, 0.0f, false, true, 3.055f, 11.0f)
                lineTo(5.07f, 11.0f)
                arcToRelative(7.002f, 7.002f, 0.0f, false, false, 9.87f, 5.354f)
                lineToRelative(-1.551f, -1.55f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 10.0f)
                lineTo(7.0f, 8.414f)
                lineTo(1.393f, 2.808f)
                lineToRelative(1.415f, -1.415f)
                lineToRelative(19.799f, 19.8f)
                lineToRelative(-1.415f, 1.414f)
                lineToRelative(-4.767f, -4.768f)
                close()
                moveTo(9.033f, 10.447f)
                lineToRelative(2.52f, 2.52f)
                arcToRelative(3.002f, 3.002f, 0.0f, false, true, -2.52f, -2.52f)
                close()
                moveTo(19.375f, 15.16f)
                lineToRelative(-1.443f, -1.442f)
                curveToRelative(0.509f, -0.81f, 0.856f, -1.73f, 0.997f, -2.718f)
                horizontalLineToRelative(2.016f)
                arcToRelative(8.95f, 8.95f, 0.0f, false, true, -1.57f, 4.16f)
                close()
                moveTo(16.465f, 12.251f)
                lineToRelative(-1.548f, -1.548f)
                curveToRelative(0.054f, -0.226f, 0.083f, -0.46f, 0.083f, -0.703f)
                lineTo(15.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -5.818f, -1.032f)
                lineTo(7.686f, 3.471f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 6.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, true, -0.534f, 2.251f)
                close()
            }
        }
        .build()
        return _micOffLine!!
    }

private var _micOffLine: ImageVector? = null
