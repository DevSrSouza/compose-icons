package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.CurrencyLira: ImageVector
    get() {
        if (_currencyLira != null) {
            return _currencyLira!!
        }
        _currencyLira = Builder(name = "CurrencyLira", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 8.76f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.51f)
                lineTo(15.0f, 5.0f)
                verticalLineToRelative(2.36f)
                lineToRelative(-4.0f, 2.51f)
                lineToRelative(0.01f, 2.35f)
                lineTo(15.0f, 9.72f)
                verticalLineToRelative(2.36f)
                lineToRelative(-4.0f, 2.51f)
                verticalLineTo(19.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 3.87f, -3.13f, 7.0f, -7.0f, 7.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-5.16f)
                lineToRelative(-3.0f, 1.88f)
                lineToRelative(0.0f, -2.36f)
                lineToRelative(3.0f, -1.88f)
                verticalLineToRelative(-2.36f)
                lineTo(6.0f, 13.0f)
                lineToRelative(0.0f, -2.36f)
                lineTo(9.0f, 8.76f)
                close()
            }
        }
        .build()
        return _currencyLira!!
    }

private var _currencyLira: ImageVector? = null
