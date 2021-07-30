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

public val LineAwesomeIcons.UserMinusSolid: ImageVector
    get() {
        if (_userMinusSolid != null) {
            return _userMinusSolid!!
        }
        _userMinusSolid = Builder(name = "UserMinusSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                curveTo(10.1f, 4.0f, 7.0f, 7.1f, 7.0f, 11.0f)
                curveTo(7.0f, 13.4f, 8.1996f, 15.6008f, 10.0996f, 16.8008f)
                curveTo(6.4996f, 18.3008f, 4.0f, 21.9f, 4.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                curveTo(6.0f, 21.6f, 9.6f, 18.0f, 14.0f, 18.0f)
                curveTo(15.4f, 18.0f, 16.7008f, 18.4f, 17.8008f, 19.0f)
                curveTo(16.7008f, 20.4f, 16.0f, 22.1f, 16.0f, 24.0f)
                curveTo(16.0f, 28.4f, 19.6f, 32.0f, 24.0f, 32.0f)
                curveTo(28.4f, 32.0f, 32.0f, 28.4f, 32.0f, 24.0f)
                curveTo(32.0f, 19.6f, 28.4f, 16.0f, 24.0f, 16.0f)
                curveTo(22.3f, 16.0f, 20.6008f, 16.6f, 19.3008f, 17.5f)
                curveTo(18.9008f, 17.2f, 18.4004f, 17.0008f, 17.9004f, 16.8008f)
                curveTo(19.8004f, 15.5008f, 21.0f, 13.4f, 21.0f, 11.0f)
                curveTo(21.0f, 7.1f, 17.9f, 4.0f, 14.0f, 4.0f)
                close()
                moveTo(14.0f, 6.0f)
                curveTo(16.8f, 6.0f, 19.0f, 8.2f, 19.0f, 11.0f)
                curveTo(19.0f, 13.8f, 16.8f, 16.0f, 14.0f, 16.0f)
                curveTo(11.2f, 16.0f, 9.0f, 13.8f, 9.0f, 11.0f)
                curveTo(9.0f, 8.2f, 11.2f, 6.0f, 14.0f, 6.0f)
                close()
                moveTo(24.0f, 18.0f)
                curveTo(27.3f, 18.0f, 30.0f, 20.7f, 30.0f, 24.0f)
                curveTo(30.0f, 27.3f, 27.3f, 30.0f, 24.0f, 30.0f)
                curveTo(20.7f, 30.0f, 18.0f, 27.3f, 18.0f, 24.0f)
                curveTo(18.0f, 20.7f, 20.7f, 18.0f, 24.0f, 18.0f)
                close()
                moveTo(20.0f, 23.0f)
                lineTo(20.0f, 25.0f)
                lineTo(28.0f, 25.0f)
                lineTo(28.0f, 23.0f)
                lineTo(20.0f, 23.0f)
                close()
            }
        }
        .build()
        return _userMinusSolid!!
    }

private var _userMinusSolid: ImageVector? = null
