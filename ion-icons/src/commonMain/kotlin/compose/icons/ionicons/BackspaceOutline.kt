package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BackspaceOutline: ImageVector
    get() {
        if (_backspaceOutline != null) {
            return _backspaceOutline!!
        }
        _backspaceOutline = Builder(name = "BackspaceOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(135.19f, 390.14f)
                arcTo(28.79f, 28.79f, 0.0f, false, false, 156.87f, 400.0f)
                horizontalLineTo(403.13f)
                arcTo(29.0f, 29.0f, 0.0f, false, false, 432.0f, 371.13f)
                verticalLineTo(140.87f)
                arcTo(29.0f, 29.0f, 0.0f, false, false, 403.13f, 112.0f)
                horizontalLineTo(156.87f)
                arcToRelative(28.84f, 28.84f, 0.0f, false, false, -21.67f, 9.84f)
                verticalLineToRelative(0.0f)
                lineTo(46.33f, 256.0f)
                lineToRelative(88.86f, 134.11f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(336.67f, 192.33f)
                lineTo(206.66f, 322.34f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(336.67f, 322.34f)
                lineTo(206.66f, 192.33f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(336.67f, 192.33f)
                lineTo(206.66f, 322.34f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(336.67f, 322.34f)
                lineTo(206.66f, 192.33f)
            }
        }
        .build()
        return _backspaceOutline!!
    }

private var _backspaceOutline: ImageVector? = null
