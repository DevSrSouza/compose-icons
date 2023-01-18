package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ArrowAutofitUp: ImageVector
    get() {
        if (_arrowAutofitUp != null) {
            return _arrowAutofitUp!!
        }
        _arrowAutofitUp = Builder(name = "ArrowAutofitUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2197f, 6.7811f)
                curveTo(12.9534f, 6.5149f, 12.9292f, 6.0982f, 13.1471f, 5.8046f)
                lineTo(13.2197f, 5.7205f)
                lineTo(15.5871f, 3.3504f)
                curveTo(15.7128f, 3.142f, 15.9629f, 3.0f, 16.2509f, 3.0f)
                curveTo(16.503f, 3.0f, 16.726f, 3.1089f, 16.862f, 3.2758f)
                lineTo(16.9148f, 3.3507f)
                lineTo(19.282f, 5.7205f)
                lineTo(19.3546f, 5.8046f)
                curveTo(19.5482f, 6.0656f, 19.5506f, 6.4238f, 19.3618f, 6.6872f)
                lineTo(19.282f, 6.7811f)
                lineTo(19.1979f, 6.8538f)
                curveTo(18.9369f, 7.0474f, 18.5787f, 7.0498f, 18.3153f, 6.8609f)
                lineTo(18.2213f, 6.7811f)
                lineTo(17.0f, 5.56f)
                verticalLineTo(20.3438f)
                lineTo(16.9931f, 20.4329f)
                curveTo(16.9434f, 20.7532f, 16.6296f, 21.0f, 16.2499f, 21.0f)
                curveTo(15.8702f, 21.0f, 15.5565f, 20.753f, 15.5068f, 20.4327f)
                lineTo(15.5f, 20.3437f)
                verticalLineTo(5.56f)
                lineTo(14.2803f, 6.7811f)
                lineTo(14.1962f, 6.8538f)
                curveTo(13.9026f, 7.0716f, 13.4859f, 7.0474f, 13.2197f, 6.7811f)
                close()
                moveTo(6.25f, 3.9922f)
                curveTo(5.0074f, 3.9922f, 4.0f, 4.9995f, 4.0f, 6.2422f)
                verticalLineTo(17.7422f)
                curveTo(4.0f, 18.9848f, 5.0074f, 19.9922f, 6.25f, 19.9922f)
                horizontalLineTo(12.25f)
                curveTo(12.6642f, 19.9922f, 13.0f, 19.6564f, 13.0f, 19.2422f)
                curveTo(13.0f, 18.828f, 12.6642f, 18.4922f, 12.25f, 18.4922f)
                horizontalLineTo(6.25f)
                curveTo(5.8358f, 18.4922f, 5.5f, 18.1564f, 5.5f, 17.7422f)
                verticalLineTo(6.2422f)
                curveTo(5.5f, 5.828f, 5.8358f, 5.4922f, 6.25f, 5.4922f)
                horizontalLineTo(10.25f)
                curveTo(10.6642f, 5.4922f, 11.0f, 5.1564f, 11.0f, 4.7422f)
                curveTo(11.0f, 4.328f, 10.6642f, 3.9922f, 10.25f, 3.9922f)
                horizontalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _arrowAutofitUp!!
    }

private var _arrowAutofitUp: ImageVector? = null
