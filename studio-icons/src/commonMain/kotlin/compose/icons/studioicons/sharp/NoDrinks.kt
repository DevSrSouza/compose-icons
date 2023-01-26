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

public val SharpGroup.NoDrinks: ImageVector
    get() {
        if (_noDrinks != null) {
            return _noDrinks!!
        }
        _noDrinks = Builder(name = "NoDrinks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(8.23f, 8.23f)
                lineTo(11.0f, 14.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-0.17f)
                lineToRelative(1.78f, 1.78f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(13.0f, 19.0f)
                verticalLineToRelative(-3.17f)
                lineTo(16.17f, 19.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(7.83f, 5.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-6.2f, 6.97f)
                lineTo(9.83f, 7.0f)
                horizontalLineToRelative(6.74f)
                lineToRelative(1.78f, -2.0f)
                horizontalLineTo(7.83f)
                close()
            }
        }
        .build()
        return _noDrinks!!
    }

private var _noDrinks: ImageVector? = null
