package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.NoDrinks: ImageVector
    get() {
        if (_noDrinks != null) {
            return _noDrinks!!
        }
        _noDrinks = Builder(name = "NoDrinks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.83f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-6.2f, 6.97f)
                lineTo(9.83f, 7.0f)
                horizontalLineToRelative(6.74f)
                lineToRelative(1.78f, -2.0f)
                horizontalLineTo(7.83f)
                lineTo(5.83f, 3.0f)
                close()
                moveTo(19.78f, 22.61f)
                lineTo(18.0f, 20.83f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(-1.37f, -1.54f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.0f, 3.0f)
                lineToRelative(18.19f, 18.19f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(16.17f, 19.0f)
                lineTo(13.0f, 15.83f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.17f)
                close()
            }
        }
        .build()
        return _noDrinks!!
    }

private var _noDrinks: ImageVector? = null
