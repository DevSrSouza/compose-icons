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

public val TablerIcons.BrandDingtalk: ImageVector
    get() {
        if (_brandDingtalk != null) {
            return _brandDingtalk!!
        }
        _brandDingtalk = Builder(name = "BrandDingtalk", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -18.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 18.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 7.5f)
                lineToRelative(7.02f, 2.632f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.567f, 1.33f)
                lineToRelative(-1.087f, 2.538f)
                horizontalLineToRelative(1.5f)
                lineToRelative(-5.0f, 4.0f)
                lineToRelative(1.0f, -4.0f)
                curveToRelative(-3.1f, 0.03f, -3.114f, -3.139f, -4.0f, -6.5f)
                close()
            }
        }
        .build()
        return _brandDingtalk!!
    }

private var _brandDingtalk: ImageVector? = null
