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

public val LineAwesomeIcons.VoteYeaSolid: ImageVector
    get() {
        if (_voteYeaSolid != null) {
            return _voteYeaSolid!!
        }
        _voteYeaSolid = Builder(name = "VoteYeaSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                lineTo(8.0f, 21.0f)
                lineTo(24.0f, 21.0f)
                lineTo(24.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                close()
                moveTo(10.0f, 7.0f)
                lineTo(22.0f, 7.0f)
                lineTo(22.0f, 19.0f)
                lineTo(10.0f, 19.0f)
                lineTo(10.0f, 7.0f)
                close()
                moveTo(19.301f, 9.9f)
                lineTo(15.0f, 14.199f)
                lineTo(12.699f, 11.9f)
                lineTo(11.301f, 13.4f)
                lineTo(14.301f, 16.4f)
                lineTo(15.0f, 17.1f)
                lineTo(15.699f, 16.4f)
                lineTo(20.699f, 11.4f)
                lineTo(19.301f, 9.9f)
                close()
                moveTo(2.0f, 19.0f)
                lineTo(2.0f, 27.0f)
                lineTo(4.0f, 27.0f)
                lineTo(4.0f, 21.0f)
                lineTo(6.0f, 21.0f)
                lineTo(6.0f, 19.0f)
                lineTo(2.0f, 19.0f)
                close()
                moveTo(26.0f, 19.0f)
                lineTo(26.0f, 21.0f)
                lineTo(28.0f, 21.0f)
                lineTo(28.0f, 27.0f)
                lineTo(30.0f, 27.0f)
                lineTo(30.0f, 19.0f)
                lineTo(26.0f, 19.0f)
                close()
                moveTo(6.0f, 23.0f)
                lineTo(6.0f, 25.0f)
                lineTo(26.0f, 25.0f)
                lineTo(26.0f, 23.0f)
                lineTo(6.0f, 23.0f)
                close()
            }
        }
        .build()
        return _voteYeaSolid!!
    }

private var _voteYeaSolid: ImageVector? = null
