package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.DualScreenPagination: ImageVector
    get() {
        if (_dualScreenPagination != null) {
            return _dualScreenPagination!!
        }
        _dualScreenPagination = Builder(name = "DualScreenPagination", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2451f, 4.0044f)
                curveTo(21.2116f, 4.0044f, 21.9951f, 4.7879f, 21.9951f, 5.7544f)
                verticalLineTo(18.2495f)
                curveTo(21.9951f, 19.216f, 21.2116f, 19.9995f, 20.2451f, 19.9995f)
                horizontalLineTo(12.9976f)
                curveTo(12.9108f, 19.9995f, 12.8255f, 19.9932f, 12.7421f, 19.981f)
                lineTo(12.742f, 4.0229f)
                curveTo(12.8254f, 4.0107f, 12.9108f, 4.0044f, 12.9976f, 4.0044f)
                horizontalLineTo(20.2451f)
                close()
                moveTo(10.9976f, 4.0019f)
                curveTo(11.0809f, 4.0019f, 11.1629f, 4.0078f, 11.2431f, 4.0191f)
                lineTo(11.2428f, 19.98f)
                curveTo(11.1627f, 19.9913f, 11.0808f, 19.9971f, 10.9976f, 19.9971f)
                horizontalLineTo(3.75f)
                curveTo(2.7835f, 19.9971f, 2.0f, 19.2136f, 2.0f, 18.2471f)
                verticalLineTo(5.7519f)
                curveTo(2.0f, 4.7854f, 2.7835f, 4.0019f, 3.75f, 4.0019f)
                horizontalLineTo(10.9976f)
                close()
                moveTo(17.6251f, 16.5007f)
                curveTo(17.2109f, 16.5007f, 16.8751f, 16.8365f, 16.8751f, 17.2507f)
                curveTo(16.8751f, 17.6649f, 17.2109f, 18.0007f, 17.6251f, 18.0007f)
                curveTo(18.0394f, 18.0007f, 18.3751f, 17.6649f, 18.3751f, 17.2507f)
                curveTo(18.3751f, 16.8365f, 18.0394f, 16.5007f, 17.6251f, 16.5007f)
                close()
                moveTo(20.1251f, 16.5007f)
                curveTo(19.7109f, 16.5007f, 19.3751f, 16.8365f, 19.3751f, 17.2507f)
                curveTo(19.3751f, 17.6649f, 19.7109f, 18.0007f, 20.1251f, 18.0007f)
                curveTo(20.5394f, 18.0007f, 20.8751f, 17.6649f, 20.8751f, 17.2507f)
                curveTo(20.8751f, 16.8365f, 20.5394f, 16.5007f, 20.1251f, 16.5007f)
                close()
                moveTo(15.1251f, 16.5007f)
                curveTo(14.7109f, 16.5007f, 14.3751f, 16.8365f, 14.3751f, 17.2507f)
                curveTo(14.3751f, 17.6649f, 14.7109f, 18.0007f, 15.1251f, 18.0007f)
                curveTo(15.5394f, 18.0007f, 15.8751f, 17.6649f, 15.8751f, 17.2507f)
                curveTo(15.8751f, 16.8365f, 15.5394f, 16.5007f, 15.1251f, 16.5007f)
                close()
            }
        }
        .build()
        return _dualScreenPagination!!
    }

private var _dualScreenPagination: ImageVector? = null
