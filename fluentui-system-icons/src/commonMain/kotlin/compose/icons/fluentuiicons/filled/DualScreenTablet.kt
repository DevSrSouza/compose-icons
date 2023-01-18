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

public val FilledGroup.DualScreenTablet: ImageVector
    get() {
        if (_dualScreenTablet != null) {
            return _dualScreenTablet!!
        }
        _dualScreenTablet = Builder(name = "DualScreenTablet", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 8.9996f)
                verticalLineTo(20.9996f)
                lineTo(3.75f, 21.0f)
                curveTo(2.8318f, 21.0f, 2.0788f, 20.2929f, 2.0058f, 19.3935f)
                lineTo(2.0f, 19.25f)
                verticalLineTo(10.7498f)
                curveTo(2.0f, 9.8317f, 2.7071f, 9.0787f, 3.6065f, 9.0056f)
                lineTo(3.75f, 8.9999f)
                lineTo(7.5f, 8.9996f)
                close()
                moveTo(12.25f, 8.9999f)
                curveTo(13.1682f, 8.9999f, 13.9212f, 9.707f, 13.9942f, 10.6063f)
                lineTo(14.0f, 10.7498f)
                verticalLineTo(19.25f)
                curveTo(14.0f, 20.1682f, 13.2929f, 20.9212f, 12.3935f, 20.9942f)
                lineTo(12.25f, 21.0f)
                lineTo(8.5f, 20.9996f)
                verticalLineTo(8.9996f)
                lineTo(12.25f, 8.9999f)
                close()
                moveTo(10.6438f, 17.5f)
                horizontalLineTo(10.1438f)
                lineTo(10.042f, 17.5068f)
                curveTo(9.6759f, 17.5565f, 9.3938f, 17.8703f, 9.3938f, 18.25f)
                curveTo(9.3938f, 18.6297f, 9.6759f, 18.9435f, 10.042f, 18.9932f)
                lineTo(10.1438f, 19.0f)
                horizontalLineTo(10.6438f)
                lineTo(10.7455f, 18.9932f)
                curveTo(11.1116f, 18.9435f, 11.3938f, 18.6297f, 11.3938f, 18.25f)
                curveTo(11.3938f, 17.8358f, 11.058f, 17.5f, 10.6438f, 17.5f)
                close()
                moveTo(5.8938f, 17.5f)
                horizontalLineTo(5.3938f)
                lineTo(5.292f, 17.5068f)
                curveTo(4.9259f, 17.5565f, 4.6438f, 17.8703f, 4.6438f, 18.25f)
                curveTo(4.6438f, 18.6297f, 4.9259f, 18.9435f, 5.292f, 18.9932f)
                lineTo(5.3938f, 19.0f)
                horizontalLineTo(5.8938f)
                lineTo(5.9955f, 18.9932f)
                curveTo(6.3616f, 18.9435f, 6.6438f, 18.6297f, 6.6438f, 18.25f)
                curveTo(6.6438f, 17.8358f, 6.308f, 17.5f, 5.8938f, 17.5f)
                close()
                moveTo(19.75f, 3.0f)
                curveTo(20.9409f, 3.0f, 21.9156f, 3.9252f, 21.9948f, 5.096f)
                lineTo(22.0f, 5.25f)
                verticalLineTo(13.75f)
                curveTo(22.0f, 14.9409f, 21.0748f, 15.9156f, 19.904f, 15.9948f)
                lineTo(19.75f, 16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(16.25f)
                curveTo(16.6642f, 13.5f, 17.0f, 13.1642f, 17.0f, 12.75f)
                curveTo(17.0f, 12.3358f, 16.6642f, 12.0f, 16.25f, 12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.5f)
                curveTo(15.0f, 9.1745f, 13.9685f, 8.09f, 12.6644f, 8.0053f)
                lineTo(12.5f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.25f)
                curveTo(6.0f, 4.0591f, 6.9252f, 3.0844f, 8.096f, 3.0052f)
                lineTo(8.25f, 3.0f)
                horizontalLineTo(19.75f)
                close()
            }
        }
        .build()
        return _dualScreenTablet!!
    }

private var _dualScreenTablet: ImageVector? = null
