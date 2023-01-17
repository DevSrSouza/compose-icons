package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.VectorSpline: ImageVector
    get() {
        if (_vectorSpline != null) {
            return _vectorSpline!!
        }
        _vectorSpline = Builder(name = "VectorSpline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                lineTo(20.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 4.0f)
                lineTo(21.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 7.0f)
                lineTo(18.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 6.0f)
                lineTo(17.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 18.0f)
                lineTo(7.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 20.0f)
                lineTo(3.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 5.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
            }
        }
        .build()
        return _vectorSpline!!
    }

private var _vectorSpline: ImageVector? = null
