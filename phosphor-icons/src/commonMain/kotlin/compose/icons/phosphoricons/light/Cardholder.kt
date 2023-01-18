package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Cardholder: ImageVector
    get() {
        if (_cardholder != null) {
            return _cardholder!!
        }
        _cardholder = Builder(name = "Cardholder", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 50.0f)
                horizontalLineTo(48.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 26.0f, 72.0f)
                verticalLineTo(184.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 22.0f, 22.0f)
                horizontalLineTo(208.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 22.0f, -22.0f)
                verticalLineTo(72.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 208.0f, 50.0f)
                close()
                moveTo(38.0f, 94.0f)
                horizontalLineTo(218.0f)
                verticalLineToRelative(20.0f)
                horizontalLineTo(167.2f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.7f, 11.2f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -51.0f, 0.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 88.8f, 114.0f)
                horizontalLineTo(38.0f)
                close()
                moveTo(48.0f, 62.0f)
                horizontalLineTo(208.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                verticalLineTo(82.0f)
                horizontalLineTo(38.0f)
                verticalLineTo(72.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 48.0f, 62.0f)
                close()
                moveTo(208.0f, 194.0f)
                horizontalLineTo(48.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                verticalLineTo(126.0f)
                horizontalLineTo(88.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 1.6f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 74.4f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -1.6f)
                horizontalLineTo(218.0f)
                verticalLineToRelative(58.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 208.0f, 194.0f)
                close()
            }
        }
        .build()
        return _cardholder!!
    }

private var _cardholder: ImageVector? = null
