package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Cardholder: ImageVector
    get() {
        if (_cardholder != null) {
            return _cardholder!!
        }
        _cardholder = Builder(name = "Cardholder", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 52.0f)
                horizontalLineTo(48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 28.0f, 72.0f)
                verticalLineTo(184.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(72.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 208.0f, 52.0f)
                close()
                moveTo(36.0f, 92.0f)
                horizontalLineTo(220.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(167.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -11.8f, 9.6f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -54.8f, 0.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 88.8f, 116.0f)
                horizontalLineTo(36.0f)
                close()
                moveTo(48.0f, 60.0f)
                horizontalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineTo(84.0f)
                horizontalLineTo(36.0f)
                verticalLineTo(72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 60.0f)
                close()
                moveTo(208.0f, 196.0f)
                horizontalLineTo(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(124.0f)
                horizontalLineTo(88.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.9f, 3.2f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 70.6f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.9f, -3.2f)
                horizontalLineTo(220.0f)
                verticalLineToRelative(60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 208.0f, 196.0f)
                close()
            }
        }
        .build()
        return _cardholder!!
    }

private var _cardholder: ImageVector? = null
