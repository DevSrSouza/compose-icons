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

public val LineAwesomeIcons.ChalkboardTeacherSolid: ImageVector
    get() {
        if (_chalkboardTeacherSolid != null) {
            return _chalkboardTeacherSolid!!
        }
        _chalkboardTeacherSolid = Builder(name = "ChalkboardTeacherSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                lineTo(4.0f, 8.0f)
                lineTo(26.0f, 8.0f)
                lineTo(26.0f, 24.0f)
                lineTo(12.0f, 24.0f)
                lineTo(12.0f, 26.0f)
                lineTo(30.0f, 26.0f)
                lineTo(30.0f, 24.0f)
                lineTo(28.0f, 24.0f)
                lineTo(28.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                close()
                moveTo(8.002f, 9.0f)
                curveTo(5.8033f, 9.0f, 4.0f, 10.8027f, 4.0f, 13.0f)
                curveTo(4.0f, 15.1987f, 5.8041f, 17.0f, 8.002f, 17.0f)
                curveTo(10.1971f, 17.0f, 12.0f, 15.1987f, 12.0f, 13.0f)
                curveTo(12.0f, 10.8027f, 10.1979f, 9.0f, 8.002f, 9.0f)
                close()
                moveTo(14.0f, 10.0f)
                lineTo(14.0f, 12.0f)
                lineTo(19.0f, 12.0f)
                lineTo(19.0f, 10.0f)
                lineTo(14.0f, 10.0f)
                close()
                moveTo(21.0f, 10.0f)
                lineTo(21.0f, 12.0f)
                lineTo(24.0f, 12.0f)
                lineTo(24.0f, 10.0f)
                lineTo(21.0f, 10.0f)
                close()
                moveTo(8.002f, 11.0f)
                curveTo(9.116f, 11.0f, 10.0f, 11.8833f, 10.0f, 13.0f)
                curveTo(10.0f, 14.1193f, 9.1168f, 15.0f, 8.002f, 15.0f)
                curveTo(6.8818f, 15.0f, 6.0f, 14.1193f, 6.0f, 13.0f)
                curveTo(6.0f, 11.8833f, 6.8826f, 11.0f, 8.002f, 11.0f)
                close()
                moveTo(14.0f, 14.0f)
                lineTo(14.0f, 16.0f)
                lineTo(24.0f, 16.0f)
                lineTo(24.0f, 14.0f)
                lineTo(14.0f, 14.0f)
                close()
                moveTo(4.0f, 18.0f)
                lineTo(4.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                lineTo(6.0f, 20.0f)
                lineTo(9.0f, 20.0f)
                lineTo(9.0f, 26.0f)
                lineTo(11.0f, 26.0f)
                lineTo(11.0f, 20.6582f)
                lineTo(13.0645f, 21.75f)
                curveTo(13.6488f, 22.0602f, 14.3516f, 22.0589f, 14.9355f, 21.75f)
                lineTo(14.9355f, 21.752f)
                lineTo(18.4668f, 19.8848f)
                lineTo(17.5332f, 18.1152f)
                lineTo(14.002f, 19.9824f)
                lineTo(10.9063f, 18.3477f)
                curveTo(10.4751f, 18.12f, 9.9935f, 18.0f, 9.5039f, 18.0f)
                lineTo(4.0f, 18.0f)
                close()
            }
        }
        .build()
        return _chalkboardTeacherSolid!!
    }

private var _chalkboardTeacherSolid: ImageVector? = null
