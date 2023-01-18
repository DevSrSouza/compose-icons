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

public val IonIcons.LogoCss3: ImageVector
    get() {
        if (_logoCss3 != null) {
            return _logoCss3!!
        }
        _logoCss3 = Builder(name = "LogoCss3", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                lineTo(99.0f, 435.22f)
                lineTo(255.77f, 480.0f)
                lineTo(413.0f, 435.15f)
                lineTo(448.0f, 32.0f)
                close()
                moveTo(354.68f, 366.9f)
                lineTo(256.07f, 395.0f)
                lineToRelative(-98.46f, -28.24f)
                lineTo(150.86f, 289.0f)
                horizontalLineToRelative(48.26f)
                lineToRelative(3.43f, 39.56f)
                lineToRelative(53.59f, 15.16f)
                lineToRelative(0.13f, 0.28f)
                horizontalLineToRelative(0.0f)
                lineToRelative(53.47f, -14.85f)
                lineTo(315.38f, 265.0f)
                horizontalLineTo(203.0f)
                lineToRelative(-4.0f, -50.0f)
                horizontalLineTo(319.65f)
                lineTo(324.0f, 164.0f)
                horizontalLineTo(140.0f)
                lineToRelative(-4.0f, -49.0f)
                horizontalLineTo(376.58f)
                close()
            }
        }
        .build()
        return _logoCss3!!
    }

private var _logoCss3: ImageVector? = null
