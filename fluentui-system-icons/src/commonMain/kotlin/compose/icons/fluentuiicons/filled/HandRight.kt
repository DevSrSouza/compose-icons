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

public val FilledGroup.HandRight: ImageVector
    get() {
        if (_handRight != null) {
            return _handRight!!
        }
        _handRight = Builder(name = "HandRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.2502f)
                curveTo(10.0f, 3.698f, 9.5523f, 3.2502f, 9.0f, 3.2502f)
                curveTo(8.4477f, 3.2502f, 8.0f, 3.698f, 8.0f, 4.2502f)
                verticalLineTo(10.9984f)
                curveTo(8.0f, 11.2746f, 7.7761f, 11.4984f, 7.5f, 11.4984f)
                curveTo(7.2239f, 11.4984f, 7.0f, 11.2746f, 7.0f, 10.9984f)
                verticalLineTo(5.9971f)
                curveTo(7.0f, 5.4448f, 6.5523f, 4.9971f, 6.0f, 4.9971f)
                curveTo(5.4477f, 4.9971f, 5.0f, 5.4448f, 5.0f, 5.9971f)
                verticalLineTo(14.7538f)
                curveTo(5.0f, 16.9333f, 6.1684f, 19.2632f, 6.914f, 20.5427f)
                curveTo(7.4702f, 21.4971f, 8.4941f, 22.0016f, 9.5366f, 22.0016f)
                horizontalLineTo(11.7046f)
                curveTo(12.9358f, 22.0016f, 14.0613f, 21.3059f, 14.6118f, 20.2045f)
                lineTo(14.7451f, 19.9377f)
                curveTo(15.1658f, 19.0959f, 15.6904f, 18.3103f, 16.3067f, 17.5992f)
                lineTo(18.5186f, 15.047f)
                lineTo(20.7105f, 13.3422f)
                curveTo(20.8931f, 13.2001f, 21.0f, 12.9816f, 21.0f, 12.7502f)
                curveTo(21.0f, 12.2654f, 20.7409f, 11.9054f, 20.4084f, 11.6906f)
                curveTo(20.1123f, 11.4992f, 19.7584f, 11.4175f, 19.4464f, 11.3804f)
                curveTo(18.8102f, 11.3049f, 18.0364f, 11.3821f, 17.3571f, 11.5139f)
                curveTo(16.8436f, 11.6136f, 16.3829f, 11.808f, 16.0f, 12.0184f)
                verticalLineTo(4.2502f)
                curveTo(16.0f, 3.698f, 15.5523f, 3.2502f, 15.0f, 3.2502f)
                curveTo(14.4477f, 3.2502f, 14.0f, 3.698f, 14.0f, 4.2502f)
                verticalLineTo(10.5002f)
                curveTo(14.0f, 10.7764f, 13.7761f, 11.0002f, 13.5f, 11.0002f)
                curveTo(13.2239f, 11.0002f, 13.0f, 10.7764f, 13.0f, 10.5002f)
                verticalLineTo(2.9971f)
                curveTo(13.0f, 2.4448f, 12.5523f, 1.9971f, 12.0f, 1.9971f)
                curveTo(11.4477f, 1.9971f, 11.0f, 2.4448f, 11.0f, 2.9971f)
                verticalLineTo(10.5002f)
                curveTo(11.0f, 10.7764f, 10.7761f, 11.0002f, 10.5f, 11.0002f)
                curveTo(10.2239f, 11.0002f, 10.0f, 10.7764f, 10.0f, 10.5002f)
                verticalLineTo(4.2502f)
                close()
            }
        }
        .build()
        return _handRight!!
    }

private var _handRight: ImageVector? = null
