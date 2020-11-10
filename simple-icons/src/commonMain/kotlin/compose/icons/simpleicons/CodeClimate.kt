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

public val SimpleIcons.CodeClimate: VectorAsset
    get() {
        if (_codeClimate != null) {
            return _codeClimate!!
        }
        _codeClimate = VectorAssetBuilder(name = "CodeClimate", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0469f, 5.0391f)
                lineTo(24.0f, 12.9922f)
                lineTo(21.293f, 15.7031f)
                lineTo(16.0469f, 10.457f)
                lineTo(14.2031f, 12.3086f)
                lineTo(11.4883f, 9.5977f)
                close()
                moveTo(10.6523f, 10.4375f)
                lineTo(13.3594f, 13.1523f)
                lineTo(15.9063f, 15.6914f)
                lineTo(13.1914f, 18.3984f)
                lineTo(7.9531f, 13.1602f)
                lineTo(3.7773f, 17.3359f)
                lineTo(2.707f, 18.3984f)
                lineTo(0.0f, 15.6914f)
                lineTo(7.9531f, 7.7383f)
                close()
                moveTo(10.6523f, 10.4375f)
            }
        }
        .build()
        return _codeClimate!!
    }

private var _codeClimate: VectorAsset? = null
