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

public val LineAwesomeIcons.RobotSolid: ImageVector
    get() {
        if (_robotSolid != null) {
            return _robotSolid!!
        }
        _robotSolid = Builder(name = "RobotSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 1.0f)
                curveTo(14.895f, 1.0f, 14.0f, 1.895f, 14.0f, 3.0f)
                curveTo(14.0f, 3.738f, 14.402f, 4.371f, 15.0f, 4.719f)
                lineTo(15.0f, 7.0f)
                lineTo(10.0f, 7.0f)
                curveTo(7.25f, 7.0f, 5.0f, 9.25f, 5.0f, 12.0f)
                lineTo(5.0f, 14.0f)
                lineTo(2.0f, 14.0f)
                lineTo(2.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 22.0f)
                lineTo(30.0f, 22.0f)
                lineTo(30.0f, 14.0f)
                lineTo(27.0f, 14.0f)
                lineTo(27.0f, 12.0f)
                curveTo(27.0f, 9.25f, 24.75f, 7.0f, 22.0f, 7.0f)
                lineTo(17.0f, 7.0f)
                lineTo(17.0f, 4.719f)
                curveTo(17.598f, 4.371f, 18.0f, 3.738f, 18.0f, 3.0f)
                curveTo(18.0f, 1.895f, 17.105f, 1.0f, 16.0f, 1.0f)
                close()
                moveTo(10.0f, 9.0f)
                lineTo(22.0f, 9.0f)
                curveTo(23.668f, 9.0f, 25.0f, 10.332f, 25.0f, 12.0f)
                lineTo(25.0f, 25.0f)
                lineTo(23.0f, 25.0f)
                lineTo(23.0f, 20.0f)
                lineTo(9.0f, 20.0f)
                lineTo(9.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 12.0f)
                curveTo(7.0f, 10.332f, 8.332f, 9.0f, 10.0f, 9.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(10.895f, 13.0f, 10.0f, 13.895f, 10.0f, 15.0f)
                curveTo(10.0f, 16.105f, 10.895f, 17.0f, 12.0f, 17.0f)
                curveTo(13.105f, 17.0f, 14.0f, 16.105f, 14.0f, 15.0f)
                curveTo(14.0f, 13.895f, 13.105f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(20.0f, 13.0f)
                curveTo(18.895f, 13.0f, 18.0f, 13.895f, 18.0f, 15.0f)
                curveTo(18.0f, 16.105f, 18.895f, 17.0f, 20.0f, 17.0f)
                curveTo(21.105f, 17.0f, 22.0f, 16.105f, 22.0f, 15.0f)
                curveTo(22.0f, 13.895f, 21.105f, 13.0f, 20.0f, 13.0f)
                close()
                moveTo(4.0f, 16.0f)
                lineTo(5.0f, 16.0f)
                lineTo(5.0f, 20.0f)
                lineTo(4.0f, 20.0f)
                close()
                moveTo(27.0f, 16.0f)
                lineTo(28.0f, 16.0f)
                lineTo(28.0f, 20.0f)
                lineTo(27.0f, 20.0f)
                close()
                moveTo(11.0f, 22.0f)
                lineTo(13.0f, 22.0f)
                lineTo(13.0f, 25.0f)
                lineTo(11.0f, 25.0f)
                close()
                moveTo(15.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                lineTo(17.0f, 25.0f)
                lineTo(15.0f, 25.0f)
                close()
                moveTo(19.0f, 22.0f)
                lineTo(21.0f, 22.0f)
                lineTo(21.0f, 25.0f)
                lineTo(19.0f, 25.0f)
                close()
            }
        }
        .build()
        return _robotSolid!!
    }

private var _robotSolid: ImageVector? = null
