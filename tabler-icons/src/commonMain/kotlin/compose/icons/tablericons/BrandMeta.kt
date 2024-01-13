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

public val TablerIcons.BrandMeta: ImageVector
    get() {
        if (_brandMeta != null) {
            return _brandMeta!!
        }
        _brandMeta = Builder(name = "BrandMeta", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 10.174f)
                curveToRelative(1.766f, -2.784f, 3.315f, -4.174f, 4.648f, -4.174f)
                curveToRelative(2.0f, 0.0f, 3.263f, 2.213f, 4.0f, 5.217f)
                curveToRelative(0.704f, 2.869f, 0.5f, 6.783f, -2.0f, 6.783f)
                curveToRelative(-1.114f, 0.0f, -2.648f, -1.565f, -4.148f, -3.652f)
                arcToRelative(27.627f, 27.627f, 0.0f, false, true, -2.5f, -4.174f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 10.174f)
                curveToRelative(-1.766f, -2.784f, -3.315f, -4.174f, -4.648f, -4.174f)
                curveToRelative(-2.0f, 0.0f, -3.263f, 2.213f, -4.0f, 5.217f)
                curveToRelative(-0.704f, 2.869f, -0.5f, 6.783f, 2.0f, 6.783f)
                curveToRelative(1.114f, 0.0f, 2.648f, -1.565f, 4.148f, -3.652f)
                curveToRelative(1.0f, -1.391f, 1.833f, -2.783f, 2.5f, -4.174f)
                close()
            }
        }
        .build()
        return _brandMeta!!
    }

private var _brandMeta: ImageVector? = null
