package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Hdd: ImageVector
    get() {
        if (_hdd != null) {
            return _hdd!!
        }
        _hdd = Builder(name = "Hdd", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(576.0f, 304.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 448.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(0.0f, -26.51f, 21.49f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(480.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, 21.49f, 48.0f, 48.0f)
                close()
                moveTo(528.0f, 224.0f)
                arcToRelative(79.56f, 79.56f, 0.0f, false, true, 30.78f, 6.16f)
                lineTo(462.25f, 85.37f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 422.31f, 64.0f)
                lineTo(153.69f, 64.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -39.94f, 21.37f)
                lineTo(17.22f, 230.16f)
                arcTo(79.56f, 79.56f, 0.0f, false, true, 48.0f, 224.0f)
                horizontalLineToRelative(480.0f)
                close()
                moveTo(480.0f, 320.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.33f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.33f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.33f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(384.0f, 320.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.33f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.33f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.33f, -32.0f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _hdd!!
    }

private var _hdd: ImageVector? = null
