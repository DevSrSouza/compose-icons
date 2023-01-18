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

public val IonIcons.Pricetag: ImageVector
    get() {
        if (_pricetag != null) {
            return _pricetag!!
        }
        _pricetag = Builder(name = "Pricetag", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(467.0f, 45.2f)
                arcTo(44.45f, 44.45f, 0.0f, false, false, 435.29f, 32.0f)
                horizontalLineTo(312.36f)
                arcToRelative(30.63f, 30.63f, 0.0f, false, false, -21.52f, 8.89f)
                lineTo(45.09f, 286.59f)
                arcToRelative(44.82f, 44.82f, 0.0f, false, false, 0.0f, 63.32f)
                lineToRelative(117.0f, 117.0f)
                arcToRelative(44.83f, 44.83f, 0.0f, false, false, 63.34f, 0.0f)
                lineToRelative(245.65f, -245.6f)
                arcTo(30.6f, 30.6f, 0.0f, false, false, 480.0f, 199.8f)
                verticalLineToRelative(-123.0f)
                arcTo(44.24f, 44.24f, 0.0f, false, false, 467.0f, 45.2f)
                close()
                moveTo(384.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 384.0f, 160.0f)
                close()
            }
        }
        .build()
        return _pricetag!!
    }

private var _pricetag: ImageVector? = null
