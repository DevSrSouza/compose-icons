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
                moveTo(16.0f, 2.5898f)
                lineTo(15.2793f, 3.2793f)
                lineTo(2.2793f, 16.2793f)
                lineTo(3.7207f, 17.7207f)
                lineTo(5.0f, 16.4395f)
                lineTo(5.0f, 28.0f)
                lineTo(13.8301f, 28.0f)
                lineTo(16.0f, 22.0f)
                lineTo(12.3809f, 22.0f)
                lineTo(16.0098f, 15.7891f)
                lineTo(16.0f, 20.0f)
                lineTo(19.5508f, 20.0f)
                lineTo(17.9395f, 28.0f)
                lineTo(27.0f, 28.0f)
                lineTo(27.0f, 16.4395f)
                lineTo(28.2793f, 17.7207f)
                lineTo(29.7207f, 16.2793f)
                lineTo(16.7207f, 3.2793f)
                lineTo(16.0f, 2.5898f)
                close()
                moveTo(16.0f, 5.4395f)
                lineTo(25.0f, 14.4395f)
                lineTo(25.0f, 26.0f)
                lineTo(20.3809f, 26.0f)
                lineTo(22.0f, 18.0f)
                lineTo(18.0f, 18.0f)
                lineTo(18.0f, 12.0f)
                lineTo(15.9004f, 12.0f)
                lineTo(10.0f, 22.1094f)
                lineTo(10.0f, 24.0f)
                lineTo(13.1504f, 24.0f)
                lineTo(12.4297f, 26.0f)
                lineTo(7.0f, 26.0f)
                lineTo(7.0f, 14.4395f)
                lineTo(16.0f, 5.4395f)
                close()
            }
        }
        .build()
        return _houseDamageSolid!!
    }

private var _houseDamageSolid: ImageVector? = null
