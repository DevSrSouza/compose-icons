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

public val LineAwesomeIcons.HouseDamageSolid: ImageVector
    get() {
        if (_houseDamageSolid != null) {
            return _houseDamageSolid!!
        }
        _houseDamageSolid = Builder(name = "HouseDamageSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.59f)
                lineTo(15.279f, 3.279f)
                lineTo(2.279f, 16.279f)
                lineTo(3.721f, 17.721f)
                lineTo(5.0f, 16.439f)
                lineTo(5.0f, 28.0f)
                lineTo(13.83f, 28.0f)
                lineTo(16.0f, 22.0f)
                lineTo(12.381f, 22.0f)
                lineTo(16.01f, 15.789f)
                lineTo(16.0f, 20.0f)
                lineTo(19.551f, 20.0f)
                lineTo(17.939f, 28.0f)
                lineTo(27.0f, 28.0f)
                lineTo(27.0f, 16.439f)
                lineTo(28.279f, 17.721f)
                lineTo(29.721f, 16.279f)
                lineTo(16.721f, 3.279f)
                lineTo(16.0f, 2.59f)
                close()
                moveTo(16.0f, 5.439f)
                lineTo(25.0f, 14.439f)
                lineTo(25.0f, 26.0f)
                lineTo(20.381f, 26.0f)
                lineTo(22.0f, 18.0f)
                lineTo(18.0f, 18.0f)
                lineTo(18.0f, 12.0f)
                lineTo(15.9f, 12.0f)
                lineTo(10.0f, 22.109f)
                lineTo(10.0f, 24.0f)
                lineTo(13.15f, 24.0f)
                lineTo(12.43f, 26.0f)
                lineTo(7.0f, 26.0f)
                lineTo(7.0f, 14.439f)
                lineTo(16.0f, 5.439f)
                close()
            }
        }
        .build()
        return _houseDamageSolid!!
    }

private var _houseDamageSolid: ImageVector? = null
