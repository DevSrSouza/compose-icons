package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.TempleHinduOutline: ImageVector
    get() {
        if (_templeHinduOutline != null) {
            return _templeHinduOutline!!
        }
        _templeHinduOutline = Builder(name = "TempleHinduOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                lineTo(15.0f, 3.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.1f)
                lineTo(6.0f, 13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                moveTo(15.3f, 11.0f)
                horizontalLineTo(8.7f)
                lineTo(9.3f, 9.0f)
                horizontalLineTo(14.7f)
                lineTo(15.3f, 11.0f)
                moveTo(14.1f, 7.0f)
                horizontalLineTo(9.9f)
                lineTo(10.5f, 5.0f)
                horizontalLineTo(13.5f)
                lineTo(14.1f, 7.0f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.5f)
                lineTo(8.1f, 13.0f)
                horizontalLineTo(15.9f)
                lineTo(16.5f, 15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _templeHinduOutline!!
    }

private var _templeHinduOutline: ImageVector? = null
