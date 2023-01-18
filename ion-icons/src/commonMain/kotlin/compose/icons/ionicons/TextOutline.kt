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

public val IonIcons.TextOutline: ImageVector
    get() {
        if (_textOutline != null) {
            return _textOutline!!
        }
        _textOutline = Builder(name = "TextOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 415.5f)
                lineToRelative(120.0f, -320.0f)
                lineToRelative(120.0f, 320.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(230.0f, 303.5f)
                lineTo(74.0f, 303.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(326.0f, 239.5f)
                curveToRelative(12.19f, -28.69f, 41.0f, -48.0f, 74.0f, -48.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(46.0f, 0.0f, 80.0f, 32.0f, 80.0f, 80.0f)
                verticalLineToRelative(144.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 358.5f)
                curveToRelative(0.0f, 36.0f, 26.86f, 58.0f, 60.0f, 58.0f)
                curveToRelative(54.0f, 0.0f, 100.0f, -27.0f, 100.0f, -106.0f)
                verticalLineToRelative(-15.0f)
                curveToRelative(-20.0f, 0.0f, -58.0f, 1.0f, -92.0f, 5.0f)
                curveTo(355.23f, 304.36f, 320.0f, 319.5f, 320.0f, 358.5f)
                close()
            }
        }
        .build()
        return _textOutline!!
    }

private var _textOutline: ImageVector? = null
