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

public val IonIcons.LogoXing: ImageVector
    get() {
        if (_logoXing != null) {
            return _logoXing!!
        }
        _logoXing = Builder(name = "LogoXing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(313.8f, 303.9f)
                lineTo(469.0f, 32.0f)
                horizontalLineTo(365.0f)
                lineTo(209.4f, 303.8f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, 0.0f, 1.7f)
                lineToRelative(98.9f, 173.8f)
                curveToRelative(0.4f, 0.7f, 0.8f, 0.7f, 1.6f, 0.7f)
                horizontalLineTo(413.0f)
                lineTo(313.7f, 305.3f)
                arcTo(1.74f, 1.74f, 0.0f, false, true, 313.8f, 303.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.9f, 216.2f)
                lineTo(163.0f, 113.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -1.0f)
                horizontalLineTo(65.0f)
                lineToRelative(58.9f, 104.4f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, true, 0.1f, 0.8f)
                lineTo(43.0f, 352.0f)
                horizontalLineToRelative(96.8f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, false, 1.6f, -0.9f)
                lineToRelative(80.5f, -133.7f)
                arcTo(2.44f, 2.44f, 0.0f, false, false, 221.9f, 216.2f)
                close()
            }
        }
        .build()
        return _logoXing!!
    }

private var _logoXing: ImageVector? = null
