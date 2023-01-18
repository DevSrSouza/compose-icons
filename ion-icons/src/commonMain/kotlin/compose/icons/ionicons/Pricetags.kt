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

public val IonIcons.Pricetags: ImageVector
    get() {
        if (_pricetags != null) {
            return _pricetags!!
        }
        _pricetags = Builder(name = "Pricetags", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 183.8f)
                verticalLineToRelative(-123.0f)
                arcTo(44.66f, 44.66f, 0.0f, false, false, 403.29f, 16.0f)
                horizontalLineTo(280.36f)
                arcToRelative(30.62f, 30.62f, 0.0f, false, false, -21.51f, 8.89f)
                lineTo(13.09f, 270.58f)
                arcToRelative(44.86f, 44.86f, 0.0f, false, false, 0.0f, 63.34f)
                lineToRelative(117.0f, 117.0f)
                arcToRelative(44.84f, 44.84f, 0.0f, false, false, 63.33f, 0.0f)
                lineTo(439.11f, 205.31f)
                arcTo(30.6f, 30.6f, 0.0f, false, false, 448.0f, 183.8f)
                close()
                moveTo(352.0f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 352.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineTo(207.37f)
                lineTo(218.69f, 468.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 22.62f, 22.62f)
                lineToRelative(262.0f, -262.0f)
                arcTo(29.84f, 29.84f, 0.0f, false, false, 512.0f, 208.0f)
                verticalLineTo(80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 496.0f, 64.0f)
                close()
            }
        }
        .build()
        return _pricetags!!
    }

private var _pricetags: ImageVector? = null
