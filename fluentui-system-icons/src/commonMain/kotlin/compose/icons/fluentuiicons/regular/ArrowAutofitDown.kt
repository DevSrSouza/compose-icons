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

public val RegularGroup.ArrowAutofitDown: ImageVector
    get() {
        if (_arrowAutofitDown != null) {
            return _arrowAutofitDown!!
        }
        _arrowAutofitDown = Builder(name = "ArrowAutofitDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2197f, 17.2188f)
                curveTo(12.9534f, 17.4851f, 12.9292f, 17.9018f, 13.1471f, 18.1954f)
                lineTo(13.2197f, 18.2795f)
                lineTo(15.5871f, 20.6496f)
                curveTo(15.7128f, 20.858f, 15.9629f, 21.0f, 16.2509f, 21.0f)
                curveTo(16.503f, 21.0f, 16.726f, 20.8911f, 16.862f, 20.7242f)
                lineTo(16.9148f, 20.6493f)
                lineTo(19.282f, 18.2795f)
                lineTo(19.3546f, 18.1954f)
                curveTo(19.5482f, 17.9344f, 19.5506f, 17.5762f, 19.3618f, 17.3128f)
                lineTo(19.282f, 17.2188f)
                lineTo(19.1979f, 17.1462f)
                curveTo(18.9369f, 16.9526f, 18.5787f, 16.9502f, 18.3153f, 17.1391f)
                lineTo(18.2213f, 17.2188f)
                lineTo(17.0f, 18.44f)
                verticalLineTo(3.6562f)
                lineTo(16.9931f, 3.5671f)
                curveTo(16.9434f, 3.2468f, 16.6296f, 3.0f, 16.2499f, 3.0f)
                curveTo(15.8702f, 3.0f, 15.5565f, 3.2469f, 15.5068f, 3.5673f)
                lineTo(15.5f, 3.6563f)
                verticalLineTo(18.44f)
                lineTo(14.2803f, 17.2188f)
                lineTo(14.1962f, 17.1462f)
                curveTo(13.9026f, 16.9284f, 13.4859f, 16.9526f, 13.2197f, 17.2188f)
                close()
                moveTo(6.25f, 20.0078f)
                curveTo(5.0074f, 20.0078f, 4.0f, 19.0005f, 4.0f, 17.7578f)
                verticalLineTo(6.2578f)
                curveTo(4.0f, 5.0152f, 5.0074f, 4.0078f, 6.25f, 4.0078f)
                horizontalLineTo(12.25f)
                curveTo(12.6642f, 4.0078f, 13.0f, 4.3436f, 13.0f, 4.7578f)
                curveTo(13.0f, 5.172f, 12.6642f, 5.5078f, 12.25f, 5.5078f)
                horizontalLineTo(6.25f)
                curveTo(5.8358f, 5.5078f, 5.5f, 5.8436f, 5.5f, 6.2578f)
                verticalLineTo(17.7578f)
                curveTo(5.5f, 18.172f, 5.8358f, 18.5078f, 6.25f, 18.5078f)
                horizontalLineTo(10.25f)
                curveTo(10.6642f, 18.5078f, 11.0f, 18.8436f, 11.0f, 19.2578f)
                curveTo(11.0f, 19.672f, 10.6642f, 20.0078f, 10.25f, 20.0078f)
                horizontalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _arrowAutofitDown!!
    }

private var _arrowAutofitDown: ImageVector? = null
