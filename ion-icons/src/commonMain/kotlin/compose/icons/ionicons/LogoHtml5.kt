package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoHtml5: ImageVector
    get() {
        if (_logoHtml5 != null) {
            return _logoHtml5!!
        }
        _logoHtml5 = Builder(name = "LogoHtml5", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                lineTo(98.94f, 435.21f)
                lineTo(255.77f, 480.0f)
                lineTo(413.0f, 435.15f)
                lineTo(448.0f, 32.0f)
                close()
                moveTo(372.0f, 164.0f)
                horizontalLineTo(188.0f)
                lineToRelative(4.0f, 51.0f)
                horizontalLineTo(368.0f)
                lineTo(354.49f, 366.39f)
                lineTo(256.0f, 394.48f)
                lineToRelative(-98.68f, -28.0f)
                lineTo(150.54f, 289.0f)
                horizontalLineTo(198.8f)
                lineToRelative(3.42f, 39.29f)
                lineTo(256.0f, 343.07f)
                lineToRelative(53.42f, -14.92f)
                lineTo(315.0f, 264.0f)
                horizontalLineTo(148.0f)
                lineTo(135.41f, 114.41f)
                lineToRelative(240.79f, 0.0f)
                close()
            }
        }
        .build()
        return _logoHtml5!!
    }

private var _logoHtml5: ImageVector? = null
