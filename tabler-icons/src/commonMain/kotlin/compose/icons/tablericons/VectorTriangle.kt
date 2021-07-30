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

public val TablerIcons.VectorTriangle: ImageVector
    get() {
        if (_vectorTriangle != null) {
            return _vectorTriangle!!
        }
        _vectorTriangle = Builder(name = "VectorTriangle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                lineTo(13.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 5.0f)
                lineTo(14.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 8.0f)
                lineTo(11.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 7.0f)
                lineTo(10.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 4.0f)
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
                moveTo(18.0f, 17.0f)
                lineTo(20.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 18.0f)
                lineTo(21.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 21.0f)
                lineTo(18.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 20.0f)
                lineTo(17.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 17.1f)
                lineTo(11.5f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 17.1f)
                lineTo(12.5f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 19.0f)
                lineTo(17.0f, 19.0f)
            }
        }
        .build()
        return _vectorTriangle!!
    }

private var _vectorTriangle: ImageVector? = null
