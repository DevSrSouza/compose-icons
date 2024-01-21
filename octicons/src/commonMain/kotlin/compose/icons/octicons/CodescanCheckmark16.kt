package compose.icons.octicons

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
import compose.icons.Octicons

public val Octicons.CodescanCheckmark16: ImageVector
    get() {
        if (_codescanCheckmark16 != null) {
            return _codescanCheckmark16!!
        }
        _codescanCheckmark16 = Builder(name = "CodescanCheckmark16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.28f, 6.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineTo(6.25f, 8.19f)
                lineToRelative(-0.97f, -0.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                lineToRelative(3.5f, -3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 15.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, 5.807f, -2.754f)
                lineToRelative(2.473f, 2.474f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.326f, 1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.734f, -0.215f)
                lineToRelative(-2.474f, -2.473f)
                arcTo(7.472f, 7.472f, 0.0f, false, true, 7.5f, 15.0f)
                close()
                moveTo(7.5f, 1.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 4.094f, 10.386f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, 0.293f, -0.292f)
                arcToRelative(6.002f, 6.002f, 0.0f, false, false, 1.117f, -6.486f)
                arcTo(6.002f, 6.002f, 0.0f, false, false, 7.5f, 1.5f)
                close()
            }
        }
        .build()
        return _codescanCheckmark16!!
    }

private var _codescanCheckmark16: ImageVector? = null
