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

public val TablerIcons.AnalyzeFilled: ImageVector
    get() {
        if (_analyzeFilled != null) {
            return _analyzeFilled!!
        }
        _analyzeFilled = Builder(name = "AnalyzeFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.99f, 12.862f)
                arcToRelative(7.1f, 7.1f, 0.0f, false, false, 12.171f, 3.924f)
                arcToRelative(1.956f, 1.956f, 0.0f, false, true, -0.156f, -0.637f)
                lineToRelative(-0.005f, -0.149f)
                lineToRelative(0.005f, -0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 1.769f, 2.137f)
                arcToRelative(9.099f, 9.099f, 0.0f, false, true, -15.764f, -4.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.98f, -0.275f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -3.995f, 4.2f)
                lineToRelative(-0.005f, -0.2f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.995f, -3.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.142f, 3.09f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, true, 7.848f, 7.772f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.98f, 0.276f)
                arcToRelative(7.1f, 7.1f, 0.0f, false, false, -6.125f, -6.064f)
                arcToRelative(7.096f, 7.096f, 0.0f, false, false, -6.048f, 2.136f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.831f, 0.939f)
                lineToRelative(-0.006f, -0.149f)
                lineToRelative(0.005f, -0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.216f, -1.838f)
                arcToRelative(9.094f, 9.094f, 0.0f, false, true, 7.921f, -2.922f)
                close()
            }
        }
        .build()
        return _analyzeFilled!!
    }

private var _analyzeFilled: ImageVector? = null
