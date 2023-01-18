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

public val FilledGroup.DualScreenStatusBar: ImageVector
    get() {
        if (_dualScreenStatusBar != null) {
            return _dualScreenStatusBar!!
        }
        _dualScreenStatusBar = Builder(name = "DualScreenStatusBar", defaultWidth = 24.0.dp,
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
                moveTo(19.7499f, 6.5007f)
                horizontalLineTo(15.2483f)
                curveTo(14.8341f, 6.5007f, 14.4983f, 6.8365f, 14.4983f, 7.2507f)
                curveTo(14.4983f, 7.6304f, 14.7805f, 7.9442f, 15.1465f, 7.9939f)
                lineTo(15.2483f, 8.0007f)
                horizontalLineTo(19.7499f)
                curveTo(20.1641f, 8.0007f, 20.4999f, 7.6649f, 20.4999f, 7.2507f)
                curveTo(20.4999f, 6.871f, 20.2178f, 6.5572f, 19.8517f, 6.5076f)
                lineTo(19.7499f, 6.5007f)
                close()
            }
        }
        .build()
        return _dualScreenStatusBar!!
    }

private var _dualScreenStatusBar: ImageVector? = null
