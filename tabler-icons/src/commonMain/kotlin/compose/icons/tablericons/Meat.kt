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

public val TablerIcons.Meat: ImageVector
    get() {
        if (_meat != null) {
            return _meat!!
        }
        _meat = Builder(name = "Meat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.62f, 8.382f)
                lineToRelative(1.966f, -1.967f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 3.414f, -1.415f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -1.413f, 3.414f)
                lineToRelative(-1.82f, 1.821f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.904f, 18.596f)
                curveToRelative(2.733f, 2.734f, 5.9f, 4.0f, 7.07f, 2.829f)
                curveToRelative(1.172f, -1.172f, -0.094f, -4.338f, -2.828f, -7.071f)
                curveToRelative(-2.733f, -2.734f, -5.9f, -4.0f, -7.07f, -2.829f)
                curveToRelative(-1.172f, 1.172f, 0.094f, 4.338f, 2.828f, 7.071f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 16.0f)
                lineToRelative(1.0f, 1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.975f, 21.425f)
                curveToRelative(3.905f, -3.906f, 4.855f, -9.288f, 2.121f, -12.021f)
                curveToRelative(-2.733f, -2.734f, -8.115f, -1.784f, -12.02f, 2.121f)
            }
        }
        .build()
        return _meat!!
    }

private var _meat: ImageVector? = null
