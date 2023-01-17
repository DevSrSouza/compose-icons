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

public val TablerIcons.ScaleOutline: ImageVector
    get() {
        if (_scaleOutline != null) {
            return _scaleOutline!!
        }
        _scaleOutline = Builder(name = "ScaleOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                lineTo(17.0f, 3.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 21.0f, 7.0f)
                lineTo(21.0f, 17.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 17.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 3.0f, 17.0f)
                lineTo(3.0f, 7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveToRelative(1.956f, 0.0f, 3.724f, 0.802f, 4.994f, 2.095f)
                lineToRelative(-2.956f, 2.904f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.038f, -0.799f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.038f, 0.798f)
                lineToRelative(-2.956f, -2.903f)
                arcToRelative(6.979f, 6.979f, 0.0f, false, true, 4.994f, -2.095f)
                close()
            }
        }
        .build()
        return _scaleOutline!!
    }

private var _scaleOutline: ImageVector? = null
