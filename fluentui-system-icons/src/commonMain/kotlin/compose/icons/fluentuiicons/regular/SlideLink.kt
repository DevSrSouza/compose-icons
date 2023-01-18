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

public val RegularGroup.SlideLink: ImageVector
    get() {
        if (_slideLink != null) {
            return _slideLink!!
        }
        _slideLink = Builder(name = "SlideLink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 5.0074f, 3.0074f, 4.0f, 4.25f, 4.0f)
                horizontalLineTo(19.75f)
                curveTo(20.9926f, 4.0f, 22.0f, 5.0074f, 22.0f, 6.25f)
                verticalLineTo(13.3766f)
                curveTo(21.5515f, 13.0576f, 21.0453f, 12.8145f, 20.5f, 12.6662f)
                verticalLineTo(6.25f)
                curveTo(20.5f, 5.8358f, 20.1642f, 5.5f, 19.75f, 5.5f)
                horizontalLineTo(4.25f)
                curveTo(3.8358f, 5.5f, 3.5f, 5.8358f, 3.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.5f, 18.1642f, 3.8358f, 18.5f, 4.25f, 18.5f)
                horizontalLineTo(11.1662f)
                curveTo(11.3145f, 19.0453f, 11.5576f, 19.5515f, 11.8766f, 20.0f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 20.0f, 2.0f, 18.9926f, 2.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(23.0f, 17.25f)
                curveTo(23.0f, 15.1789f, 21.3211f, 13.5f, 19.25f, 13.5f)
                lineTo(19.1482f, 13.5068f)
                curveTo(18.7822f, 13.5565f, 18.5f, 13.8703f, 18.5f, 14.25f)
                curveTo(18.5f, 14.6642f, 18.8358f, 15.0f, 19.25f, 15.0f)
                lineTo(19.404f, 15.0052f)
                curveTo(20.5748f, 15.0844f, 21.5f, 16.0591f, 21.5f, 17.25f)
                curveTo(21.5f, 18.4926f, 20.4926f, 19.5f, 19.25f, 19.5f)
                lineTo(19.2466f, 19.5046f)
                lineTo(19.1448f, 19.5119f)
                curveTo(18.779f, 19.5633f, 18.4983f, 19.8783f, 18.5f, 20.258f)
                curveTo(18.5019f, 20.6722f, 18.8392f, 21.0065f, 19.2534f, 21.0046f)
                verticalLineTo(21.0f)
                lineTo(19.4523f, 20.9948f)
                curveTo(21.4276f, 20.8913f, 23.0f, 19.2543f, 23.0f, 17.25f)
                close()
                moveTo(16.5f, 14.25f)
                curveTo(16.5f, 13.8358f, 16.1642f, 13.5f, 15.75f, 13.5f)
                lineTo(15.5508f, 13.5052f)
                curveTo(13.5724f, 13.6087f, 12.0f, 15.2457f, 12.0f, 17.25f)
                curveTo(12.0f, 19.3211f, 13.6789f, 21.0f, 15.75f, 21.0f)
                lineTo(15.8518f, 20.9932f)
                curveTo(16.2178f, 20.9435f, 16.5f, 20.6297f, 16.5f, 20.25f)
                curveTo(16.5f, 19.8358f, 16.1642f, 19.5f, 15.75f, 19.5f)
                lineTo(15.596f, 19.4948f)
                curveTo(14.4252f, 19.4156f, 13.5f, 18.4409f, 13.5f, 17.25f)
                curveTo(13.5f, 16.0074f, 14.5074f, 15.0f, 15.75f, 15.0f)
                lineTo(15.8518f, 14.9932f)
                curveTo(16.2178f, 14.9435f, 16.5f, 14.6297f, 16.5f, 14.25f)
                close()
                moveTo(20.0f, 17.25f)
                curveTo(20.0f, 16.8358f, 19.6642f, 16.5f, 19.25f, 16.5f)
                horizontalLineTo(15.75f)
                lineTo(15.6482f, 16.5068f)
                curveTo(15.2822f, 16.5565f, 15.0f, 16.8703f, 15.0f, 17.25f)
                curveTo(15.0f, 17.6642f, 15.3358f, 18.0f, 15.75f, 18.0f)
                horizontalLineTo(19.25f)
                lineTo(19.3518f, 17.9932f)
                curveTo(19.7178f, 17.9435f, 20.0f, 17.6297f, 20.0f, 17.25f)
                close()
            }
        }
        .build()
        return _slideLink!!
    }

private var _slideLink: ImageVector? = null
