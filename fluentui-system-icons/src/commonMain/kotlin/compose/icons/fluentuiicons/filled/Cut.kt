package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Cut: ImageVector
    get() {
        if (_cut != null) {
            return _cut!!
        }
        _cut = Builder(name = "Cut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8294f, 2.4394f)
                curveTo(7.5208f, 1.9814f, 6.8994f, 1.8602f, 6.4413f, 2.1688f)
                curveTo(5.9833f, 2.4774f, 5.8621f, 3.0988f, 6.1707f, 3.5569f)
                lineTo(10.9634f, 10.6711f)
                lineTo(8.6368f, 14.3487f)
                curveTo(8.1371f, 14.1244f, 7.5831f, 13.9996f, 7.0f, 13.9996f)
                curveTo(4.7909f, 13.9996f, 3.0f, 15.7905f, 3.0f, 17.9996f)
                curveTo(3.0f, 20.2087f, 4.7909f, 21.9996f, 7.0f, 21.9996f)
                curveTo(9.2091f, 21.9996f, 11.0f, 20.2087f, 11.0f, 17.9996f)
                curveTo(11.0f, 17.1029f, 10.705f, 16.2752f, 10.2067f, 15.6081f)
                lineTo(12.1839f, 12.4828f)
                lineTo(14.0676f, 15.2791f)
                curveTo(13.4051f, 15.9929f, 13.0f, 16.9489f, 13.0f, 17.9996f)
                curveTo(13.0f, 20.2087f, 14.7909f, 21.9996f, 17.0f, 21.9996f)
                curveTo(19.2091f, 21.9996f, 21.0f, 20.2087f, 21.0f, 17.9996f)
                curveTo(21.0f, 15.7905f, 19.2091f, 13.9996f, 17.0f, 13.9996f)
                curveTo(16.5639f, 13.9996f, 16.1441f, 14.0694f, 15.7511f, 14.1984f)
                lineTo(12.1319f, 8.8241f)
                lineTo(12.1313f, 8.8251f)
                lineTo(7.8294f, 2.4394f)
                close()
                moveTo(5.0f, 17.9996f)
                curveTo(5.0f, 16.895f, 5.8954f, 15.9996f, 7.0f, 15.9996f)
                curveTo(8.1046f, 15.9996f, 9.0f, 16.895f, 9.0f, 17.9996f)
                curveTo(9.0f, 19.1042f, 8.1046f, 19.9996f, 7.0f, 19.9996f)
                curveTo(5.8954f, 19.9996f, 5.0f, 19.1042f, 5.0f, 17.9996f)
                close()
                moveTo(15.0f, 17.9996f)
                curveTo(15.0f, 16.895f, 15.8954f, 15.9996f, 17.0f, 15.9996f)
                curveTo(18.1046f, 15.9996f, 19.0f, 16.895f, 19.0f, 17.9996f)
                curveTo(19.0f, 19.1042f, 18.1046f, 19.9996f, 17.0f, 19.9996f)
                curveTo(15.8954f, 19.9996f, 15.0f, 19.1042f, 15.0f, 17.9996f)
                close()
                moveTo(14.5202f, 8.7899f)
                lineTo(17.8452f, 3.5342f)
                curveTo(18.1404f, 3.0675f, 18.0014f, 2.4498f, 17.5347f, 2.1545f)
                curveTo(17.068f, 1.8592f, 16.4503f, 1.9982f, 16.155f, 2.4649f)
                lineTo(13.2998f, 6.978f)
                lineTo(14.5202f, 8.7899f)
                close()
            }
        }
        .build()
        return _cut!!
    }

private var _cut: ImageVector? = null
