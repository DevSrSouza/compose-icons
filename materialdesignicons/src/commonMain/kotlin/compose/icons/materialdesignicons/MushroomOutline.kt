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

public val MaterialDesignIcons.MushroomOutline: ImageVector
    get() {
        if (_mushroomOutline != null) {
            return _mushroomOutline!!
        }
        _mushroomOutline = Builder(name = "MushroomOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 8.27f, 17.44f, 5.13f, 14.0f, 4.25f)
                curveTo(13.86f, 5.24f, 13.0f, 6.0f, 12.0f, 6.0f)
                curveTo(11.0f, 6.0f, 10.14f, 5.24f, 10.0f, 4.25f)
                curveTo(6.56f, 5.13f, 4.0f, 8.27f, 4.0f, 12.0f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 14.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(13.5f, 17.0f)
                horizontalLineTo(10.5f)
                lineTo(9.92f, 19.0f)
                lineTo(9.65f, 20.0f)
                horizontalLineTo(14.35f)
                lineTo(14.08f, 19.0f)
                lineTo(13.5f, 17.0f)
                moveTo(15.0f, 15.0f)
                lineTo(16.0f, 18.5f)
                lineTo(16.27f, 19.45f)
                lineTo(16.35f, 20.0f)
                curveTo(16.35f, 21.1f, 15.45f, 22.0f, 14.35f, 22.0f)
                horizontalLineTo(9.65f)
                lineTo(9.17f, 21.94f)
                curveTo(8.1f, 21.66f, 7.45f, 20.57f, 7.73f, 19.5f)
                lineTo(8.0f, 18.5f)
                lineTo(9.0f, 15.0f)
                horizontalLineTo(15.0f)
                moveTo(16.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 7.0f)
                moveTo(8.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 7.0f)
                close()
            }
        }
        .build()
        return _mushroomOutline!!
    }

private var _mushroomOutline: ImageVector? = null
