package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.SparklesOutline: ImageVector
    get() {
        if (_sparklesOutline != null) {
            return _sparklesOutline!!
        }
        _sparklesOutline = Builder(name = "SparklesOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(259.92f, 262.91f)
                lineTo(216.4f, 149.77f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -16.8f, 0.0f)
                lineTo(156.08f, 262.91f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -5.17f, 5.17f)
                lineTo(37.77f, 311.6f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, 16.8f)
                lineToRelative(113.14f, 43.52f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 5.17f, 5.17f)
                lineTo(199.6f, 490.23f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 16.8f, 0.0f)
                lineToRelative(43.52f, -113.14f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 5.17f, -5.17f)
                lineTo(378.23f, 328.4f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, -16.8f)
                lineTo(265.09f, 268.08f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 259.92f, 262.91f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(108.0f, 68.0f)
                lineToRelative(-20.0f, -52.0f)
                lineToRelative(-20.0f, 52.0f)
                lineToRelative(-52.0f, 20.0f)
                lineToRelative(52.0f, 20.0f)
                lineToRelative(20.0f, 52.0f)
                lineToRelative(20.0f, -52.0f)
                lineToRelative(52.0f, -20.0f)
                lineToRelative(-52.0f, -20.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(426.67f, 117.33f)
                lineToRelative(-26.67f, -69.33f)
                lineToRelative(-26.67f, 69.33f)
                lineToRelative(-69.33f, 26.67f)
                lineToRelative(69.33f, 26.67f)
                lineToRelative(26.67f, 69.33f)
                lineToRelative(26.67f, -69.33f)
                lineToRelative(69.33f, -26.67f)
                lineToRelative(-69.33f, -26.67f)
                close()
            }
        }
        .build()
        return _sparklesOutline!!
    }

private var _sparklesOutline: ImageVector? = null
