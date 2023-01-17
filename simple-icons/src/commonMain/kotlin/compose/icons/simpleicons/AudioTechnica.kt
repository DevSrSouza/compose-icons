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

public val SimpleIcons.Audiotechnica: ImageVector
    get() {
        if (_audiotechnica != null) {
            return _audiotechnica!!
        }
        _audiotechnica = Builder(name = "Audiotechnica", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(11.992f, 11.992f, 0.0f, false, false, 0.015f, 11.985f)
                arcTo(12.019f, 12.019f, 0.0f, false, false, 12.0f, 24.0f)
                arcToRelative(12.019f, 12.019f, 0.0f, false, false, 11.985f, -12.015f)
                arcTo(11.992f, 11.992f, 0.0f, false, false, 12.004f, 0.0f)
                close()
                moveTo(12.0f, 0.903f)
                arcToRelative(11.078f, 11.078f, 0.0f, false, true, 11.085f, 11.078f)
                curveToRelative(0.0f, 6.123f, -4.958f, 11.112f, -11.085f, 11.112f)
                arcTo(11.104f, 11.104f, 0.0f, false, true, 0.922f, 11.985f)
                arcTo(11.078f, 11.078f, 0.0f, false, true, 11.996f, 0.907f)
                close()
                moveTo(12.087f, 2.063f)
                lineToRelative(-0.43f, 1.252f)
                lineToRelative(-5.674f, 16.063f)
                lineToRelative(-0.204f, 0.604f)
                horizontalLineToRelative(12.654f)
                lineToRelative(-0.23f, -0.604f)
                lineTo(12.524f, 3.31f)
                close()
                moveTo(12.087f, 4.86f)
                lineToRelative(2.007f, 5.643f)
                lineToRelative(-3.024f, 8.553f)
                lineTo(7.056f, 19.056f)
                close()
                moveTo(14.589f, 11.898f)
                lineToRelative(2.532f, 7.155f)
                horizontalLineToRelative(-5.09f)
                close()
            }
        }
        .build()
        return _audiotechnica!!
    }

private var _audiotechnica: ImageVector? = null
