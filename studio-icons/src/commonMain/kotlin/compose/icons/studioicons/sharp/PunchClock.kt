package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PunchClock: ImageVector
    get() {
        if (_punchClock != null) {
            return _punchClock!!
        }
        _punchClock = Builder(name = "PunchClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(8.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveTo(14.76f, 19.0f, 12.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 11.5f)
                lineToRelative(-1.0f, 0.0f)
                lineToRelative(0.0f, 2.71f)
                lineToRelative(1.64f, 1.64f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-1.35f, -1.35f)
                close()
            }
        }
        .build()
        return _punchClock!!
    }

private var _punchClock: ImageVector? = null
