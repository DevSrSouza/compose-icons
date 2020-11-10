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

public val SimpleIcons.Openid: VectorAsset
    get() {
        if (_openid != null) {
            return _openid!!
        }
        _openid = VectorAssetBuilder(name = "Openid", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.54f, 0.887f)
                lineTo(10.91f, 2.66f)
                verticalLineTo(20.83f)
                curveTo(6.76f, 20.31f, 3.64f, 18.05f, 3.64f, 15.33f)
                curveTo(3.64f, 12.75f, 6.44f, 10.58f, 10.27f, 9.92f)
                verticalLineTo(7.61f)
                curveTo(4.42f, 8.32f, 0.0f, 11.5f, 0.0f, 15.33f)
                curveTo(0.0f, 19.29f, 4.74f, 22.57f, 10.91f, 23.11f)
                lineTo(14.54f, 21.4f)
                verticalLineTo(0.886f)
                moveTo(15.18f, 7.61f)
                verticalLineTo(9.92f)
                curveTo(16.61f, 10.17f, 17.89f, 10.62f, 18.94f, 11.23f)
                lineTo(16.97f, 12.34f)
                lineTo(24.0f, 13.87f)
                lineTo(23.5f, 8.66f)
                lineTo(21.63f, 9.72f)
                curveTo(19.89f, 8.66f, 17.67f, 7.91f, 15.18f, 7.61f)
                close()
            }
        }
        .build()
        return _openid!!
    }

private var _openid: VectorAsset? = null
