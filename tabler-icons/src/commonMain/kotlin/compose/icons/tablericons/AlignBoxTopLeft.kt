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

public val TablerIcons.AlignBoxTopLeft: ImageVector
    get() {
        if (_alignBoxTopLeft != null) {
            return _alignBoxTopLeft!!
        }
        _alignBoxTopLeft = Builder(name = "AlignBoxTopLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.778f, 20.0f)
                horizontalLineToRelative(12.444f)
                curveToRelative(0.982f, 0.0f, 1.778f, -0.796f, 1.778f, -1.778f)
                verticalLineToRelative(-12.444f)
                curveToRelative(0.0f, -0.982f, -0.796f, -1.778f, -1.778f, -1.778f)
                horizontalLineToRelative(-12.444f)
                curveToRelative(-0.982f, 0.0f, -1.778f, 0.796f, -1.778f, 1.778f)
                verticalLineToRelative(12.444f)
                curveToRelative(0.0f, 0.982f, 0.796f, 1.778f, 1.778f, 1.778f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 9.0f)
                verticalLineToRelative(-2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 13.0f)
                verticalLineToRelative(-6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 11.0f)
                verticalLineToRelative(-4.0f)
            }
        }
        .build()
        return _alignBoxTopLeft!!
    }

private var _alignBoxTopLeft: ImageVector? = null
