package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Searchengin: ImageVector
    get() {
        if (_searchengin != null) {
            return _searchengin!!
        }
        _searchengin = Builder(name = "Searchengin", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9395f, 4.0f)
                lineTo(12.9395f, 6.7168f)
                curveTo(15.9445f, 6.9858f, 17.9492f, 9.4635f, 17.9492f, 12.3145f)
                curveTo(17.9492f, 14.9355f, 16.1556f, 17.133f, 13.7266f, 17.748f)
                lineTo(12.9004f, 20.3398f)
                lineTo(12.7852f, 20.6855f)
                curveTo(14.2632f, 20.5895f, 15.7413f, 20.0627f, 17.0273f, 19.1797f)
                lineTo(17.5371f, 19.9473f)
                curveTo(18.9581f, 20.4653f, 20.053f, 21.5986f, 20.543f, 22.6836f)
                curveTo(21.033f, 23.7876f, 21.0501f, 24.3624f, 22.7871f, 25.6484f)
                curveTo(24.5251f, 26.9254f, 25.6585f, 27.8669f, 25.9375f, 27.9629f)
                curveTo(26.2255f, 28.0589f, 26.8495f, 28.001f, 27.4355f, 27.416f)
                curveTo(28.0195f, 26.829f, 28.0765f, 26.2048f, 27.9805f, 25.9258f)
                curveTo(27.8845f, 25.6478f, 26.9442f, 24.5153f, 25.6582f, 22.7773f)
                curveTo(24.3722f, 21.0393f, 23.7854f, 21.0203f, 22.6914f, 20.5313f)
                curveTo(21.5974f, 20.0413f, 20.4641f, 18.9562f, 19.9551f, 17.5352f)
                lineTo(19.1973f, 17.0371f)
                curveTo(20.1193f, 15.6931f, 20.7051f, 14.0715f, 20.7051f, 12.3145f)
                curveTo(20.7051f, 7.8885f, 17.2875f, 4.269f, 12.9395f, 4.0f)
                close()
                moveTo(11.1719f, 4.0684f)
                curveTo(7.1209f, 4.6344f, 4.0f, 8.1195f, 4.0f, 12.3145f)
                curveTo(4.0f, 16.5385f, 7.0054f, 20.0692f, 11.0664f, 20.6172f)
                lineTo(11.0664f, 17.8242f)
                curveTo(8.5034f, 17.3162f, 6.7168f, 15.0405f, 6.7168f, 12.3145f)
                curveTo(6.7168f, 9.9235f, 8.2044f, 7.8873f, 10.3164f, 7.0723f)
                lineTo(11.1035f, 4.3184f)
                lineTo(11.1719f, 4.0684f)
                close()
                moveTo(12.0f, 4.5664f)
                lineTo(9.1543f, 14.502f)
                lineTo(12.0059f, 13.2441f)
                lineTo(12.0059f, 20.043f)
                lineTo(15.5195f, 9.1172f)
                lineTo(12.0f, 10.5859f)
                lineTo(12.0f, 4.5664f)
                close()
                moveTo(26.4922f, 26.0605f)
                curveTo(26.7232f, 26.0605f, 26.9141f, 26.2524f, 26.9141f, 26.4824f)
                curveTo(26.9141f, 26.7134f, 26.7222f, 26.8965f, 26.4922f, 26.8965f)
                curveTo(26.2622f, 26.8965f, 26.0801f, 26.7134f, 26.0801f, 26.4824f)
                curveTo(26.0801f, 26.2524f, 26.2612f, 26.0605f, 26.4922f, 26.0605f)
                close()
            }
        }
        .build()
        return _searchengin!!
    }

private var _searchengin: ImageVector? = null
