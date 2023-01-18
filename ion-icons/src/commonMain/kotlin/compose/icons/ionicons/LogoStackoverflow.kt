package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoStackoverflow: ImageVector
    get() {
        if (_logoStackoverflow != null) {
            return _logoStackoverflow!!
        }
        _logoStackoverflow = Builder(name = "LogoStackoverflow", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(392.0f, 440.0f)
                verticalLineTo(320.0f)
                horizontalLineToRelative(40.0f)
                verticalLineTo(480.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(320.0f)
                horizontalLineToRelative(40.0f)
                verticalLineTo(440.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(149.1f, 308.77f)
                lineToRelative(198.57f, 40.87f)
                lineToRelative(8.4f, -39.32f)
                lineTo(157.5f, 269.45f)
                close()
                moveTo(175.37f, 215.65f)
                lineTo(359.22f, 300.0f)
                lineTo(376.0f, 263.76f)
                lineTo(192.18f, 178.92f)
                close()
                moveTo(226.32f, 126.65f)
                lineTo(382.32f, 254.43f)
                lineTo(408.06f, 223.91f)
                lineTo(252.06f, 96.13f)
                close()
                moveTo(328.0f, 32.0f)
                lineTo(294.61f, 55.8f)
                lineTo(415.43f, 216.17f)
                lineTo(448.0f, 192.0f)
                close()
                moveTo(144.0f, 400.0f)
                lineTo(348.0f, 400.0f)
                lineTo(348.0f, 360.0f)
                lineTo(144.0f, 360.0f)
                close()
            }
        }
        .build()
        return _logoStackoverflow!!
    }

private var _logoStackoverflow: ImageVector? = null
