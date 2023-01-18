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

public val RegularGroup.Desktop: ImageVector
    get() {
        if (_desktop != null) {
            return _desktop!!
        }
        _desktop = Builder(name = "Desktop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 22.0004f)
                curveTo(6.3358f, 22.0004f, 6.0f, 21.6647f, 6.0f, 21.2504f)
                curveTo(6.0f, 20.8707f, 6.2821f, 20.557f, 6.6482f, 20.5073f)
                lineTo(6.75f, 20.5004f)
                lineTo(8.499f, 20.5f)
                verticalLineTo(18.002f)
                lineTo(4.25f, 18.0023f)
                curveTo(3.0591f, 18.0023f, 2.0844f, 17.0771f, 2.0052f, 15.9063f)
                lineTo(2.0f, 15.7523f)
                verticalLineTo(5.25f)
                curveTo(2.0f, 4.0591f, 2.9252f, 3.0844f, 4.096f, 3.0052f)
                lineTo(4.25f, 3.0f)
                horizontalLineTo(19.7488f)
                curveTo(20.9397f, 3.0f, 21.9145f, 3.9252f, 21.9936f, 5.096f)
                lineTo(21.9988f, 5.25f)
                verticalLineTo(15.7523f)
                curveTo(21.9988f, 16.9431f, 21.0737f, 17.9179f, 19.9029f, 17.9971f)
                lineTo(19.7488f, 18.0023f)
                lineTo(15.499f, 18.002f)
                verticalLineTo(20.5f)
                lineTo(17.25f, 20.5004f)
                curveTo(17.6642f, 20.5004f, 18.0f, 20.8362f, 18.0f, 21.2504f)
                curveTo(18.0f, 21.6301f, 17.7178f, 21.9439f, 17.3518f, 21.9936f)
                lineTo(17.25f, 22.0004f)
                horizontalLineTo(6.75f)
                close()
                moveTo(13.998f, 18.002f)
                horizontalLineTo(9.998f)
                lineTo(9.999f, 20.5004f)
                horizontalLineTo(13.999f)
                lineTo(13.998f, 18.002f)
                close()
                moveTo(19.7488f, 4.5f)
                horizontalLineTo(4.25f)
                curveTo(3.8703f, 4.5f, 3.5565f, 4.7821f, 3.5069f, 5.1482f)
                lineTo(3.5f, 5.25f)
                verticalLineTo(15.7523f)
                curveTo(3.5f, 16.132f, 3.7822f, 16.4458f, 4.1482f, 16.4954f)
                lineTo(4.25f, 16.5023f)
                horizontalLineTo(19.7488f)
                curveTo(20.1285f, 16.5023f, 20.4423f, 16.2201f, 20.492f, 15.854f)
                lineTo(20.4988f, 15.7523f)
                verticalLineTo(5.25f)
                curveTo(20.4988f, 4.8703f, 20.2167f, 4.5565f, 19.8506f, 4.5068f)
                lineTo(19.7488f, 4.5f)
                close()
            }
        }
        .build()
        return _desktop!!
    }

private var _desktop: ImageVector? = null
