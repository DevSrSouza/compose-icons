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
                curveTo(5.803f, 9.0f, 4.0f, 10.803f, 4.0f, 13.0f)
                curveTo(4.0f, 15.199f, 5.804f, 17.0f, 8.002f, 17.0f)
                curveTo(10.197f, 17.0f, 12.0f, 15.199f, 12.0f, 13.0f)
                curveTo(12.0f, 10.803f, 10.198f, 9.0f, 8.002f, 9.0f)
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
                curveTo(9.116f, 11.0f, 10.0f, 11.883f, 10.0f, 13.0f)
                curveTo(10.0f, 14.119f, 9.117f, 15.0f, 8.002f, 15.0f)
                curveTo(6.882f, 15.0f, 6.0f, 14.119f, 6.0f, 13.0f)
                curveTo(6.0f, 11.883f, 6.883f, 11.0f, 8.002f, 11.0f)
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
                lineTo(11.0f, 20.658f)
                lineTo(13.064f, 21.75f)
                curveTo(13.649f, 22.06f, 14.352f, 22.059f, 14.936f, 21.75f)
                lineTo(14.936f, 21.752f)
                lineTo(18.467f, 19.885f)
                lineTo(17.533f, 18.115f)
                lineTo(14.002f, 19.982f)
                lineTo(10.906f, 18.348f)
                curveTo(10.475f, 18.12f, 9.994f, 18.0f, 9.504f, 18.0f)
                lineTo(4.0f, 18.0f)
                close()
            }
        }
        .build()
        return _chalkboardTeacherSolid!!
    }

private var _chalkboardTeacherSolid: ImageVector? = null
