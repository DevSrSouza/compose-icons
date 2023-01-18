package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Cardholder: ImageVector
    get() {
        if (_cardholder != null) {
            return _cardholder!!
        }
        _cardholder = Builder(name = "Cardholder", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 44.0f)
                horizontalLineTo(48.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 20.0f, 72.0f)
                verticalLineTo(184.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineTo(208.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, -28.0f)
                verticalLineTo(72.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 208.0f, 44.0f)
                close()
                moveTo(48.0f, 68.0f)
                horizontalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineTo(88.0f)
                horizontalLineTo(167.2f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -19.6f, 16.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -39.2f, 0.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 88.8f, 88.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 48.0f, 68.0f)
                close()
                moveTo(208.0f, 188.0f)
                horizontalLineTo(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(112.0f)
                horizontalLineTo(85.7f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 84.6f, 0.0f)
                horizontalLineTo(212.0f)
                verticalLineToRelative(72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 188.0f)
                close()
            }
        }
        .build()
        return _cardholder!!
    }

private var _cardholder: ImageVector? = null
