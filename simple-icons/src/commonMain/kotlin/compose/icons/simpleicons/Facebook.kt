package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Facebook: VectorAsset
    get() {
        if (_facebook != null) {
            return _facebook!!
        }
        _facebook = VectorAssetBuilder(name = "Facebook", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9981f, 11.9991f)
                curveTo(23.9981f, 5.3722f, 18.626f, 0.0f, 11.9991f, 0.0f)
                curveTo(5.3722f, 0.0f, 0.0f, 5.3722f, 0.0f, 11.9991f)
                curveTo(0.0f, 17.9882f, 4.3879f, 22.9522f, 10.1242f, 23.8524f)
                verticalLineTo(15.4676f)
                horizontalLineTo(7.0776f)
                verticalLineTo(11.9991f)
                horizontalLineTo(10.1242f)
                verticalLineTo(9.3555f)
                curveTo(10.1242f, 6.3483f, 11.9156f, 4.6871f, 14.6564f, 4.6871f)
                curveTo(15.9692f, 4.6871f, 17.3424f, 4.9215f, 17.3424f, 4.9215f)
                verticalLineTo(7.8744f)
                horizontalLineTo(15.8294f)
                curveTo(14.3388f, 7.8744f, 13.8739f, 8.7993f, 13.8739f, 9.7482f)
                verticalLineTo(11.9991f)
                horizontalLineTo(17.2018f)
                lineTo(16.6698f, 15.4676f)
                horizontalLineTo(13.8739f)
                verticalLineTo(23.8524f)
                curveTo(19.6103f, 22.9522f, 23.9981f, 17.9882f, 23.9981f, 11.9991f)
                close()
            }
        }
        .build()
        return _facebook!!
    }

private var _facebook: VectorAsset? = null
