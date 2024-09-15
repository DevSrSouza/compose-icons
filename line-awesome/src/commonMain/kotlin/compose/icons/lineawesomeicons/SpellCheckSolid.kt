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

public val LineAwesomeIcons.SpellCheckSolid: ImageVector
    get() {
        if (_spellCheckSolid != null) {
            return _spellCheckSolid!!
        }
        _spellCheckSolid = Builder(name = "SpellCheckSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.332f, 5.0f)
                lineTo(3.0f, 18.0f)
                lineTo(5.107f, 18.0f)
                lineTo(6.107f, 15.0f)
                lineTo(10.668f, 15.0f)
                lineTo(11.668f, 18.0f)
                lineTo(13.775f, 18.0f)
                lineTo(9.441f, 5.0f)
                lineTo(7.332f, 5.0f)
                close()
                moveTo(15.0f, 5.0f)
                lineTo(15.0f, 10.0f)
                lineTo(15.0f, 12.0f)
                lineTo(15.0f, 18.0f)
                lineTo(21.0f, 18.0f)
                curveTo(23.206f, 18.0f, 25.0f, 16.206f, 25.0f, 14.0f)
                curveTo(25.0f, 12.322f, 23.958f, 10.888f, 22.49f, 10.295f)
                curveTo(22.808f, 9.768f, 23.0f, 9.159f, 23.0f, 8.5f)
                curveTo(23.0f, 6.57f, 21.43f, 5.0f, 19.5f, 5.0f)
                lineTo(15.0f, 5.0f)
                close()
                moveTo(17.0f, 7.0f)
                lineTo(19.5f, 7.0f)
                curveTo(20.327f, 7.0f, 21.0f, 7.673f, 21.0f, 8.5f)
                curveTo(21.0f, 9.327f, 20.327f, 10.0f, 19.5f, 10.0f)
                lineTo(17.0f, 10.0f)
                lineTo(17.0f, 7.0f)
                close()
                moveTo(8.389f, 8.162f)
                lineTo(10.002f, 13.0f)
                lineTo(6.775f, 13.0f)
                lineTo(8.389f, 8.162f)
                close()
                moveTo(17.0f, 12.0f)
                lineTo(19.5f, 12.0f)
                lineTo(21.0f, 12.0f)
                curveTo(22.103f, 12.0f, 23.0f, 12.897f, 23.0f, 14.0f)
                curveTo(23.0f, 15.103f, 22.103f, 16.0f, 21.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                lineTo(17.0f, 12.0f)
                close()
                moveTo(27.809f, 17.777f)
                lineTo(19.117f, 26.113f)
                lineTo(15.193f, 22.336f)
                lineTo(13.807f, 23.775f)
                lineTo(19.113f, 28.887f)
                lineTo(29.191f, 19.223f)
                lineTo(27.809f, 17.777f)
                close()
            }
        }
        .build()
        return _spellCheckSolid!!
    }

private var _spellCheckSolid: ImageVector? = null
