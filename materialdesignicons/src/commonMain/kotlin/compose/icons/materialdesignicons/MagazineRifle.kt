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

public val MaterialDesignIcons.MagazineRifle: ImageVector
    get() {
        if (_magazineRifle != null) {
            return _magazineRifle!!
        }
        _magazineRifle = Builder(name = "MagazineRifle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                lineTo(5.0f, 19.0f)
                lineTo(14.0f, 23.0f)
                lineTo(18.0f, 13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(1.0f)
                moveTo(10.0f, 3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.88f)
                verticalLineTo(13.45f)
                lineTo(9.6f, 18.14f)
                lineTo(8.0f, 17.5f)
                lineTo(10.0f, 13.5f)
                close()
            }
        }
        .build()
        return _magazineRifle!!
    }

private var _magazineRifle: ImageVector? = null
